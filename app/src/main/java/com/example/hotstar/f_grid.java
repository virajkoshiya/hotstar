package com.example.hotstar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class f_grid extends Fragment {

    int[] bigimg = {R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama,R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama,R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama,R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama,R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama,R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama};
    private RecyclerView recGrid;

    View vgrid;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        vgrid=inflater.inflate(R.layout.fragment_f_grid,container,false);

        recGrid = (RecyclerView) vgrid.findViewById(R.id.rec_grid);

        ad_f_v_small rec_adapter=new ad_f_v_small(bigimg);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getContext(),4);
        recGrid.setLayoutManager(gridLayoutManager);
        recGrid.setAdapter(new ad_f_v_small(bigimg));

        return vgrid;
    }
}