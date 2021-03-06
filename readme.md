## 项目介绍
- 依赖：spring boot(2.1.7) + mybatis(mysql) + elastic search(6.4.1) + swagger2 + logback + lombok 
- 构建：maven 
- 多model


## 日志说明
日志级别从低到高分为TRACE < DEBUG < INFO < WARN < ERROR < FATAL，如果设置为WARN，则低于WARN的信息都不会输出。

LogBack读取配置文件的步骤
（1）尝试classpath下查找文件logback-test.xml
（2）如果文件不存在，尝试查找logback.xml
（3）如果两个文件都不存在，LogBack用BasicConfiguration自动对自己进行最小化配置，这样既实现了上面我们不需要添加任何配置就可以输出到控制台日志信息。

链接：https://www.jianshu.com/p/6dcb2e05dc5a

日志框架介绍了解。
https://blog.csdn.net/qq_30604989/article/details/81841160


## 数据库说明 
访问数据库的方式一般来说有两种，一种以Java Entity为中心，将实体和实体关系对应到数据库的表和表关系，例如Hibernate框架(Spring Data JPA由此实现)；另一种以原生SQL为中心，更加灵活便捷，例如Mybatis。
JPA和MyBatis各有各的好处，混合食用效果更佳。


## 过滤器和拦截器介绍
https://blog.csdn.net/GV7lZB0y87u7C/article/details/80649707






