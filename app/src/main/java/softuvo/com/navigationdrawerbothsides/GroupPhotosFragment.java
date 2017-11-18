package softuvo.com.navigationdrawerbothsides;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class GroupPhotosFragment extends Fragment {
    ArrayList<Integer> users;
    GroupPhotosAdapter adapter;
    RecyclerView rv_photos;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View getView = inflater.inflate(R.layout.frag_group_photos, container, false);
        users = new ArrayList<>();
        users.add(R.drawable.photo1);
        users.add(R.drawable.photo1);
        users.add(R.drawable.photo1);
        users.add(R.drawable.photo1);
        users.add(R.drawable.photo1);
        users.add(R.drawable.photo1);
        users.add(R.drawable.photo1);

        adapter = new GroupPhotosAdapter(this, users);
        rv_photos = getView.findViewById(R.id.rv_photos);
        rv_photos.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        rv_photos.setLayoutManager(gridLayoutManager);
        rv_photos.setAdapter(adapter);

        return getView;
    }
}
