package com.example.dota2compose.functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.dota2compose.R

@Composable
fun headerImage(){
    Image(
        painter = painterResource(id = R.drawable.header_image),
        contentDescription = "HeaderImage",
        modifier = Modifier
            .size(628.dp, 354.dp)
    )
}