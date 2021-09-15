package com.example.hotstar.fragement;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hotstar.R;
import com.example.hotstar.adapter.ad_f_v_big;
import com.example.hotstar.adapter.ad_f_v_small;


public class f_v extends Fragment {

    int[] bigimg = {R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
    , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story,R.drawable.bhuj, R.drawable.chaddi, R.drawable.gajra, R.drawable.shame, R.drawable.empire
            , R.drawable.story};
    int[] imagess = {R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama, R.drawable.blackwidow, R.drawable.cruella, R.drawable.cityofdream, R.drawable.ghanghara
            , R.drawable.hungama};

    private RecyclerView smallimgRec;
    private RecyclerView bigimgRec;
    View v;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_f_v, container, false);


        bigimgRec = (RecyclerView) v.findViewById(R.id.bigimg_rec);
        smallimgRec = (RecyclerView) v.findViewById(R.id.smallimg_rec);


        ad_f_v_small ad = new ad_f_v_small(imagess);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        smallimgRec.setLayoutManager(linearLayoutManager);
        smallimgRec.setAdapter(ad);


        ad_f_v_big ad_f_v_big = new ad_f_v_big(bigimg);

        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getContext());
        bigimgRec.setLayoutManager(linearLayoutManager1);
        bigimgRec.setAdapter(ad_f_v_big);


        //  return inflater.inflate(R.layout.fragment_f_v, container, false);
        return v;

    }
}