package softuvo.com.navigationdrawerbothsides.Activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import softuvo.com.navigationdrawerbothsides.fragments.BlogMainFragment;
import softuvo.com.navigationdrawerbothsides.fragments.MarketPlaceFragment;
import softuvo.com.navigationdrawerbothsides.R;
import softuvo.com.navigationdrawerbothsides.fragments.ForumsFragment;
import softuvo.com.navigationdrawerbothsides.fragments.Menu_Group_Fragment;
import softuvo.com.navigationdrawerbothsides.fragments.PagesMainFragment;
import softuvo.com.navigationdrawerbothsides.fragments.PollsMainFragment;
import softuvo.com.navigationdrawerbothsides.fragments.QuizzesFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    private TextView tv_title;
    ImageView menuRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        drawer = findViewById(R.id.drawer_layout);
        tv_title = findViewById(R.id.tv_title);

        ImageView menuLeft = findViewById(R.id.menuLeft);
        menuRight = findViewById(R.id.menuRight);

        menuLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawer.isDrawerOpen(GravityCompat.START)) {
                    drawer.closeDrawer(GravityCompat.START);
                } else {
                    drawer.openDrawer(GravityCompat.START);
                }
            }
        });

        menuRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawer.isDrawerOpen(GravityCompat.END)) {
                    drawer.closeDrawer(GravityCompat.END);
                } else {
                    drawer.openDrawer(GravityCompat.END);
                }
            }
        });

        NavigationView navigationView1 = findViewById(R.id.nav_view_left);
        NavigationView navigationView2 = findViewById(R.id.nav_view_right);
        navigationView1.setNavigationItemSelectedListener(this);
        navigationView2.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if (drawer.isDrawerOpen(GravityCompat.END)) {
            drawer.closeDrawer(GravityCompat.END);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        Fragment fragment = null;
        switch (item.getItemId()) {
            case R.id.item_group:
                fragment = new Menu_Group_Fragment();
                break;
            case R.id.item_terms:
                fragment = new QuizzesFragment();
                break;

            case R.id.item_forum:
                fragment = new ForumsFragment();
                break;
            case R.id.item_pages:
                fragment = new PagesMainFragment();
                break;
            case R.id.item_marketplace:
                fragment = new MarketPlaceFragment();
                break;
            case R.id.item_blog:
                fragment = new BlogMainFragment();
                break;
            case R.id.item_polls:
                fragment = new PollsMainFragment();
                break;

        }
        if (fragment != null) {
            menuRight.setVisibility(View.GONE);
            transaction.replace(R.id.fragment_layout, fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
        if (drawer.isDrawerOpen(GravityCompat.START))
            drawer.closeDrawer(GravityCompat.START);
        else if (drawer.isDrawerOpen(GravityCompat.END))
            drawer.closeDrawer(GravityCompat.END);
        return true;
    }

    public void setTitle(String title) {
        tv_title.setText(title);
    }
}
