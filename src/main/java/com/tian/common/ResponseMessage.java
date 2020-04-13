package com.tian.common;

/**
 * @ Copyright:Zhejiang DRORE Technology
 * @ Desc:
 * @ ProjectName: crawler_gather
 * @ Date: 2018/7/10$ 11:01$
 * @ Author: caowj
 */
public class ResponseMessage {
    private boolean success=true;
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public ResponseMessage setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResponseMessage setMessage(String message) {
        this.message = message;
        return this;
    }

    public ResponseMessage(String message) {
        this.message = message;
    }
}
