package com.example.unsolito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class Web extends AppCompatActivity {

    Button btnBuscar;
    EditText EdURL;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        btnBuscar = findViewById(R.id.btnViewWebLink);
        EdURL = findViewById(R.id.EDURL);

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = EdURL.getText().toString();
                WebView myWebView = (WebView) findViewById(R.id.Explorador);
                myWebView.loadUrl(url);

            }
        });

    }
}