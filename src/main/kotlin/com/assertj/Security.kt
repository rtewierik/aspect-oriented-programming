package com.assertj

interface Security {

    fun isSecure(jwt: JWT): Boolean
}

class JWTSecurity : Security {
    override fun isSecure(jwt: JWT) = jwt.token == "valid" // Token validation algorithm
}

class AlwaysSecurity : Security {
    override fun isSecure(jwt: JWT) = true
}

class NeverSecurity : Security {
    override fun isSecure(jwt: JWT) = false
}