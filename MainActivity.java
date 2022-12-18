package com.sandy.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView1;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        textView1=findViewById(R.id.textView1);
        editText=findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Succesfully Converted", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int kg=Integer.parseInt(s);
                double pound=2.204623*kg;
                textView1.setText("The Corresponding Value in pound is " + pound);
            }
        });


    }
}