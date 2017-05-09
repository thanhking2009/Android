package com.example.admin.doilich;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtkq;
    Button btnchuyen;
    EditText ednam;
    int c, cc;
    String Can;
    String Chi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtkq = (TextView) findViewById(R.id.kq);
        btnchuyen = (Button) findViewById(R.id.chuyen);
        ednam = (EditText) findViewById(R.id.edl);

        btnchuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (Integer.parseInt(ednam.getText() + "") % 10) {
                    case 0:
                        Can = "Canh";
                        break;
                    case 1:
                        Can = "Tân";
                        break;
                    case 2:
                        Can = "Nhâm";
                        break;
                    case 3:
                        Can = "Quý";
                        break;
                    case 4:
                        Can = "Giáp";
                        break;
                    case 5:
                        Can = "Ất";
                        break;
                    case 6:
                        Can = "Bính";
                        break;
                    case 7:
                        Can = "Đinh";
                        break;
                    case 8:
                        Can = "Mậu";
                        break;
                    case 9:
                        Can = "Kỷ";
                        break;

                }
                ;

                switch ((Integer.parseInt(ednam.getText() + "") % 12)) {
                    case 0:
                        Chi = "Thân";
                        break;
                    case 1:
                        Chi = "Dậu";
                        break;
                    case 2:
                        Chi = "Tuất";
                        break;
                    case 3:
                        Chi = "Hợi";
                        break;
                    case 4:
                        Chi = "Tý";
                        break;
                    case 5:
                        Chi = "Sửu";
                        break;
                    case 6:
                        Chi = "Dần";
                        break;
                    case 7:
                        Chi = "Mẹo";
                        break;
                    case 8:
                        Chi = "Thìn";
                        break;
                    case 9:
                        Chi = "Tỵ";
                        break;
                    case 10:
                        Chi = "Ngọ";
                        break;
                    case 11:
                        Chi = "Mùi";
                        break;

                }
                ;

                txtkq.setText(Can + " " + Chi);

            }
        });
    }
}
