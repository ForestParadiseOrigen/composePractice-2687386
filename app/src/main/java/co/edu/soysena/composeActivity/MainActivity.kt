package co.edu.soysena.composeActivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import co.edu.soysena.composeActivity.ui.theme.ComposeActivityTheme
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.border
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.clickable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material3.ElevatedButton
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Button
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeActivityTheme {
                //Columns and rows
                ColumnsAndRows()

            }
        }
    }
}

// COLUMNS AND ROWS
@Composable
@Preview
private fun ColumnsAndRows() {
    Surface(color = MaterialTheme.colorScheme.background) {
        Column{

            //First Row
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(MaterialTheme.colorScheme.primary)
            ){
                Text("Esta es una fila.")
            }

            //Divider between rows
            Spacer(modifier = Modifier .padding(vertical = 5.dp))

            //Second Row
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(MaterialTheme.colorScheme.primary)
            ){

                Column(modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .background(MaterialTheme.colorScheme.secondary)
                ){
                    Text("Esta es una columna.")
                }

                Spacer(modifier = Modifier .width(5.dp))

                Column(modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .background(MaterialTheme.colorScheme.secondary)
                ){
                    Text("Esta es una columna.")
                }

                Spacer(modifier = Modifier .width(5.dp))

                Column(modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .background(MaterialTheme.colorScheme.secondary)
                ){
                    Text("Esta es una columna.")
                }

                Spacer(modifier = Modifier .width(5.dp))

                Column(modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .background(MaterialTheme.colorScheme.secondary)
                ){
                    Text("Esta es una columna.")
                }

                Spacer(modifier = Modifier .width(5.dp))

                Column(modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .background(MaterialTheme.colorScheme.secondary)
                ){
                    Text("Esta es una columna.")
                }

                Spacer(modifier = Modifier .width(5.dp))

            }
        }
    }
} // END COLUMNS AND ROWS

// CARDS WHITH BUTTOMS
@Composable
private fun Greeting(name: String) {

    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(modifier = Modifier.padding(24.dp)) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "¡Buenas! ")
                Text(text = name)
            }
            ElevatedButton(
                onClick = { /* TODO */ }
            ) {
                Text("Mostrar mas")
            }
        }
    }
}

@Composable
fun MyApp(
    modifier: Modifier = Modifier,
    names: List<String> = listOf("Hernando", "Ronaldo")
) {
    Column(modifier = modifier.padding(vertical = 4.dp)) {
        for (name in names) {
            Greeting(name = name)
        }
    }
}



@Preview(showBackground = true, widthDp = 320)
@Composable
fun DefaultPreview() {
    ComposeActivityTheme {
        MyApp()
    }
}

// END CARD WHITH BUTTOMS

// ELEVATION OF STATE

@Composable
fun OnboardingScreen(modifier: Modifier = Modifier) {
    var shouldShowOnboarding by remember { mutableStateOf(true) }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("¡BIENVENIDO! Esta es una aplicacion creada con Jetpack Compose.")
        Button(
            modifier = Modifier.padding(vertical = 24.dp),
            onClick = { shouldShowOnboarding = false }
        ) {
            Text("Continue")
        }
    }
}

@Preview(showBackground = true, widthDp = 320, heightDp = 320)
@Composable
fun OnboardingPreview() {
    ComposeActivityTheme {
        OnboardingScreen()
    }
}

// END ELEVATION OF STATE
