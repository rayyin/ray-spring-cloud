package com.ray.cloud.app.provider.common.result;

/**
 * @author yinrui
 * @version 1.0
 */
import java.io.Serializable;

public class Result<T> implements Serializable {

    private static final long serialVersionUID = 7024571167626813460L;

    int code;
    String msg;
    T data;

    public Result(int code, String msg) {
        this.setCode(code);
        this.setMsg(msg);
    }

    public Result() {
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}