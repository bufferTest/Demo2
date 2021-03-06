package softuvo.com.navigationdrawerbothsides.Adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import softuvo.com.navigationdrawerbothsides.fragments.AllQuizzesFragment;
import softuvo.com.navigationdrawerbothsides.fragments.MyQuizzesFragment;

public class QuizzesTabsAdapter extends FragmentPagerAdapter {

    public QuizzesTabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0) {
            fragment = new AllQuizzesFragment();
        } else if (position == 1) {
            fragment = new MyQuizzesFragment();
        }
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
                return "All Quizzes";
            case 1:
                return "My Quizzes";
        }
        return null;
    }
}