package pl.pwr.mnah.catalogue

import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView

class SwipeToDelete (var adapter: RecyclerAdapter) : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.RIGHT){
    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        TODO("")
    }


    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        var pos = viewHolder.adapterPosition
        var currentPos = 0
        var index = 0
        adapter.defaultFilms.forEach {
            if (adapter.listViewModel.filmsList[pos] == it) {
                index = adapter.defaultFilms.indexOf(it)
            } else {
                currentPos++;
            }
        }
        adapter.defaultFilms.removeAt(index)
        if (adapter.defaultFilms != adapter.listViewModel.filmsList)
            adapter.deleteItem(pos)
        adapter.notifyDataSetChanged()

    }

}