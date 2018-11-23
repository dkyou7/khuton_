package com.example.ydk.khuthon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RandomMatchActivity extends AppCompatActivity {

    private ImageView userPortrait;
    private TextView userName;
    private Button selectButton, passButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_match);

        userPortrait = (ImageView)findViewById(R.id.user_portrait);
        userName = (TextView)findViewById(R.id.user_name);
        selectButton = (Button)findViewById(R.id.pick_button);
        passButton = (Button)findViewById(R.id.pass_button);

        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),PackageSelectActivity.class);
                startActivity(intent.setFlags(intent.FLAG_ACTIVITY_CLEAR_TOP | intent.FLAG_ACTIVITY_SINGLE_TOP));
            }
        });

    }
}
