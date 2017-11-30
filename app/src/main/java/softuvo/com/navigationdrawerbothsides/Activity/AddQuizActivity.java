package softuvo.com.navigationdrawerbothsides.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import softuvo.com.navigationdrawerbothsides.Adapter.GroupsListAdapter;
import softuvo.com.navigationdrawerbothsides.Adapter.QuizQuestionsAdapter;
import softuvo.com.navigationdrawerbothsides.ListData;
import softuvo.com.navigationdrawerbothsides.R;

public class AddQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_quiz);

        ImageView menuLeft = findViewById(R.id.menuLeft);
        menuLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        RecyclerView rv_questions = findViewById(R.id.rv_questions);
        QuizQuestionsAdapter adapter = new QuizQuestionsAdapter(getApplicationContext(), ListData.getGroupList());
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv_questions.setHasFixedSize(true);
        rv_questions.setAdapter(adapter);
        rv_questions.setLayoutManager(llm);
    }
}
