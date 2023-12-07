package com.example.commonintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons
        Button browser_btn = findViewById(R.id.broswer_btn);
        Button map_btn = findViewById(R.id.map_btn);
        //edit texts
        EditText url = findViewById(R.id.web_url);
        EditText map = findViewById(R.id.map_location);
        //onclick events
        browser_btn.setOnClickListener(view -> {
            Uri page=Uri.parse(url.getText().toString());
            Intent intent = new Intent(Intent.ACTION_VIEW, page);
            startActivity(intent);
        });
        map_btn.setOnClickListener(view -> {
            String url_string=map.getText().toString();
            Uri location=Uri.parse("geo:0,0?q="+url_string);
            Intent intent = new Intent(Intent.ACTION_VIEW, location);
            startActivity(intent);
        });


    }
}