package kg.geektech.kotlin_2_img_submit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kg.geektech.kotlin_2_img_submit.databinding.ActivityMainBinding
import kg.geektech.kotlin_2_img_submit.extension.showToast
import kg.geektech.kotlin_2_img_submit.extension.urlCheck

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val images =
        arrayListOf<String>().apply {
            add("https://s.hdnux.com/photos/01/24/35/41/22141044/5/ratio3x2_1800.jpg")
            add("https://www.notreble.com/wp-content/uploads/2022/02/Cetonia-Music-Tools-Horizontal-Sawn-Bass-Body-600x400.jpg")
            add("https://cdn.mos.cms.futurecdn.net/nLMvc7uR32HLfjq7fwtUQX.jpg")
            add("https://i.ytimg.com/vi/FM6MKgVcfyo/maxresdefault.jpg")
            add("https://img.championat.com/news/big/t/o/devil-may-cry-5-pochti-idealnyj-choknutyj-slesher-iz-japonii_1552385532972906817.jpg")
            add("https://images.genius.com/667556416a6d799d3de55a545efcd0a7.640x640x1.jpg")
            add("https://i.ytimg.com/vi/5p5d1vflc_g/hqdefault.jpg")
            add("https://upload.wikimedia.org/wikipedia/ru/5/57/DmC_Devil_May_Cry_Rus_Cover.jpg")
            add("https://media.newyorker.com/photos/59b3f875e899d754c57f4c35/1:1/w_2799,h_2799,c_limit/Rothman-IT.JPG")
            add("https://cdni.rt.com/russian/images/2022.03/article/623b398c02e8bd4c970ca387.jpg")
            add("https://yablyk.com/wp-content/uploads/2017/05/IT_Careers.jpg")
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        btnSubmit()
        binding.btnRandom.setOnClickListener {
            Glide.with(this).load(images.random()).into(binding.imageView)
        }
    }

    private fun btnSubmit() {
        binding.btnSubmit.setOnClickListener {
            if (urlCheck(binding.editText.text.toString()))
            { val text = binding.editText.text.toString()
                Glide.with(this).load(text).into(binding.imageView)
            } else {
                showToast(getString(R.string.error_message)) }
        }
    }
}

