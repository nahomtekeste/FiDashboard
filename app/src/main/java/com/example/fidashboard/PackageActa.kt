package com.example.fidashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView

class PackageActa : AppCompatActivity() {

    internal lateinit var pagetitle: TextView
    internal lateinit var pagesubtitle: TextView
    internal lateinit var packagePlace: ImageView
    internal lateinit var packageRange: SeekBar
    internal lateinit var atg: Animation
    internal lateinit var packageimg: Animation


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_package_acta)


        atg = AnimationUtils.loadAnimation(this,R.anim.atg)
        packageimg = AnimationUtils.loadAnimation(this, R.anim.packageimg)
        pagetitle = findViewById(R.id.pagetitle)
        pagesubtitle = findViewById(R.id.pagesubtitle)
        packagePlace = findViewById(R.id.packagePlace)
        packageRange = findViewById(R.id.packageRange)
        packageRange.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                if (progress == 35) {
                    pagetitle.text = "Starter Guy"
                    pagesubtitle.text = "The simply text be dummies too good and easier"
                    packagePlace.setImageResource(R.drawable.icstarter)
                    // pass animation
                    packagePlace.startAnimation(packageimg)
                    pagetitle.startAnimation(atg)
                    pagesubtitle.startAnimation(atg)
                } else if (progress == 75) {
                    pagetitle.text = "Business Player"
                    pagesubtitle.text = "The simply text be dummies too good and easier"
                    packagePlace.setImageResource(R.drawable.icbusinessplayer)
                    // pass animation
                    packagePlace.startAnimation(packageimg)
                    pagetitle.startAnimation(atg)
                    pagesubtitle.startAnimation(atg)
                } else if (progress == 100) {
                    pagetitle.text = "Legend of VIP"
                    pagesubtitle.text = "The simply text be dummies too good and easier"
                    packagePlace.setImageResource(R.drawable.icvip)

                    // pass animation
                    packagePlace.startAnimation(packageimg)
                    pagetitle.startAnimation(atg)
                    pagesubtitle.startAnimation(atg)
                }
            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }
            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })
    }
}
