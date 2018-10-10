package br.com.app.componentes.componentesaplicacao

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService: FirebaseMessagingService(){
    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        super.onMessageReceived(remoteMessage)

        NotificationUtils.showNotification(
                this,
                1234,
                "CHANNEL_BOTAO_DOIS",
                "CHANNEL_BOTAO_DOIS_NAME",
                remoteMessage?.notification?.body.toString(),
                remoteMessage?.notification?.title.toString())
    }
}