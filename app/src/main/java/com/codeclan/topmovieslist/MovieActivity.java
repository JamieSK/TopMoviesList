package com.codeclan.topmovieslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MovieActivity extends AppCompatActivity {
  TextView movieYear;
  TextView movieTitle;
  TextView movieRating;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_movie);

    movieTitle = (TextView) findViewById(R.id.movieTitle);
    movieYear = (TextView) findViewById(R.id.movieYear);
    movieRating = (TextView) findViewById(R.id.movieRating);

    setDetails();
  }

  private void setDetails() {
    Bundle extras = getIntent().getExtras();
    String title = (String) extras.get("title");
    String year = extras.get("year").toString();
    String rating = extras.get("ranking").toString();

    movieTitle.setText(title);
    movieYear.setText(year);
    movieRating.setText(rating);
  }


}
