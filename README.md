这边注意高版本报错，builder注入失败；
把springboot 2.1.4.RELEASE换成了 2.0.5.RELEASE
 https://blog.csdn.net/maduo_duo/article/details/84866137
 
 https://github.com/spring-cloud/spring-cloud-gateway/issues/319
 
Java8的新特性Java中Lambda表达式的使用
 https://www.cnblogs.com/franson-2016/p/5593080.html
 
 Mono入门应用
 https://blog.csdn.net/songhaifengshuaige/article/details/79248343
 
 cURL是一个利用URL语法在命令行下工作的文件传输工具
 https://curl.haxx.se/download.html
 
 访问命令：
 
 这个可以
 http://localhost:8080/get
 
 这个命令还测试不通
 curl --dump-header - --header 'Host: www.hystrix.com' http://localhost:8080/delay/3
 
 网关简单的说就是提供一个对外统一的API入口和出口，统管企业对外的所有API出口。一般来说，网关对外暴露的URL或者接口信息，我们统称之为路由信息。如果研发过网关中间件，或者使用或了解过ZUUL的，网关的核心肯定是Filter以及Filter Chain(Filter责任链)。Spring Cloud Gateway也具有路由信息和Filter。下面介绍一下Spring Cloud gateway中最重要的几个概念:
 路由(route):路由网关的基本构建块。它由一个ID、一个目的URI、一组谓词和一组过滤器定义。如果聚合谓词为真，则路由匹配。
 
 断言(predicate): java 8中的断言函数。Spring Cloud Gateway中的断言函数输入类型是Spring 5.0框架中的ServerWebExchange。Spring Cloud Gateway中的断言函数允许开发者去定义匹配来自于http request中的任何信息，比如请求头和参数等。
 
 过滤器(filter):一个标准的Spring webFilter。Spring Cloud Gateway中的Filter分为两种类型的Filter，分别是Gateway Filter和Global Filter.网关 Filter实例是由Spring 框架中的网关Filter的特殊工厂构造。request在转发到目前服务之前，response在返回到调用端之前都可以被修改或者自定义。