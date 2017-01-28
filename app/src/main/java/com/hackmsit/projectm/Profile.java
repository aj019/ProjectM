package com.hackmsit.projectm;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Profile extends AppCompatActivity implements View.OnClickListener {

    CollapsingToolbarLayout collapsingToolbarLayout;
    RecyclerView rv1;
    LinearLayoutManager lm;
    RecyclerView.Adapter mAdapter;
    Button btRequest;
    ArrayList<String> acheivements = new ArrayList<>();
    String[] headers ={"Skills","Projects"};
    String[] body = {"Php,Java,HTML,CSS","Created a website called Memeveme.com that allows users to share funny content on the internet with their Friends"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapse_toolbar);
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.RED);
        collapsingToolbarLayout.setExpandedTitleColor(Color.BLACK);

        collapsingToolbarLayout.setContentScrimColor(Color.BLACK);

        btRequest = (Button) findViewById(R.id.btRequest);
        btRequest.setOnClickListener(this);
        rv1 = (RecyclerView) findViewById(R.id.recyclerView1);
        lm  = new LinearLayoutManager(getApplicationContext());
        rv1.setLayoutManager(lm);
        rv1.setHasFixedSize(true);
        mAdapter = new CustomProfileAdapter(this,headers,body);
        rv1.setAdapter(mAdapter);

    }

    @Override
    public void onClick(View v) {

        btRequest.setText("Request Sent");
        btRequest.setBackgroundColor(Color.RED);
    }
}
