package com.assertj

class SecuredMethod {
    @Secured(securityType = SecurityType.NEVER)
    fun lockedMethod(jwt: JWT) = "LOCKED"

    @Secured(securityType = SecurityType.ALWAYS)
    fun unlockedMethod(jwt: JWT) = "UNLOCKED"

    @Secured(securityType = SecurityType.JWT)
    fun jwtMethod(jwt: JWT) = "JWT"
}