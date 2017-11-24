package softuvo.com.navigationdrawerbothsides.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import softuvo.com.navigationdrawerbothsides.fragments.GroupActivityFragment;
import softuvo.com.navigationdrawerbothsides.fragments.GroupEventsFragment;
import softuvo.com.navigationdrawerbothsides.fragments.GroupInformationFragment;
import softuvo.com.navigationdrawerbothsides.fragments.GroupPhotosFragment;
import softuvo.com.navigationdrawerbothsides.fragments.QuizzesActivityFragment;

public class QuizzesInformationAdapter extends FragmentPagerAdapter {

    public QuizzesInformationAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0) {
            fragment = new QuizzesActivityFragment();
        } else if (position == 1) {
            fragment = new GroupActivityFragment();
        } else if (position == 2) {
            fragment = new GroupEventsFragment();
        } else if (position == 3) {
            fragment = new GroupPhotosFragment();
        } else if (position == 4) {
            fragment = new GroupPhotosFragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Activity";
            case 1:
                return "About";
            case 2:
                return "Friends";
            case 3:
                return "Photos";
            case 4:
                return "Activity Points";
        }
        return null;
    }
}
