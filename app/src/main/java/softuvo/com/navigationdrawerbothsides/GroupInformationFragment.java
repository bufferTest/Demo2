package softuvo.com.navigationdrawerbothsides;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class GroupInformationFragment extends Fragment {
    private ImageView lay_cover, iv_profile;
    ArrayList<Integer> users;
    SharingAccountsAdapter adapter;
    RecyclerView rv_members, rv_admin;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View getView = inflater.inflate(R.layout.frag_group_information, container, false);
        lay_cover = getView.findViewById(R.id.lay_cover);
        iv_profile = getView.findViewById(R.id.iv_profile);
        Glide.with(getActivity()).load(R.drawable.photo1).into(lay_cover);
        Glide.with(getActivity()).load(R.drawable.photo1).into(iv_profile);
        users = new ArrayList<>();
        users.add(R.drawable.photo1);
        users.add(R.drawable.photo1);
        users.add(R.drawable.photo1);

        adapter = new SharingAccountsAdapter(this, users);
        rv_members = getView.findViewById(R.id.rv_members);
        rv_members.setHasFixedSize(true);
        rv_members.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv_members.setLayoutManager(llm);

        rv_admin = getView.findViewById(R.id.rv_admin);
        rv_admin.setHasFixedSize(true);
        rv_admin.setAdapter(adapter);
        LinearLayoutManager llm2 = new LinearLayoutManager(getActivity());
        llm2.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv_admin.setLayoutManager(llm2);
        return getView;
    }
}
