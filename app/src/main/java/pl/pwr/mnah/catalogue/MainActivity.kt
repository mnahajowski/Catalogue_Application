package pl.pwr.mnah.catalogue

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import pl.pwr.mnah.catalogue.databinding.ActivityMainBinding
const val DESCRIPTION_INTENT_KEY = "DESCRIPTION"
const val IMAGES_INTENT_KEY = "IMAGES"
const val ACTORS_INTENT_KEY = "ACTORS"

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding: ActivityMainBinding
    lateinit var adapter: RecyclerAdapter
    lateinit var viewModel: ListViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainBinding.myRecyclerView.layoutManager = LinearLayoutManager(this)
        mainBinding.myRecyclerView.setHasFixedSize(true)
        viewModel = ViewModelProvider(this).get(ListViewModel::class.java)
        adapter = RecyclerAdapter(viewModel, this)

        var itemTouchHelper = ItemTouchHelper(SwipeToDelete(adapter))
        itemTouchHelper.attachToRecyclerView(mainBinding.myRecyclerView)

        mainBinding.myRecyclerView.adapter = adapter
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.filter_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.sciFi_filter) {
            adapter.updateRecyclerData(filterList("SciFi"))
        }
        else if(item.itemId == R.id.action_film_filter) {
            adapter.updateRecyclerData(filterList("Akcji"))
        }
        else if(item.itemId == R.id.fantasy_filter) {
            adapter.updateRecyclerData(filterList("Fantasy"))
        }else if(item.itemId == R.id.romantic_filter) {
            adapter.updateRecyclerData(filterList("Romantyczny"))
        }
        else if(item.itemId == R.id.favourites) {
            adapter.updateRecyclerData(findFavourites())
        }
        else if(item.itemId == R.id.default_list) {
            adapter.updateRecyclerData(filterList("Ogólny"))
        }
        return super.onOptionsItemSelected(item)
    }

    fun findFavourites() : ArrayList<Film>{
        var myFilms = adapter.defaultFilms
        var returnList : ArrayList<Film> = ArrayList()
        myFilms.forEach {
            if(it.favourite)
                returnList.add(it)
        }
        return returnList
    }

    fun filterList(category : String) : ArrayList<Film>{
        if(category == "Ogólny")
            return adapter.defaultFilms
        var myFilms = adapter.defaultFilms
        var returnList : ArrayList<Film> = ArrayList()
        myFilms.forEach {
            if(it.category == category)
                returnList.add(it)
        }
        return returnList

    }
}