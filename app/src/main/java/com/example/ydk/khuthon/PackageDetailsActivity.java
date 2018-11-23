package com.example.ydk.khuthon;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PackageDetailsActivity extends AppCompatActivity {

    Button      cafeButton, mealButton, movieButton, pubButton, prevButton, nextButton;
    TextView    cafeSelection, mealSelection, movieSelection, pubSelction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package_details);

        cafeButton = (Button)findViewById(R.id.cafe_button);
        mealButton = (Button)findViewById(R.id.meal_button);
        movieButton = (Button)findViewById(R.id.movie_button);
        pubButton = (Button)findViewById(R.id.pub_button);
        prevButton = (Button)findViewById(R.id.prev_button);
        nextButton = (Button)findViewById(R.id.next_button);

        cafeSelection = (TextView)findViewById(R.id.cafe_selection);
        mealSelection = (TextView)findViewById(R.id.meal_selection);
        movieSelection = (TextView)findViewById(R.id.movie_selection);
        pubSelction = (TextView)findViewById(R.id.pub_selection);




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

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 뒤로
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음
            }
        });
    }

    void show_cafe() {

        final List<String> ListItems = new ArrayList<>();
        ListItems.add("cafe_ex1");
        ListItems.add("cafe_ex2");
        ListItems.add("cafe_ex3");
        ListItems.add("cafe_ex4");
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
        ListItems.add("meal_ex1");
        ListItems.add("meal_ex2");
        ListItems.add("meal_ex3");
        ListItems.add("meal_ex4");
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
        ListItems.add("cafe_ex1");
        ListItems.add("cafe_ex2");
        ListItems.add("cafe_ex3");
        ListItems.add("cafe_ex4");
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
        ListItems.add("cafe_ex1");
        ListItems.add("cafe_ex2");
        ListItems.add("cafe_ex3");
        ListItems.add("cafe_ex4");
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

    void show_time(StringBuilder msg) {

        TimePickerDialog.OnTimeSetListener listener = new TimePickerDialog.OnTimeSetListener() {

            @Override
            public void onTimeSet(TimePicker view, int hour, int minute) {
//                msg.append("\n");

            }
        };

        TimePickerDialog dialog = new TimePickerDialog(this, listener, 15, 24, false);
    }
}
