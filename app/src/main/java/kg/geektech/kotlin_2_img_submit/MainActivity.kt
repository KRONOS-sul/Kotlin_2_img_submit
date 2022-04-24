package kg.geektech.kotlin_2_img_submit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import kg.geektech.kotlin_2_img_submit.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var random: Random
    private val images =
        arrayListOf<String>("https://raccoon-city.ru/wp-content/uploads/2021/06/kyb-eydwdya-e1622731650346.jpg")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        btnSubmit()
    }

    private fun btnSubmit() {
        binding.btnSubmit.setOnClickListener {
            if (binding.editText.text.isEmpty()) {
                Toast.makeText(this, "Вставьте ссылку на изображение", Toast.LENGTH_LONG).show()
            } else {
                val text = binding.editText.text.toString()
                Glide.with(this).load(text).into(binding.imageView)
            }
        }
    }
}