package pl.pwr.mnah.catalogue

import android.R.id.text1
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavHost
import androidx.navigation.fragment.NavHostFragment
import androidx.viewpager2.widget.ViewPager2


class DetailsActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_view_pager)

        val fragmentList = arrayListOf(
                DetailsDescriptionFragment(intent.getStringExtra(DESCRIPTION_INTENT_KEY)),
                DetailsScenesFragment(intent.getIntArrayExtra(IMAGES_INTENT_KEY)),
                DetailsActorsFragment(intent.getStringArrayExtra(ACTORS_INTENT_KEY))
        )
        val adapter = ViewPagerAdapter(
                fragmentList,
                supportFragmentManager,
                lifecycle
        )

        viewPager = findViewById<ViewPager2>(R.id.viewPager)
        viewPager.adapter = adapter

    }
}