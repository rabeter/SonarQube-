# 自定义 Java 规则
---
## 对Java函数名进行***驼峰式***规则检查
## 开发Java 规则的SonarQube插件。
---
1. 创建[SonarQube](http://docs.sonarqube.org/display/HOME/SonarQube+Platform)插件。
    1. [安装SonarQube与SonarQube scanner](http://www.finedevelop.com/pages/viewpage.action?pageId=6721886)
    2. 使用Maven构建插件与编写Java规则，
    [样本模板](https://github.com/SonarSource/sonar-examples)导入IDEA或eclipse中进行开发。
2. 使用SonarQube插件[API](http://docs.sonarqube.org/display/DEV/API+Basics)编写可用的Java规则。
    
3. 生成jar插件。
使用Maven命令构建SonarQube插件
    mvn clean install
4. 把插件放到相应SonarQube插件目录。
    SONARQUBE_HOME/extensions/plugins
5. 重启SonarQube服务器。