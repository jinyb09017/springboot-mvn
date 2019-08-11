## 日志说明
日志级别从低到高分为TRACE < DEBUG < INFO < WARN < ERROR < FATAL，如果设置为WARN，则低于WARN的信息都不会输出。

LogBack读取配置文件的步骤
（1）尝试classpath下查找文件logback-test.xml
（2）如果文件不存在，尝试查找logback.xml
（3）如果两个文件都不存在，LogBack用BasicConfiguration自动对自己进行最小化配置，这样既实现了上面我们不需要添加任何配置就可以输出到控制台日志信息。

作者：上进的小二狗
链接：https://www.jianshu.com/p/6dcb2e05dc5a
来源：简书
简书著作权归作者所有，任何形式的转载都请联系作者获得授权并注明出处。

日志框架介绍了解。
https://blog.csdn.net/qq_30604989/article/details/81841160



