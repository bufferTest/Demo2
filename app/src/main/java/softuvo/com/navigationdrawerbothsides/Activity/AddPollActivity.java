package softuvo.com.navigationdrawerbothsides.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

import softuvo.com.navigationdrawerbothsides.Adapter.AddPollAnswerAdapter;
import softuvo.com.navigationdrawerbothsides.Adapter.CategorySpinnerAdapter;
import softuvo.com.navigationdrawerbothsides.Adapter.QuizQuestionsAdapter;
import softuvo.com.navigationdrawerbothsides.ListData;
import softuvo.com.navigationdrawerbothsides.R;

public class AddPollActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_poll);

        ImageView menuLeft = findViewById(R.id.menuLeft);
        menuLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        RecyclerView rv_answer = findViewById(R.id.rv_answer);
        AddPollAnswerAdapter adapter = new AddPollAnswerAdapter(getApplicationContext(), ListData.getGroupList());
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv_answer.setHasFixedSize(true);
        rv_answer.setAdapter(adapter);
        rv_answer.setLayoutManager(llm);

        Spinner filter_Menu = findViewById(R.id.filter_Menu);
        ArrayList<String> category = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.category)));
        CategorySpinnerAdapter filterSpinnerAdapter = new CategorySpinnerAdapter(getApplicationContext(), category);
        filter_Menu.setAdapter(filterSpinnerAdapter);

    }
}
