import Models.Level
import androidx.compose.material.Card
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

public enum class Location {
    OMA,
    KEVIN,
    SCHULE,
    JUSTIN;

    fun getDesktopPath() : String {
        return this.toString().lowercase() + ".png";
    }
}

@Composable
fun getLocationImage(location : Location) {
    Card(modifier = Modifier) {
        LocationImage(location)
    }
}

@Composable
expect fun LevelButton(location: Location, level :  Level, onClick: () -> Unit)