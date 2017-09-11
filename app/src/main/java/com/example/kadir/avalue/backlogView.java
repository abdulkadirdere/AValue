package com.example.kadir.avalue;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class backlogView extends AppCompatActivity {


    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backlog_view);
        WebView myWebView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("http://avaluetreefelling.co.za/");

        // Stop local links and redirects from opening in browser instead of WebView
        myWebView.setWebViewClient(new MyAppWebViewClient());
    }

    @Override
    public void onBackPressed() {
        WebView webView = (WebView) findViewById(R.id.webView);
        if(webView!=null)
        {
            if(webView.canGoBack())
            {
                webView.goBack();
            }
            else
            {
                super.onBackPressed();
            }
        }
    }

}
