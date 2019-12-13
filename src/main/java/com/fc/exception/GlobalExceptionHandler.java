package com.fc.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fc.util.Result;

/**
 * 统一异常处理
 * 我们再添加一个GlobalExceptionHandler类，来处理每个抛出DomainException类返回的数据，前返回Result给前端了
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	
	// 系统运行异常
	@ResponseBody
	@ExceptionHandler(value = {RuntimeException.class,Exception.class})
    public Result<?> domainExceptionHandler(HttpServletRequest req, Exception e){
		// e.printStackTrace(); // 打印异常
        Result<?> Result = new Result(123456, "系统异常");
        return Result;
    }
	
	// 自定义捕捉异常
	@ResponseBody
	@ExceptionHandler(value = {DomainException.class})
	public Result<?> domainExceptionHandler(DomainException e){
		Result<?> Result = new Result(e.getErrCode(), e.getMessage());
		return Result;
	}
} 
