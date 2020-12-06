package pl.pwr.mnah.catalogue

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetailsScenesFragment(scenes : IntArray?) : Fragment() {

    var scenesIds = scenes
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_details_scenes, container, false)
        recyclerView = view.findViewById(R.id.scenes_gallery_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.layoutManager = LinearLayoutManager(view.context);
        recyclerView.adapter = ScenesGalleryRecyclerViewAdapter(scenesIds);
        return view
    }

}