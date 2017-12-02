package softuvo.com.navigationdrawerbothsides.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import softuvo.com.navigationdrawerbothsides.Activity.CheckInActivity;
import softuvo.com.navigationdrawerbothsides.Adapter.ShowMembersAdapter;
import softuvo.com.navigationdrawerbothsides.R;

public class PersonActivityFragment extends Fragment {
    private ImageView lay_cover, iv_profile;
    ArrayList<Integer> users;
    ShowMembersAdapter adapter;
    RecyclerView rv_members, rv_admin;
    ConstraintLayout lay_members, lay_admin;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View getView = inflater.inflate(R.layout.frag_person_activity, container, false);
        lay_cover = getView.findViewById(R.id.lay_cover);
        iv_profile = getView.findViewById(R.id.iv_profile);
        Glide.with(getActivity()).load(R.drawable.photo1).into(lay_cover);
        Glide.with(getActivity()).load(R.drawable.photo1).into(iv_profile);
        users = new ArrayList<>();
        users.add(R.drawable.photo1);
        users.add(R.drawable.photo1);
        users.add(R.drawable.photo1);

        adapter = new ShowMembersAdapter(getActivity(), users);
        rv_members = getView.findViewById(R.id.rv_members);
        rv_members.setHasFixedSize(true);
        rv_members.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv_members.setLayoutManager(llm);

        ImageView iv_location = getView.findViewById(R.id.iv_location);
        iv_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), CheckInActivity.class));
            }
        });

        return getView;
    }
}
