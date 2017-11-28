package net.androidbootcamp.healthyrecipes;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Weightconverter extends AppCompatActivity {
    double conversionRate =2.2,
    weightEntered,
    convertedWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weightconverter);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final EditText weight = (EditText) findViewById(R.id.pWeight);
        final RadioButton lbToKilo = (RadioButton) findViewById(R.id.LBtoK);
        final RadioButton kiloToLb = (RadioButton) findViewById(R.id.KtoLB);
        final TextView result = (TextView) findViewById(R.id.mwcResults);

        Button convert = (Button) findViewById(R.id.convertweight);


        convert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                weightEntered = Double.parseDouble(weight.getText().toString());
                DecimalFormat tenth = new DecimalFormat("#.#");
                if(lbToKilo.isChecked()){

                    if (weightEntered <= 1000){
                        convertedWeight = weightEntered/conversionRate;
                        result.setText(tenth.format(convertedWeight) + " kilograms");
                    } else {
                        Toast.makeText(Weightconverter.this,"Pounds must be less than 1,000", Toast.LENGTH_LONG).show();
                    }

                }
                if(kiloToLb.isChecked()){
                    if (weightEntered <= 1000){
                        convertedWeight = weightEntered * conversionRate;
                        result.setText(tenth.format(convertedWeight) + " pounds");
                    } else {
                        Toast.makeText(Weightconverter.this,"Kilos must be less than 453.5", Toast.LENGTH_LONG).show();
                    }

                }
            }
        });
    }
}
