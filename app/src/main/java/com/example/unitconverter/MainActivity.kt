package com.example.unitconverter
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.unitconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.meter.setOnClickListener { calculateMeter() }
    }

    @SuppressLint("SetTextI18n")
    private fun calculateMeter() {
        val meter = binding.meter.text.toString().toDoubleOrNull()
        if (meter == null) {
            binding.foot.text?.clear()
            return
        }
        val foot = meter.times(3.281)
        binding.foot.setText("" + foot)
    }
}
