import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import org.example.project.R

@Composable
actual fun callImage(location : Location){
    Image(
        painterResource(R.drawable.oma),
        modifier = Modifier.fillMaxSize(),
        contentDescription = location.toString()
    )
}