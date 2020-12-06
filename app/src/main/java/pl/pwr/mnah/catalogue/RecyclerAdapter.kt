package pl.pwr.mnah.catalogue

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.content.ContextCompat.startActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import pl.pwr.mnah.catalogue.databinding.ActivityMainBinding
import pl.pwr.mnah.catalogue.databinding.SingleFilmLayoutBinding


class RecyclerAdapter(public var listViewModel: ListViewModel, var context: Context) : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    lateinit var defaultFilms : ArrayList<Film>


    fun updateRecyclerData(newList : ArrayList<Film>) {
        listViewModel.filmsList = newList
        notifyDataSetChanged()
    }

    class MyViewHolder(itemView: SingleFilmLayoutBinding) :
        RecyclerView.ViewHolder(itemView.root) {
        val itemLayoutBinding : SingleFilmLayoutBinding = itemView

        init {
            itemView.root.setOnClickListener {
                val intent = Intent(itemView.root.context, DetailsActivity::class.java)
                intent.putExtra(DESCRIPTION_INTENT_KEY, itemView.film?.description)
                intent.putExtra(ACTORS_INTENT_KEY, itemView.film?.actors)
                intent.putExtra(IMAGES_INTENT_KEY, itemView.film?.filmScenes)
                Toast.makeText(itemView.root.context, "You clicked on item ${itemView.film?.name}", Toast.LENGTH_SHORT).show()
                startActivity(itemView.root.context, intent, null)
            }

            itemView.favouriteStar.setOnClickListener {
                itemView.film?.favourite = !itemView.film?.favourite!!
                if (itemView.film?.favourite == true) {
                    itemView.favouriteStar.setImageResource(R.drawable.star_full)
                    Toast.makeText(itemView.root.context, "Added to favourites", Toast.LENGTH_SHORT).show()
                } else {
                    itemView.favouriteStar.setImageResource(R.drawable.star_empty)
                    Toast.makeText(itemView.root.context, "Removed from favourites", Toast.LENGTH_SHORT).show()
                }

            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemLayoutBinding = DataBindingUtil.inflate<SingleFilmLayoutBinding>(
            LayoutInflater.from(parent.context), R.layout.single_film_layout, parent, false)
        val createdViewHolder = MyViewHolder(itemLayoutBinding)
        defaultFilms = listViewModel.filmsList
        return createdViewHolder
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var film = listViewModel.filmsList[position]
        holder.itemLayoutBinding.film = film
    }


    override fun getItemCount(): Int {
        return listViewModel.filmsList.size
    }


    fun deleteItem(pos : Int) {
        listViewModel.filmsList.removeAt(pos)
        notifyItemRemoved(pos)
    }
}