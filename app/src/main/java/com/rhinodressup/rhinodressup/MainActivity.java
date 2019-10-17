
// Marcel Timm, RhinoDevel, 2019

package com.rhinodressup.rhinodressup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        WebView webview = new WebView(this);
        WebSettings webSettings = webview.getSettings();

        webSettings.setJavaScriptEnabled(true);

        setContentView(webview);

        webview.loadUrl("file:///android_asset/RhinoDressUp/index.html");
    }
}
