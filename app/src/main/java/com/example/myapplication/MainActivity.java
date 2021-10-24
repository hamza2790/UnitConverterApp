package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView, textView2, textView4, valueinMPH;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.valueOfMPH);
        valueinMPH = findViewById(R.id.valueOfMPH);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConvertFromKPHToMPH();
            }
        });
    }
    private void ConvertFromKPHToMPH(){
        String valueEnteredinKPH = editText.getText().toString();
        double KPH = Double.parseDouble(valueEnteredinKPH);
        double MPH = KPH*0.6213;

        textView4.setText("" + MPH);
    }
}