package com.hackmsit.projectm;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Diva on 2/3/2016.
 */
public class ContentFragment extends Fragment {
    ListView lvRequest;
    int[] image = {R.drawable.mentor2,R.drawable.mentor3,R.drawable.mentor4};
    String[] name = {"Anuj sent you a Request","Karan sent you a Request","Simran sent you a Request"};
    ArrayAdapter<String> adapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_requests,container,false);
        lvRequest = (ListView) v.findViewById(R.id.lvRequests);
        adapter = new CustomRequestAdapter(getActivity(),name,image);
        lvRequest.setAdapter(adapter);

        return v;
    }
}
