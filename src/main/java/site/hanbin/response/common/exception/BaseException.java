package site.hanbin.response.common.exception;


import lombok.Getter;
import lombok.Setter;

/**
 * @author hanbin
 */
@Setter
@Getter
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

}
