package com.example.ydk.khuthon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FinalMessageActivity extends AppCompatActivity {

    private Button submit;
    private Button back;
    private Button update;
    private TextView final_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_message);
        submit = (Button)findViewById(R.id.btnSubmit);
        back = (Button)findViewById(R.id.btnBack);
        update = (Button)findViewById(R.id.btnUpdate);
        final_msg = (TextView) findViewById(R.id.textFinal);



        final_msg.setText("데이트 신청서");
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"제출 완료되었습니다.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),RandomMatchActivity.class);
                startActivity(intent);
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"제출 완료되었습니다.",Toast.LENGTH_SHORT).show();

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}



