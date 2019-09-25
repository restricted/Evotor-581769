/*
 * Copyright (c) 2019. Dementyev Alexey.
 */

package ru.zaoblako.evotor.struna;

import android.os.Bundle;
import android.webkit.WebView;

import ru.evotor.framework.core.IntegrationAppCompatActivity;

public class WebActivity extends IntegrationAppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://46.101.107.28/strunaplus");
    }


}
