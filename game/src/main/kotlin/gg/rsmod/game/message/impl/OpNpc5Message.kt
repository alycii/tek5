package gg.rsmod.game.message.impl

import gg.rsmod.game.message.Message

/**
 * @author Tom <rspsmods@gmail.com>
 */
data class OpNpc5Message(
    val index: Int,
    val movementType: Int,
) : Message
