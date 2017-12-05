package com.example.lg.a216230115;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.*;
import android.webkit.*;


public class Fragment3 extends android.support.v4.app.Fragment {
    private WebView mWebView;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fragment3,container,false);
        mWebView = (WebView) view.findViewById(R.id.webView);
        mWebView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mWebView.loadUrl("http://www.google.com");
        return view;
    }
}