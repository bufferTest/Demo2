package softuvo.com.navigationdrawerbothsides.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

import softuvo.com.navigationdrawerbothsides.Adapter.CategorySpinnerAdapter;
import softuvo.com.navigationdrawerbothsides.R;

public class AddGroupActivity extends AppCompatActivity {
    Spinner category_Menu;
    /* git remote set-url origin "https://github.com/bufferTest/Demo2.git" */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_group);
        ImageView menuLeft = findViewById(R.id.menuLeft);
        menuLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        category_Menu =findViewById(R.id.category_Menu);

        ArrayList<String> category = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.category)));
        CategorySpinnerAdapter categorySpinnerAdapter = new CategorySpinnerAdapter(getApplicationContext(), category);
        category_Menu.setAdapter(categorySpinnerAdapter);
    }
}
