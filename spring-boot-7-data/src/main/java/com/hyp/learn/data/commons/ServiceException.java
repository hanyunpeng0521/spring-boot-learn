package com.hyp.learn.data.commons;

import lombok.Data;

import java.util.Map;

/**
 * @author hyp
 * Project name is spring-boot-learn
 * Include in com.hyp.learn.async.commons
 * hyp create at 19-12-21
 **/
@Data
public class ServiceException extends Exception{
    private  ErrorCode code;
    private  Map<String, ? extends Object> errors;
}

