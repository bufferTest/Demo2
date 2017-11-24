package softuvo.com.navigationdrawerbothsides.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import softuvo.com.navigationdrawerbothsides.fragments.AllBlogsFragment;
import softuvo.com.navigationdrawerbothsides.fragments.AllListingFragment;
import softuvo.com.navigationdrawerbothsides.fragments.MyBlogFragment;
import softuvo.com.navigationdrawerbothsides.fragments.MyListingFragment;

public class BlogMainAdapter extends FragmentPagerAdapter {

    public BlogMainAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
            fragment = new AllBlogsFragment();
        else if (position == 1)
            fragment = new MyBlogFragment();

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
                return "All Blogs";
            case 1:
                return "My Blogs";
        }
        return null;
    }
}