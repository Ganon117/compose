package com.example.compose

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true, backgroundColor = 0xFFe1e1)
@Composable
private fun ModifierPreview(){
       //NewSpacing()
        NewSizes()
    //NewClick()
}

@Composable
fun NewSpacing(){
    Box(modifier = Modifier
        .padding(16.dp)
        .background(Color.White.copy(alpha = 0.6f))) {
        TextAnt()
        TextFrg(modifier = Modifier
            //.paddingFromBaseline(top = 24.dp))
            .offset(x = 16.dp, y = 16.dp))
    }
}
@Composable
fun NewSizes(){
    Column(modifier = Modifier
        .size(200.dp)
        .background(Color.Yellow)) {
    Column (modifier = Modifier
        .size(250.dp)
        .background(Color.Red)){
        TextAnt()
        //TextFrg(modifier = Modifier.fillMaxWidth())
        //TextFrg(modifier = Modifier.width(80.dp))
        TextFrg(modifier = Modifier
            .requiredWidth(80.dp)
            .requiredHeight(40.dp))
        NewClick(modifier = Modifier
            .background(Color.Blue)
            .fillMaxWidth())
    }
        TextFrg(modifier = Modifier.size(width = 70.dp, height = 70.dp))
    }

}
@Composable
fun NewClick(modifier: Modifier = Modifier){
    Box(modifier = modifier
        .padding(16.dp)
        .background(Color.White)){
        TextFrg(modifier = modifier
            .size(width = 120.dp, height = 64.dp)
            .padding(16.dp)
            .clickable { println("lala") })
    }
}