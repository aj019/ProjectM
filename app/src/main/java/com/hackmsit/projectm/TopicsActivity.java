package com.hackmsit.projectm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class TopicsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private Toolbar toolbar;
    ListView topresults;
    ListAdapter adapter;
    String[] names = {"Ridhima Shetty,","Rohan Arora","Karan Trehan","Roshni Shah"};
    int[] image = {R.drawable.mentor1,R.drawable.mentor2,R.drawable.mentor3,R.drawable.mentor4};
    String[] rating ={"Rating - 4.4","Rating - 4.0","Rating - 3.7","Rating - 3.5"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("HTML");
        setSupportActionBar(toolbar);

        topresults = (ListView) findViewById(R.id.lvHtmlTopRated);
        adapter = new CustomAdapter(this,names,rating,image);
        topresults.setAdapter(adapter);
        topresults.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent k = new Intent(TopicsActivity.this,Profile.class);
        startActivity(k);

    }
}
