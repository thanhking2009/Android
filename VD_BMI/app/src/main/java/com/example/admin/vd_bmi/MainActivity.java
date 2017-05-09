package com.example.admin.vd_bmi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtkqbmi, txtkqcd;
    Button btntinh;
    EditText edcc, edcn;
    String chandoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtkqbmi = (TextView) findViewById(R.id.kqBMI);
        txtkqcd = (TextView) findViewById(R.id.kqcd);
        btntinh = (Button) findViewById(R.id.tinh);
        edcc = (EditText) findViewById(R.id.cao);
        edcn = (EditText) findViewById(R.id.can);
        btntinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double H=Double.parseDouble(edcc.getText()+"");
                double W=Double.parseDouble(edcn.getText()+"");
                double BMI=W/Math.pow(H, 2);
                if(BMI<18)
                {
                    chandoan="Bạn gầy";
                }
                else if(BMI<=24.9)
                {
                    chandoan="Bạn bình thường";
                }
                else if(BMI<=29.9)
                {
                    chandoan="Bạn béo phì độ 1";
                }
                else if(BMI<=34.9)
                {
                    chandoan="Bạn béo phì độ 2";
                }
                else
                {
                    chandoan="Bạn béo phì độ 3";
                }
                txtkqcd.setText(chandoan);
                txtkqbmi.setText(BMI + "");

            }
        });
    }
}
