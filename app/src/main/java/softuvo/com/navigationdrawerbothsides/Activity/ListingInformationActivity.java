package softuvo.com.navigationdrawerbothsides.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import softuvo.com.navigationdrawerbothsides.Adapter.ShowMembersAdapter;
import softuvo.com.navigationdrawerbothsides.R;

public class ListingInformationActivity extends AppCompatActivity {
    RecyclerView iv_listing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing_information);
        ArrayList<Integer> users = new ArrayList<>();
        users.add(R.drawable.photo1);
        users.add(R.drawable.photo1);
        users.add(R.drawable.photo1);

        ShowMembersAdapter adapter = new ShowMembersAdapter(getApplicationContext(), users);
        iv_listing = findViewById(R.id.iv_listing);
        iv_listing.setHasFixedSize(true);
        iv_listing.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        iv_listing.setLayoutManager(llm);
    }
}
