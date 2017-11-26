package softuvo.com.navigationdrawerbothsides.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import softuvo.com.navigationdrawerbothsides.Adapter.GroupMemberShowAdapter;
import softuvo.com.navigationdrawerbothsides.Adapter.PollResultAdapter;
import softuvo.com.navigationdrawerbothsides.ListData;
import softuvo.com.navigationdrawerbothsides.R;

public class PollResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poll_results);
        ImageView menuLeft = findViewById(R.id.menuLeft);
        menuLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        ArrayList<Integer> users = ListData.dummyPhotos();
        RecyclerView rv_members = findViewById(R.id.rv_members);
        PollResultAdapter adapter = new PollResultAdapter(this, users);
        rv_members.setHasFixedSize(true);
        rv_members.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv_members.setLayoutManager(llm);
    }
}
