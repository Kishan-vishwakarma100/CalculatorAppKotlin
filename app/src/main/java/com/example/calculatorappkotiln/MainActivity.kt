package com.example.calculatorappkotiln

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatorappkotiln.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAc.setOnClickListener {
            binding.inputTxt.text = ""
            binding.outPuttxt.text = ""
        }

        binding.btn1.setOnClickListener {
            binding.inputTxt.append("1")
        }

        binding.btn2.setOnClickListener {
            binding.inputTxt.append("2")
        }

        binding.btn3.setOnClickListener {
            binding.inputTxt.append("3")
        }

        binding.btn4.setOnClickListener {
            binding.inputTxt.append("4")
        }

        binding.btn5.setOnClickListener {
            binding.inputTxt.append("5")
        }

        binding.btn6.setOnClickListener {
            binding.inputTxt.append("6")
        }

        binding.btn7.setOnClickListener {
            binding.inputTxt.append("7")
        }

        binding.btn8.setOnClickListener {
            binding.inputTxt.append("8")
        }

        binding.btn9.setOnClickListener {
            binding.inputTxt.append("9")
        }

        binding.btn0.setOnClickListener {
            binding.inputTxt.append("0")
        }

        binding.btn0.setOnClickListener {
            binding.inputTxt.append("0")
        }

        binding.btn0.setOnClickListener {
            binding.inputTxt.append("0")
        }

        binding.btnPlus.setOnClickListener {
            binding.inputTxt.append(" + ")
        }

        binding.btnMinus.setOnClickListener {
            binding.inputTxt.append(" - ")
        }

        binding.btnMultiplication.setOnClickListener {
            binding.inputTxt.append(" * ")
        }

        binding.btnModule.setOnClickListener {
            binding.inputTxt.append(" % ")
        }

        binding.btnDot.setOnClickListener {
            binding.inputTxt.append(".")
        }

        binding.bracketLeft.setOnClickListener {
            binding.inputTxt.append(" ( ")
        }

        binding.bracketRight.setOnClickListener {
            binding.inputTxt.append(" ) ")
        }

        binding.btnEqual.setOnClickListener {
            val expression = ExpressionBuilder(binding.inputTxt.text.toString()).build()
            val result = expression.evaluate()
            val longresult = result.toLong()

            if(result == longresult.toDouble()){
                binding.outPuttxt.text = longresult.toString()
            }
            else{
                binding.outPuttxt.text = result.toString()
            }
        }

        binding.btnBackspace.setOnClickListener {
           val text = binding.inputTxt.text.toString()
            if(text.isNotEmpty()) {
                binding.inputTxt.text = text.drop(1)
            }else{
                binding.outPuttxt.text = ""
            }

        }
    }
}


