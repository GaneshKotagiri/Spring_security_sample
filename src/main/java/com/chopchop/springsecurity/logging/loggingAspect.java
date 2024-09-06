package com.chopchop.springsecurity.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class loggingAspect {

    public static final Logger logging= LoggerFactory.getLogger(loggingAspect.class);

    @AfterReturning("execution(* com.chopchop.springsecurity.controllers.homeController.hello(..))")
    public void callMethod(JoinPoint jp){
        logging.info(jp.getSignature().getName()+ " Method is executed successfully!");
    }

}
