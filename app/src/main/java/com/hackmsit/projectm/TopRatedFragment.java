package com.hackmsit.projectm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Diva on 2/4/2016.
 */
public class TopRatedFragment extends Fragment implements AdapterView.OnItemClickListener {
    ListView lvTopRatedOverall;
    int[] image = {R.drawable.mentor1,R.drawable.mentor3,R.drawable.mentor4,R.drawable.mentor5,R.drawable.mentor6,R.drawable.mentor8,R.drawable.mentor2};
    String[] name = {"Ridhima Shetty,","Rohan Arora","Taniya Trehan","Roshni Shah","Akhil Gupta","Nitin Marvaha","Priyank Kappor"};
    String[] rating = {"Rating - 4.4","Rating - 4.2","Rating - 4.2","Rating - 4.1","Rating - 4.0","Rating - 3.7","Rating - 3.5"};
    ArrayAdapter<String> adapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.top_rated_fragment,container,false);
        lvTopRatedOverall = (ListView) v.findViewById(R.id.lvTopRatedOverall);
        adapter = new CustomAdapter(getActivity(),name,rating,image);
        lvTopRatedOverall.setAdapter(adapter);
        lvTopRatedOverall.setOnItemClickListener(this);
        return v;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i = new Intent(getActivity(),Profile.class);
        startActivity(i);
    }
}