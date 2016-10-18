package com.projects.aaronmonteabaro.listenup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NewTree extends AppCompatActivity {

    private View mCreateAndListenButton;
    private View mCancelButton;
    private View mUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_tree);

        mCreateAndListenButton = findViewById(R.id.createAndListenButton);
        mCreateAndListenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NewTree.this, "Creating new tree and playing first song.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(NewTree.this, CurrentTree.class);
                startActivity(intent);
            }
        });

        mCancelButton = findViewById(R.id.cancelButton);
        mCancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NewTree.this, "New Tree Canceled.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(NewTree.this, MainActivity.class);
                startActivity(intent);
            }
        });

        mUpButton = findViewById(R.id.upButton);
        mUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewTree.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
