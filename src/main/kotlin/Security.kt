interface Security {

    fun isSecure(): Boolean
}

class AlwaysSecurity : Security {
    override fun isSecure() = true
}

class NeverSecurity : Security {
    override fun isSecure() = false
}