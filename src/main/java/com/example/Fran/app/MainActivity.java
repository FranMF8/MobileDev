package com.example.Fran.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText text1;
    private EditText text2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (EditText) findViewById(R.id.n1Input);
        text2 = (EditText) findViewById(R.id.n2Input);

        result = (TextView) findViewById(R.id.ResultView);
    }

    public void Calculate(View view) {
        String value1 = text1.getText().toString();
        String value2 = text2.getText().toString();

        int n1 = Integer.parseInt(value1);
        int n2 = Integer.parseInt(value2);

        String resultString = String.valueOf(n1 + n2);

        result.setText(resultString);
    }
}