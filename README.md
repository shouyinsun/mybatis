# mybatis
mybatis 源码阅读

### Configuration
配置都在配置类

### MapperProxy 
mapper代理

### 3.3.1版本后ExecutorType为simple、reuse批量插入可以正确返回生成主键

### KeyGenerator
useGeneratedKeys 为true 使用 Jdbc3KeyGenerator

selectKey node 使用SelectKeyGenerator

### Interceptor
拦截器 pluginAll 作用于 Executor、ParameterHandler、ResultSetHandler、StatementHandler

### 缓存
##### 一级缓存
本地缓存,scope有 session(默认) statement,默认开启,update操作时清空
##### 二级缓存
默认不开启,二级缓存是多个SqlSession共享的,基于namespace的

开启mapper文件中需要设置 &lt;cache&gt; 标签,指定type，eviction，flushInterval等属性

### mybatis-spring
#### @MapperScan  
basePackages 

sqlSessionTemplateRef(多datasource) 

sqlSessionFactoryRef


#### MapperScannerConfigurer 
basePackage 

sqlSessionFactory 

sqlSessionTemplate

MapperScannerConfigurer 继承自 BeanDefinitionRegistryPostProcessor
BeanDefinitionRegistryPostProcessor 继承自 BeanFactoryPostProcessor 并且在其之前执行
如果参数中使用了placeholder,可以设置processPropertyPlaceHolders 属性,找出上下文中所有的 PropertyResourceConfigurer,
模拟spring环境,新建一个beanFactory,注册进bean,然后调用prc.postProcessBeanFactory(factory)
在BeanFactoryPostProcessor之前替换bean里对应placeholder属性



