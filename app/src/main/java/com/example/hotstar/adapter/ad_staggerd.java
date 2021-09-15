package com.example.hotstar.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotstar.R;

import java.util.ArrayList;

public class ad_staggerd extends RecyclerView.Adapter<ad_staggerd.hold> {

    private ArrayList<CharSequence> arrayList;

    public ad_staggerd(ArrayList<CharSequence> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public hold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View viewstag= inflater.inflate(R.layout.item_staggerd_layout,parent,false);
        return new hold(viewstag) ;

    }

    @Override
    public void onBindViewHolder(@NonNull hold holder, int position) {

        holder.textView.setText(arrayList.get(position));

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class hold extends RecyclerView.ViewHolder {

        private TextView textView;



        public hold(@NonNull View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.text_sport);
        }
    }
}
