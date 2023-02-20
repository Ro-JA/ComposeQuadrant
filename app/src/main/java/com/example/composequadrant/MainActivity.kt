package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {

}

@Composable
fun ComposeQuadrant() {
    Row(
        modifier = Modifier
            .fillMaxWidth().fillMaxHeight(0.5f)
    ) {
        Column(
            modifier = Modifier
                .padding(all = 16.dp).fillMaxHeight().fillMaxWidth(0.5f)
                .background(Color.Green),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center


        ) {
            Text(
                text = stringResource(id = R.string.column_composable_first),
                modifier = Modifier.padding(bottom = 16.dp),
                fontWeight = FontWeight.Bold
            )

            Text(
                text = stringResource(id = R.string.text_composable_second),
                textAlign = TextAlign.Justify
            )
        }

        Column(
            modifier = Modifier
                .padding(all = 16.dp)
                .fillMaxHeight()
                .fillMaxWidth(0.5f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,


            ) {
            Text(
                text = stringResource(id = R.string.image_composable_first),
                modifier = Modifier.padding(bottom = 16.dp),
                fontWeight = FontWeight.Bold
            )

            Text(
                text = stringResource(id = R.string.image_composable_second),
                textAlign = TextAlign.Justify
            )
        }

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrant()
    }
}