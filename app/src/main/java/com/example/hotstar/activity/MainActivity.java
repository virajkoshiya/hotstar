package com.example.hotstar.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hotstar.R;
import com.example.hotstar.fragement.ViewPagerAdapter;
import com.example.hotstar.fragement.f_grid;
import com.example.hotstar.fragement.f_v;
import com.example.hotstar.fragement.fragment_vertical_rec;
import com.example.hotstar.fragement.full_grid_horizontal;
import com.example.hotstar.fragement.grid_and_vertical;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linWatchlist;
    private LinearLayout linPrise;
    private LinearLayout linLanguage;
    private LinearLayout linPreferance;
    private LinearLayout linHelp;

    View header;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView toolbar, upagrade, install;
    Menu menu;
    TextView textView;
    LinearLayout home, tv, disnery, movies, sports,ldownlod;
    private TextView hotstarheading, sky;
    private ImageView serch;
    private ImageView homeIcon;
    private TextView homeTxt;
    private ImageView tvIcon;
    private TextView tvTxt;
    private TextView disneyTxt;
    private ImageView movieIcon;
    private TextView movieTxt;
    private ImageView sportsIcon;
    private TextView sportsTxt;
    private ViewPager viewPager;
    private RelativeLayout upperstrip;

    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  Window window=getWindow();
        //  window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);
        upperstrip = findViewById(R.id.upperstrip);
        drawerLayout = findViewById(R.id.drawer_lay);
        navigationView = findViewById(R.id.nav_view);
        // textView=findViewById(R.id.textView);
        toolbar = findViewById(R.id.menu);
        upagrade = findViewById(R.id.upagrade);
        install = findViewById(R.id.install);

        header = navigationView.getHeaderView(0);
        sky = (TextView) header.findViewById(R.id.txt_skyline);
        ldownlod=header.findViewById(R.id.lin_downlod);

        linWatchlist = (LinearLayout)header. findViewById(R.id.lin_watchlist);
        linPrise = (LinearLayout) header.findViewById(R.id.lin_prise);
        linLanguage = (LinearLayout) header.findViewById(R.id.lin_language);
        linPreferance = (LinearLayout)header. findViewById(R.id.lin_preferance);
        linHelp = (LinearLayout)header. findViewById(R.id.lin_help);
        home = findViewById(R.id.home);
        tv = findViewById(R.id.tv);
        disnery = findViewById(R.id.disney);
        movies = findViewById(R.id.movie);
        sports = findViewById(R.id.sport);

        hotstarheading = (TextView) findViewById(R.id.hotstarheading);
        serch = (ImageView) findViewById(R.id.serch);
        homeIcon = (ImageView) findViewById(R.id.home_icon);
        homeTxt = (TextView) findViewById(R.id.home_txt);
        tvIcon = (ImageView) findViewById(R.id.tv_icon);
        tvTxt = (TextView) findViewById(R.id.tv_txt);
        disneyTxt = (TextView) findViewById(R.id.disney_txt);
        movieIcon = (ImageView) findViewById(R.id.movie_icon);
        movieTxt = (TextView) findViewById(R.id.movie_txt);
        sportsIcon = (ImageView) findViewById(R.id.sports_icon);
        sportsTxt = (TextView) findViewById(R.id.sports_txt);

        //  GetFragement(new fragment_vertical_rec());

        serch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Intent intent = new Intent(MainActivity.this,full_grid_horizontal.class);
                //  startActivity(intent);

                // upperstrip.setVisibility(View.GONE);

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disneyTxt.setTextColor(getResources().getColor(R.color.offwhite));
                homeIcon.clearColorFilter();
                tvIcon.clearColorFilter();
                movieIcon.clearColorFilter();
                sportsIcon.clearColorFilter();
                serch.setVisibility(View.VISIBLE);
                homeIcon.setColorFilter(getResources().getColor(R.color.white));
                //  GetFragement(new fragment_vertical_rec());
                viewPager.setCurrentItem(0);


            }
        });

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disneyTxt.setTextColor(getResources().getColor(R.color.offwhite));
                homeIcon.clearColorFilter();
                tvIcon.clearColorFilter();
                movieIcon.clearColorFilter();
                sportsIcon.clearColorFilter();
                serch.setVisibility(View.VISIBLE);
                tvIcon.setColorFilter(getResources().getColor(R.color.white));
                //  GetFragement(new f_v());
                viewPager.setCurrentItem(1);


            }
        });

        disnery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disneyTxt.setTextColor(getResources().getColor(R.color.offwhite));
                homeIcon.clearColorFilter();
                tvIcon.clearColorFilter();
                movieIcon.clearColorFilter();
                sportsIcon.clearColorFilter();
                serch.setVisibility(View.VISIBLE);
                disneyTxt.setTextColor(getResources().getColor(R.color.white));
                //   GetFragement(new f_grid());
                viewPager.setCurrentItem(2);

            }
        });

        movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disneyTxt.setTextColor(getResources().getColor(R.color.offwhite));
                homeIcon.clearColorFilter();
                tvIcon.clearColorFilter();
                movieIcon.clearColorFilter();
                sportsIcon.clearColorFilter();
                serch.setVisibility(View.VISIBLE);
                movieIcon.setColorFilter(getResources().getColor(R.color.white));
                //  GetFragement(new grid_and_vertical());
                viewPager.setCurrentItem(3);

            }
        });

        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disneyTxt.setTextColor(getResources().getColor(R.color.offwhite));
                homeIcon.clearColorFilter();
                tvIcon.clearColorFilter();
                movieIcon.clearColorFilter();
                sportsIcon.clearColorFilter();
                sportsIcon.setColorFilter(getResources().getColor(R.color.white));

                serch.setVisibility(View.GONE);
                //  GetFragement(new full_grid_horizontal());

                viewPager.setCurrentItem(4);
           //   int sport= viewPager.getCurrentItem();
//              if(sport==4){
//                  sportsIcon.setColorFilter(getResources().getColor(R.color.white));
//              }

            }
        });


        upagrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Updating", Toast.LENGTH_SHORT).show();
            }
        });

//        install.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "installing", Toast.LENGTH_SHORT).show();
//            }
//        });
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                drawerLayout.openDrawer(navigationView);

            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

              //  menuItem(item);

                return true;
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {
                int num= viewPager.getCurrentItem();
                Log.e("numberrrrrrr", "onCreate: "+ num);
                if(num==4){
                    disneyTxt.setTextColor(getResources().getColor(R.color.offwhite));
                    homeIcon.clearColorFilter();
                    tvIcon.clearColorFilter();
                    movieIcon.clearColorFilter();
                    sportsIcon.clearColorFilter();
                    serch.setVisibility(View.VISIBLE);
                    sportsIcon.setColorFilter(getResources().getColor(R.color.white));
                }
                else if (num==3){
                    disneyTxt.setTextColor(getResources().getColor(R.color.offwhite));
                    homeIcon.clearColorFilter();
                    tvIcon.clearColorFilter();
                    movieIcon.clearColorFilter();
                    sportsIcon.clearColorFilter();
                    serch.setVisibility(View.VISIBLE);
                    movieIcon.setColorFilter(getResources().getColor(R.color.white));
                }else if (num==2){
                    disneyTxt.setTextColor(getResources().getColor(R.color.offwhite));
                    homeIcon.clearColorFilter();
                    tvIcon.clearColorFilter();
                    movieIcon.clearColorFilter();
                    sportsIcon.clearColorFilter();
                    serch.setVisibility(View.VISIBLE);
                    disneyTxt.setTextColor(getResources().getColor(R.color.white));
                }else if (num==1){

                    disneyTxt.setTextColor(getResources().getColor(R.color.offwhite));
                    homeIcon.clearColorFilter();
                    tvIcon.clearColorFilter();
                    movieIcon.clearColorFilter();
                    sportsIcon.clearColorFilter();
                    serch.setVisibility(View.VISIBLE);
                    tvIcon.setColorFilter(getResources().getColor(R.color.white));
                }else if (num==0){
                    disneyTxt.setTextColor(getResources().getColor(R.color.offwhite));
                    homeIcon.clearColorFilter();
                    tvIcon.clearColorFilter();
                    movieIcon.clearColorFilter();
                    sportsIcon.clearColorFilter();
                    serch.setVisibility(View.VISIBLE);
                    homeIcon.setColorFilter(getResources().getColor(R.color.white));
                }


            }
        });


        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.add(new fragment_vertical_rec());
        viewPagerAdapter.add(new f_v());
        viewPagerAdapter.add(new f_grid());
        viewPagerAdapter.add(new grid_and_vertical());
        viewPagerAdapter.add(new full_grid_horizontal());

        viewPager.setAdapter(viewPagerAdapter);

        sky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sky.setTextColor(getResources().getColor(R.color.offwhite));
                Toast.makeText(MainActivity.this, "SKY", Toast.LENGTH_SHORT).show();
            }
        });

        ldownlod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linHelp.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linPreferance.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linLanguage.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linPrise.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linPrise.setBackgroundColor(getResources().getColor(R.color.transpertant));
                ldownlod.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linWatchlist.setBackgroundColor(getResources().getColor(R.color.transpertant));
                ldownlod.setBackgroundColor(getResources().getColor(R.color.offwhite));

                Intent intent = new Intent(MainActivity.this,downlods_img.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Downloads", Toast.LENGTH_SHORT).show();
            }
        });
        linWatchlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linHelp.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linPreferance.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linLanguage.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linPrise.setBackgroundColor(getResources().getColor(R.color.transpertant));
                      linPrise.setBackgroundColor(getResources().getColor(R.color.transpertant));
                ldownlod.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linWatchlist.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linWatchlist.setBackgroundColor(getResources().getColor(R.color.offwhite));
                // Toast.makeText(MainActivity.this, "SKY", Toast.LENGTH_SHORT).show();
            }
        });

        linPrise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linHelp.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linPreferance.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linLanguage.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linPrise.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linPrise.setBackgroundColor(getResources().getColor(R.color.transpertant));
                ldownlod.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linWatchlist.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linPrise.setBackgroundColor(getResources().getColor(R.color.offwhite));
                // Toast.makeText(MainActivity.this, "SKY", Toast.LENGTH_SHORT).show();
            }
        });

        linLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linHelp.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linPreferance.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linLanguage.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linPrise.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linPrise.setBackgroundColor(getResources().getColor(R.color.transpertant));
                ldownlod.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linWatchlist.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linLanguage.setBackgroundColor(getResources().getColor(R.color.offwhite));
                // Toast.makeText(MainActivity.this, "SKY", Toast.LENGTH_SHORT).show();
            }
        });

        linPreferance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linHelp.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linPreferance.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linLanguage.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linPrise.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linPrise.setBackgroundColor(getResources().getColor(R.color.transpertant));
                ldownlod.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linWatchlist.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linPreferance.setBackgroundColor(getResources().getColor(R.color.offwhite));
                // Toast.makeText(MainActivity.this, "SKY", Toast.LENGTH_SHORT).show();
            }
        });

        linHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linHelp.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linPreferance.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linLanguage.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linPrise.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linPrise.setBackgroundColor(getResources().getColor(R.color.transpertant));
                ldownlod.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linWatchlist.setBackgroundColor(getResources().getColor(R.color.transpertant));
                linHelp.setBackgroundColor(getResources().getColor(R.color.offwhite));
                // Toast.makeText(MainActivity.this, "SKY", Toast.LENGTH_SHORT).show();
            }
        });


    }

    public boolean menuItem(MenuItem item) {

        switch (item.getItemId()) {
//            case R.id.ddownlod:
//
//                Toast.makeText(this, "Downlods ", Toast.LENGTH_SHORT).show();
//                return true;
//
//            case R.id.watchlist:
//                Toast.makeText(this, "watchlist", Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.prize:
//
//                  Toast.makeText(this, "prize", Toast.LENGTH_SHORT).show();
//                return true;
//
//            case R.id.language:
//
//                Toast.makeText(this, "language", Toast.LENGTH_SHORT).show();
//                return true;
//
//            case R.id.prefrence:
//
//                Toast.makeText(this, "prefrence", Toast.LENGTH_SHORT).show();
//                return true;
//
//            case R.id.txt_skyline:
//
//                Toast.makeText(this, "txt_skyline", Toast.LENGTH_SHORT).show();
//                return true;
            default:
                return true;

        }
    }

    public void GetFragement(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frm, fragment);
        fragmentTransaction.commit();
    }
}