
# 公共仓返回，定义公共code，msg部分
## 说明
1. 用于项目基础使用，公共返回类
2. 使用简单

## 使用
~~~ xml
<dependency>
    <groupId>site.hanbin</groupId>
    <artifactId>response-common</artifactId>
    <version>0.0.3</version>
</dependency>
~~~
~~~
version 
2.6.n  为springboot  2.6.x 版本，使用 jdk1.8
2.7.n  为springboot  2.7.x 版本，使用 jdk1.8
3.0.n  为springboot  3.0.x 版本，使用 jdk17
3.3.n  为springboot  3.3.x 版本，使用 jdk17

x 与 n 非对应关系
~~~

## 计划
1. 适配不同版本的springboot(2.6以及以下, 2.7， 3.0 以上)
2. 增加适配分页部分
3. 其他

## 其他
1. 目前使用springboot 3.3.3 版本


~~~ java
return ResultUtils.success(1, "返回信息", Object 返回数据);

return ResultUtils.success();

return ResultUtils.successOnlyMsg("返回信息");

return ResultUtils.success(Object 返回数据);

return ResultUtils.error(1, "错误信息");

return ResultUtils.error("错误信息");
~~~

~~~ java
throw new ApiException();

throw new ApiException("异常信息");

throw new ApiException(500, "异常信息");
~~~

## 自定义编码
~~~ java

response:
  success: 1 # 请求成功返回状态码
  error: 0 # 请求失败返回状态码
  notLogin: 400 # 用户未登录返回状态码
  unknown: -1 # 未知异常返回状态码
  tokenExpire: 401 # 用户登录token过期
  noAccess: 402 # 无访问权限返回状态码

~~~