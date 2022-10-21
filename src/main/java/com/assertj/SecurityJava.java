package com.assertj;

interface SecurityJava {

    boolean isSecure();
}

class AlwaysSecurityJava implements SecurityJava {
    @Override
    public boolean isSecure() {
        return true;
    }
}

class NeverSecurityJava implements SecurityJava {
    @Override
    public boolean isSecure() {
        return false;
    }
}