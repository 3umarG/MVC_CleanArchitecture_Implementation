package com.example.mvcimplementation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.mvcimplementation.R
import com.example.mvcimplementation.pojo.MovieModel

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnGetMovie : Button
    private lateinit var tvMovieName : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetMovie = findViewById(R.id.btnGetMovie)
        tvMovieName = findViewById(R.id.tvMovieName)


        btnGetMovie.setOnClickListener(this)

    }

    private fun getMovieFromDataBase(): MovieModel = MovieModel("Star Wars", 11, "Action")


    override fun onClick(view: View?) {
        when (view?.id) {
         R.id.btnGetMovie -> {
             tvMovieName.text = getMovieFromDataBase().name
         }
        }
    }
}