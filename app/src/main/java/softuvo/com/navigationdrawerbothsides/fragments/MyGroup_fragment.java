package softuvo.com.navigationdrawerbothsides.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import softuvo.com.navigationdrawerbothsides.Adapter.GroupsListAdapter;
import softuvo.com.navigationdrawerbothsides.ListData;
import softuvo.com.navigationdrawerbothsides.R;

public class MyGroup_fragment extends Fragment {
    private RecyclerView grouplist;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View getView = inflater.inflate(R.layout.fragment_groups, container, false);
        grouplist = getView.findViewById(R.id.listview);
        GroupsListAdapter adapter = new GroupsListAdapter(getActivity(), ListData.getGroupList());
        grouplist.setHasFixedSize(true);
        grouplist.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        grouplist.setLayoutManager(llm);
        return getView;
    }

}
