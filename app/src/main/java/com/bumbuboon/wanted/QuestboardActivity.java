package com.bumbuboon.wanted;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class QuestboardActivity extends AppCompatActivity {

    private RecyclerView staggeredRv;
    private StaggeredRecyclerAdapter adapter ;
    private StaggeredGridLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        // let's make the activity on full screen for better ui

        getSupportActionBar().hide();

        staggeredRv = findViewById(R.id.staggered_rv);
        manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        staggeredRv.setLayoutManager(manager);
        // lets create a simple array list of images
        List<Bounty> lst = new ArrayList<>();
        Bounty bounty;

        // 1st bounty
        bounty = new Bounty(R.drawable.illustrationtwo);
        bounty.setBountyName("illustrationtwo");
        lst.add(bounty);

        // 2nd bounty
        lst.add(new Bounty(R.drawable.clothes));
        bounty.setBountyName("clothes");
        lst.add(bounty);

        // 3rd bounty
        lst.add(new Bounty(R.drawable.illustration));
        bounty.setBountyName("illustration");
        lst.add(bounty);

        // 4th bounty
        lst.add(new Bounty(R.drawable.clothes));
        bounty.setBountyName("clothes");
        lst.add(bounty);

        // 5th bounty
        lst.add(new Bounty(R.drawable.paint2));
        bounty.setBountyName("paint2");
        lst.add(bounty);

        // 6th bounty
        lst.add(new Bounty(R.drawable.paint));
        bounty.setBountyName("paint");
        lst.add(bounty);

        // 7th bounty
        lst.add(new Bounty(R.drawable.clothestwo));
        bounty.setBountyName("clothestwo");
        lst.add(bounty);

        // 8th bounty
        lst.add(new Bounty(R.drawable.wallpaper));
        bounty.setBountyName("wallpaper");
        lst.add(bounty);

        // 9th bounty
        lst.add(new Bounty(R.drawable.illustrationtwo));
        bounty.setBountyName("illustrationtwo");
        lst.add(bounty);

        // 10th bounty
        lst.add(new Bounty(R.drawable.illustration));
        bounty.setBountyName("illustration");
        lst.add(bounty);

        // 11th bounty
        lst.add(new Bounty(R.drawable.clothes));
        bounty.setBountyName("clothes");
        lst.add(bounty);

        // 12th bounty
        lst.add(new Bounty(R.drawable.paint2));
        bounty.setBountyName("paint2");
        lst.add(bounty);

        // 13th bounty
        lst.add(new Bounty(R.drawable.paint));
        bounty.setBountyName("paint");
        lst.add(bounty);

        // 14th bounty
        lst.add(new Bounty(R.drawable.clothestwo));
        bounty.setBountyName("clothestwo");
        lst.add(bounty);

        // 15th bounty
        lst.add(new Bounty(R.drawable.wallpaper));
        bounty.setBountyName("wallpaper");
        lst.add(bounty);

        // 16th bounty
        lst.add(new Bounty(R.drawable.clothes));
        bounty.setBountyName("clothes");
        lst.add(bounty);

        adapter = new StaggeredRecyclerAdapter(this,lst);
        staggeredRv.setAdapter(adapter);
    }
}