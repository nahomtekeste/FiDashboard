package com.example.fidashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    internal lateinit var nameuser: TextView
    internal lateinit var walletuser: TextView
    internal lateinit var review: TextView
    internal lateinit var network: TextView
    internal lateinit var plugins: TextView
    internal lateinit var myapps: TextView
    internal lateinit var mainmenus: TextView

    internal lateinit var pagetitle: TextView
    internal lateinit var pagesubtitle: TextView


    internal lateinit var btnguide: Button

    internal lateinit var atg: Animation
    internal lateinit var atgtwo: Animation
    internal lateinit var atgthree: Animation

    internal lateinit var imageView3: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        atg = AnimationUtils.loadAnimation(this, R.anim.atg)
        atgtwo = AnimationUtils.loadAnimation(this, R.anim.atgtwo)
        atgthree = AnimationUtils.loadAnimation(this, R.anim.atgthree)
        nameuser = findViewById(R.id.nameuser)
        walletuser = findViewById(R.id.walletuser)
        imageView3 = findViewById(R.id.imageView3)
        review = findViewById(R.id.review)
        network = findViewById(R.id.network)
        plugins = findViewById(R.id.plugins)
        myapps = findViewById(R.id.myapps)
        mainmenus = findViewById(R.id.mainmenus)
        pagetitle = findViewById(R.id.pagetitle)
        pagesubtitle = findViewById(R.id.pagesubtitle)
        btnguide = findViewById(R.id.btnguide)
        btnguide.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val a = Intent(this@MainActivity, PackageActa::class.java)
                startActivity(a)
            }
        })

        // pass an animation
        imageView3.startAnimation(atg)
        pagetitle.startAnimation(atgtwo)
        pagesubtitle.startAnimation(atgtwo)
        btnguide.startAnimation(atgthree)
    }
}