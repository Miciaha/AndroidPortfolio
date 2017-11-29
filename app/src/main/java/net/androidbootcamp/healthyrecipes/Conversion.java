package net.androidbootcamp.healthyrecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Conversion extends AppCompatActivity {
    double dollarsEntered,
    newAmount,
    euroComp = 0.8438,
    pesoComp = 18.536,
    canadaComp = 1.281;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final EditText amount = (EditText) findViewById(R.id.convertAmount);
        final RadioButton euros = (RadioButton) findViewById(R.id.radEuro);
        final RadioButton pesos = (RadioButton) findViewById(R.id.radPeso);
        final RadioButton canada = (RadioButton) findViewById(R.id.radCanadian);
        final Button convert = (Button) findViewById(R.id.convertDollars);
        final TextView result = (TextView) findViewById(R.id.currencyResult);

        convert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                dollarsEntered = Double.parseDouble(amount.getText().toString());
                DecimalFormat money = new DecimalFormat("###,###.##");

                if(dollarsEntered <= 100000){
                    if(euros.isChecked()){
                        newAmount = dollarsEntered * euroComp;
                        result.setText("$"+ money.format(dollarsEntered)+ " is equal to " + money.format(newAmount) + " euros.");
                    }
                    if(pesos.isChecked()){
                        newAmount = dollarsEntered * pesoComp;
                        result.setText("$"+ money.format(dollarsEntered)+ "is equal to " + money.format(newAmount) + " pesos.");
                    }
                    if(canada.isChecked()){
                        newAmount = dollarsEntered * canadaComp;
                        result.setText("$" +money.format(dollarsEntered) + " is equal to " + money.format(newAmount) + " Canadian dollars");
                    }
                } else {
                    Toast.makeText(Conversion.this,"Dollar amount must be less than $100,000",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
