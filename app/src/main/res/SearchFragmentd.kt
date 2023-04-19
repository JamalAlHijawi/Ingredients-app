import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.fragment.app.DialogFragment
import your.burger.ingredient_search.R

class SearchFragmentd : DialogFragment() {

    companion object {
        fun newInstance(): SearchFragmentd {
            return SearchFragmentd()
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val inflater = LayoutInflater.from(activity)
        val view = inflater.inflate(R.layout.fragment_search, null)

        // Set up search button click listener
        view.findViewById<Button>(R.id.btnSearch).setOnClickListener {
            // Handle search button click
            // Get search criteria from EditText and Spinner
            val searchQuery = view.findViewById<EditText>(R.id.etSearch).text.toString()
            val category = view.findViewById<Spinner>(R.id.spinnerCategory).selectedItem.toString()

            // Perform recipe search based on search criteria
            // and display results in a RecyclerView
            // ...
        }

        // Set up cancel button click listener
        view.findViewById<Button>(R.id.btnCancel).setOnClickListener {
            // Dismiss the dialog
            dismiss()
        }

        return Dialog(requireContext()).apply {
            setContentView(view)
        }
    }
}
