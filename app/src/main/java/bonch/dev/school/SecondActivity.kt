package bonch.dev.school

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

   private lateinit var textView:TextView

    val INDICATOR_KEY : String = "INDICATOR_KEY"
    val TEXT_KEY : String = "TEXT_KEY"
    val COUNTER_KEY : String = "COUNTER_KEY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        initView()
        initData()
    }

    private fun initData() {
        val loadedIndicator:Boolean=intent.getBooleanExtra(INDICATOR_KEY,false)
        val loadedText : String=intent.getStringExtra(TEXT_KEY)
        val loadedClickCount:String=intent.getStringExtra(COUNTER_KEY)

        textView.setText("Is the button indicator pressed: "+loadedIndicator+"\n"+"Text is: "+loadedText+"\n"+"Count of click is: "+loadedClickCount)
    }

    private fun initView() {
        textView=findViewById(R.id.text_view)
    }
}
