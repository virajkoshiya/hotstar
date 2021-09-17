package com.example.hotstar.fragement;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.hotstar.R;
import com.example.hotstar.activity.Image_view;


public class fragment_vertical_rec extends Fragment {

    private ImageView clickStory;
    private ImageView clickBhuj;
    private ImageView clickEmpire;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_vertical_rec,container,false);
        clickStory = (ImageView) v.findViewById(R.id.click_story);
        clickBhuj = (ImageView)v. findViewById(R.id.click_bhuj);
        clickEmpire = (ImageView) v.findViewById(R.id.click_empire);

        clickStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), Image_view.class);
                intent.putExtra("bhuj",R.drawable.story);
                startActivity(intent);
              //  Toast.makeText(v.getContext(), "TES CLICK", Toast.LENGTH_SHORT).show();
            }
        });

        clickBhuj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), Image_view.class);
                intent.putExtra("bhuj",R.drawable.bhuj);
                startActivity(intent);
                //  Toast.makeText(v.getContext(), "TES CLICK", Toast.LENGTH_SHORT).show();
            }
        });

        clickEmpire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), Image_view.class);
                intent.putExtra("bhuj",R.drawable.empire);
                startActivity(intent);
                //  Toast.makeText(v.getContext(), "TES CLICK", Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }
}