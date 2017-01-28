package com.hackmsit.projectm;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Kushan on 03-02-2016.
 */
public class OutlineAdapter extends RecyclerView.Adapter<OutlineAdapter.OutlineView> {

    Context applicationContext;
    ArrayList<String> date;
    ArrayList<String> requests;



    public OutlineAdapter(Context applicationContext, ArrayList<String> date, ArrayList<String> requests) {

        this.date = date;
        this.requests = requests;
        this.applicationContext = applicationContext;



    }

    @Override
    public OutlineView onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(applicationContext).inflate(R.layout.card_view2,parent,false);

        OutlineView mOut = new OutlineView(v);

        return mOut;
    }

    @Override
    public void onBindViewHolder(OutlineView holder, int position) {

        holder.tv1.setText(date.get(position));
        holder.tv2.setText(requests.get(position));



    }

    @Override
    public int getItemCount() {
        return date.size();
    }

    public class OutlineView extends RecyclerView.ViewHolder{

        CardView cv;
        TextView tv1,tv2;


        public OutlineView(View itemView) {
            super(itemView);

            cv = (CardView) itemView.findViewById(R.id.cardView2);
            tv1 = (TextView) itemView.findViewById(R.id.date);
            tv2 = (TextView) itemView.findViewById(R.id.request);


        }
    }

}
