package site.hanbin.response.common.result.utils;


import site.hanbin.response.common.result.enums.CustomEnum;
import site.hanbin.response.common.result.model.Result;

/**
 * @author hanbin
 */
public class ResultUtils {

    /**
     * 成功时生成result的方法,有返回数据
     */
    public static <T> Result<T> success(Integer code, String msg, T t) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(t);
        result.setTime(DateUtils.getNowTime());
        return result;
    }

    /**
     * 成功时生成result的方法,无返回数据
     */
    public static <T> Result<T> success() {
        return success(CustomEnum.CustomCodeEnum.SUCCESS.getCode(), CustomEnum.CustomCodeEnum.SUCCESS.getMsg(), null);
    }

    /**
     * 成功时生成result的方法,无返回数据
     */
    public static <T> Result<T> successOnlyMsg(String msg) {
        return success(CustomEnum.CustomCodeEnum.SUCCESS.getCode(), msg, null);
    }

    /**
     * 成功时生成result的方法,无返回数据
     */
    public static <T> Result<T> success(T t) {
        return success(CustomEnum.CustomCodeEnum.SUCCESS.getCode(), CustomEnum.CustomCodeEnum.SUCCESS.getMsg(), t);
    }

    /**
     * 失败时生成result的方法
     */
    public static <T> Result<T> error(int status, String msg) {
        Result<T> result = new Result<>();
        result.setCode(status);
        result.setMsg(msg);
        result.setTime(DateUtils.getNowTime());
        return result;
    }

    /**
     * 失败时生成result的方法
     */
    public static <T> Result<T> error(String msg) {
        return error(CustomEnum.CustomCodeEnum.FAIL.getCode(), msg);
    }

    /**
     * 返回未知错误异常
     */
    public static <T> Result<T> unknown(String msg) {
        return error(CustomEnum.CustomCodeEnum.UNKNOWN_ERROR.getCode(), msg);
    }

    /**
     * 返回未知错误异常
     */
    public static <T> Result<T> unknown() {
        return error(CustomEnum.CustomCodeEnum.UNKNOWN_ERROR.getCode(), CustomEnum.CustomCodeEnum.UNKNOWN_ERROR.getMsg());
    }
}
