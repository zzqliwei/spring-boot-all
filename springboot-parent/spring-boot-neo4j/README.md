1、下载路径 https://neo4j.com/download-center/
 windows安装neo4j-community-3.5.8-windows.zip
2、解压后配置环境变量 NEO4J_HOME

3、尝试启动
以管理员身份运行控制台（win+A+X）
在命令窗口切入到主目录%NEO4J_HOME%\bin
执行neo4j.bat console 

运行成功的话，此时可以打开浏览器，输入：
http://localhost:7474/browser/
默认密码：neo4j
更改密码。完成。

cypher语言