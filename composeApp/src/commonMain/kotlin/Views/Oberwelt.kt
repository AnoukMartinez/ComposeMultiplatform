package Views

import LevelButton
import Location
import Models.Level
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Oberwelt(
    listOfLevels: List<Level>,
    onLocationSelected: (Location) -> Unit
) {
    Column {
        Row (modifier = Modifier.padding(20.dp)){
            for(i in 0..< listOfLevels.size / 2){
                LevelButton(listOfLevels[i].location) { onLocationSelected(listOfLevels[i].location) }
            }
        }
        Row (modifier = Modifier.padding(20.dp)){
            for(i in listOfLevels.size / 2..< listOfLevels.size) {
                LevelButton(listOfLevels[i].location) { onLocationSelected(listOfLevels[i].location) }
            }
        }
    }
}