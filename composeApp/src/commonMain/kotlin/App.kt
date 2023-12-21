
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun App() {



    MaterialTheme {
        var currentLocation by remember { mutableStateOf<Location?>(null) }

        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {

           /* locationButton("OMA") { currentLocation = Location.OMA }
            locationButton("KEVIN") { currentLocation = Location.KEVIN }
            locationButton("SCHULE") { currentLocation = Location.SCHULE }*/

            Oberwelt()



            currentLocation?.let { location ->
                locationTest(location)
            }
        }
    }
}
data class Welt(val name: String)

@Composable
fun LocationInfo(level:Welt) {
    Text(text = level.name, fontSize = 24.sp,
        modifier = Modifier.padding(10.dp))
}
@Composable
fun Oberwelt() {
    Column{
        LocationInfo(level = Welt("Oberwelt"))
        Row (modifier = Modifier.padding(all =20.dp)){
            //Button(btn = Button("Oma"))
            LevelButton("Schule", onClick = { })
            Spacer(modifier = Modifier.width(100.dp))
            //Button(btn = Button("Kevin"))
            LevelButton("Kevin", onClick = { })
            Spacer(modifier = Modifier.width(20.dp))
            //Button(btn = Button("Justin"))
            LevelButton("Justin", onClick = {  })
        }
        Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
            //Button(btn = Button("Schule"))
            LevelButton("Schule", onClick = {  })
        }}
}

@Composable
fun LevelButton(name:String, onClick:()-> Unit) {
    Column(modifier = Modifier.wrapContentSize(Alignment.Center)) {
        TextButton(
            onClick = { onClick() })
        {
            Text(name)
        }

    }
}

