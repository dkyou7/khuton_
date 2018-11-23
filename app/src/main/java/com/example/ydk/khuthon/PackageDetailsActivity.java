package com.example.ydk.khuthon;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PackageDetailsActivity extends AppCompatActivity {

    Button cafeButton, mealButton, movieButton, pubButton, nextButton,btnBack;
    TextView cafeSelection, mealSelection, movieSelection, pubSelction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package_details);

        cafeButton = (Button)findViewById(R.id.cafe_button);
        mealButton = (Button)findViewById(R.id.meal_button);
        movieButton = (Button)findViewById(R.id.movie_button);
        pubButton = (Button)findViewById(R.id.pub_button);
        nextButton = (Button)findViewById(R.id.next_button);
        btnBack = (Button)findViewById(R.id.btnBack);

        cafeSelection = (TextView)findViewById(R.id.cafe_selection);
        mealSelection = (TextView)findViewById(R.id.meal_selection);
        movieSelection = (TextView)findViewById(R.id.movie_selection);
        pubSelction = (TextView)findViewById(R.id.pub_selection);

        Intent intent = getIntent();
        int tmp = intent.getIntExtra("id",-1);

        switch (tmp){
            case 1:
                mealButton.setVisibility(View.GONE);
                movieButton.setVisibility(View.GONE);
                pubButton.setVisibility(View.GONE);
                break;
            case 2:
                movieButton.setVisibility(View.GONE);
                pubButton.setVisibility(View.GONE);
                break;
            case 3:
                pubButton.setVisibility(View.GONE);
                break;
            case 4:
                break;
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        cafeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_cafe();
            }
        });
        mealButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_meal();
            }
        });
        movieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_movie();
            }
        });
        pubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_pub();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음
                Intent intent = new Intent(getApplicationContext(),FinalMessageActivity.class);
                startActivity(intent);
            }
        });
    }

    void show_cafe() {
        final List<String> ListItems = new ArrayList<>();
        ListItems.add("카페베네");
        ListItems.add("스타벅스");
        ListItems.add("엔젤리너스");
        ListItems.add("탐엔탐스");
        final CharSequence[] items = ListItems.toArray(new String[ListItems.size()]);

        final List SelectedItems = new ArrayList();
        int defaultItem = 0;
        SelectedItems.add(defaultItem);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("select cafe");
        builder.setSingleChoiceItems(items, defaultItem,
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        SelectedItems.clear();
                        SelectedItems.add(which);
                    }
                });

        builder.setPositiveButton("select",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {

                        String msg = "";

                        if (!SelectedItems.isEmpty()) {
                            int index = (int) SelectedItems.get(0);
                            msg = ListItems.get(index);
                            cafeSelection.setText(msg);
                        }
                        Toast.makeText(getApplicationContext(),
                                "Cafe selected\n" + msg, Toast.LENGTH_LONG).show();

                    }
                });

        builder.setNegativeButton("cancel",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {

                    }
                });
        builder.show();
    }

    void show_meal() {

        final List<String> ListItems = new ArrayList<>();
        ListItems.add("한국순대국");
        ListItems.add("교동짬뽕");
        ListItems.add("bhc치킨");
        ListItems.add("미챠이");
        final CharSequence[] items = ListItems.toArray(new String[ListItems.size()]);

        final List SelectedItems = new ArrayList();
        int defaultItem = 0;
        SelectedItems.add(defaultItem);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("음식점 고르기");
        builder.setSingleChoiceItems(items, defaultItem,
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        SelectedItems.clear();
                        SelectedItems.add(which);
                    }
                });

        builder.setPositiveButton("select",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {

                        String msg = "";

                        if (!SelectedItems.isEmpty()) {
                            int index = (int) SelectedItems.get(0);
                            msg = ListItems.get(index);
                            mealSelection.setText(msg);
                        }
                        Toast.makeText(getApplicationContext(),
                                "Cafe selected\n" + msg, Toast.LENGTH_LONG).show();

                    }
                });

        builder.setNegativeButton("cancel",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {

                    }
                });
        builder.show();
    }

    void show_movie() {

        final List<String> ListItems = new ArrayList<>();
        ListItems.add("영통역 메가박스");
        ListItems.add("수원역 씨지비");
        ListItems.add("수원역 롯데시네마");
        final CharSequence[] items = ListItems.toArray(new String[ListItems.size()]);

        final List SelectedItems = new ArrayList();
        int defaultItem = 0;
        SelectedItems.add(defaultItem);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("select cafe");
        builder.setSingleChoiceItems(items, defaultItem,
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        SelectedItems.clear();
                        SelectedItems.add(which);
                    }
                });

        builder.setPositiveButton("select",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {

                        String msg = "";

                        if (!SelectedItems.isEmpty()) {
                            int index = (int) SelectedItems.get(0);
                            msg = ListItems.get(index);
                            movieSelection.setText(msg);
                        }
                        Toast.makeText(getApplicationContext(),
                                "Cafe selected\n" + msg, Toast.LENGTH_LONG).show();

                    }
                });

        builder.setNegativeButton("cancel",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {

                    }
                });
        builder.show();
    }

    void show_pub() {

        final List<String> ListItems = new ArrayList<>();
        ListItems.add("꼬지마루");
        ListItems.add("블루블랙");
        ListItems.add("엄마닭");
        ListItems.add("오뎅빠");
        final CharSequence[] items = ListItems.toArray(new String[ListItems.size()]);

        final List SelectedItems = new ArrayList();
        int defaultItem = 0;
        SelectedItems.add(defaultItem);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("select cafe");
        builder.setSingleChoiceItems(items, defaultItem,
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        SelectedItems.clear();
                        SelectedItems.add(which);
                    }
                });

        builder.setPositiveButton("select",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {

                        String msg = "";

                        if (!SelectedItems.isEmpty()) {
                            int index = (int) SelectedItems.get(0);
                            msg = ListItems.get(index);
                            pubSelction.setText(msg);
                        }
                        Toast.makeText(getApplicationContext(),
                                "Cafe selected\n" + msg, Toast.LENGTH_LONG).show();

                    }
                });

        builder.setNegativeButton("cancel",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {

                    }
                });
        builder.show();
    }

}