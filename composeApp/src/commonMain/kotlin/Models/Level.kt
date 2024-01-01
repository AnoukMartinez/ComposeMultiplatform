package Models

import Location

// WORK IN PROGRESS...
// Vielleicht kann man hier eine Datei mit dem Script durchlaufen?
class Script(val testline : String) {
    fun getDialogue() {
        // WORK IN PROGRESS...
    }
}

data class Level (
    val location : Location,
    var discovered : Boolean = false,
    var cleared : Boolean = false,
    var script : Script
)

var kevinScript = Script("Oh hey Justin, wie geht's? Ich spiele gerade Fortnite...")
var omaScript = Script("Hallo Justin! Willst du ein paar selbstgemachte Kekse?")
var schuleScript = Script("Hey Mann, du hast doch in Informatik aufgepasst, oder?")
var justinScript = Script("Home Sweet Home... Zeit selber nach Hinweisen zu suchen.")

var kevin = Level(Location.KEVIN, script = kevinScript)
var oma = Level(Location.OMA, script = omaScript)
var schule = Level(Location.SCHULE, script = schuleScript)
var justin = Level(Location.JUSTIN, script = justinScript)

val levels = listOf(kevin, oma, schule, justin)