package softuvo.com.navigationdrawerbothsides.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import softuvo.com.navigationdrawerbothsides.Adapter.PagesListAdapter;
import softuvo.com.navigationdrawerbothsides.ListData;
import softuvo.com.navigationdrawerbothsides.R;

public class Pages_Fragment extends Fragment {
    private RecyclerView rv_pages;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View getView = inflater.inflate(R.layout.fragment_pages, container, false);
        rv_pages = getView.findViewById(R.id.rv_pages);
        PagesListAdapter adapter = new PagesListAdapter(getActivity(), ListData.getGroupList());
        rv_pages.setHasFixedSize(true);
        rv_pages.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv_pages.setLayoutManager(llm);
        return getView;
    }

}