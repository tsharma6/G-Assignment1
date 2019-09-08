package com.tushar.unitsconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button convertButton = findViewById(R.id.button);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed1 = findViewById(R.id.editText1);
                String strInch = ed1.getText().toString();
                double valInch = Integer.parseInt(strInch);

                double valMtr = valInch * 0.0254;
                EditText ed2 = findViewById(R.id.editText2);
                ed2.setText(Double.toString(valMtr));

            }
        });

    }

}
