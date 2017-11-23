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

import softuvo.com.navigationdrawerbothsides.Activity.GroupMembersShowActivity;
import softuvo.com.navigationdrawerbothsides.Adapter.ShowMembersAdapter;
import softuvo.com.navigationdrawerbothsides.R;

public class PageInformationFragment extends Fragment {
    private ImageView lay_cover, iv_profile;
    ArrayList<Integer> users;
    ShowMembersAdapter adapter;
    RecyclerView rv_likes;
    ConstraintLayout lay_members;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View getView = inflater.inflate(R.layout.frag_page_information, container, false);
        lay_cover = getView.findViewById(R.id.lay_cover);
        iv_profile = getView.findViewById(R.id.iv_profile);
        Glide.with(getActivity()).load(R.drawable.photo1).into(lay_cover);
        Glide.with(getActivity()).load(R.drawable.photo1).into(iv_profile);
        users = new ArrayList<>();
        users.add(R.drawable.photo1);
        users.add(R.drawable.photo1);
        users.add(R.drawable.photo1);

        adapter = new ShowMembersAdapter(getActivity(), users);
        rv_likes = getView.findViewById(R.id.rv_likes);
        rv_likes.setHasFixedSize(true);
        rv_likes.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv_likes.setLayoutManager(llm);

        lay_members = getView.findViewById(R.id.lay_likes);
        lay_members.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), GroupMembersShowActivity.class);
                intent.putExtra("title","Likes");
                getActivity().startActivity(intent);
            }
        });
        return getView;
    }
}
