package softuvo.com.navigationdrawerbothsides.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import softuvo.com.navigationdrawerbothsides.Adapter.GroupActivityAdapter;
import softuvo.com.navigationdrawerbothsides.ListData;
import softuvo.com.navigationdrawerbothsides.R;

public class GroupActivityFragment extends Fragment {
    private ArrayList<ListData.events> users;
    private GroupActivityAdapter adapter;
    private RecyclerView rv_events;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View getView = inflater.inflate(R.layout.frag_group_activity, container, false);
        users = new ArrayList<>();
        users.addAll(ListData.getEvents());
        adapter = new GroupActivityAdapter(getActivity(), users);
        rv_events = getView.findViewById(R.id.rv_events);
        rv_events.setHasFixedSize(true);
        rv_events.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv_events.setLayoutManager(llm);
        return getView;
    }
}