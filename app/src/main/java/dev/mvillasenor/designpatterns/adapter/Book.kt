package dev.mvillasenor.designpatterns.adapter

data class Book(
    val id: String,
    val name: String,
    val author: String,
    val categories: List<String>
)
