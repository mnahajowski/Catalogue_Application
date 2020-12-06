package pl.pwr.mnah.catalogue

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


class DetailsDescriptionFragment(stringExtra: String?) : Fragment() {

    val descriptionText = stringExtra

    @SuppressLint("CutPasteId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view =  inflater.inflate(R.layout.fragment_details_description, container, false)
        view.findViewById<TextView>(R.id.detailsDescriptionText).movementMethod = ScrollingMovementMethod()
        view.findViewById<TextView>(R.id.detailsDescriptionText).text = descriptionText
        return view
    }

}