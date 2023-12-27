import androidx.compose.material.Card
import androidx.compose.material.Text
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
        callImage(location)
    }
}

@Composable
expect fun LevelButton(locationName : String, onClick : () -> Unit)