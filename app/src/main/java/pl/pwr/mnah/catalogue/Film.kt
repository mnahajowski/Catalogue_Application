package pl.pwr.mnah.catalogue

import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import de.hdodenhof.circleimageview.CircleImageView

class Film (
    var name : String,
    var category : String,
    var imageId : Int,
    var favourite : Boolean,
    var description : String,
    var actors : Array<String>,
    var filmScenes : IntArray){

    companion object {

        @BindingAdapter("android:imageUrl")
        @JvmStatic
        fun loadImage(view: View, imageId: Int) {
            var circleImageView = view as CircleImageView
            circleImageView.setImageDrawable(ContextCompat.getDrawable(view.context, imageId))
        }

        @BindingAdapter("android:starUrl")
        @JvmStatic
        fun loadStar(view: View, favourite: Boolean) {
            var imageView = view as ImageView
            if (!favourite){
                imageView.setImageDrawable(ContextCompat.getDrawable(view.context, R.drawable.star_empty))
            } else
            {
                imageView.setImageDrawable(ContextCompat.getDrawable(view.context, R.drawable.star_full))
            }

        }

    }


}