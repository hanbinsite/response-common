package site.hanbin.response.common.result.model;

import lombok.Data;

import java.io.Serializable;


/**
 * @author hanBinSuper
 */
@Data
public class Result<T> implements Serializable {

    /**
     * 错误码
     */
    private int code;

    /**
     * 提示消息
     */
    private String msg;

    /**
     * 返回的数据体
     */
    private T data;

    private String time;

}
