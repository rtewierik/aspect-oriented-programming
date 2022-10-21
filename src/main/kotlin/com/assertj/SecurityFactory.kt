package com.assertj

object SecurityFactory {

    fun createSecurity(securityType: SecurityType): Security =
        when(securityType) {
            SecurityType.ALWAYS -> AlwaysSecurity()
            SecurityType.NEVER -> NeverSecurity()
        }
}