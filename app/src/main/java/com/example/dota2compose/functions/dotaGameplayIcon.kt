package com.example.dota2compose.functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.dota2compose.R

@Composable
fun dotaGameplayIcon() {
    // Рисуем рамку вокруг иконки игрового процесса Dota
    Box(
        modifier = Modifier
            .border(width = 0.7.dp, color = Color(0x00FFFFFF))
            .padding(0.7.dp)
            .offset(96.dp, 43.dp)
    ) {
        // Иконка игрового процесса Dota
        Image(
            painter = painterResource(id = R.drawable.dota_gameplay_icon),
            contentDescription = "Dota gameplay icon",
            modifier = Modifier
                .size(48.dp)
        )
    }
}