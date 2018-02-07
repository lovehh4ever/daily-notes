package cn.edu.nju.dan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class X264Encoder {

	public final static String X264PATH = "C:\\Program^ Files\\X264\\x264.exe";

	public static void main(String[] args) {

		try {
			makeX264("D:\\video\\short\\short-raw.mp4", "D:\\video\\short\\short.mp4");
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void makeX264(String input, String output) throws IOException, InterruptedException {
		String cmd = X264PATH + " --output " + output + " --fps 24 " + "--preset slow " + "--bitrate 2400 "
				+ "--vbv-maxrate 4800 " + "--vbv-bufsize 9600 " + "--min-keyint 48 " + "--keyint 48 " + "--scenecut 0 "
				+ "--no-scenecut " + "--pass 1 " + "--video-filter \"resize:width=1280,height=720\" " + input;

		System.out.println(cmd);

		Process p = new ProcessBuilder(cmd).start();

		p.waitFor();

		System.out.println("finished");

		if (fail(p))
			printStream(p.getErrorStream());

	}

	private static boolean fail(Process p) throws IOException {
		return p.getErrorStream().available() > 0;
	}

	private static void printStream(InputStream is) throws IOException {
		BufferedReader error = new BufferedReader(new InputStreamReader(is));
		String line;
		while ((line = error.readLine()) != null)
			System.out.println(line);
	}
}
