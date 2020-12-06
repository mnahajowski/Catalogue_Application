package pl.pwr.mnah.catalogue

import android.content.Context
import android.content.Intent
import android.util.Log
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import pl.pwr.mnah.catalogue.databinding.SingleFilmLayoutBinding

class ActorsListRecyclerViewAdapter (var listActors: Array<String>?) : RecyclerView.Adapter<ActorsListRecyclerViewAdapter.ActorsViewHolder>() {

    class ActorsViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorsViewHolder {
        val tv = TextView(parent.context)
        tv.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )

        return ActorsViewHolder(tv)
    }


    override fun getItemCount(): Int {
        return listActors!!.size
    }

    override fun onBindViewHolder(holder: ActorsViewHolder, position: Int) {
        var actor = listActors?.get(position)
        val index = position + 1
        holder.textView.text = "$index. $actor"
        holder.textView.textSize = 20F
    }

}