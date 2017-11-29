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

public class AddPagesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_pages);

        ImageView menuLeft = findViewById(R.id.menuLeft);
        menuLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        Spinner filter_Menu =findViewById(R.id.filter_Menu);
        Spinner category_Menu =findViewById(R.id.category_Menu);

        ArrayList<String> category = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.category)));
        CategorySpinnerAdapter filterSpinnerAdapter = new CategorySpinnerAdapter(getApplicationContext(), category);
        filter_Menu.setAdapter(filterSpinnerAdapter);

        CategorySpinnerAdapter categorySpinnerAdapter = new CategorySpinnerAdapter(getApplicationContext(), category);
        category_Menu.setAdapter(categorySpinnerAdapter);
        /*category_Menu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                category_Menu = parent.getItemAtPosition(position).toString();
                setConditions();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*/
    }
}
