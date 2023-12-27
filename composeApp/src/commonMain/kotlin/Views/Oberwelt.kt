package Views

import LevelButton
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Oberwelt() {
    Column {
        Row (modifier = Modifier.padding(20.dp)){
            LevelButton("Oma", onClick = { })
            LevelButton("Kevin", onClick = { })
            LevelButton("Justin", onClick = { })
        }

        Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
            //Button(btn = Button("Schule"))
            LevelButton("Schule", onClick = { })
        }
    }
}