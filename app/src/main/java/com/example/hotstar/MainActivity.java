package com.example.hotstar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView toolbar,upagrade,install;
    Menu menu;
    TextView textView;
    LinearLayout home,tv,disnery,movies,sports;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        drawerLayout=findViewById(R.id.drawer_lay);
        navigationView=findViewById(R.id.nav_view);
       // textView=findViewById(R.id.textView);
        toolbar= findViewById(R.id.menu);
        upagrade = findViewById(R.id.upagrade);
                install=findViewById(R.id.install);

        home=findViewById(R.id.home);
        tv=findViewById(R.id.tv);
        disnery=findViewById(R.id.disney);
        movies=findViewById(R.id.movie);
        sports=findViewById(R.id.sport);

        GetFragement(new fragment_vertical_rec());

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetFragement(new fragment_vertical_rec());

                Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
            }
        });

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GetFragement(new f_v());

              //  Toast.makeText(MainActivity.this, "Tv", Toast.LENGTH_SHORT).show();
            }
        });

        disnery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GetFragement(new f_grid());
              //  Toast.makeText(MainActivity.this, "Disney", Toast.LENGTH_SHORT).show();
            }
        });

        movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GetFragement(new grid_and_vertical());
               // Toast.makeText(MainActivity.this, "Movies", Toast.LENGTH_SHORT).show();
            }
        });

        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GetFragement(new full_grid_horizontal());
              //  Toast.makeText(MainActivity.this, "Sports", Toast.LENGTH_SHORT).show();
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
               menuItem(item);
               return true;
           }
       });


    }

    public boolean menuItem(MenuItem item)
    {

        switch (item.getItemId())
        {
            case R.id.ddownlod:

                Toast.makeText(this, "Downlods ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.watchlist:
                Toast.makeText(this, "watchlist", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.prize:

                  Toast.makeText(this, "prize", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.language:

                Toast.makeText(this, "language", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.prefrence:

                Toast.makeText(this, "prefrence", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.help:

                Toast.makeText(this, "help", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return true;

        }
    }

    public void GetFragement(Fragment fragment){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frm,fragment);
        fragmentTransaction.commit();
    }
}