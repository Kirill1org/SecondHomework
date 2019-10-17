package bonch.dev.school

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class FirstFragment : Fragment() {

    private lateinit var nextActivityButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_first, container, false)


        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initializeView(view)
        setClickListener()

    }

    private fun setClickListener() {
        nextActivityButton.setOnClickListener {
            (context as FragmentActivity).replaceFragment()
        }
    }

    private fun initializeView(view: View) {
        nextActivityButton = view.findViewById(R.id.next_activity_button)
    }

}