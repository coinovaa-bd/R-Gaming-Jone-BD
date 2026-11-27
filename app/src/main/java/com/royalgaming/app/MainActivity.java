package com.royalgaming.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.graphics.Color;

public class MainActivity extends Activity {
    private WebView webView;
    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        getWindow().setStatusBarColor(Color.rgb(9,9,9));
        getWindow().setNavigationBarColor(Color.rgb(9,9,9));
        webView = new WebView(this);
        webView.setBackgroundColor(Color.rgb(9,9,9));
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(true);
        settings.setAllowFileAccess(true);
        settings.setSupportZoom(false);
        webView.setWebViewClient(new WebViewClient());
        setContentView(webView);
        webView.loadUrl("file:///android_asset/index.html");
    }
    @Override public void onBackPressed() {
        if (webView != null) {
            webView.evaluateJavascript("(function(){if(document.getElementById('screen').style.display==='block'){home();return 'handled';}return 'exit';})()", value -> {
                if ("\"exit\"".equals(value)) MainActivity.super.onBackPressed();
            });
        } else super.onBackPressed();
    }
}
