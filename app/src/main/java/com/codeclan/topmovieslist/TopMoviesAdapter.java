package com.codeclan.topmovieslist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jamie on 07/11/2017.
 */

class TopMoviesAdapter extends ArrayAdapter<Movie> {
  public TopMoviesAdapter(Context context, ArrayList<Movie> movies) {
    super(context, 0, movies);
  }

  public View getView(int position, View convertView, ViewGroup parent) {
    if (convertView == null) {
      convertView = LayoutInflater.from(getContext()).inflate(R.layout.movie_item, parent, false);
    }
    Movie currentMovie = getItem(position);
    TextView ranking = (TextView) convertView.findViewById(R.id.rank_text);
    ranking.setText(currentMovie.getRanking().toString());

    TextView title = (TextView) convertView.findViewById(R.id.title_text);
    title.setText(currentMovie.getTitle().toString());

    TextView year = (TextView) convertView.findViewById(R.id.year_text);
    year.setText(currentMovie.getYear().toString());

    convertView.setTag(currentMovie);

    return convertView;
  }
}
