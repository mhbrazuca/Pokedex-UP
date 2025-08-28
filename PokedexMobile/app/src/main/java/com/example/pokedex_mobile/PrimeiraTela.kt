package com.example.pokedex_mobile

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class PrimeiraTela : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("👋 Bem-vindo à Pokedéx")

                Spacer(modifier = Modifier.height(20.dp))


                Button(onClick = {
                    val intent = Intent(this@PrimeiraTela, SegundaTela::class.java)
                    intent.putExtra("nome", "Pikachu")
                    startActivity(intent)
                }) {
                    Text("Ir para Segunda Tela")
                }
            }
        }
    }
}
