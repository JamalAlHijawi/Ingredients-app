package your.burger.ingredient_search

import SearchFragmentd
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Load the default fragment
        loadDefaultFragment()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_search -> {
                // Handle search menu item click
                val searchFragment = SearchFragmentd()
                searchFragment.show(supportFragmentManager, "SearchFragmentd")
                return true
            }
            R.id.menu_saved -> {
                // Handle saved recipes menu item click
                // Replace with your own implementation
                // For example, display a toast message
                Toast.makeText(this, "Saved Recipes clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            // Add other menu item cases here if needed

            else -> return super.onOptionsItemSelected(item)
        }
    }

    private fun loadDefaultFragment() {
        // Replace with your own implementation
        // For example, load the default fragment using FragmentManager and FragmentTransaction
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        val defaultFragment = SearchFragmentd()
        fragmentTransaction.replace(R.id.fragment_container, defaultFragment)
        fragmentTransaction.commit()
    }
}
