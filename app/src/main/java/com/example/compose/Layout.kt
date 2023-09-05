package com.example.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun LayoutPreview(){
//    NewFrameLayout()
//      NewLinearLayout()
    ConstrainLayout()
}
/*
@Composable
fun NewConstrainLayout() {
    *//*ConstraintLayout{
        val (normalA, normalF, filledF, container) = createRefs()
        Text(text = "Cursos Android ANT",Modifier.constrainAs(normalA){top.linkTo(parent.top)})
        Text(text = "Frogames", Modifier.constrainAs(normalF){top.linkTo(normalA.bottom)})
        TextFrg(modifier = Modifier.constrainAs(filledF){top.linkTo(normalF.top); start.linkTo(normalF.end)})
        Row(modifier = Modifier.constrainAs(container){top.linkTo(normalF.bottom)}) {
            TextAnt()
            TextFrg()
        }
    }*//*
    ConstraintLayout{
        val (normalA, normalF, filledF, container) = createRefs()
        Text(text = "Cursos Android ANT",Modifier.constrainAs(normalA){top.linkTo(parent.top)
        bottom.linkTo(parent.bottom);start.linkTo(parent.start);end.linkTo(parent.end)})
        Text(text = "Frogames", Modifier.constrainAs(normalF){top.linkTo(normalA.bottom)
        start.linkTo(normalA.start)})
        TextFrg(modifier = Modifier.constrainAs(filledF){top.linkTo(normalF.top); start.linkTo(normalF.end)})
        Row(modifier = Modifier.constrainAs(container){top.linkTo(normalF.bottom);start.linkTo(normalF.start)}) {
            TextAnt()
            TextFrg()
        }
    }
}*/
@Composable
fun ConstrainLayout() {

    ConstraintLayout{
        val (normalA, normalF, filledF, container,middle) = createRefs()
        TextAnt(modifier = Modifier.constrainAs(normalA){top.linkTo(parent.top)
            bottom.linkTo(parent.bottom);start.linkTo(parent.start);end.linkTo(parent.end)})
        Text(text = "Cursos Ant", Modifier.constrainAs(normalF){top.linkTo(normalA.bottom)
            start.linkTo(normalA.start)})
        Text(text = "Frogames", Modifier.constrainAs(filledF){top.linkTo(normalF.bottom); start.linkTo(normalA.start)})
        TextFrg(modifier = Modifier.constrainAs(middle){top.linkTo(normalF.bottom); bottom.linkTo(filledF.top); end.linkTo(filledF.start)})
        Row(modifier = Modifier.constrainAs(container){top.linkTo(filledF.bottom);start.linkTo(filledF.start)}) {
            TextAnt()
            TextFrg()
        }
    }
}

@Composable
fun NewLinearLayout() {
    /*Column(horizontalAlignment = Alignment.End , verticalArrangement = Arrangement.Center) {
        Text(text = "Cursos Android ANT")
        Text(text = "Frogames")
        Row {
            TextAnt()
            TextFrg()
        }
    }*/
    Row(verticalAlignment = Alignment.Top) {
        Text(text = "Cursos Android ANT")
        Column(horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Bottom) {
            Row {
                Text(text = "Frogames")
                TextFrg()
            }
                Row {
                    TextAnt()
                    TextFrg()
                }

        }

    }
}

@Composable
fun TextAnt(modifier: Modifier = Modifier) {
    Text(text = "Cursos Android ANT", modifier.background(Color.Blue))

}

@Composable
fun TextFrg(modifier: Modifier = Modifier) {
    Text(text = "Frogames", modifier.background(Color.Gray))
}
@Composable
fun NewFrameLayout(){

    Box(contentAlignment = Alignment.CenterEnd) {
        Text(text = "Cursos Android ANT")
        Text(text = "Frogames")
    }
}