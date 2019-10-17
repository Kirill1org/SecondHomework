package bonch.dev.school

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FragmentActivity : AppCompatActivity() {

    val fm = supportFragmentManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val firstFragment = FirstFragment()
        fm.beginTransaction()
            .add(R.id.fragment_container,firstFragment)
            .commit()
    }

    fun replaceFragment(){
        val secondFragment = SecondFragment()
        fm.beginTransaction()
            .replace(R.id.fragment_container,secondFragment)
            .addToBackStack("SECOND_FRAGMENT")
            .commit()
    }
}
