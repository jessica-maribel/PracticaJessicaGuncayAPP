package ec.edu.ups.practicajessicaguncay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ec.edu.ups.practicajessicaguncay.databinding.FragmentLoginBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}