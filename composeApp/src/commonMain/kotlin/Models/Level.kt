package Models

import Location

class Level (
    val location : Location,
    var discovered : Boolean = false,
    var cleared : Boolean = false
)

var kevin = Level(Location.KEVIN)
var oma = Level(Location.OMA)
var schule = Level(Location.SCHULE)
var justin = Level(Location.JUSTIN)

val levels = listOf(kevin, oma, schule, justin)