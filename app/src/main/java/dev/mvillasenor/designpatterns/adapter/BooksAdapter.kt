package dev.mvillasenor.designpatterns.adapter

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BooksAdapter : RecyclerView.Adapter<BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder = BooksViewHolder(TextView(parent.context))

    override fun getItemCount(): Int = data.bookList.size

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        (holder.itemView as TextView).text = data.bookList[position].name
    }
}
