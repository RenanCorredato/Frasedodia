package com.masterclass.frasedodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.masterclass.frasedodia.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val phrase = arrayOf(
        "A saudade é a nossa alma dizendo para onde ela quer voltar.",
        "Aprendi com as primaveras a deixar-me cortar e a voltar sempre inteira.",
        "O homem não morre quando deixa de viver, mas sim quando deixa de amar.",
        "O que importa afinal, viver ou saber que se está vivendo?",
        "Sonhe como se fosse viver para sempre, viva como se fosse morrer amanhã.",
        "O que vale não é o quanto se vive... mas como se vive...",
        "Você vive hoje uma vida que gostaria de viver por toda a eternidade?",
        "Uma vida não basta ser vivida. Ela precisa ser sonhada.",
        "Não precisa correr tanto, o que tiver de ser seu às mãos lhe há de vir.",
        "A arte de viver consiste em tirar o maior bem do maior mal."
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btNovaFrase.setOnClickListener {
            generatePhrase()
        }
    }

    fun generatePhrase() {

        val intentArray = phrase.size
        val numberRandom = Random().nextInt(intentArray)

        binding.tvFrase.text = phrase[numberRandom]

    }

}