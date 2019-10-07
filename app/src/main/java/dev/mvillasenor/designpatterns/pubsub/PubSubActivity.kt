package dev.mvillasenor.designpatterns.pubsub

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.net.ConnectivityManager.CONNECTIVITY_ACTION
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.mvillasenor.designpatterns.R
import kotlinx.android.synthetic.main.activity_observer.newState
import kotlinx.android.synthetic.main.activity_observer.setState
import kotlinx.android.synthetic.main.activity_observer.state
import kotlinx.android.synthetic.main.activity_pubsub.*


private const val STATE_ACTION = "broadcast.sample.StateAction"
private const val STATE_VALUE = "broadcast.sample.StateValue"

class PubSubActivity : AppCompatActivity(R.layout.activity_pubsub) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUpView()
        registerReceiver()
        registerNetworkReceiver()
    }

    private fun registerReceiver() {
        // 1. Create filter
        // 2. Register receiver
    }

    private fun registerNetworkReceiver() {
        // 1. Create filter
        // 2. Register receiver
    }

    private fun setUpView() {
        setState.setOnClickListener {
            // Create Intent and send broadcast
        }
    }

    private fun checkConnection() {
        val connectionManager =
            getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = connectionManager.activeNetworkInfo
        val connectionState = activeNetwork?.takeIf {
            it.isConnected
        }?.let {
            R.string.state_connected
        } ?: R.string.state_disconnected

        networkState.setText(connectionState)
    }

    private val broadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            intent?.getStringExtra(STATE_VALUE)?.let {
                state.text = it
            }
        }
    }

    private val networkReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            checkConnection()
        }
    }
}
