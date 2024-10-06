package site.hanbin.response.common.result.enums;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class CustomEnum {

    static Integer successCode = CustomCodeEnum.ResultEnumInit.successCode;

    static Integer errorCode = CustomCodeEnum.ResultEnumInit.errorCode;

    static Integer notLoginCode = CustomCodeEnum.ResultEnumInit.notLoginCode;

    static Integer unknownCode = CustomCodeEnum.ResultEnumInit.unknownCode;

    static Integer tokenExpireCode = CustomCodeEnum.ResultEnumInit.tokenExpireCode;

    static Integer noAccessCode = CustomCodeEnum.ResultEnumInit.noAccessCode;

    @Getter
    public enum CustomCodeEnum {

        /**
         * 未知错误
         */
        UNKNOWN_ERROR(unknownCode, "未知错误"),
        /**
         * 成功
         */
        SUCCESS(successCode, "成功"),
        /**
         * 请求失败
         */
        FAIL(errorCode, "请求失败"),
        /**
         * 用户未登录
         */
        NOT_LOGIN(notLoginCode, "用户未登录"),
        /**
         * token已失效
         */
        TOKEN_EXPIRE(tokenExpireCode, "token已失效"),
        /**
         * 无访问权限
         */
        NO_ACCESS_RIGHT(noAccessCode, "无访问权限"),
        /**
         * 地址不存在
         */
        NOT_FOUND(404, "地址不存在"),
        /**
         * 基本信息中BasicInfoId为空
         */
        BASIC_INFO_ID_IS_EMPTY(600, "基本信息中BasicInfoId为空"),
        /**
         * 向数据库添加基本信息失败
         */
        BASIC_INFO_ADD_TO_DATABASE_FAILURE(601, "向数据库添加基本信息失败"),
        /**
         * 测试数据中BasicInfoId为空
         */
        DETAILS_DATA_BASIC_INFO_ID_IS_EMPTY(602, "测试数据中BasicInfoId为空"),
        /**
         * 向数据库添加测试数据失败
         */
        DETAILS_DATA_ADD_TO_DATABASE_FAILURE(603, "向数据库添加测试数据失败");

        CustomCodeEnum(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        private final int code;

        private final String msg;

        @Override
        public String toString() {
            return "ResultEnum{" +
                    "code=" + code +
                    ", msg='" + msg + '\'' +
                    '}';
        }





        @Component
        static class ResultEnumInit {

            private static Integer successCode;

            private static Integer errorCode;

            private static Integer notLoginCode;

            private static Integer unknownCode;

            private static Integer tokenExpireCode;

            private static Integer noAccessCode;

            @Value("${response.success:1}")
            public void setSuccessCode(Integer successCode) {
                ResultEnumInit.successCode = successCode;
            }

            @Value("${response.error:0}")
            public void setErrorCode(Integer errorCode) {
                ResultEnumInit.errorCode = errorCode;
            }

            @Value("${response.notLogin:400}")
            public void setNotLoginCode(Integer notLoginCode) {
                ResultEnumInit.notLoginCode = notLoginCode;
            }

            @Value("${response.unknown:-1}")
            public void setUnknownCode(Integer unknownCode) {
                ResultEnumInit.unknownCode = unknownCode;
            }

            @Value("${response.tokenExpire:401}")
            public void setTokenExpireCode(Integer tokenExpireCode) {
                ResultEnumInit.tokenExpireCode = tokenExpireCode;
            }

            @Value("${response.noAccess:402}")
            public void setNoAccessCode(Integer noAccessCode) {
                ResultEnumInit.noAccessCode = noAccessCode;
            }
        }
    }

}
