public class SecuredMethodJava {

    @Secured(securityType = SecurityType.NEVER)
    public String lockedMethod() {
        return "LOCKED";
    }

    @Secured(securityType = SecurityType.ALWAYS)
    public String unlockedMethod() {
        return "UNLOCKED";
    }
}