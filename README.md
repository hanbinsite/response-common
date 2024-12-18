
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

page-2.6.n  为springboot  2.6.x 版本，使用 jdk1.8,允许使用分页
page-2.7.n  为springboot  2.7.x 版本，使用 jdk1.8,允许使用分页
page-3.0.n  为springboot  3.0.x 版本，使用 jdk17,允许使用分页
page-3.3.n  为springboot  3.3.x 版本，使用 jdk17,允许使用分页

x 与 n 非对应关系
~~~

## 计划
1. 适配不同版本的springboot(2.6以及以下, 2.7， 3.0 以上)
2. 增加适配分页部分
3. 其他

## 其他
1. 目前使用springboot 3.3.3 版本
2. page-* 版本，必须配置 数据源，否则启动失败


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

~~~ java

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import site.hanbin.response.common.page.model.PageConfig;
import com.hb.scan.dining.server.common.page.utils.PageUtils;



 // 前端或者其他接收到的分页条数以及当前页数
Integer pageNum = 1;
Integer pageSize = 10;
PageConfig pageConfig = new PageConfig(pageNum, pageSize);

PageHelper.startPage(pageNum, pageSize);
// 获得list数据部分， mapper 可携带自定义参数
List<Object> adminListVos = dingTableMapper.selectDingTableList(name, status);
// 返回部分
PageUtils.getPageResult(pageConfig, new PageInfo<>(adminListVos));

~~~