package com.assertj

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut

@Aspect
class SecuredMethodAspect {

    @Pointcut("@annotation(secured)")
    fun securityPointcut(secured: Secured) {}

    @Around("securityPointcut(secured)")
    fun around(pjp: ProceedingJoinPoint, secured: Secured) =
        if (SecurityFactory.createSecurity(secured.securityType).isSecure()) pjp.proceed() else null
}