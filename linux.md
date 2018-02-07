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
