package com.example.hotstar.fragement;

import android.app.ActionBar;
import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.hotstar.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class full_grid_horizontal extends Fragment {

    private ListView list1;

    String[] sportsname = {"soccer","basketball","tennis","baseball","golf","running","volleyball"
            ,"badminton","swimming","boxing","table tennis","skiing","ice skating","roller skating","cricket"
            ,"rugby","pool","darts","football","bowling","ice hockey","surfing","karate","horse racing"
            ,"snowboarding","skateboarding","cycling","archery","fishing","gymnastics","figure skating","rock climbing"
            ,"sumo wrestling","taekwondo","fencing","water skiing","jet skiing","weight lifting","scuba diving"
            ,"judo","wind surfing","kickboxing","skydiving","hanggliding","bungeejumping"};
    private ArrayList<CharSequence> arrayList;
    private ArrayAdapter<CharSequence> arrayAdapter;
    ArrayList e = new ArrayList();
    private ArrayList<CharSequence> arr;



    private RecyclerView staggerd;
    private SearchView search1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        arrayList=new ArrayList<CharSequence>();
        arrayList.add("soccer");
        arrayList.add("basketball");
        arrayList.add("tennis");
        arrayList.add("baseball");
        arrayList.add("golf");
        arrayList.add("running");
        arrayList.add("volleyball");
        arrayList.add("badminton");



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v_staggerd = inflater.inflate(R.layout.fragment_full_grid_horizontal,container,false);
        staggerd = (RecyclerView)v_staggerd.findViewById(R.id.staggerd);
        list1 = (ListView) v_staggerd.findViewById(R.id.list_1);
     //   search1 = (SearchView)v_staggerd.findViewById(R.id.search_1);
        search1 =v_staggerd.findViewById(R.id.search_1);
        arrayAdapter=new ArrayAdapter<CharSequence>(getContext(),android.R.layout.simple_list_item_1,arrayList);
        list1.setAdapter(arrayAdapter);

//        ad_staggerd stag_adapter=new ad_staggerd(arrayList);
//      LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
//        staggerd.setLayoutManager(linearLayoutManager);
//        staggerd.setAdapter(new ad_staggerd(arrayList));

        search1.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if(arrayList.contains(query))
                {
                    arrayAdapter.getFilter().filter(query);
                }
                else
                {
                    Toast.makeText(getContext(), "No match found", Toast.LENGTH_SHORT).show();
                }



                return false;

            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });

        return v_staggerd;
    }
}