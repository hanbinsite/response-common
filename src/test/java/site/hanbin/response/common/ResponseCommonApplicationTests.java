package site.hanbin.response.common;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import site.hanbin.response.common.result.enums.CustomEnum;
import site.hanbin.response.common.result.utils.ResultUtils;

@SpringBootTest
@Slf4j
class ResponseCommonApplicationTests {

    @Test
    void contextLoads() {
        log.info("成功 自定义 状态码， 信息， 数据: {}", ResultUtils.success(1, "返回信息", "这是数据"));
        log.info("成功  全部默认: {}", ResultUtils.success());
        log.info("成功  自定义信息: {}", ResultUtils.successOnlyMsg("返回信息"));
        log.info("成功  自定义数据: {}", ResultUtils.success("这是数据"));
        log.info("异常 自定义 状态码， 信息: {}", ResultUtils.error(1, "返回信息"));
        log.info("异常 自定义 信息: {}", ResultUtils.success("返回信息"));

        log.info("异常 自定义 信息: {}", ResultUtils.success(CustomEnum.CustomCodeEnum.UNKNOWN_ERROR.getCode(),
                CustomEnum.CustomCodeEnum.UNKNOWN_ERROR.getMsg(), "eeee"));
    }

}
