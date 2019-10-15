package com.example.hk.exception;

import com.example.hk.utils.JSONResponse;
import com.example.hk.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author huangkai
 * @desc
 * @date 2019/10/15
 */
@ControllerAdvice
@ResponseBody  //表示返回的对象，Spring会自动把该对象进行json转化，最后写入到Response中。
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    // 只拦截自定义异常类
    @ExceptionHandler(ServiceException.class) //表示让Spring捕获到所有抛出的SignException异常，并交由这个被注解的方法处理。
    @ResponseStatus(HttpStatus.BAD_REQUEST)  //表示设置状态码。
    JSONResponse handleException(Exception e){
        logger.error(e.getMessage()) ;
        return ResultUtil.error(e.getMessage());
    }
}
