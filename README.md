<p align="center">
    <a href='https://docs.oracle.com/en/java/javase/8'><img alt="Java 8" src="readme/Java8.png"></a>
    <a href='https://docs.spring.io/spring-boot/docs/2.6.2-SNAPSHOT/reference/html'><img alt="Spring Boot 2" src="https://img.shields.io/badge/Spring%20Boot%202-%23000000.svg?logo=springboot"></a>
    <a href='https://staging-cn.vuejs.org'><img alt="Vue 3" src="https://img.shields.io/badge/Vue%202%20-%232b3847.svg?logo=vue.js"></a><br/>
    <a href='#'><img alt="Github stars" src="https://img.shields.io/github/stars/201206030/novel?logo=github"></a>
    <a href='#'><img alt="Github forks" src="https://img.shields.io/github/forks/201206030/novel?logo=github"></a>
    <a href='#'><img alt="Gitee stars" src="https://gitee.com/novel_dev_team/novel/badge/star.svg?theme=gitee"></a>
    <a href='#'><img alt="Gitee forks" src="https://gitee.com/novel_dev_team/novel/badge/fork.svg?theme=gitee"></a>
</p>


# CRM系统

#### 开发环境

+ Windows

#### 配置环境

| 程序           | 版本        | 说明                       |
|--------------|-----------|--------------------------|
| Jdk          | 1.8.0 161 | Java 开发工具包               |
| Mysql        | 5.5.27    | 关系型数据库                   |
| Apache-maven | 3.9.0     | Java 项目管理和构建工具           |
| Nvm          | 1.10      | Node.js 版本管理器            |
| Node         | 8.12.0    | Node.js JavaScript 运行时环境 |

#### 开发工具

| 工具                       | 版本            | 说明                      |
|--------------------------|---------------|-------------------------|
| IDEA                     | 2022.3.2      | 后前端开发IDE                |
| Git                      | 2.24.1        | 代码托管平台                  |
| Google   Chrome          | 75.0.3770.100 | 浏览器、前端调试工具              |
| Navicat                  | 11.1.13       | 数据库连接工具                 |
| Postman                  | 7.1.0         | 接口测试工具                  |
| VMware   Workstation Pro | 14.1.3        | 虚拟机(未用到或许你会用到)          |
| PowerDesigner            | 15            | 数据库设计工具(未用到或许你会用到)      |
| SQLyog                   | 12.0.3        | 数据库连接工具 (未用到或许你会用到)     |
| Visio                    | 2013          | 时序图、流程图等绘制工具(未用到或许你会用到) |
| ProcessOn                | ——            | 架构图等绘制工具(未用到或许你会用到)     |
| XMind   ZEN              | 9.2.0         | 思维导图绘制工具(未用到或许你会用到)     |
| RedisDesktop             | 0.9.3.817     | redis客户端连接工具(未用到或许你会用到) |

#### 编码规范

- 规范方式：严格遵守阿里编码规约。
- 命名统一：简介最大程度上达到了见名知意。
- 分包明确：层级分明可快速定位到代码位置。
- 注释完整：描述性高大量减少了开发人员的代码阅读工作量。
- 工具规范：使用统一jar包避免出现内容冲突。
- 代码整洁：可读性、维护性高。

#### 包的结构
```
+- crm
|   +- crm.sql -- 后端系统的数据库文件，用于创建和初始化数据库。
|   +- crm_sb -- 后端 Spring Boot 项目的文件夹，包括了 Spring Boot 项目的代码和配置文件，以及一些工具类和依赖库。
|   |   +- .gitignore -- 用于指定 Git 版本控制系统忽略的文件或目录。
|   |   +- .mvn -- Maven Wrapper 相关的配置文件和脚本。
|   |   |   +- wrapper -- 用于下载和管理 Maven Wrapper 的相关文件。
|   |   +- HELP.md -- 包含了项目的帮助文档和使用说明
|   |   +- mvnw -- Maven Wrapper 的脚本文件，用于在不安装 Maven 的情况下构建项目
|   |   +- mvnw.cmd -- Maven Wrapper 的脚本文件，用于在不安装 Maven 的情况下构建项目
|   |   +- pom.xml -- Maven 项目的配置文件，包括了项目的依赖库和构建配置等。
|   |   +- src -- 项目的源代码目录
|   |   |   +- main 
|   |   |   |   +- java 
|   |   |   |   |   +- com 
|   |   |   |   |   |   +- wanshu 
|   |   |   |   |   |   |   +- common -- 通用模块，包括了一些通用的注解、切面、常量、异常、模型、结果等。
|   |   |   |   |   |   |   |   +- annotation -- 自定义注解模块，包括了一些自定义注解
|   |   |   |   |   |   |   |   +- aspect -- 切面模块，包括了一些切面类。
|   |   |   |   |   |   |   |   +- constant -- 常量模块，包括了一些常量类。
|   |   |   |   |   |   |   |   +- execption -- 异常模块，包括了一些异常类。
|   |   |   |   |   |   |   |   +- model -- 模型模块，包括了一些通用的模型类。
|   |   |   |   |   |   |   |   +- result -- 结果模块，包括了一些通用的结果类。
|   |   |   |   |   |   |   |   +- swagger -- Swagger 模块，包括了一些 Swagger 相关的配置类和注
|   |   |   |   |   |   |   |   +- util -- 工具模块，包括了一些通用的工具类。
|   |   |   |   |   |   |   +- config -- 配置模块，包括了一些配置类。
|   |   |   |   |   |   |   +- sys -- 系统模块，包括了一些系统相关的控制器、实体、过滤器、映射器、模型、服务等
|   |   |   |   |   |   |   |   +- controller -- 控制器模块，包括了一些系统相关的控制器类。
|   |   |   |   |   |   |   |   +- entity -- 实体模块，包括了一些系统相关的实体类。
|   |   |   |   |   |   |   |   +- filter -- 过滤器模块，包括了一些系统相关的过滤器类。
|   |   |   |   |   |   |   |   +- mapper -- 映射器模块，包括了一些系统相关的映射器接口。
|   |   |   |   |   |   |   |   +- model -- 模型模块，包括了一些系统相关的模型类。
|   |   |   |   |   |   |   |   +- service -- 服务模块，包括了一些系统相关的服务接口。
|   |   |   |   |   |   |   |   |   +- impl -- 服务实现模块，包括了一些系统相关的服务实现类
|   |   |   |   |   |   |   +- WscrmApplication.java -- Spring Boot 应用程序的入口类。
|   |   |   +- test -- 测试代码目录
|   |   |   |   +- java 
|   |   |   |   |   +- com 
|   |   |   |   |   |   +- wanshu 
|   |   |   |   |   |   |   +- WscrmApplicationTests.java -- 测试代码目录
|   |   +- WSCRM.iml -- IntelliJ IDEA 项目文件。
|   +- crm_vue -- 前端系统的 Vue.js 项目文件夹，包括了 Vue.js 项目的源代码和静态资源文件等
|   |   +- .babelrc -- Babel 配置文件，用于将 ES6+ 代码转换为 ES5 代码以兼容旧版浏览器。
|   |   +- .editorconfig -- 编辑器配置文件，用于统一不同编辑器的代码风格和格式化规则等。
|   |   +- .gitignore -- 用于指定 Git 版本控制系统忽略的文件或目录。
|   |   +- .postcssrc.js -- PostCSS 配置文件，用于处理 CSS 样式。
|   |   +- build -- 构建脚本和配置文件目录
|   |   +- config -- 开发环境和生产环境的配置文件目录
|   |   +- dist -- 打包后生成的目标代码目录。
|   |   |   +- index.html -- Vue.js 应用程序的入口 HTML 文件。
|   |   |   +- static -- 静态资源文件目录，包括了 CSS 样式、字体、JavaScript 脚本等
|   |   |   |   +- css 
|   |   |   |   +- fonts 
|   |   |   |   +- js 
|   |   +- index.html -- npm 包管理器的锁定文件，用于锁定依赖库的版本号以保证构建环境的稳定性。
|   |   +- package-lock.json -- npm 包管理器的锁定文件，用于锁定依赖库的版本号以保证构建环境的稳定性。
|   |   +- package.json -- npm 包管理器的配置文件，包括了项目的依赖库和构建配置等
|   |   +- src -- Vue.js 应用程序的源代码目录。
|   |   |   +- App.vue -- Vue.js 应用程序的根组件，包括了应用程序的路由和布局等
|   |   |   +- assets -- 应用程序的资源文件目录，包括了图片、字体等资源文件
|   |   |   +- components -- Vue.js 应用程序的组件目录，包括了通用组件和页面组件等
|   |   |   |   +- common -- 通用组件目录，包括了一些通用组件如头部、底部、菜单等
|   |   |   |   +- pages -- 页面组件目录，包括了一些页面组件如客户、订单、系统等页面组件。
|   |   |   |   |   +- customer 
|   |   |   |   |   +- order 
|   |   |   |   |   +- sys 
|   |   |   +- main.js -- Vue.js 应用程序的入口 JavaScript 文件，主要作为生产环境下的入口文件。
|   |   |   +- router -- Vue.js 应用程序的路由配置目录，包括了应用程序的路由配置信息
|   |   |   +- store -- Vue.js 应用程序的状态管理目录，包括了应用程序的状态管理信息。
|   |   |   +- views -- Vue.js 应用程序的视图目录，包括了一些视图组件如登录页、首页等视图组件。
|   |   +- static -- 静态资源文件目录，主要作为开发环境下的静态资源文件目录。
|   |   |   +- .gitkeep -- 空文件，用于确保 Git 版本控制系统能够正确地跟踪该目录。
|   +- README.md -- 项目说明
```

#### 后端技术栈

| 技术                             | 版本            | 说明                          |
|--------------------------------|---------------|-----------------------------|
| Spring Boot                     | 2.4.12        | 框架                          |
| Lombok                          | -             | 简化 Java 代码的工具         |
| MySQL Connector/J               | -             | MySQL JDBC 驱动程序          |
| MyBatis-Plus                    | 3.4.3.1       | 持久层框架                    |
| Fastjson                        | 1.2.78        | JSON 序列化和反序列化库      |
| Druid Spring Boot Starter       | 1.2.4         | 数据库连接池                  |
| MyBatis-Plus Generator          | 3.5.2         | MyBatis-Plus 代码生成器       |
| Freemarker                      | -             | 模板引擎                      |
| Spring Boot DevTools            | -             | 开发工具                      |
| Swagger Annotations             | 1.5.22        | Swagger 注解                  |
| Spring Boot Starter AOP         | -             | 面向切面编程                  |
| Springfox Boot Starter          | 3.0.0         | Swagger 工具                  |
| Hibernate Validator            | -             | 验证框架                      |
| Commons Collections4            | 4.1           | Java 集合框架的扩展库        |
| Commons Lang3                   | 3.12.0        | Java 常用工具类库            |
| Knife4j Spring Boot Starter     | 3.0.3         | Swagger 增强工具              |
| Spring Boot Starter Security    | -             | 安全框架                      |
| Java JWT                        | 3.4.0         | JSON Web Token 的 Java 实现  |
#### 前端技术栈

| 技术                      | 版本      | 说明                    |
|-------------------------|---------|-----------------------|
| Vue.js                  | 2.5.2   | 前端 JavaScript 框架      |
| Vue Router              | 3.0.1   | Vue 官方的路由管理器          |
| Vuex                    | 3.6.2   | Vue 官方的状态管理器          |
| Element UI              | 2.15.10 | 基于 Vue 的 UI 组件库       |
| ECharts                 | 5.1.2   | 前端图表库                 |
| Axios                   | 1.1.3   | 基于 Promise 的 HTTP 库   |
| Less                    | 3.0.0   | CSS 预处理器              |
| Less Loader             | 4.1.0   | Webpack 的 Less 加载器    |
| Babel Core              | 6.22.1  | JavaScript 编译器        |
| Babel Loader            | 7.1.1   | Webpack 的 Babel 加载器   |
| Babel Preset Env        | 1.3.2   | Babel 的环境预设           |
| Babel Preset Stage 2    | 6.22.0  | Babel 的 Stage 2 预设    |
| PostCSS Loader          | 2.0.8   | Webpack 的 PostCSS 加载器 |
| UglifyJS Webpack Plugin | 1.1.1   | Webpack 的代码压缩插件       |
| HTML Webpack Plugin     | 2.30.1  | Webpack 的 HTML 插件     |
| Vue Loader              | 13.3.0  | Webpack 的 Vue 加载器     |
| webpack                 | 3.6.0   | 前端打包工具                |
| webpack-dev-server      | 2.9.1   | Webpack 的开发服务器        |
| webpack-merge           | 4.1.0   | Webpack 的配置合并工具       |

#### 安装教程
1.  在navicat中运行数据库脚本生成对应的数据库表
2.  在src/main/resources/application.yml文件里更改数据库名称或数据库密码
3.  在pom.xml文件的父目录运行 mvn clean spring-boot:run 启动后端
4.  启动前端 你可以在package.json的父目录执行下如命令 或者 直接在IDEA里点击也可运行 值得一提的是后两命令分别是打包命令和检查修复命令

```
npm install
```
```
npm run serve
```
```
npm run build
```
```
npm run lint
```
+ 如下图所示

![](./inc/readme/1.png)
![](./inc/readme/2.png)
![](./inc/readme/3.png)
![](./inc/readme/4.png)
![](./inc/readme/5.png)

#### 登录账户
用户名：admin
密码：1
#### 截图
![登录](./inc/readme/登录.png)
![增删改查](./inc/readme/增删改查列表.png)
![用户管理](./inc/readme/用户管理.png)
![角色管理](./inc/readme/角色管理.png)
![系统菜单](./inc/readme/系统菜单.png)