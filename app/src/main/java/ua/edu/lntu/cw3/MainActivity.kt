package ua.edu.lntu.cw3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ua.edu.lntu.cw3.ui.theme.IPZ_CR_3Theme
import ua.edu.lntu.cw3.data.Datasource
import ua.edu.lntu.cw3.model.CardText
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.platform.LocalContext
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CR_3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingPreview()
                }
            }
        }
    }
}

@Composable
fun card(card:CardText, modifier: Modifier = Modifier) {

    Text(
        text = LocalContext.current.getString(card.stringResourceIdName),
        modifier = modifier.padding(bottom = 10.dp)
    )
    Text(
        text = LocalContext.current.getString(card.stringResourceIdDescription),
        modifier = modifier.padding(bottom = 10.dp)
    )
}
@Composable
fun CardList(cardList: List<CardText>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(cardList) {card ->
            card(
                card = card,
                modifier = Modifier.padding(bottom = 20.dp)
            )
        }
    }
}
@Composable
fun CardApp() {
    CardList(
        cardList = Datasource().loadCards(),
    )
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IPZ_CR_3Theme {
CardApp()
    }
}