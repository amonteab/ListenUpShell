package com.projects.aaronmonteabaro.listenup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SongInfo extends AppCompatActivity {

    private View mNewTreeFromThisSongButton;
    private View mUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_info);

        mNewTreeFromThisSongButton = findViewById(R.id.newTreeFromThisSongButton);
        mNewTreeFromThisSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongInfo.this, NewTree.class);
                startActivity(intent);
            }
        });

        mUpButton = findViewById(R.id.upButton);
        mUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongInfo.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
