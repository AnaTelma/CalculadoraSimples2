package com.project.calculadorasimples;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    double num1,num2,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_somar= findViewById(R.id.btn_soma);
        Button btn_subtrair= findViewById(R.id.btn_subtrai);
        Button btn_multiplicar= findViewById(R.id.btn_multiplica);
        Button btn_dividir= findViewById(R.id.btn_divide);

        TextView tv_resultado= findViewById(R.id.tv_resultado);
        EditText et_valor1= findViewById(R.id.et_valor1);
        EditText et_valor2= findViewById(R.id.et_valor2);


        btn_somar.setOnClickListener(view -> {
            num1=Double.parseDouble(et_valor1.getText().toString());
            num2=Double.parseDouble(et_valor2.getText().toString());
            res=num1+num2;
            tv_resultado.setText(String.valueOf(res));
        });
        btn_subtrair.setOnClickListener(view -> {
            num1=Double.parseDouble(et_valor1.getText().toString());
            num2=Double.parseDouble(et_valor2.getText().toString());
            res=num1-num2;
            tv_resultado.setText(String.valueOf(res));
        });btn_multiplicar.setOnClickListener(view -> {
            num1=Double.parseDouble(et_valor1.getText().toString());
            num2=Double.parseDouble(et_valor2.getText().toString());
            res=num1*num2;
            tv_resultado.setText(String.valueOf(res));
        });btn_dividir.setOnClickListener(view -> {
            num1=Double.parseDouble(et_valor1.getText().toString());
            num2=Double.parseDouble(et_valor2.getText().toString());
            res=num1/num2;
            tv_resultado.setText(String.valueOf(res));
        });
    }
}