package com.fc.exception;

import com.fc.util.ResultCode;

//DomainException的作用是要抛出的异常类，从代码中可以看出它是继承RuntimeException类的，
//所以可以使用throw new DomainException(ResultCode.XX);这样就可以抛到前端。
public class DomainException extends RuntimeException {
    private int errCode = ResultCode.Unknown_Exception.getCode();

    public DomainException() {
        super(ResultCode.Unknown_Exception.getMessage());
    }

    public DomainException(ResultCode ResultCode) {
        super(ResultCode.getMessage());
        this.errCode = ResultCode.getCode();
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }
}