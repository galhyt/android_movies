package com.example.movies

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_movie_data.view.*
import android.view.LayoutInflater


class MoviesListViewAdapter(val movies: List<MovieItem>, val context: Context) : RecyclerView.Adapter<MoviesListViewAdapter.ViewHolder>()
{


    override fun getItemCount(): Int {
        return movies.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as android.view.LayoutInflater).inflate(R.layout.list_item_movie_data, parent, false)
        //LayoutInflater.from(parent.context).inflate(R.layout.list_item_movie_data, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var img: ImageView = itemView.findViewById(R.id.movieImageId)
        var title: TextView = itemView.findViewById(R.id.movieTitleId)
        var overview: TextView = itemView.findViewById(R.id.movieOverviewId)

        fun bind(item: MovieItem){
            img.setImageResource(item.img)
            title.text = item.title
            overview.text = item.overview
        }
    }


}