package kg.geektech.kotlin_2_img_submit.extension

import android.util.Patterns

fun urlCheck(link: String): Boolean {
    return Patterns.WEB_URL.matcher(link).matches()
}