class SecurityFactoryJava {

    public static SecurityJava createSecurity(SecurityTypeJava securityTypeJava) {
        SecurityJava result = null;
        switch (securityTypeJava) {
            case NEVER:
                result = new NeverSecurityJava();
            case ALWAYS:
                result = new AlwaysSecurityJava();
        }
        return result;
    }
}