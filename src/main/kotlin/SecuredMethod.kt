class SecuredMethod {
    @Secured(securityType = SecurityType.NEVER)
    fun lockedMethod() = "LOCKED"

    @Secured(securityType = SecurityType.ALWAYS)
    fun unlockedMethod() = "UNLOCKED"
}