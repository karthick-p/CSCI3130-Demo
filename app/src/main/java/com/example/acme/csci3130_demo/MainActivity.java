package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean button_status;
    private Button ok;
    private EditText entered_text;
    TextView output_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ok = findViewById(R.id.ok);
        entered_text = findViewById(R.id.textfield);
        output_text = findViewById(R.id.textView);
        button_status = false;

        ok.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!button_status) {
                    output_text.setText(entered_text.getText());
                    ok.setText("Submitted");
                    button_status = true;
                    entered_text.setText("");
                }
                else {
                    ok.setText("Submit");
                    button_status = false;
                }
            }
        });
    }
}
