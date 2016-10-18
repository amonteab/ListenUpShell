package com.projects.aaronmonteabaro.listenup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SearchTrees extends AppCompatActivity {

    private View mListenToTreeNowButton;
    private View mSaveTreeForLaterButton;
    private View mUploadCurrentTreeButton;
    private View mUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_trees);

        mListenToTreeNowButton = findViewById(R.id.listenTreeNowButton);
        mListenToTreeNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SearchTrees.this, "Importing Tree and Playing Now", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SearchTrees.this, CurrentTree.class);
                startActivity(intent);
            }
        });

        mSaveTreeForLaterButton = findViewById(R.id.saveTreeButton);
        mSaveTreeForLaterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SearchTrees.this, "This Tree Imported for Later Use", Toast.LENGTH_SHORT).show();
            }
        });

        mUploadCurrentTreeButton = findViewById(R.id.uploadCurrentTreeButton);
        mUploadCurrentTreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SearchTrees.this, "Uploading Your Current Tree To Your Profile.", Toast.LENGTH_SHORT).show();
            }
        });

        mUpButton = findViewById(R.id.upButton);
        mUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchTrees.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
