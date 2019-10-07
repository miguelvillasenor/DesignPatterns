package dev.mvillasenor.designpatterns.observer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import dev.mvillasenor.designpatterns.R
import kotlinx.android.synthetic.main.activity_observer.*

class ObserverActivity : AppCompatActivity(R.layout.activity_observer) {

    private val subject = Subject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUpView()
        observeState()
    }

    private fun observeState() {
        subject.viewState.observe(this, Observer {
            state.text = it
        })
    }

    private fun setUpView() {
        setState.setOnClickListener {
            subject.setNewState(newState.text.toString())
        }
    }
}
