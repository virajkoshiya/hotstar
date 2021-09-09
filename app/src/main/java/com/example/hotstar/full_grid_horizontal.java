package com.example.hotstar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class full_grid_horizontal extends Fragment {

    int[] stagged_imagess = {R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi,R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow,R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi,R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            ,R.drawable.bhuj, R.drawable.chaddi,R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow,R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi,R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream};

    private RecyclerView staggerd;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v_staggerd = inflater.inflate(R.layout.fragment_full_grid_horizontal,container,false);
        staggerd = (RecyclerView)v_staggerd.findViewById(R.id.staggerd);

        ad_staggerd stag_adapter=new ad_staggerd(stagged_imagess);
        StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL);
        staggerd.setLayoutManager(staggeredGridLayoutManager);
        staggerd.setAdapter(new ad_staggerd(stagged_imagess));

        return v_staggerd;
    }
}