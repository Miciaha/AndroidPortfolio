package net.androidbootcamp.healthyrecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class PiggyBank extends AppCompatActivity {
    final double valQuarter = 0.25,
    valDime = 0.10,
    valNickel = 0.05,
    valPenny = 0.01;

    int numQuarters = 0,
    numDimes = 0,
    numNickels = 0,
    numPennies = 0;

    double sumQuarters,
    sumDimes,
    sumNickles,
    sumPennies,
    total;

    String moneyChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piggy_bank);

        final EditText Quarters = (EditText)findViewById(R.id.numQuarters);
        final EditText Dimes = (EditText)findViewById(R.id.numDimes);
        final EditText Nickles = (EditText)findViewById(R.id.numNickles);
        final EditText Pennies = (EditText)findViewById(R.id.numPennies);

        final Spinner group = (Spinner)findViewById(R.id.txtMoney);

        Button calculate = (Button)findViewById(R.id.calculateCoins);

        calculate.setOnClickListener(new View.OnClickListener() {
            final TextView result = (TextView)findViewById(R.id.txtResult);
            @Override
            public void onClick(View view) {
                try {
                    numQuarters = Integer.parseInt(Quarters.getText().toString());
                }
                catch (NumberFormatException e){
                    numQuarters = 0;
                }

                try {
                    numDimes = Integer.parseInt(Dimes.getText().toString());
                }
                catch (NumberFormatException e){
                    numDimes = 0;
                }

                try {
                    numNickels = Integer.parseInt(Nickles.getText().toString());
                }
                catch (NumberFormatException e){
                    numNickels = 0;
                }

                try {
                    numPennies = Integer.parseInt(Pennies.getText().toString());
                }
                catch (NumberFormatException e){
                    numPennies = 0;
                }

                sumQuarters = numQuarters * valQuarter;
                sumDimes = numDimes * valDime;
                sumNickles = numNickels * valNickel;
                sumPennies = numPennies * valPenny;
                total = sumDimes + sumPennies + sumNickles + sumQuarters;

                DecimalFormat america = new DecimalFormat("$###.##");

                moneyChoice = group.getSelectedItem().toString();

                result.setText("You have " + america.format(total) + " to " + moneyChoice + "!");

            }
        });


    }
}
