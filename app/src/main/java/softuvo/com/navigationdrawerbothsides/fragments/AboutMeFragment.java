package softuvo.com.navigationdrawerbothsides.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import softuvo.com.navigationdrawerbothsides.R;

public class AboutMeFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View getView = inflater.inflate(R.layout.frag_aboutme_activity, container, false);
        return getView;
    }
}
