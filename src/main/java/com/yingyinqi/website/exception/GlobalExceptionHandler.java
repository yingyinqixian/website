package com.yingyinqi.website.exception;

import com.yingyinqi.website.commons.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = Exception.class)
    public CommonResult exception(HttpServletRequest request, Exception e){
        String requestURI = request.getRequestURI();
        String method = request.getMethod();
        log.error("exception:请求方式：{}，请求路径：{}，异常信息：{}",method,requestURI,e.getMessage(),e);
        return CommonResult.failed();
    }
    @ExceptionHandler(value = CustomException.class)
    public CommonResult customException(HttpServletRequest request, CustomException e){
        String requestURI = request.getRequestURI();
        String method = request.getMethod();
        log.error("customException:请求方式：{}，请求路径：{}，异常信息：{}",method,requestURI,e.getMsg(),e);
        return CommonResult.failed(e.getCode(),e.getMsg());
    }
}