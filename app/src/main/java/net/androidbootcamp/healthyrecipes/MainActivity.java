package net.androidbootcamp.healthyrecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);

        //Setting icon in action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        Button buttonRecipe = (Button)findViewById(R.id.btnBruschetta);
        Button buttonConcert = (Button)findViewById(R.id.btnConcert);
        Button buttonPiggy = (Button)findViewById(R.id.btnPiggyBankApp);
        Button buttonWeight = (Button) findViewById(R.id.mwcapp);
        Button buttonConvert = (Button) findViewById(R.id.moneyConverter);
        Button buttonCoffee = (Button) findViewById(R.id.btnTally);

        buttonCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Coffee.class));
            }
        });

        buttonConvert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this,Conversion.class));
            }
        });

        buttonPiggy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Piggy.class));
            }
        });


        buttonConcert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Concert.class));
            }
        });

        buttonRecipe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Brush.class));
            }
        });

        buttonWeight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this,Weightconverter.class));
            }
        });

    }
}
