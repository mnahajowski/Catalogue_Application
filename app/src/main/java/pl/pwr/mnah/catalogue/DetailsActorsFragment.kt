package pl.pwr.mnah.catalogue

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetailsActorsFragment(actors : Array<String>?) : Fragment() {

    var actorsDetails = actors
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_details_actors, container, false)
        recyclerView = view.findViewById(R.id.actors_list_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.layoutManager = LinearLayoutManager(view.context);
        recyclerView.adapter = ActorsListRecyclerViewAdapter(actorsDetails);

        return view;
    }
}