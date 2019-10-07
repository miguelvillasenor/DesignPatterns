package dev.mvillasenor.designpatterns.observer

import androidx.lifecycle.MutableLiveData

class Subject {

    val viewState = MutableLiveData<String>()

    fun setNewState(state: String) {
        viewState.postValue(state)
    }

}
