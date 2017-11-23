package softuvo.com.navigationdrawerbothsides.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import softuvo.com.navigationdrawerbothsides.fragments.MyGroup_fragment;
import softuvo.com.navigationdrawerbothsides.fragments.ShowForumsFragment;

public class ForumsAdapter extends FragmentPagerAdapter {

    public ForumsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0) {
            fragment = new ShowForumsFragment();
        } else if (position == 1) {
            fragment = new MyGroup_fragment();
        } else if (position == 2) {
            fragment = new MyGroup_fragment();
        } else if (position == 3) {
            fragment = new MyGroup_fragment();
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
                return "Forums";
            case 1:
                return "New Post";
            case 2:
                return "My Thread";
            case 3:
                return "Subscribed Threads";
        }
        return null;
    }
}
