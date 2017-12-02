package softuvo.com.navigationdrawerbothsides.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import softuvo.com.navigationdrawerbothsides.Adapter.BlogsAdapter;
import softuvo.com.navigationdrawerbothsides.Adapter.PersonFriendsAdapter;
import softuvo.com.navigationdrawerbothsides.ListData;
import softuvo.com.navigationdrawerbothsides.R;

public class PersonFriendsFragment extends Fragment {
    private RecyclerView rv_friends;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View getView = inflater.inflate(R.layout.fragment_person_friends, container, false);
        rv_friends = getView.findViewById(R.id.rv_friends);
        PersonFriendsAdapter adapter = new PersonFriendsAdapter(getActivity(), ListData.getGroupList());
        rv_friends.setHasFixedSize(true);
        rv_friends.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv_friends.setLayoutManager(llm);
        return getView;
    }

}