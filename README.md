<p align="center">
    <a href='https://docs.oracle.com/en/java/javase/8'><img alt="Java 8" src="./inc/readme/Java8.png"></a>
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
|   +- crm.sql
|   +- crm_sb
|   |   +- .gitignore
|   |   +- .mvn
|   |   |   +- wrapper
|   |   +- HELP.md
|   |   +- mvnw
|   |   +- mvnw.cmd
|   |   +- pom.xml
|   |   +- src
|   |   |   +- main
|   |   |   |   +- java
|   |   |   |   |   +- com
|   |   |   |   |   |   +- wanshu
|   |   |   |   |   |   |   +- common
|   |   |   |   |   |   |   |   +- annotation
|   |   |   |   |   |   |   |   +- aspect
|   |   |   |   |   |   |   |   +- constant
|   |   |   |   |   |   |   |   +- execption
|   |   |   |   |   |   |   |   +- model
|   |   |   |   |   |   |   |   +- result
|   |   |   |   |   |   |   |   +- swagger
|   |   |   |   |   |   |   |   +- util
|   |   |   |   |   |   |   +- config
|   |   |   |   |   |   |   +- sys
|   |   |   |   |   |   |   |   +- controller
|   |   |   |   |   |   |   |   +- entity
|   |   |   |   |   |   |   |   +- filter
|   |   |   |   |   |   |   |   +- mapper
|   |   |   |   |   |   |   |   +- model
|   |   |   |   |   |   |   |   +- service
|   |   |   |   |   |   |   |   |   +- impl
|   |   |   |   |   |   |   +- WscrmApplication.java
|   |   |   +- test
|   |   |   |   +- java
|   |   |   |   |   +- com
|   |   |   |   |   |   +- wanshu
|   |   |   |   |   |   |   +- WscrmApplicationTests.java
|   |   +- WSCRM.iml
|   +- crm_vue
|   |   +- .babelrc
|   |   +- .editorconfig
|   |   +- .gitignore
|   |   +- .postcssrc.js
|   |   +- build
|   |   +- config
|   |   +- dist
|   |   |   +- index.html
|   |   |   +- static
|   |   |   |   +- css
|   |   |   |   +- fonts
|   |   |   |   +- js
|   |   +- index.html
|   |   +- package-lock.json
|   |   +- package.json
|   |   +- src
|   |   |   +- App.vue
|   |   |   +- assets
|   |   |   |   +- images
|   |   |   |   +- login_bg.jpg
|   |   |   |   +- logo.png
|   |   |   +- components
|   |   |   |   +- common
|   |   |   |   +- pages
|   |   |   |   |   +- customer
|   |   |   |   |   +- order
|   |   |   |   |   +- sys
|   |   |   +- main.js
|   |   |   +- router
|   |   |   +- store
|   |   |   +- views
|   |   +- static
|   |   |   +- .gitkeep
|   +- README.md -- 项目说明
```

#### 后端技术栈

| 技术                             | 版本            | 说明                          |
|--------------------------------|---------------|-----------------------------|
| Spring Boot Starter Parent     | 2.0.4.RELEASE | Spring Boot 父依赖             |
| MySQL Connector Java           | 未指定           | MySQL 驱动                    |
| MyBatis                        | 3.4.4         | ORM框架                       |
| MyBatis Spring Boot Starter    | 1.1.1         | MyBatis Spring Boot Starter |
| Apache Shiro                   | 1.3.2         | 安全框架                        |
| Fastjson                       | 1.2.42        | JSON处理工具                    |
| jjwt                           | 0.7.0         | JSON Web Token 处理工具         |
| Spring Boot Starter Websocket  | 未指定           | WebSocket依赖                 |
| Spring Context Support         | 未指定           | Spring上下文支持                 |
| Spring Boot Starter Security   | 未指定           | Spring Security依赖           |
| Ehcache                        | 3.8.1         | 缓存框架                        |
| ehcache                        | 未指定           | ehcache                     |
| PageHelper Spring Boot Starter | 1.2.3         | 分页插件                        |
| faker4j                        | 1.0.0         | 随机数据生成工具                    |
| Commons Collections4           | 4.1           | 集合处理工具                      |
| Commons IO                     | 1.4           | IO操作工具                      |
| Commons Fileupload             | 未指定           | 文件上传工具                      |
#### 前端技术栈

| 技术                                 | 版本         | 说明                                       |
|------------------------------------|------------|------------------------------------------|
| axios                              | ^0.16.2    | HTTP请求库                                  |
| echarts                            | ^3.7.1     | 可视化图表库                                   |
| element-ui                         | ^2.0.7     | 基于Vue.js的UI组件库                           |
| express                            | ^4.16.3    | 基于Node.js的Web应用框架                        |
| fabric                             | 2.3.6      | HTML5 Canvas 库                           |
| fabric-customise-controls          | 2.0.6-beta | Fabric.js 的自定义控件扩展库                      |
| lodash                             | ^4.17.4    | 实用工具库                                    |
| v-viewer                           | ^1.5.1     | 基于Viewer.js的Vue图片查看器组件                   |
| vue                                | ^2.5.9     | 前端JavaScript框架                           |
| vue-clipboard2                     | ^0.3.1     | 复制粘贴库                                    |
| vue-router                         | ^2.8.1     | Vue.js的官方路由器                             |
| vue-template-compiler              | ^2.5.9     | 将Vue.js模板编译为渲染函数的库                       |
| vuex                               | ^3.0.1     | Vue.js的状态管理库                             |
| autoprefixer                       | ^6.7.2     | 自动添加CSS3前缀的PostCSS插件                     |
| babel-core                         | ^6.26.0    | ES6转码器的核心库                               |
| babel-loader                       | ^6.2.10    | Webpack的Babel加载器                         |
| babel-plugin-transform-runtime     | ^6.22.0    | Babel插件，将ES6的函数替换为使用 babel-runtime 来优化代码 |
| babel-preset-env                   | ^1.6.0     | Babel的预设，根据当前的目标环境自动确定所需的插件              |
| babel-preset-stage-2               | ^6.24.1    | Babel的预设，包含ES7的部分特性                      |
| babel-register                     | ^6.26.0    | Babel的注册器，可以在运行时将ES6模块转换为ES5模块           |
| chalk                              | ^1.1.3     | 终端彩色输出库                                  |
| connect-history-api-fallback       | ^1.3.0     | 为HTML5历史API提供回退选项的中间件                    |
| copy-webpack-plugin                | ^4.0.1     | Webpack插件，用于将文件或文件夹复制到构建目录中              |
| css-loader                         | ^0.26.4    | 加载CSS文件的Webpack加载器                       |
| eventsource-polyfill               | ^0.9.6     | 用于WebSocket的EventSource polyfill         |
| extract-text-webpack-plugin        | ^2.1.2     | Webpack插件，用于从打包后的JS文件中提取CSS样             |
| file-loader                        | ^0.10.0    | 用于处理 webpack 中的文件依赖关系                    |
| friendly-errors-webpack-plugin     | ^1.1.3     | 友好显示 webpack 构建错误信息                      |
| function-bind                      | ^1.1.1     | ES6 函数绑定 polyfill                        |
| html-webpack-plugin                | ^2.30.1    | 用于生成 HTML 文件                             |
| http-proxy-middleware              | ^0.17.3    | http 代理中间件                               |
| node-sass                          | ^4.12.0    | sass 的 Node.js 绑定模块                      |
| opn                                | ^4.0.2     | 用于在 Node.js 中打开文件/URL 的模块                |
| optimize-css-assets-webpack-plugin | ^1.3.2     | 用于优化压缩 CSS 文件                            |
| ora                                | ^1.3.0     | 用于在控制台显示 loading 动画的模块                   |
| rimraf                             | ^2.6.2     | Node.js 中删除文件和文件夹的模块                     |
| sass-loader                        | ^6.0.6     | 用于处理 Sass 文件的 webpack loader             |
| semver                             | ^5.4.1     | Node.js 的版本管理工具                          |
| style-loader                       | ^0.16.1    | 用于将 CSS 添加到 DOM 的样式标签中                   |
| url-loader                         | ^0.5.9     | 用于将文件转换成 base64 URL 的 webpack loader     |
| vue-loader                         | ^11.1.4    | 用于处理 Vue.js 单文件组件的 webpack loader        |
| vue-style-loader                   | ^2.0.0     | 用于将 CSS 添加到 Vue.js 组件中的样式标签中             |
| webpack                            | ^2.7.0     | JavaScript 模块打包工具                        |
| webpack-bundle-analyzer            | ^2.9.0     | 用于分析 webpack 打包后的模块大小                    |
| webpack-dev-middleware             | ^1.12.0    | 用于在开发环境中将 webpack 打包后的文件暴露到 HTTP 服务器上    |
| webpack-hot-middleware             | ^2.19.1    | webpack 热更新中间件                           |
| webpack-merge                      | ^2.6.1     | 用于合并 webpack 配置的工具                       |

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