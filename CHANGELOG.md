# 更新日志 CHANGELOG

## [V1.2.1-RELEASE] 2019.08.20

### ⚡️ Optimization
- 启用项目静态资源访问，可访问static/templates目录下资源
- static资源访问：http://127.0.0.1:8888/static/welcome.html
- templates资源访问：http://127.0.0.1:8888/templates/springbootplus.html

###  ⭐️  New Features
- 文件上传保存到服务器指定目录
- 文件下载
- 访问上传的图片等资源
- static/templates项目静态资源访问

### 📝 Added/Modified
- Add `UploadController` 上传控制器
- Add `DownloadController` 下载控制器
- Add `ImageController` 图片访问控制器
- Add `ResourceInterceptor` 资源拦截器

- Add `welcome.html` 在`static`目录下
- Add `springbootplus.html` 在`templates`目录下

- Modify `WebMvcConfig` 注册资源拦截器，项目静态资源访问配置
- Modify `SpringBootPlusConfig` 创建 `ResourceInterceptor` 资源拦截器
- Modify `SpringBootPlusInterceptorConfig` 添加 `resourceConfig` 资源拦截器配置 
- Modify `SpringBootPlusProperties`  添加 `uploadPath`,`resourceAccessPath`,`resourceAccessPatterns`,`resourceAccessUrl`属性
- Modify `application.yml`, `application-local.yml` 添加文件上传/下载配置

- Modify `mysql_spring_boot_plus.sql` 添加创建数据库语句，如果不存在，则创建


### 🔨 Dependency Upgrades
- Upgrade to springboot 2.1.7.RELEASE



## [V1.2.0-RELEASE] 2019.08.06
### 🚀 spring-boot-plus演示地址
- 👉 [spring-boot-plus演示地址-Spring Boot Admin](http://47.105.159.10:8888)

- 👉 [spring-boot-plus演示地址-Swagger](http://47.105.159.10:8888/docs)

###  ⭐️  New Features
- 集成`maven-assembly-plugin`进行项目打包
- 启动/重启脚本
- 提取`config`配置文件到项目外部
- 可配置代码生成查询参数是否支持排序
- 可配置代码生成策略：ALL/SIMPLE
- 新增`SpringBootPlusProperties`自定义属性配置类
- 新增`SpringBootPlusConfig`项目配置类

### ⚡️ Optimization
- 优化启动命令脚本路径
- 优化配置文件，设置默认值
- 优化分页排序，使用`OrderItem`
- 优化代码生成器模板
- 完成CRUD单元测试
- 完成Swagger接口测试 
- 删除OrderEnum枚举类，使用`OrderItem`替代
- 移除Rabbit/Kafka MQ配置，将在后续版本中已模块形式体现
- 优化刷新Swagger，后台报404 NOT FOUND，设置Swagger版本为`2.6.1`
- 优化`application.yml`及`application-xxx.yml`配置文件

### 🐞  Bug Fixes
- 修复LocalDateTime日期错误问题，使用Date日期类型
- 修复SpringBootAdmin在线查日志错误问题

### 📔  Documentation
- [项目打包](https://springboot.plus/guide/pack.html)
- [运维部署](https://springboot.plus/guide/deploy.html)
- [FAQ-LocalDateTime](https://springboot.plus/guide/faq.html#localdatetime日期类使用问题)

### 🔨 Dependency Upgrades
- Upgrade to mybatis-plus 3.1.2
- Upgrade to druid 1.1.18
- Upgrade to fastjson 1.2.59


## [V1.1.0-RELEASE] 2019.08.01
###  ⭐️  New Features
- 集成spring boot admin 后台监控功能

### ⚡️ Optimization
- 细节优化
- dev和 local环境一致


### 📔  Documentation
- [ Eclipse中使用spring-boot-plus项目详细步骤](https://springboot.plus/guide/eclipse-spring-boot-plus.html)
- [集成Spring Boot Admin](https://springboot.plus/guide/springbootadmin.html)
- [FAQ](https://springboot.plus/guide/faq.html)

### 😃 QQ技术交流讨论群
![QQ技术交流讨论群](https://raw.githubusercontent.com/geekidea/spring-boot-plus/master/docs/img/spring-boot-plus-qq-group.png)


## [V1.0.0-RELEASE] 2019.07.10
###  ⭐️  New Features
- 集成spring boot 2.1.6.RELEASE
- 集成mybatis-plus 3.1.1
- 集成redis
- 集成druid数据库连接池
- 集成rabbit/kafka mq
- 集成maven assembly项目打包
- 启动、重启命令脚本
- 项目公共代码部分
- AOP记录请求响应日志：LogAop
- 统一响应结果处理：ApiResult
- 公共常量
- 常用validator注解约束：EmailValidator、EnumTypeValidator、IdCardValidator、PhoneValidator
- 提取公共类：BaseEntity、BaseService、BaseServiceImpl、BaseTypeStateEnum、BaseController、QueryParam等
- 全局异常处理：BusinessException、GlobalErrorController、GlobalExceptionHandler
- 跨域处理Filter：CrossDomainFilter
- 请求路径处理Filter：RequestPathFilter
- 分页封装
- 公共配置部分
- 转换器配置
- FastJson、Jackson 全局配置
- kafka/rabbit mq配置
- 文件上传配置
- mybatis-plus配置
- Redis缓存配置
- swagger配置
- webmvc配置
- 获取请求信息ip及对应的地区
- system模块
- 不同环境打包不同配置文件
- logback.xml日志配置
- 常用工具类等
- 代码生成器
- 自定义代码生成模板

### 📔  Documentation
- 官网：[https://springboot.plus](https://springboot.plus)
- GITHUB：[https://github.com/geekidea/spring-boot-plus](https://github.com/geekidea/spring-boot-plus "spring-boot-plus github")
- GITEE：[https://gitee.com/geekidea/spring-boot-plus](https://gitee.com/geekidea/spring-boot-plus "spring-boot-plus gitee")
