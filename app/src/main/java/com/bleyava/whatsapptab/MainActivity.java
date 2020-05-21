package com.bleyava.whatsapptab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import org.w3c.dom.Document;

import java.lang.annotation.Documented;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        CookieManager.getInstance().setAcceptCookie(true);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView wv = (WebView) findViewById(R.id.wbv);

        wv.loadUrl("https://web.whatsapp.com/");

        WebView webView = wv;

        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setUserAgentString("Mozilla/5.0 (Linux; Win64; x64; rv:46.0) Gecko/20100101 Firefox/68.0");
        webView.getSettings().setDomStorageEnabled(true);
        webView.setInitialScale(100);
    }
}
