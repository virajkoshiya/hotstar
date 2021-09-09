package com.example.hotstar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ad_staggerd extends RecyclerView.Adapter<ad_staggerd.hold> {

    int staggerd_img [];

    public ad_staggerd(int[] staggerd_img) {
        this.staggerd_img = staggerd_img;
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

        holder.stimg.setImageResource(staggerd_img[position]);

    }

    @Override
    public int getItemCount() {
        return staggerd_img.length;
    }

    public class hold extends RecyclerView.ViewHolder {

        private ImageView stimg;



        public hold(@NonNull View itemView) {
            super(itemView);

            stimg = (ImageView)itemView.findViewById(R.id.stimg);
        }
    }
}
