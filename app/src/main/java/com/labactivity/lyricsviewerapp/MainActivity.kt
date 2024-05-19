package com.labactivity.lyricsviewerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.labactivity.lyricsviewerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var songName:String
        var songLyrics:String
        var songNum: Int

        binding.song1ImgBtn.setOnClickListener() {
            songName = binding.song1TextView.text.toString()
            songNum = 1
            songLyrics = "Lift your head, baby, don't be scared\n" +
                    "Of the things that could go wrong along the way\n" +
                    "You'll get by with a smile\n" +
                    "You can't win at everything, but you can try\n\n" +
                    "Baby, you don't have to worry\n" +
                    "'Cause there ain't no need to hurry\n" +
                    "No one ever said that there's an easy way\n" +
                    "When they're closing all their doors\n" +
                    "And they don't want you anymore\n" +
                    "This sounds funny, but I'll say it anyway\n\n" +
                    "Girl, I'll stay through the bad times\n" +
                    "Even if I have to fetch you everyday\n" +
                    "We'll get by with a smile\n" +
                    "You can never be too happy in this life\n\n" +
                    "'Cause in a world where everybody hates a happy ending story\n" +
                    "It's a wonder love can make the world go round\n" +
                    "But don't let it bring you down\n" +
                    "And turn your face into a frown\n" +
                    "You'll get along with a little prayer and a song\n\n" +
                    "Let me hear you sing it\n\n" +
                    "'Cause in a world where everybody hates a happy ending story\n" +
                    "It's a wonder love can make the world go round\n" +
                    "But don't let it bring you down\n" +
                    "And turn your face into a frown\n" +
                    "You'll get along with a little prayer and a song\n\n" +
                    "Lift your head, baby, don't be scared\n" +
                    "Of the things that could go wrong along the way\n" +
                    "You'll get by with a smile\n" +
                    "Now it's time to kiss away those tears goodbye\n\n" +
                    "Let me hear you sing it"
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("passedSongName", songName)
            intent.putExtra("passedSongNum", songNum)
            intent.putExtra("passedSongLyrics", songLyrics)
            startActivity(intent)
            this.finish()
        }

        binding.song2ImgBtn.setOnClickListener() {
            songName = binding.song2TextView.text.toString()
            songNum = 2
            songLyrics = "'Pag automatic na ang luha\n" +
                    "Tuwing naghahating-gabi\n" +
                    "'Pag imposibleng napatawa\n" +
                    "At 'di na madapuan ng ngiti\n\n" +
                    "Kumapit ka kaya\n" +
                    "Sa akin nang ikaw ay\n" +
                    "Maitangay sa kalayaan ng ligaya\n" +
                    "Tayo na tayo na\n" +
                    "Ika'y magtiwala sapagka't ngayon gabi\n" +
                    "Ako ang mahiwagang\n" +
                    "Elesi\n\n" +
                    "'Pag komplikado ang problema\n" +
                    "Parang relong made in Japan\n" +
                    "At para ding sandwich na nasa lunchbox mong nawawala\n" +
                    "Nabubulok na sa isipan\n\n" +
                    "Kumapit ka kaya\n" +
                    "Sa akin nang ikaw ay\n" +
                    "Maitangay sa kalayaan ng ligaya\n" +
                    "Tayo na tayo na\n" +
                    "Ika'y magtiwala sapagka't ngayon gabi\n" +
                    "Ako ang mahiwagang\n" +
                    "Elesi\n" +
                    "Elesi\n\n" +
                    "Minsan ako'y nangailangan\n" +
                    "Daglian kang lumapit sa akin\n" +
                    "Ibinulong mo kaibigan\n" +
                    "Ako ang iyong liwanag sa dilim\n\n" +
                    "Kumapit ka kaya\n" +
                    "Sa akin nang ikaw ay\n" +
                    "Maitangay sa kalayaan ng ligaya\n" +
                    "Tayo na tayo na\n" +
                    "Ika'y magtiwala sapagka't ngayong gabi\n" +
                    "Ako ang mahiwagang\n" +
                    "Elesi\n" +
                    "Elesi\n\n" +
                    "Elesi (oh)\n" +
                    "Elesi (oh)"
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("passedSongName", songName)
            intent.putExtra("passedSongNum", songNum)
            intent.putExtra("passedSongLyrics", songLyrics)
            startActivity(intent)
            this.finish()
        }

        binding.song3ImgBtn.setOnClickListener() {
            songName = binding.song3TextView.text.toString()
            songNum = 3
            songLyrics = "Out here in the fields, I fight for my meals\n" +
                    "I get my back into my living\n" +
                    "I don't need to fight to prove I'm right\n" +
                    "I don't need to be forgiven, yeah, yeah, yeah, yeah, yeah\n\n" +
                    "Don't cry, don't raise your eye\n" +
                    "It's only teenage wasteland\n\n" +
                    "Sally, take my hand, we'll travel south 'cross land\n" +
                    "Put out the fire and don't look past my shoulder\n" +
                    "The exodus is here, the happy ones are near\n" +
                    "Let's get together before we get much older\n\n" +
                    "Teenage wasteland, it's only teenage wasteland\n" +
                    "Teenage wasteland, oh, yeah\n" +
                    "Teenage wasteland\n" +
                    "They're all wasted"
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("passedSongName", songName)
            intent.putExtra("passedSongNum", songNum)
            intent.putExtra("passedSongLyrics", songLyrics)
            startActivity(intent)
            this.finish()
        }

        binding.song4ImgBtn.setOnClickListener() {
            songName = binding.song4TextView.text.toString()
            songNum = 4
            songLyrics = "Talking away\n" +
                    "I don't know what I'm to say\n" +
                    "I'll say it anyway\n" +
                    "Today is another day to find you\n" +
                    "Shying away\n" +
                    "I'll be coming for your love. OK?\n\n" +
                    "Take on me (take on me)\n" +
                    "Take me on (take on me)\n" +
                    "I'll be gone\n" +
                    "In a day or two\n\n" +
                    "So needless to say\n" +
                    "Of odds and ends\n" +
                    "But I'll be stumbling away\n" +
                    "Slowly learning that life is OK.\n" +
                    "Say after me,\n" +
                    "\"It's no better to be safe than sorry.\"\n\n" +
                    "Take on me (take on me)\n" +
                    "Take me on (take on me)\n" +
                    "I'll be gone\n" +
                    "In a day or two\n\n" +
                    "Oh, things that you say. Yeah.\n" +
                    "Is it life or just to play my worries away?\n" +
                    "You're all the things I've got to remember\n" +
                    "You're shying away\n" +
                    "I'll be coming for you anyway\n\n" +
                    "Take on me (take on me)\n" +
                    "Take me on (take on me)\n" +
                    "I'll be gone\n" +
                    "In a day\n\n" +
                    "Take on me (take on me)\n" +
                    "Take me on (take on me)\n" +
                    "I'll be gone\n" +
                    "In a day\n\n" +
                    "Take on me (take on me)\n" +
                    "Take me on (take on me)"
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("passedSongName", songName)
            intent.putExtra("passedSongNum", songNum)
            intent.putExtra("passedSongLyrics", songLyrics)
            startActivity(intent)
            this.finish()
        }

        binding.song5ImgBtn.setOnClickListener() {
            songName = binding.song5TextView.text.toString()
            songNum = 5
            songLyrics = "When I look into your eyes\n" +
                    "I can see a love restrained\n" +
                    "But, darlin', when I hold you\n" +
                    "Don't you know I feel the same? Yeah\n\n" +
                    "'Cause nothing lasts forever\n" +
                    "And we both know hearts can change\n" +
                    "And it's hard to hold a candle\n" +
                    "In the cold November rain\n\n" +
                    "We've been through this such a long, long time\n" +
                    "Just tryna kill the pain, ooh yeah\n" +
                    "But lovers always come and lovers always go\n" +
                    "And no one's really sure who's lettin' go today, walkin' away\n" +
                    "If we could take the time to lay it on the line\n" +
                    "I could rest my head, just knowin' that you were mine, all mine\n\n" +
                    "So, if you want to love me\n" +
                    "Then, darlin', don't refrain\n" +
                    "Or I'll just end up walkin'\n" +
                    "In the cold November rain\n\n" +
                    "Do you need some time on your own?\n" +
                    "Do you need some time all alone?\n" +
                    "Ooh, everybody needs some time on their own\n" +
                    "Ooh, don't you know you need some time all alone?\n\n" +
                    "I know it's hard to keep an open heart\n" +
                    "When even friends seem out to harm you\n" +
                    "But if you could heal a broken heart\n" +
                    "Wouldn't time be out to charm you, whoa-whoa\n\n" +
                    "Sometimes, I need some time on my own\n" +
                    "Sometimes, I need some time all alone\n" +
                    "Ooh, everybody needs some time on their own\n" +
                    "Ooh, don't you know you need some time all alone?\n\n" +
                    "And when your fears subside\n" +
                    "And shadows still remain, ooh yeah\n" +
                    "I know that you can love me\n" +
                    "When there's no one left to blame\n\n" +
                    "So, never mind the darkness\n" +
                    "We still can find a way\n" +
                    "'Cause nothin' lasts forever\n" +
                    "Even cold November rain\n\n" +
                    "Don't ya think that you need somebody?\n" +
                    "Don't ya think that you need someone?\n" +
                    "Everybody needs somebody\n" +
                    "You're not the only one, you're not the only one\n" +
                    "Don't ya think that you need somebody?\n" +
                    "Don't ya think that you need someone?\n" +
                    "Everybody needs somebody\n" +
                    "You're not the only one, you're not the only one\n" +
                    "Don't ya think that you need somebody?\n" +
                    "Don't ya think that you need someone?\n" +
                    "Everybody needs somebody\n" +
                    "You're not the only one, you're not the only one\n" +
                    "Don't ya think that you need somebody?\n" +
                    "Don't ya think that you need someone?\n" +
                    "Everybody needs somebody"
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("passedSongName", songName)
            intent.putExtra("passedSongNum", songNum)
            intent.putExtra("passedSongLyrics", songLyrics)
            startActivity(intent)
            this.finish()
        }
    }
}