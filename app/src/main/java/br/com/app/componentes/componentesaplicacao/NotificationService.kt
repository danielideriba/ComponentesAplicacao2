package br.com.app.componentes.componentesaplicacao

import android.app.IntentService
import android.content.Intent
import android.util.Log

class NotificationService: IntentService(""){
    override fun onHandleIntent(intent: Intent?) {
        val msg = intent?.getStringArrayExtra("MSG")
        val msg2 = intent?.getStringExtra("MSG2")
        Log.i("DANIEL", "---$msg")
        Log.i("DANIEL", "---$msg2")
    }

}