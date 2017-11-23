package softuvo.com.navigationdrawerbothsides.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import softuvo.com.navigationdrawerbothsides.fragments.MyGroup_fragment;
import softuvo.com.navigationdrawerbothsides.fragments.Pages_Fragment;

public class PagesMainAdapter extends FragmentPagerAdapter {

    public PagesMainAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
            fragment = new Pages_Fragment();
        else if (position == 1)
            fragment = new Pages_Fragment();

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
                return "Pages";
            case 1:
                return "My Pages";
        }
        return null;
    }
}