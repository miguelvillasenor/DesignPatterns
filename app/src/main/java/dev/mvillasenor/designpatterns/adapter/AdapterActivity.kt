package dev.mvillasenor.designpatterns.adapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import dev.mvillasenor.designpatterns.R
import kotlinx.android.synthetic.main.activity_adapter.*

class AdapterActivity : AppCompatActivity(R.layout.activity_adapter) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        booksList.layoutManager = LinearLayoutManager(this)
        booksList.adapter = BooksAdapter()
    }
}
