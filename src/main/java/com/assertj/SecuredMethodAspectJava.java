package com.assertj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecuredMethodAspectJava {

    @Pointcut("@annotation(secured)")
    public void securityPointcut(SecuredJava secured) {}

    @Around("securityPointcut(secured)")
    public Object around(ProceedingJoinPoint pjp, SecuredJava secured) throws Throwable {
        return SecurityFactoryJava.createSecurity(secured.securityType()).isSecure() ? pjp.proceed() : null;
    }
}