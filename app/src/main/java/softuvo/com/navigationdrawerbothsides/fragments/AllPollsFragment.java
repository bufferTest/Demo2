package softuvo.com.navigationdrawerbothsides.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import softuvo.com.navigationdrawerbothsides.Adapter.BlogsAdapter;
import softuvo.com.navigationdrawerbothsides.Adapter.PollsAdapter;
import softuvo.com.navigationdrawerbothsides.ListData;
import softuvo.com.navigationdrawerbothsides.R;

public class AllPollsFragment extends Fragment {
    private RecyclerView rv_polls;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View getView = inflater.inflate(R.layout.fragment_polls, container, false);
        rv_polls = getView.findViewById(R.id.rv_polls);
        PollsAdapter adapter = new PollsAdapter(getActivity(), ListData.getGroupList());
        rv_polls.setHasFixedSize(true);
        rv_polls.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv_polls.setLayoutManager(llm);
        return getView;
    }

}