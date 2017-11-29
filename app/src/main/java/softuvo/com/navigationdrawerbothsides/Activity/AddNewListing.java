package softuvo.com.navigationdrawerbothsides.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

import softuvo.com.navigationdrawerbothsides.Adapter.CategorySpinnerAdapter;
import softuvo.com.navigationdrawerbothsides.R;

public class AddNewListing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_listing);

        ImageView menuLeft = findViewById(R.id.menuLeft);
        menuLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        Spinner filter_Menu =findViewById(R.id.filter_Menu);
        Spinner price_menu =findViewById(R.id.price_menu);
        Spinner location_menu =findViewById(R.id.location_menu);
        Spinner privacy_menu =findViewById(R.id.privacy_menu);

        ArrayList<String> category = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.category)));
        CategorySpinnerAdapter filterSpinnerAdapter = new CategorySpinnerAdapter(getApplicationContext(), category);
        filter_Menu.setAdapter(filterSpinnerAdapter);
        price_menu.setAdapter(filterSpinnerAdapter);
        location_menu.setAdapter(filterSpinnerAdapter);
        privacy_menu.setAdapter(filterSpinnerAdapter);
    }
}
