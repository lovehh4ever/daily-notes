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

https://stackoverflow.com/questions/1693322/eclipse-web-project-dependencies

https://www.linuxbabe.com/ubuntu/install-teamviewer-12-ubuntu-16-04-ubuntu-16-10

sudo apt-get -f install

sudo apt install gdebi-core

sudo gdebi teamviewer*.deb

cat result_init.mp4 > wtf.mp4
cat 1-10.m4s >> wtf.mp4

https://stackoverflow.com/questions/13716658/how-to-delete-all-commit-history-in-github

https://support.microsoft.com/en-ph/help/17463/windows-7-connect-to-another-computer-remote-desktop-connection
