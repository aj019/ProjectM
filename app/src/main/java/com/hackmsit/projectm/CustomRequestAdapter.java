package com.hackmsit.projectm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Diva on 2/3/2016.
 */
public class CustomRequestAdapter extends ArrayAdapter<String> implements View.OnClickListener {

    Context context;
    String[] names;
    int[] image;
    public CustomRequestAdapter(Context context, String[] names, int[] image) {
        super(context,R.layout.custom_request_row ,names);
        this.context = context;
        this.names = names;
        this.image= image;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customview = inflater.inflate(R.layout.custom_request_row, parent, false);

        ImageView iv = (ImageView) customview.findViewById(R.id.ivRequestFace);
        TextView tvName = (TextView) customview.findViewById(R.id.tvRequestText);
        ImageButton btAccept = (ImageButton) customview.findViewById(R.id.btAccept);
        ImageButton btReject = (ImageButton) customview.findViewById(R.id.btReject);

        iv.setImageResource(image[position]);
        tvName.setText(names[position]);
        btAccept.setOnClickListener(this);
        btReject.setOnClickListener(this);
        return customview;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btAccept:
                break;
            case R.id.btReject:
                break;
        }
    }
}
