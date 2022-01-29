package edu.stevens.cs522.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends Activity implements View.OnClickListener {

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        EditText edText = findViewById(R.id.editTextTextPersonName);
        String helloText = "Hello "+edText.getText();
        Intent intent = new Intent(this, ShowActivity.class);
        intent.putExtra(ShowActivity.showActivityId, helloText);
        startActivity(intent);
    }

//    public void onBtnClick(View view){
//        EditText ed = findViewById(R.id.editTextTextPersonName);
//        System.out.println(ed.getText());
//        String output = "Hello "+ed.getText();
//        Toast.makeText(getApplicationContext(), output, Toast.LENGTH_LONG).show();
//    }

}