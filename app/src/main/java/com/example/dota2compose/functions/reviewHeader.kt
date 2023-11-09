package com.example.dota2compose.functions

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dota2compose.R

@Composable
fun reviewHeader(){
    Text(
        modifier = Modifier
            .padding(start = 24.dp, top = 20.dp),
        text = "Review & Ratings",
        style = TextStyle(
            fontSize = 16.sp,
            fontFamily = FontFamily(Font(R.font.sk_modernist)),
            fontWeight = FontWeight(700),
            color = Color(0xFFEEF2FB),
            letterSpacing = 0.6.sp,
        )
    )
}