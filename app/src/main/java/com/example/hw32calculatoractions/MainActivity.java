package com.example.hw32calculatoractions;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnZero;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEigth;
    private Button btnNine;
    private Button btnPoint;
    private TextView txtOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEigth = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnPoint = findViewById(R.id.btnPoint);
        txtOutput = findViewById(R.id.txtOutput);

        btnZero.setOnClickListener(onButtonClickListener);
        btnOne.setOnClickListener(onButtonClickListener);
        btnTwo.setOnClickListener(onButtonClickListener);
        btnThree.setOnClickListener(onButtonClickListener);
        btnFour.setOnClickListener(onButtonClickListener);
        btnFive.setOnClickListener(onButtonClickListener);
        btnSix.setOnClickListener(onButtonClickListener);
        btnSeven.setOnClickListener(onButtonClickListener);
        btnEigth.setOnClickListener(onButtonClickListener);
        btnNine.setOnClickListener(onButtonClickListener);
        btnPoint.setOnClickListener(onButtonClickListener);

    }

    View.OnClickListener onButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button btn = (Button) v;
            String txt = btn.getText().toString();
            txtOutput.setText(txt);

        }
    };
}
