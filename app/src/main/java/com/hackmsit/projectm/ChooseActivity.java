package com.hackmsit.projectm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.Button;

import com.hackmsit.projectm.adapters.ChooseTopicsAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class ChooseActivity extends AppCompatActivity {

    Button btHtml,btPHp,btAndroid,btCHash,btIos,btContinue;
    StaggeredGridLayoutManager sglm;
    RecyclerView rv;
    RecyclerView.Adapter adapter;
    ArrayList<String> topics = new ArrayList<>(Arrays.asList("Php","Android","IOS","HTML","Php","Android","IOS","HTML"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        rv = (RecyclerView) findViewById(R.id.rvTopics);
        sglm = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.HORIZONTAL);
        rv.setLayoutManager(sglm);
        adapter = new ChooseTopicsAdapter(this,topics);
        rv.setAdapter(adapter);
    }
//
//    @Override
//    public void onClick(View v) {
//
//        switch (v.getId()){
//
//            case R.id.btChooseAndroid:
//                btAndroid.setTextColor(Color.WHITE);
//                btAndroid.setBackgroundResource(R.drawable.choose_after);
//                break;
//            case R.id.btChooseHtml:
//                btHtml.setTextColor(Color.WHITE);
//                btHtml.setBackgroundResource(R.drawable.choose_after);
//
//                break;
//            case R.id.btChooseIos:
//                btIos.setTextColor(Color.WHITE);
//                btIos.setBackgroundResource(R.drawable.choose_after);
//
//                break;
//            case R.id.btChooseC:
//                btCHash.setTextColor(Color.WHITE);
//                btCHash.setBackgroundResource(R.drawable.choose_after);
//
//                break;
//            case R.id.btChoosePHP:
//                btPHp.setTextColor(Color.WHITE);
//                btPHp.setBackgroundResource(R.drawable.choose_after);
//
//                break;
//            case R.id.btContinue:
//
//                Intent i =  new Intent(ChooseActivity.this,HomeActivity.class);
//                startActivity(i);
//                finish();
//                break;
//
//        }
//    }
}
