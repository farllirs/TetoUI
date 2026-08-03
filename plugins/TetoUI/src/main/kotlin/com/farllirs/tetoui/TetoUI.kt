package com.farllirs.tetoui

import android.content.Context
import com.aliucord.annotations.AliucordPlugin
import com.aliucord.entities.Plugin
import com.aliucord.patcher.*

@AliucordPlugin(requiresRestart = false)
@Suppress("unused")
class TetoUI : Plugin() {
    override fun start(context: Context) {
        logger.info("TetoUI cargado")
    }

    override fun stop(context: Context) {
        patcher.unpatchAll()
    }
}
