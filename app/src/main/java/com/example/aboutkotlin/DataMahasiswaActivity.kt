package com.example.aboutkotlin;

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DataMahasiswaActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_mahasiswa)

        val namaMahasiswa = intent.getStringExtra("nama")
        val nimMahasiswa = intent.getStringExtra("nim")
        val prodiMahasiswa = intent.getStringExtra("prodi")
        val semesterMahasiswa = intent.getStringExtra("semester")
        val alamatMahasiswa = intent.getStringExtra("alamat")

        val namaTextView: TextView = findViewById(R.id.student_name)
        val nimTextView: TextView = findViewById(R.id.student_id)
        val prodiTextView: TextView = findViewById(R.id.student_major)
        val semesterTextView: TextView = findViewById(R.id.student_semester)
        val alamatTextView: TextView = findViewById(R.id.student_address)

        namaTextView.text = namaMahasiswa
        nimTextView.text = nimMahasiswa
        prodiTextView.text = prodiMahasiswa
        semesterTextView.text = semesterMahasiswa
        alamatTextView.text = alamatMahasiswa
        }
        }
