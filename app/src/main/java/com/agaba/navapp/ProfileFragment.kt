package com.agaba.navapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class ProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val web = view?.findViewById<WebView>(R.id.webview)
        web?.webViewClient = WebViewClient()
        web?.loadUrl("www.github.com/abelagaba")
        val webSettings = web?.settings
        webSettings?.javaScriptEnabled = true

        return inflater.inflate(R.layout.fragment_profile, container, false)
    }
}