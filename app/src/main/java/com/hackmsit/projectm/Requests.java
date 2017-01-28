package com.hackmsit.projectm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Requests extends AppCompatActivity {
ListView lvRequest;
    int[] image = {R.drawable.mentor2,R.drawable.mentor3,R.drawable.mentor4};
    String[] name = {"Anuj sent you a Request","Karan sent you a Request","Simran sent you a Request"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requests);

        lvRequest = (ListView) findViewById(R.id.lvRequests);
        adapter = new CustomRequestAdapter(this,name,image);
        lvRequest.setAdapter(adapter);

    }
}
