package com.fc.exception;

import com.fc.util.Result;
import com.fc.util.ResultCode;

//这个类的作用是辅助类，把Code和Message都封装到这个类，就可以直接返回到前端了。
public class SuccessResult<T> extends Result<T> {
    public SuccessResult(){

    }

    public SuccessResult(T data) {
        super(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }
}