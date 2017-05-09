package com.example.admin.vd_listenerinvariable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btndoiC, btndoiF, btnclear;
    EditText eddoC, eddoF;
    private View.OnClickListener myVarListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (v == btndoiC) {
                double F = (Double) Double.parseDouble(eddoF.getText() + "");
                eddoC.setText(((F - 32) * (5 / 9)) + "");
            }
            if (v == btndoiF) {
                double C = (Double) Double.parseDouble(eddoF.getText() + "");
                eddoF.setText(((C * 9/5) + (double) (32)) + "");
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btndoiC = (Button) findViewById(R.id.doiC);
        btndoiF = (Button) findViewById(R.id.doiF);
        btnclear = (Button) findViewById(R.id.clear);
        eddoC = (EditText) findViewById(R.id.ed_C);
        eddoF = (EditText) findViewById(R.id.ed_F);
        btndoiC.setOnClickListener(myVarListener);
    }
}
