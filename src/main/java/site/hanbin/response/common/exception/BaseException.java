package site.hanbin.response.common.exception;


/**
 * @author hanbin
 */
public class BaseException extends RuntimeException {

    /**
     * 异常状态码
     */
    public int code;
    /**
     * 异常信息
     */
    public String msg;

    public BaseException() {
    }

    /**
     * @param code 状态
     * @param msg 信息
     */
    public BaseException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
