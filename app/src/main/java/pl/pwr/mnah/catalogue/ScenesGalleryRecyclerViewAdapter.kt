package pl.pwr.mnah.catalogue

import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ScenesGalleryRecyclerViewAdapter(var listScenes: IntArray?) : RecyclerView.Adapter<ScenesGalleryRecyclerViewAdapter.ScenesViewHolder>() {

    class ScenesViewHolder(val image : ImageView) : RecyclerView.ViewHolder(image)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScenesViewHolder {
        val tv = ImageView(parent.context)
        tv.layoutParams = ViewGroup.LayoutParams(
                
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
        )

        return ScenesViewHolder(tv)
    }


    override fun getItemCount(): Int {
        return listScenes!!.size
    }

    override fun onBindViewHolder(holder: ScenesViewHolder, position: Int) {
        var imageId = listScenes?.get(position)
        if (imageId != null) {
            holder.image.setImageResource(imageId)
        }
    }
}