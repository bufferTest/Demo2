package softuvo.com.navigationdrawerbothsides;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class GroupInformationAdapter extends FragmentPagerAdapter {

    public GroupInformationAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0) {
            fragment = new GroupInformationFragment();
        } else if (position == 1) {
            fragment = new GroupInformationFragment();
        } else if (position == 2) {
            fragment = new GroupEventsFragment();
        } else if (position == 3) {
            fragment = new GroupPhotosFragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Information";
            case 1:
                return "Activity";
            case 2:
                return "Events";
            case 3:
                return "Photos";
        }
        return null;
    }
}
