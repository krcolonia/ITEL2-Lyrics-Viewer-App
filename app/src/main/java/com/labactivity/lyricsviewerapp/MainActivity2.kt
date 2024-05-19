package com.labactivity.lyricsviewerapp

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.lyricsviewerapp.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.songTitleTxtView.text = intent.getStringExtra("passedSongName")
        binding.lyricsTxtView.text = intent.getStringExtra("passedSongLyrics")
        var song = intent.getIntExtra("passedSongNum", 0)
        var songfile = MediaPlayer()

        when(song) {
            1 -> songfile = MediaPlayer.create(this, R.raw.with_a_smile)
            2 -> songfile = MediaPlayer.create(this, R.raw.elesi)
            3 -> songfile = MediaPlayer.create(this, R.raw.babaoriley)
            4 -> songfile = MediaPlayer.create(this, R.raw.takeonme)
            5 -> songfile = MediaPlayer.create(this, R.raw.novemberrain)
        }

        songfile.start()

        binding.returnToMenuBtn.setOnClickListener() {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
            songfile.stop()
            songfile.release()
            this.finish()
        }
    }
}