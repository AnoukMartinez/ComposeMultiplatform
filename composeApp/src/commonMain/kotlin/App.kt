import Models.levels
import Views.Oberwelt
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun App() {
    MaterialTheme {
        var currentLocation by remember { mutableStateOf<Location?>(null) }

        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            // HomeScreen { }
            Oberwelt(levels) { selectedLocation ->
                currentLocation = selectedLocation
            }

            currentLocation?.let { location ->
                getLocationImage(location)
            }
        }
    }
}