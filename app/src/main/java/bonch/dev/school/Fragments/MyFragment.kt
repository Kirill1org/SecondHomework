package bonch.dev.school.Fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import bonch.dev.school.R

class MyFragment : Fragment(){
    private lateinit var textView: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_my, container, false)


        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initializeView(view)
        val loadedBoolean = arguments?.getBoolean("loadIndicator")
        val loadedText = arguments?.getString("loadText")
        val loadedCountClick = arguments?.getString("loadCountClick")


        textView.setText("Is the button indicator pressed: "+ loadedBoolean+"\n"+"Text is: "+loadedText+"\n"+"Count of click is: "+loadedCountClick)

    }

    private fun initializeView(view: View) {
       textView = view.findViewById(R.id.text_view_fragment)
    }

    companion object {

        fun newInstance(loadedIndicator: Boolean, loadedText: String, loadedCountClick: String): MyFragment {
            Log.e("FRAGMENT NEW INSTANCE", loadedCountClick)
            val args = Bundle()
            args.putBoolean("loadIndicator",loadedIndicator)
            args.putString("loadText", loadedText)
            args.putString("loadCountClick", loadedCountClick)
            val fragment = MyFragment()
            fragment.arguments = args
            return fragment
        }
    }
}