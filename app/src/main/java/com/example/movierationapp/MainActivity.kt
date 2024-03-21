package com.example.movierationapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movieListView = findViewById<ListView>(R.id.movieListView)

        // Sample movie data
        val movies = listOf(
            Movie("Kaithi", "Action,Thriller", 4.5f),
            Movie("Mankatha", "Action,Thriller", 4.8f),
            Movie("Leo", "Action,Thriller", 4.7f),
            Movie("Soodhu kavvum", "Comedy,Thriller", 4.6f),
            Movie("Aayirathil Oruvan", "Adventure", 4.4f),
            Movie("Kutty", "Action,Drama", 4.3f)
        )

        val adapter = ArrayAdapter(
            this,
            R.layout.list_item_movie,
            R.id.titleTextView, // Check this ID
            movies
        )

        movieListView.adapter = adapter
    }

    data class Movie(val title: String, val genre: String, val rating: Float) {
        override fun toString(): String {
            return "$title ($genre)"
        }
    }
}
