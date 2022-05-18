package com.mrsv.mymoviecatalog.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.mrsv.mymoviecatalog.databinding.MovieListItemBinding
import com.mrsv.mymoviecatalog.models.ModelResultMovies

class MovieListAdapter : ListAdapter< ModelResultMovies, MovieListAdapter.MovieItemViewHolder>(
    DIFF_CALLBACK
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieItemViewHolder {
        val binding = MovieListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class MovieItemViewHolder(
        private val binding: MovieListItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(modelResultMovies: ModelResultMovies) {
            binding.title.text = modelResultMovies.title
            binding.release.text = modelResultMovies.release_date
        //binding.genre.text =
        }
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<ModelResultMovies>() {
            override fun areItemsTheSame(oldItem: ModelResultMovies, newItem: ModelResultMovies): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: ModelResultMovies, newItem: ModelResultMovies): Boolean {
                return oldItem == newItem
            }
        }
    }

}
