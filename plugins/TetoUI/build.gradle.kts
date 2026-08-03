version = "1.0.1" // Plugin version. Increment this to trigger an update
description = "Interfaz rediseñada para Aliucord" // Plugin description that will be shown to user

aliucord {
    // Changelog of your plugin
    changelog.set(
        """
        # 1.0.1
        * Corregir autor y repositorio en el manifest
        """.trimIndent(),
    )

    // Excludes this plugin from publishing and global plugin repositories.
    // Set this to false if the plugin is unfinished
    deploy.set(true)
}
