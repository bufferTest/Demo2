package softuvo.com.navigationdrawerbothsides.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import softuvo.com.navigationdrawerbothsides.fragments.AllBlogsFragment;
import softuvo.com.navigationdrawerbothsides.fragments.AllPollsFragment;
import softuvo.com.navigationdrawerbothsides.fragments.MyBlogFragment;
import softuvo.com.navigationdrawerbothsides.fragments.MyPollsFragment;

public class PollsMainAdapter extends FragmentPagerAdapter {

    public PollsMainAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
            fragment = new AllPollsFragment();
        else if (position == 1)
            fragment = new MyPollsFragment();

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
                return "All Polls";
            case 1:
                return "My Polls";
        }
        return null;
    }
}