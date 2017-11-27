package net.androidbootcamp.healthyrecipes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Piggy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piggy_land);

        Button buttonBank = (Button)findViewById(R.id.btnPiggyBank);

        buttonBank.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(Piggy.this, PiggyBank.class));
            }
        });



    }
}
