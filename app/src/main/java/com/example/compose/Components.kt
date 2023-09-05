package com.example.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun ComponentsPreview(){
    //NewTextView()
    Components()

}
@Composable
fun Components(){
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)) {
        Column(modifier = Modifier.padding(8.dp)) {
            NewTextView()
            CustomDiver()
            NewTextField()
            NewTextFieldOutline()
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewTextField(){
        var textValue by remember { mutableStateOf("Hi") }
    TextField(value = textValue, onValueChange = {textValue = it}, label = { Text(text = "Escribe ALgo")})
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewTextFieldOutline(){
        var textValue by remember { mutableStateOf("") }
    var passwordValue by remember { mutableStateOf("") }
    OutlinedTextField(value = textValue,
        onValueChange = {textValue = it},
        label = { Text(text = "Life Cycle")},
        modifier = Modifier.fillMaxWidth())

    OutlinedTextField(value = passwordValue,
        onValueChange = {passwordValue = it},
        visualTransformation = PasswordVisualTransformation(),
        trailingIcon = { if (passwordValue.isNotBlank()) Icon(imageVector = Icons.Filled.Clear, contentDescription = "Erase", modifier = Modifier.clickable { passwordValue = "" })},
        label = { Text(text = "Contrasena")},
        modifier = Modifier.fillMaxWidth())

}


@Composable
fun NewTextView(){



        Text(
            text = "JetPackCompose",
            color = Color.Blue,
            fontSize = 28.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Black,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Magenta,
                    offset = Offset(6f, 6f),
                    blurRadius = 4f
                )
            )
        )
        Text(
            text = "The best course in the worlwide into this city to avoid misstakes in this part to understand better this part for all parts of the parts",
            style = MaterialTheme.typography.bodySmall, maxLines = 1 , overflow = TextOverflow.Ellipsis
        )
        Text(text = buildAnnotatedString {
            withStyle(style = SpanStyle(fontWeight = FontWeight.ExtraBold)){append("Batman")}
            append(",Bruce Wayne")
        })
        Text(text = "Let´s go to the next one.",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleLarge)

}
@Composable
fun CustomDiver(){
        Spacer(modifier = Modifier.height(8.dp))
        Divider(Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(16.dp))
}