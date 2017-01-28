package com.hackmsit.projectm;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Outline extends Fragment {

    RecyclerView rv2;
    RecyclerView.Adapter rvAdapter;
    LinearLayoutManager lm2;

    ArrayList<String> date = new ArrayList<>();
    ArrayList<String> requests = new ArrayList<>();



    public Outline() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = LayoutInflater.from(getContext()).inflate(R.layout.fragment_outline,container,false);




        date.add("4th May");
        date.add("22nd April");
        date.add("29th Mar");
        date.add("5th Mar");
        date.add("29th Feb");
        date.add("22nd Feb");
        date.add("4th Feb");

        requests.add("Completed Php Course Under Anuj Gupta");
        requests.add("Completed Android Under Kushan Singh");
        requests.add("Completed Python under Raghav Khurana");
        requests.add("Completed Java Script under Simranjeet");
        requests.add("Completed IOS under Vaibhav");
        requests.add("Completed c++ under Navdeep");
        requests.add("Completed C# under Pankaj Punia");






        rv2 = (RecyclerView) v.findViewById(R.id.recyclerView2);
        lm2 = new LinearLayoutManager(getActivity().getApplicationContext());
        rv2.setLayoutManager(lm2);
        rv2.setHasFixedSize(true);

        rvAdapter = new OutlineAdapter(getActivity().getApplicationContext(),date,requests);
        rv2.setAdapter(rvAdapter);


        return v;


    }


}
