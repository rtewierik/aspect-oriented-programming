package com.assertj

class Main {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val service = SecuredMethod()
            service.lockedMethod(JWT("invalid"))
            service.unlockedMethod(JWT("valid"))
        }
    }
}