package softuvo.com.navigationdrawerbothsides.fragments;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import softuvo.com.navigationdrawerbothsides.Activity.AddGroupActivity;
import softuvo.com.navigationdrawerbothsides.Activity.AddQuizActivity;
import softuvo.com.navigationdrawerbothsides.Activity.MainActivity;
import softuvo.com.navigationdrawerbothsides.Adapter.QuizzesTabsAdapter;
import softuvo.com.navigationdrawerbothsides.R;

public class QuizzesFragment extends Fragment {
    private View view;
    private QuizzesTabsAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    public QuizzesFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        inflater.inflate(R.menu.main, menu);
        /*super.onCreateOptionsMenu(menu, inflater);*/

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_add) {
            startActivity(new Intent(getActivity(), AddQuizActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_quizzes, container, false);
        setHasOptionsMenu(true);
        mSectionsPagerAdapter = new QuizzesTabsAdapter(getChildFragmentManager());
        ((MainActivity) getActivity()).setTitle("Quizzes");
        mViewPager = view.findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = view.findViewById(R.id.tabs);
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
        return view;
    }


}
