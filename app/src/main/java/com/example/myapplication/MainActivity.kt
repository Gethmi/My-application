package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "My Calculator"
        calculateBtn.setOnClickListener {
            if (firstFieldText.text.toString() != "" && secondFieldText.text.toString() != "") {

                var val1 = firstFieldText.text.toString().toInt()
                var val2 = secondFieldText.text.toString().toInt()
                var result = 0;
                if (radioGroup.checkedRadioButtonId == R.id.addRadioBtn) {
                    result = val1 + val2;

                    calculateBtn.text =
                        firstFieldText.text.toString() + " + " + secondFieldText.text.toString() + " = " + result.toString()

                } else if (radioGroup.checkedRadioButtonId == R.id.subRadioBtn) {
                    result = val1 - val2;
                    calculateBtn.text =
                        firstFieldText.text.toString() + " - " + secondFieldText.text.toString() + " = " + result.toString()
                } else if (radioGroup.checkedRadioButtonId == R.id.mulRadioBtn){
                    result = val1 * val2;
                    calculateBtn.text =
                        firstFieldText.text.toString() + " * " + secondFieldText.text.toString() + " = " + result.toString()

                } else if(radioGroup.checkedRadioButtonId == R.id.divRadioBtn){
                    result = val1 / val2;
                    calculateBtn.text =
                        firstFieldText.text.toString() + " / " + secondFieldText.text.toString() + " = " + result.toString()
                }
            }

        }
    }
}