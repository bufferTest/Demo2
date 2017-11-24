package softuvo.com.navigationdrawerbothsides.fragments;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import softuvo.com.navigationdrawerbothsides.Activity.MainActivity;
import softuvo.com.navigationdrawerbothsides.Adapter.PagesMarketplaceAdapter;
import softuvo.com.navigationdrawerbothsides.R;

public class MarketPlaceFragment extends Fragment {
    private PagesMarketplaceAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @RequiresApi(api = Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View getView = inflater.inflate(R.layout.fragment_marketplace, container, false);
        ((MainActivity)getActivity()).setTitle("MarketPlace");
        mSectionsPagerAdapter = new PagesMarketplaceAdapter(getChildFragmentManager());

        mViewPager = getView.findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = getView.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        View root = tabLayout.getChildAt(0);
        if (root instanceof LinearLayout) {
            ((LinearLayout) root).setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE);
            GradientDrawable drawable = new GradientDrawable();
            drawable.setColor(getResources().getColor(R.color.divider_color));
            drawable.setSize(3, 1);
            ((LinearLayout) root).setDividerPadding(10);
            ((LinearLayout) root).setDividerDrawable(drawable);
        }
        return getView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
