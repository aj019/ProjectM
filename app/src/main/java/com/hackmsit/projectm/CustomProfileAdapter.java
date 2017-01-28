package com.hackmsit.projectm;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Kushan on 03-02-2016.
 */
public class CustomProfileAdapter extends RecyclerView.Adapter<CustomProfileAdapter.Achievements> {


    Context context;
    String[] headers;
    String[] body;

    public CustomProfileAdapter(Context context, String[] headers,String[] body) {

        this.context = context;
        this.headers = headers;
        this.body = body;

    }


    @Override
    public Achievements onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.cardview,parent,false);

        Achievements ach = new Achievements(v);


        return ach;
    }

    @Override
    public void onBindViewHolder(Achievements holder, int position) {


        holder.tv1.setText(headers[position]);
        holder.tv2.setText(body[position]);

    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public class Achievements extends RecyclerView.ViewHolder{

                CardView cv1;
                TextView tv1;
                TextView tv2;


        public Achievements(View itemView) {
            super(itemView);

           cv1 = (CardView) itemView.findViewById(R.id.cardView1);
            tv1 = (TextView) itemView.findViewById(R.id.achievement_header);
            tv2 = (TextView) itemView.findViewById(R.id.achievement_body);

        }
    }


}
