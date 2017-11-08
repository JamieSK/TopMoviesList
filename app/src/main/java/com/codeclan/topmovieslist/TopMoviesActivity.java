package com.codeclan.topmovieslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopMoviesActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.movies_list);
    TopMovies topMovies = new TopMovies();
    ArrayList<Movie> movieList = topMovies.getList();

    TopMoviesAdapter moviesAdapter = new TopMoviesAdapter(this, movieList);
    ListView listView = (ListView) findViewById(R.id.movie_list);
    listView.setAdapter(moviesAdapter);
  }

  public void getMovie(View listItem) {
    Movie movie = (Movie) listItem.getTag();
    Intent i = new Intent(this, MovieActivity.class);
    i.putExtra("title", movie.getTitle());
    i.putExtra("year", movie.getYear());
    i.putExtra("ranking", movie.getRanking());
    startActivity(i);
  }
}
