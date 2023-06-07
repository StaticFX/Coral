package com.zellerfeld


/**
 * Coral is a single application hosting a single discord bot.
 * Its manages the bot by wrapping around the JDA Api. To make executions and programing simpler Coral provides a lot of functions and builders to minimize code.
 *
 * Coral is build from different modules
 *  - API containing the main developer API for extensions
 *  - HTTP containing the http api to control coral
 *
 * Coral itself only provides a connection to the discord bot and very limited functionality.
 * To fully use coral extensions need to be added, therefore the extensions api can be used.
 *
 */
object Coral {

    init {
        boot()
    }

    private fun boot() {
        println("www")
    }


}