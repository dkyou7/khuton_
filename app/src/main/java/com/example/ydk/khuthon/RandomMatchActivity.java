package com.example.ydk.khuthon;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RandomMatchActivity extends AppCompatActivity {

    private ImageView userPortrait;
    private TextView userName;
    private Button selectButton, passButton,btnMailbox;

    public static final int array[]={
            R.drawable.im1, R.drawable.im2, R.drawable.im3,
            R.drawable.im4, R.drawable.im5, R.drawable.im6,
            R.drawable.im7
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_match);

        userPortrait = (ImageView)findViewById(R.id.user_portrait);
        userName = (TextView)findViewById(R.id.user_name);
        selectButton = (Button)findViewById(R.id.pick_button);
        btnMailbox = (Button)findViewById(R.id.btnMailbox);

        btnMailbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MailboxActivity.class);
                startActivity(intent);
            }
        });

        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show();
            }
        });

        passButton = (Button)findViewById(R.id.pass_button);
        passButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                ImageView test = (ImageView)findViewById(R.id.user_portrait);

                int random = (int)(Math.random()*7);
                test.setImageResource(array[random]);

            }
        });
    }

    void show()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("데이트 명세 시작");
        builder.setMessage("1. 데이트 날자를 정하세요!\n2. 데이트 장소를 정하세요!\n3. 보내기~! 및 기다리기");
        builder.setPositiveButton("시작하자",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(),PackageSelectActivity.class);
                        startActivity(intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | intent.FLAG_ACTIVITY_SINGLE_TOP));
                    }
                });
        builder.setNegativeButton("다시생각해볼게요",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"아니오를 선택했습니다.",Toast.LENGTH_LONG).show();
                    }
                });
        builder.show();
    }
}
