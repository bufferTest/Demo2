package softuvo.com.navigationdrawerbothsides.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import softuvo.com.navigationdrawerbothsides.fragments.AboutMeFragment;
import softuvo.com.navigationdrawerbothsides.fragments.GroupActivityFragment;
import softuvo.com.navigationdrawerbothsides.fragments.GroupEventsFragment;
import softuvo.com.navigationdrawerbothsides.fragments.GroupInformationFragment;
import softuvo.com.navigationdrawerbothsides.fragments.GroupPhotosFragment;
import softuvo.com.navigationdrawerbothsides.fragments.PersonActivityFragment;
import softuvo.com.navigationdrawerbothsides.fragments.PersonFriendsFragment;
import softuvo.com.navigationdrawerbothsides.fragments.QuizzesActivityFragment;

public class ProfileInformationAdapter extends FragmentPagerAdapter {

    public ProfileInformationAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0) {
            fragment = new PersonActivityFragment();
        } else if (position == 1) {
            fragment = new AboutMeFragment();
        } else if (position == 2) {
            fragment = new PersonFriendsFragment();
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
