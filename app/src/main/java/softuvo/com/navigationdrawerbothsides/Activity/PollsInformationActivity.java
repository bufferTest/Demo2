package softuvo.com.navigationdrawerbothsides.Activity;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import softuvo.com.navigationdrawerbothsides.Adapter.ShowMembersAdapter;
import softuvo.com.navigationdrawerbothsides.R;

public class PollsInformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polls_information);

        ImageView menuLeft = findViewById(R.id.menuLeft);
        menuLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        ArrayList<Integer> users = new ArrayList<>();
        users.add(R.drawable.photo1);
        users.add(R.drawable.photo1);
        users.add(R.drawable.photo1);

        ShowMembersAdapter adapter = new ShowMembersAdapter(getApplicationContext(), users);
        RecyclerView rv_members = findViewById(R.id.rv_members);
        rv_members.setHasFixedSize(true);
        rv_members.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv_members.setLayoutManager(llm);


        ConstraintLayout lay_members = findViewById(R.id.lay_members);
        lay_members.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PollResultsActivity.class));
            }
        });
    }
}
