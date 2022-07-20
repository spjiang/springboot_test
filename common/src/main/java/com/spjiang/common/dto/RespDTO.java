package com.spjiang.common.dto;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONType;
import com.spjiang.common.exception.ErrorCode;

import java.io.Serializable;

@JSONType(orders = {"ErrorCode", "Message", "Data", "RefreshTime"})
public class RespDTO<T> implements Serializable {

    private static final long serialVersionUID = 7862697510309623240L;
    public int ErrorCode = 0;
    public String Message = "";
    public long RefreshTime = (System.currentTimeMillis() / 1000);
    public T Data;

    public static RespDTO onSuc(Object data) {
        RespDTO resp = new RespDTO();
        if (data == null) {
            resp.Data = new JSONObject();
        } else {
            resp.Data = data;
        }

        return resp;
    }

    public static RespDTO onSuc(String sucMsg, Object data) {
        RespDTO resp = new RespDTO();
        if (data == null) {
            resp.Data = new JSONObject();
        } else {
            resp.Data = data;
        }
        resp.Message = sucMsg;

        return resp;
    }

    public static RespDTO onError(int errCode, String errMsg) {
        RespDTO resp = new RespDTO();
        resp.Data = new JSONObject();
        resp.ErrorCode = errCode;
        resp.Message = errMsg;
        return resp;
    }

    public static RespDTO onError(ErrorCode errCode) {
        RespDTO resp = new RespDTO();
        resp.Data = new JSONObject();
        resp.ErrorCode = errCode.getCode();
        resp.Message = errCode.getMsg();
        return resp;
    }

    public Boolean isSuccess() {
        return ErrorCode == 0;
    }

    public static RespDTO onError(String errMsg) {
        RespDTO resp = new RespDTO();
        resp.Data = new JSONObject();
        resp.ErrorCode = com.spjiang.common.exception.ErrorCode.FAIL.getCode();
        resp.Message = errMsg;
        return resp;
    }


    @Override
    public String toString() {
        return
                "{ErrorCode=" + ErrorCode +
                        ", Message='" + Message + '\'' +
                        ", Data=" + Data +
                        ", RefreshTime=" + RefreshTime +
                        '}';
    }
}
