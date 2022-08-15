package com.example.hw_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hw_1.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Ed1 = findViewById(R.id.no1);
        EditText Ed2 = findViewById(R.id.no2);
        EditText Ed3 = findViewById(R.id.no3);
        EditText Ed4 = findViewById(R.id.no4);
        Button b = findViewById(R.id.button);
        TextView t = findViewById(R.id.textView);

        Button submitButton = findViewById(R.id.button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(Ed1.getText().toString());
                int num2 = Integer.parseInt(Ed2.getText().toString());
                int num3 = Integer.parseInt(Ed3.getText().toString());
                int num4 = Integer.parseInt(Ed4.getText().toString());

                int result = num1 + num2 + num3 + num4;

                t.setText(String.valueOf(result));

            }
        });

    }

}
