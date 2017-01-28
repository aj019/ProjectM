package com.hackmsit.projectm;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {

    Context context;
    String[] names;
    String[] rating;
    int[] image;
    public CustomAdapter(Context context, String[] names,String[] rating,int[] image) {
        super(context,R.layout.custom_row ,names);
        this.context = context;
        this.names = names;
        this.rating = rating;
        this.image = image;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customview = inflater.inflate(R.layout.custom_row, parent, false);

        TextView tvname = (TextView) customview.findViewById(R.id.tvName);
        TextView tvrating = (TextView) customview.findViewById(R.id.tvRating);
        ImageView iv = (ImageView) customview.findViewById(R.id.ivFace);
        tvname.setText(names[position]);
        tvrating.setText(rating[position]);
        iv.setImageResource(image[position]);

        return customview;

    }
}
