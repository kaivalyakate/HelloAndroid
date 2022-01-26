package edu.stevens.cs522.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ShowActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.mainActivityId);

        TextView tv = findViewById(R.id.welcomeTextView);
        tv.setText(message);

    }
}