package com.projects.aaronmonteabaro.listenup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView mPlayButton;
    private ImageView mPauseButton;
    private ImageView mInfoButton;
    private ImageView mTreeButton;

    private View mCurrentSongButton;
    private View mNextSongButton1;
    private View mNextSongButton2;

    private View mNewTreeButton;
    private View mSearchTreesButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayButton = (ImageView) findViewById(R.id.playButton);
        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Audio Play", Toast.LENGTH_SHORT).show();
            }
        });

        mPauseButton = (ImageView) findViewById(R.id.pauseButton);
        mPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Audio Paused", Toast.LENGTH_SHORT).show();
            }
        });

        mInfoButton = (ImageView) findViewById(R.id.infoButton);
        mInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(intent);

            }
        });

        mTreeButton = (ImageView) findViewById(R.id.treeButton);
        mTreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CurrentTree.class);
                startActivity(intent);
            }
        });

        mCurrentSongButton = findViewById(R.id.currentSongIcon);
        mCurrentSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SongInfo.class);
                startActivity(intent);
            }
        });

        mNextSongButton1 = findViewById(R.id.nextSongIcon1);
        mNextSongButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SongInfo.class);
                startActivity(intent);
            }
        });

        mNextSongButton2 = findViewById(R.id.nextSongIcon2);
        mNextSongButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SongInfo.class);
                startActivity(intent);
            }
        });

        mNewTreeButton = findViewById(R.id.newTreeButton);
        mNewTreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewTree.class);
                startActivity(intent);
            }
        });

        mSearchTreesButton = findViewById(R.id.searchTreesButton);
        mSearchTreesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchTrees.class);
                startActivity(intent);
            }
        });
    }
}
