package com.assertj;

public class SecuredMethodJava {

    @SecuredJava(securityType = SecurityTypeJava.NEVER)
    public String lockedMethod() {
        return "LOCKED";
    }

    @SecuredJava(securityType = SecurityTypeJava.ALWAYS)
    public String unlockedMethod() {
        return "UNLOCKED";
    }
}