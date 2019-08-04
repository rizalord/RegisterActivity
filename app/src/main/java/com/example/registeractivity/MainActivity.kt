package com.example.registeractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var editName: EditText? = null
    var spinnerGender: Spinner? = null
    var editEmail: EditText? = null
    var editTelp: EditText? = null
    var editAlamat: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editName = findViewById(R.id.editName)
        editEmail = findViewById(R.id.editEmail)
        editTelp = findViewById(R.id.editTelp)
        editAlamat = findViewById(R.id.editAlamat)
        spinnerGender = findViewById(R.id.SpinnerGradder)


        submit.setOnClickListener {
            validasiInput()
        }

        setDataSpinner()
    }

    fun setDataSpinner(){
        val adapter = ArrayAdapter.createFromResource(
            this ,R.array.gender_list , android.R.layout.simple_spinner_dropdown_item
        )

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinnerGender?.adapter = adapter
    }

    fun validasiInput() {
        val name = editName?.text.toString()
        val email = editName?.text.toString()
        val telp = editName?.text.toString()
        val alamat = editName?.text.toString()
        val spinerGender = editName?.text.toString()

        when {

            spinerGender.equals("Pilih jenis kelamin :") ->Toast.makeText(this, "Kelamin harus dipilih", Toast.LENGTH_SHORT).show()
            name.isEmpty() -> error("Nama harus diisi")
            email.isEmpty() -> error("Email harus diisi")
            telp.isEmpty() -> error("Telp harus diisi")
            alamat.isEmpty() -> error("Alamat harus diisi")

            else -> {
                Toast.makeText(this, "Data valid", Toast.LENGTH_SHORT).show()
            }


        }
    }
}

