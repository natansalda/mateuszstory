package com.example.mateuszstory

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun makePartOne(view: View) {
        header_text.setTextColor(resources.getColor(R.color.colorPrimary))
        header_text.text = "Najperw dołączyłem do zespołu ,Android Gdynia'"
    }

    fun makePartTwo(view: View) {
        header_text.setTextColor(Color.RED)
        header_text.text = "Moją pierwszą aplikacją miała nazwę 'Moje miasto Gdynia'"
    }

    fun makePartThree(view: View) {
        header_text.setTextColor(Color.GREEN)
        header_text.text = "Drugą aplikacją którą robiłem była to 'Aplikacja do zgadywania liczb'"
    }

    fun makePartFour(view: View) {
        header_text.setTextColor(Color.MAGENTA)
        header_text.text = "Ćwiczyłem wykonywanie wyglądu aplikacji na Androida"
    }

    fun makePartFive(view: View) {
        header_text.setTextColor(Color.DKGRAY)
        header_text.text = "Uczyłem się programować funkcje i wygląd przycisków"
    }

    fun makePartSix(view: View) {
        header_text.setTextColor(Color.BLACK)
        header_text.text = "Robiłem też 'Aplikację do liczenia wyników sportowych'"
    }

    fun makePartSeven(view: View) {
        header_text.setTextColor(Color.LTGRAY)
        header_text.text = "I właśnie dlatego zdecydowałem się wziać udział w tym konkursie :)"
    }
}