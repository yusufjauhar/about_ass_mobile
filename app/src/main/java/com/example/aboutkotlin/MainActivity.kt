package com.example.aboutkotlin


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openButton: Button = findViewById(R.id.open_button)
        openButton.setOnClickListener {
            val intent = Intent(this, DataMahasiswaActivity::class.java)
            intent.putExtra("nama", "Yusuf Jauhar Alif Faqih")
            intent.putExtra("nim", "NIM STI202102390")
            intent.putExtra("prodi", "Prodi Teknik Informatika")
            intent.putExtra("semester", "Semester 4")
            intent.putExtra("alamat", "Alamat kec.Banyumas kab.Banyumas jawa tengah")
            startActivity(intent)
        }
    }
}
