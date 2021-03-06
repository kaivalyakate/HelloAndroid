package edu.stevens.cs522.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ShowActivity extends Activity {

    public static String MESSAGE_KEY = "edu.stevens.cs522.hello";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MESSAGE_KEY);

        TextView tv = findViewById(R.id.welcomeTextView);
        tv.setText(message);

    }
}