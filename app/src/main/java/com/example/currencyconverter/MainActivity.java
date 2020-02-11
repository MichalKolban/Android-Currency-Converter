package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertMoney(View view){

        Log.i("info", "button pressed");

        EditText convertMoney = findViewById(R.id.amountText);

        double exchange = 4.26;
        DecimalFormat df = new DecimalFormat("#.##");
        double amount = Double.parseDouble(convertMoney.getText().toString());
        double endAmount = exchange * amount;
        String msg = String.valueOf(df.format(endAmount));

        Toast.makeText(this,msg + " pln", Toast.LENGTH_LONG).show();



    }

}
