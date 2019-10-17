package bonch.dev.school

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import bonch.dev.school.Model.ClickCounterData

class MainActivity : AppCompatActivity() {

    private lateinit var indicatorButton: Button;
    private lateinit var counterButton: Button;
    private lateinit var textField: EditText;
    private lateinit var nextActivityButton: Button;
    private lateinit var counter: ClickCounterData;

    val INDICATOR_KEY: String = "INDICATOR_KEY"
    val TEXT_KEY: String = "TEXT_KEY"
    val COUNTER_KEY: String = "COUNTER_KEY"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        initData()
        setListiners()


    }

    private fun initData() {
        counter = ClickCounterData()
        counterButton.setText("${counter.currentCount}")
    }

    private fun setListiners() {

        //IndicatorButton Click Listener
        indicatorButton.setOnClickListener {
            indicatorButton.setEnabled(false)
        }

        //CounterButton Click Listener
        counterButton.setOnClickListener {
            counter.increment()
            counterButton.setText("${counter.currentCount}")
        }

        //NextActivityButton Click Listener
        nextActivityButton.setOnClickListener {
            val intent = Intent(MainActivity@ this, SecondActivity::class.java)
            intent.putExtra(INDICATOR_KEY, !indicatorButton.isEnabled)
            intent.putExtra(TEXT_KEY, textField.text.toString())
            intent.putExtra(COUNTER_KEY, "${counter.currentCount}")
            startActivity(intent)

        }


    }

    private fun initViews() {
        indicatorButton = findViewById(R.id.indicator_button)
        counterButton = findViewById(R.id.counter_button)
        textField = findViewById(R.id.text_field)
        nextActivityButton = findViewById(R.id.next_activity_button)
    }
}
