package com.projects.aaronmonteabaro.listenup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CurrentTree extends AppCompatActivity {

    private View mNewTreeButton;
    private View mSwapTreeButton;
    private View mSearchTreeButton;
    private View mUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_tree);

        mNewTreeButton = findViewById(R.id.newTreeButton);
        mNewTreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CurrentTree.this, NewTree.class);
                startActivity(intent);
            }
        });

        mSwapTreeButton = findViewById(R.id.swapTreesButton);
        mSwapTreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CurrentTree.this, "Here's Where the swap dialog box opens.", Toast.LENGTH_SHORT).show();
            }
        });

        mSearchTreeButton = findViewById(R.id.searchTreesButton);
        mSearchTreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CurrentTree.this, SearchTrees.class);
                startActivity(intent);
            }
        });

        mUpButton = findViewById(R.id.upButton);
        mUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CurrentTree.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
