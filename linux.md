### install Java

- Add Oracle's PPA, then update your package repository
```bash
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
```
- To install JDK 9, use the following command
```
sudo apt-get install oracle-java9-installer
```
- You can configure which version is the default for use
```
sudo update-alternatives --config java
```
- set this environment variable
```bash
sudo vi /etc/environment
```
|  /etc/environment | 
|:-:|
|  JAVA_HOME="/usr/lib/jvm/java-8-oracle" |
```
source /etc/environment
echo $JAVA_HOME
```


### MPEG-DASH Content Generation with MP4Box and x264



```
sudo apt install x264
sudo apt install gpac
```

https://bitmovin.com/mp4box-dash-content-generation-x264/

http://ubuntuhandbook.org/index.php/2016/01/how-to-install-the-latest-eclipse-in-ubuntu-16-04-15-10/

sudo useradd -r tomcat --shell /bin/false

cd /opt
sudo tar -zxf /home/server/Downloads/apache-tomcat-9.0.4.tar.gz


sudo ln -s apache-tomcat-9.0.4 tomcat-latest

sudo chown -hR tomcat: tomcat-latest apache-tomcat-9.0.4



sudo gedit /etc/systemd/system/tomcat.service

-----------

[Unit]
Description=Tomcat9
After=network.target

[Service]
Type=forking
User=tomcat
Group=tomcat

Environment=CATALINA_PID=/opt/tomcat-latest/tomcat9.pid
Environment=JAVA_HOME=/usr/lib/jvm/java-9-oracle
Environment=CATALINA_HOME=/opt/tomcat-latest
Environment=CATALINA_BASE=/opt/tomcat-latest
Environment="CATALINA_OPTS=-Xms512m -Xmx512m"
Environment="JAVA_OPTS=-Dfile.encoding=UTF-8 -Dnet.sf.ehcache.skipUpdateCheck=true -XX:+UseConcMarkSweepGC -XX:+CMSClassUnloadingEnabled -XX:+UseParNewGC"

ExecStart=/opt/tomcat-latest/bin/startup.sh
ExecStop=/opt/tomcat-latest/bin/shutdown.sh

[Install]
WantedBy=multi-user.target


------------


systemctl daemon-reload
systemctl start tomcat
systemctl enable tomcat



http://users.ece.cmu.edu/~vsekar/mpcdash.html


https://tdngan.wordpress.com/2016/11/17/how-to-encode-multi-bitrate-videos-in-mpeg-dash-for-mse-based-media-players/


http://dashif.org/reference/players/javascript/nightly/dash.js/samples/getting-started-basic-embed/listening-to-events.html

        function setListener(eventName)
        {
            player.on(dashjs.MediaPlayer.events[eventName],showEvent);
            var element = document.createElement("input");
            element.type = "button";
            element.id = eventName;
            element.value = "Remove " + eventName;
            element.onclick = function() {
                player.off(dashjs.MediaPlayer.events[eventName],showEvent);
                document.getElementById("eventHolder").removeChild(element);
            };
            document.getElementById("eventHolder").appendChild(element);
        }


http://cdn.dashjs.org/latest/jsdoc/MediaPlayerEvents.html
http://cdn.dashjs.org/latest/jsdoc/module-MediaPlayer.html


MANIFEST_LOADED

Average Video Quality
        getBitrateInfoListFor(type)
        
Average Quality Variations
        PLAYBACK_RATE_CHANGED

Rebuffer
        BUFFER_EMPTY

Startup Delay
        CAN_PLAY


https://www.radiantmediaplayer.com/guides/working-with-mp4box.html
