package dev.mvillasenor.designpatterns

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import dev.mvillasenor.designpatterns.observer.ObserverActivity
import dev.mvillasenor.designpatterns.pubsub.PubSubActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    observer.setOnClickListener(this)
    pubsub.setOnClickListener(this)
  }

  override fun onClick(view: View?)  {
    when(view) {
      observer -> Intent(this, ObserverActivity::class.java).also {
        startActivity(it)
      }
      pubsub -> Intent(this, PubSubActivity::class.java).also {
        startActivity(it)
      }
    }
  }
}
