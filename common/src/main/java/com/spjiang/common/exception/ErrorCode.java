package com.spjiang.common.exception;


public enum ErrorCode {

    OK(0, ""),
    API_SIGN_ERROR(-4, "签名错误"),
    PARAMS_ERROR(-3, "参数错误"),
    RPC_ERROR(-2, "远程调度失败"),
    FAIL(-1, "操作失败"),
    USER_NOT_FOUND(1000, "用户不存在"),
    USER_PASSWORD_ERROR(1001, "密码错误"),
    USER_HAS_EXISTED(1002, "用户已经存在"),
    TOKEN_INVALID(1003, "无效的访问token"),
    TOKEN_EXPIRED(1004, "token过期了"),
    TOKEN_IS_NOT_MATCH_USER(1005, "请使用自己的token进行接口请求"),
    NO_LOGIN(1006, "未登录"),
    ROLE_NOT_EXIST(1007, "角色不存在"),
    ROLE_HAS_EXISTED(1008, "角色已经存在"),
    NO_OPERATION_ROLE(1009, "无权限操作"),
    TIME_OUT(1010, "请求超时"),
    USER_NOT_PASS(1011, "用户名或密码错误"),
    USER_AUTH_FAIL(1012, "认证失败"),
    OPERATION_CLIENT_FAIL(1013, "操作的平台不能为空"),
    No_Client(1014, "应用不能为空"),
    No_RepeatClient(1015, "应用不能重复"),
    SMS_SEND_CODE_DAY_MAX_NUM(2001, "超过最大短信发送次数");

    public static final String MSG_PASSWORD_LENGTH_ERROR = "密码长度不正确";
    public static final String MSG_PASSWORD_ID_ERROR = "密码用户Id不正确";

    private int code;
    private String msg;


    ErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static ErrorCode codeOf(int code) {
        for (ErrorCode state : values()) {
            if (state.getCode() == code) {
                return state;
            }
        }
        return null;
    }
}
