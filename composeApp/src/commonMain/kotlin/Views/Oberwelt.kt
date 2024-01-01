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
import moe.tlaster.precompose.navigation.Navigator

@Composable
fun Oberwelt(
    listOfLevels : List<Level>,
    navigator : Navigator,
    onLocationSelected : (Location) -> Unit
) {
    Column {
        Row (modifier = Modifier.padding(20.dp)){
            for(i in 0..< listOfLevels.size / 2){
                LevelButton(listOfLevels[i].location) {
                    navigator.navigate("/${listOfLevels[i].location.toString().lowercase()}")
                }
            }
        }

        Row (modifier = Modifier.padding(20.dp)){
            for(i in listOfLevels.size / 2..< listOfLevels.size) {
                LevelButton(listOfLevels[i].location) {
                    navigator.navigate("/${listOfLevels[i].location.toString().lowercase()}")
                }
            }
        }
    }
}