package net.androidbootcamp.healthyrecipes;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Coffee extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] shops = {"Lucky Goat Coffee","Black Dog Cafe", "All Saints Cafe", "RedEye Coffee", "The Sweet Shop"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_coffee, R.id.cofeeshops, shops));
    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://luckygoatcoffee.com/")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://blackdogcafefl.wixsite.com/blackdogcafe")));
                break;
            case 2:
                startActivity(new Intent(Coffee.this,Allsaints.class));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.re3eye.com/")));
                break;
            case 4:
                startActivity(new Intent(Coffee.this, Sweetshop.class));
                break;
        }
    }

}
