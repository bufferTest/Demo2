package softuvo.com.navigationdrawerbothsides.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import softuvo.com.navigationdrawerbothsides.fragments.AllListingFragment;
import softuvo.com.navigationdrawerbothsides.fragments.MyListingFragment;

public class PagesMarketplaceAdapter extends FragmentPagerAdapter {

    public PagesMarketplaceAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
            fragment = new AllListingFragment();
        else if (position == 1)
            fragment = new MyListingFragment();

        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "All Listings";
            case 1:
                return "My Listings";
        }
        return null;
    }
}