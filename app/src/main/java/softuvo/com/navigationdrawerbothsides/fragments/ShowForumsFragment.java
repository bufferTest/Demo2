package softuvo.com.navigationdrawerbothsides.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import softuvo.com.navigationdrawerbothsides.Adapter.DiscussionForumsAdapter;
import softuvo.com.navigationdrawerbothsides.Adapter.GroupsListAdapter;
import softuvo.com.navigationdrawerbothsides.ListData;
import softuvo.com.navigationdrawerbothsides.R;

public class ShowForumsFragment extends Fragment {
    private RecyclerView rv_members,rv_computers;
    ArrayList<String> DiscussionforumNames,ComputerForumsList;
    DiscussionForumsAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DiscussionforumNames = new ArrayList<>();
        DiscussionforumNames.add("General");
        DiscussionforumNames.add("Movies");
        DiscussionforumNames.add("Music");
        ComputerForumsList = new ArrayList<>();
        ComputerForumsList.add("Computers");
        ComputerForumsList.add("Electronics");
        ComputerForumsList.add("Gadget");
        ComputerForumsList.add("General");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View getView = inflater.inflate(R.layout.fragment_show_forums, container, false);
        rv_members = getView.findViewById(R.id.rv_members);
        adapter = new DiscussionForumsAdapter(getActivity(), DiscussionforumNames);
        rv_members.setHasFixedSize(true);
        rv_members.setAdapter(adapter);
        LinearLayoutManager discussionllm = new LinearLayoutManager(getActivity());
        discussionllm.setOrientation(LinearLayoutManager.VERTICAL);
        rv_members.setLayoutManager(discussionllm);

        rv_computers = getView.findViewById(R.id.rv_computers);
        adapter = new DiscussionForumsAdapter(getActivity(), ComputerForumsList);
        rv_computers.setHasFixedSize(true);
        rv_computers.setAdapter(adapter);
        LinearLayoutManager computerllm = new LinearLayoutManager(getActivity());
        computerllm.setOrientation(LinearLayoutManager.VERTICAL);
        rv_computers.setLayoutManager(computerllm);
        return getView;
    }

}
