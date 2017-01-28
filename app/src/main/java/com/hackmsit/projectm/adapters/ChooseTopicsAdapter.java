package com.hackmsit.projectm.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.hackmsit.projectm.R;

import java.util.ArrayList;

public class ChooseTopicsAdapter extends RecyclerView.Adapter<ChooseTopicsAdapter.Topics> {

    Context context;
    ArrayList<String> topics;

    public ChooseTopicsAdapter(Context context, ArrayList<String> topics) {
        this.context = context;
        this.topics = topics;
    }

    @Override
    public Topics onCreateViewHolder(ViewGroup parent, int viewType) {

        View v  = LayoutInflater.from(context).inflate(R.layout.topics_item,parent,false);
        Topics t = new Topics(v);
        return t;
    }

    @Override
    public void onBindViewHolder(final Topics holder, int position) {
        holder.btChooseTopic.setText(topics.get(position));
        holder.btChooseTopic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.btChooseTopic.setTextColor(Color.WHITE);
                holder.btChooseTopic.setBackgroundResource(R.drawable.choose_after);
            }
        });

    }

    @Override
    public int getItemCount() {
        return topics.size();
    }

    public class Topics extends RecyclerView.ViewHolder{

        Button btChooseTopic;
        public Topics(View itemView) {
            super(itemView);
            btChooseTopic = (Button) itemView.findViewById(R.id.btChooseTopic);

        }
    }


}
