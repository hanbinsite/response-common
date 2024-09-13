package site.hanbin.response.common.exception;


import site.hanbin.response.common.result.enums.ResultEnum;

/**
 * @author hanbin
 */
public class NotLoginException extends BaseException {


    public NotLoginException() {
        this.code = ResultEnum.NOT_LOGIN.getCode();
        this.msg = ResultEnum.NOT_LOGIN.getMsg();
    }
}
