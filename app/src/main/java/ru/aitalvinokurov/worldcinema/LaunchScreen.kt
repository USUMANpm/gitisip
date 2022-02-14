package ru.aitalvinokurov.worldcinema

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class LaunchScreen : AppCompatActivity() {
    private val SPLASH_DISPLAY_LENGHT = 2000
    public override fun onCreate(icicle: Bundle?) {
        super.onCreate(icicle)
        setContentView(R.layout.launch_screen)
            Handler().postDelayed({
                val mainIntent = Intent(this, SignUpActivity::class.java)
                startActivity(mainIntent)
                finish()
            }, SPLASH_DISPLAY_LENGHT.toLong())
        }
}

