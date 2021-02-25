package com.jkb.instarexam;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.jkb.instarexam.adapter.MainAdapter;
import com.jkb.instarexam.adapter.StoryAdapter;
import com.jkb.instarexam.model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvStory, rvMain;
    private StoryAdapter storyAdapter;
    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StoryAdapter();
        MainAdapter();

    }

    public void StoryAdapter(){

        List<User> users = new ArrayList<>();
        for (int i=1; i<20; i++){
            users.add(new User(1L,"IU", null, R.drawable.iu));
        }

        LinearLayoutManager manager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        rvStory = findViewById(R.id.rv_story);
        rvStory.setLayoutManager(manager);

        storyAdapter = new StoryAdapter(users);
        rvStory.setAdapter(storyAdapter);
    }

    public void MainAdapter(){

        List<User> users = new ArrayList<>();
        for (int i=1; i<20; i++){
            users.add(new User(1L,"IU", null, R.drawable.iu));
        }

        LinearLayoutManager manager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rvMain = findViewById(R.id.rv_main);
        rvMain.setLayoutManager(manager);

        mainAdapter = new MainAdapter(users);
        rvMain.setAdapter(mainAdapter);
    }
}