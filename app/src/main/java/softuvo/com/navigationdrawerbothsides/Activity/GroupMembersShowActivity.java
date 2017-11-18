package softuvo.com.navigationdrawerbothsides.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import softuvo.com.navigationdrawerbothsides.Adapter.GroupMemberShowAdapter;
import softuvo.com.navigationdrawerbothsides.R;

public class GroupMembersShowActivity extends AppCompatActivity {
    ArrayList<Integer> users;
    RecyclerView rv_members;
    GroupMemberShowAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_members_show);
        String title = getIntent().getStringExtra("title");
        TextView tv_title = findViewById(R.id.tv_title);
        TextView tv_subtitle = findViewById(R.id.tv_subtitle);
        tv_title.setText(title);
        tv_subtitle.setText(title);
        ImageView menuLeft = findViewById(R.id.menuLeft);
        menuLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        users = new ArrayList<>();
        users.add(R.drawable.photo1);
        users.add(R.drawable.photo1);
        users.add(R.drawable.photo1);
        adapter = new GroupMemberShowAdapter(this, users);
        rv_members = findViewById(R.id.rv_members);
        rv_members.setHasFixedSize(true);
        rv_members.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv_members.setLayoutManager(llm);
    }
}
