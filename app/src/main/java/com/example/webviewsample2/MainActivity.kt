package com.example.webviewsample2

import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webViewVariable=findViewById<WebView>(R.id.webView)
        webViewSetUp(webViewVariable)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(a: WebView){
        a.webViewClient= WebViewClient()
        a.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled = true
            loadUrl("https://support.maidinindia.co.in/")
        }
    }
}