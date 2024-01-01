package Views

import Location
import LocationImage
import Models.Level
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.Navigator

@Composable
fun LevelView(navigator : Navigator, level : Level) {
    LocationImage(level.location)
    Row {
        IconButton(onClick = { navigator.goBack() }) {
            Icon(Icons.Filled.Home, contentDescription = "Back To Worldview")
        }
    }
}