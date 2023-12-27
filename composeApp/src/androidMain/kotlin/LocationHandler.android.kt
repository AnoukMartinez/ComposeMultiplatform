import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import org.example.project.R

@Composable
actual fun LevelButton(location : Location, onClick : () -> Unit) {
    Column(modifier = Modifier.wrapContentSize(Alignment.Center)) {
        Image (
            painterResource(R.drawable.haus1), "Haus der jeweiligen Location",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .align(Alignment.CenterHorizontally)
        )
        TextButton (
            onClick = { onClick() }
        )
        {
            Text(location.toString())
        }
    }
}