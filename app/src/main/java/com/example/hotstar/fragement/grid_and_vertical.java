package com.example.hotstar.fragement;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hotstar.R;
import com.example.hotstar.adapter.ad_f_v_big;
import com.example.hotstar.adapter.ad_f_v_small;


public class grid_and_vertical extends Fragment {

    int[] h_bigimg = {R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story};

    int[] h_imagess = {R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
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

    private RecyclerView recHybridGrid;
    private RecyclerView hySmallimgRec;
    private RecyclerView hyBigimgRec;

   View hview;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        hview=inflater.inflate(R.layout.fragment_grid_and_vertical,container,false);

        recHybridGrid = (RecyclerView)hview. findViewById(R.id.rec_hybrid_grid);
        hySmallimgRec = (RecyclerView) hview.findViewById(R.id.hy_smallimg_rec);
        hyBigimgRec = (RecyclerView)hview. findViewById(R.id.hy_bigimg_rec);


        ad_f_v_small rec_adapter=new ad_f_v_small(h_imagess);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getContext(),4);
        recHybridGrid.setLayoutManager(gridLayoutManager);
        recHybridGrid.setAdapter(new ad_f_v_small(h_imagess));


        ad_f_v_small ad = new ad_f_v_small(h_imagess);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        hySmallimgRec.setLayoutManager(linearLayoutManager);
        hySmallimgRec.setAdapter(ad);


        ad_f_v_big ad_f_v_big = new ad_f_v_big(h_bigimg);

        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getContext());
        hyBigimgRec.setLayoutManager(linearLayoutManager1);
        hyBigimgRec.setAdapter(ad_f_v_big);

        return hview;
    }
}