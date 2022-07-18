package com.example.ktorview.presentation.ui

import android.os.Bundle
import com.example.ktorview.R
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.ktorview.data.ApiService
import com.example.ktorview.domain.models.ResponseModel
import com.example.ktorview.ui.theme.ScrollsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
//    private val apiService by lazy {
//        ApiService.create()
//    }

private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            val v = mainViewModel._state.value
            ScrollsTheme {
                Surface(color = MaterialTheme.colors.background) {
                    DisplayList(items = v.products)
                }
            }
        }
    }
}

@Composable
fun ListItem(item: ResponseModel) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                bottom = 6.dp,
                top = 6.dp,
            )
            .background(Color.Gray)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            //set the image url
            val painter = rememberImagePainter(
                data = item.image,
                builder = {
                    error(R.drawable.ic_launcher_background)
                }
            )

            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Crop,
                contentDescription = "Coil Image",
                painter = painter
            )
            Spacer(
                modifier = Modifier
                    .height(4.dp)
            )
            Text(
                text = item.title,
                fontSize = 18.sp
            )
            Spacer(
                modifier = Modifier
                    .height(4.dp)
            )
            Text(
                text = item.description,
                fontSize = 12.sp
            )
        }

    }
}

@Composable
fun DisplayList(items: List<ResponseModel>) {
    LazyColumn(modifier = Modifier.fillMaxSize(1F)) {
        items(items) { item ->
            ListItem(item = item)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    ScrollsTheme {
        ListItem(item = ResponseModel("title", "describe", ""))
    }
}