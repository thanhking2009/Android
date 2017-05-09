package com.example.admin.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtkq;
    EditText ea, eb;
    Button btntong, btntru, btnnhan, btnchia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtkq = (TextView) findViewById(R.id.kq);
        ea = (EditText) findViewById(R.id.eda);
        eb = (EditText) findViewById(R.id.edb);
        btntong = (Button) findViewById(R.id.tong);
        btntru = (Button) findViewById(R.id.tru);
        btnnhan = (Button) findViewById(R.id.nhan);
        btnchia = (Button) findViewById(R.id.chia);
        Kiemtra(ea);
        Kiemtra(eb);
        btntong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Kiemtra(ea) == false || Kiemtra(eb) == false)
                    txtkq.setText("Moi nhap so");
                else
                    txtkq.setText(Integer.parseInt(ea.getText() + "") + Integer.parseInt(eb.getText() + "") + "");

            }
        });
        btntru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Kiemtra(ea) == false || Kiemtra(eb) == false)
                    txtkq.setText("Moi nhap so");
                else
                    txtkq.setText(Integer.parseInt(ea.getText() + "") - Integer.parseInt(eb.getText() + "") + "");
            }
        });
        btnnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Kiemtra(ea) == false || Kiemtra(eb) == false)
                    txtkq.setText("Moi nhap so");
                else
                    txtkq.setText(Integer.parseInt(ea.getText() + "") * Integer.parseInt(eb.getText() + "") + "");
            }
        });
        btnchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Kiemtra(ea) == false || Kiemtra(eb) == false)
                    txtkq.setText("Moi nhap so");
                else
                    txtkq.setText((float) Integer.parseInt(ea.getText() + "") / Integer.parseInt(eb.getText() + "") + "");
            }
        });
    }

    public boolean Kiemtra(EditText n) {
        try {
            Integer.parseInt(n.getText() + "");
        } catch (Exception e) {
            return false;
        }
        return true;

    }

}



