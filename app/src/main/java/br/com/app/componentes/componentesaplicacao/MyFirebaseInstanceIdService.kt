package br.com.app.componentes.componentesaplicacao

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceIdService
import com.google.firebase.iid.FirebaseInstanceId



class MyFirebaseInstanceIdService: FirebaseInstanceIdService(){
    override fun onTokenRefresh() {
        super.onTokenRefresh()

        val token = FirebaseInstanceId.getInstance().token
        Log.i("TOKEN", token)
    }
}