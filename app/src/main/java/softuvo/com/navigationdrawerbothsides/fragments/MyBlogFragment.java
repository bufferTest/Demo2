package softuvo.com.navigationdrawerbothsides.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import softuvo.com.navigationdrawerbothsides.Adapter.BlogsAdapter;
import softuvo.com.navigationdrawerbothsides.ListData;
import softuvo.com.navigationdrawerbothsides.R;

public class MyBlogFragment extends Fragment {
    private RecyclerView rv_blogs;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View getView = inflater.inflate(R.layout.fragment_blogs, container, false);
        rv_blogs = getView.findViewById(R.id.rv_blogs);
        BlogsAdapter adapter = new BlogsAdapter(getActivity(), ListData.getGroupList());
        rv_blogs.setHasFixedSize(true);
        rv_blogs.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv_blogs.setLayoutManager(llm);
        return getView;
    }

}