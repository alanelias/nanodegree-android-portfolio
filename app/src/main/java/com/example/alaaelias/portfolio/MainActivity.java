package com.example.alaaelias.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String LOG_TITLE = "Portfolio";

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(LOG_TITLE, "onStop");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(LOG_TITLE, "onCreate");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        //  get a reference to the TableLayout witch is buttons container
        final TableLayout container = (TableLayout) this.findViewById(R.id.container);

        //  get a reference to Popular Movies Button
        final Button btn_popular_movies = (Button) container.findViewById(R.id.btn_popular_movies);
        if (btn_popular_movies != null) {
            // on click or on touch event handler
            btn_popular_movies.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    showToast(String.valueOf(btn_popular_movies.getText()));
                }
            });
        }

        //  get a reference to Stock Hawk Button
        final Button btn_stock_hawak = (Button) container.findViewById(R.id.btn_stock_hawak);
        if (btn_stock_hawak != null) {
            // on click or on touch event handler
            btn_stock_hawak.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    showToast(String.valueOf(btn_stock_hawak.getText()));
                }
            });
        }

        //  get a reference to Build it Bigger Button
        final Button btn_build_it_bigger = (Button) container.findViewById(R.id.btn_build_it_bigger);
        if (btn_build_it_bigger != null) {
            // on click or on touch event handler
            btn_build_it_bigger.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    showToast(String.valueOf(btn_build_it_bigger.getText()));
                }
            });
        }

        //  get a reference to Make Your App Material  Button
        final Button btn_make_your_app_material = (Button) container.findViewById(R.id.btn_make_your_app_material);
        if (btn_make_your_app_material != null) {
            // on click or on touch event handler
            btn_make_your_app_material.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    showToast(String.valueOf(btn_make_your_app_material.getText()));
                }
            });
        }

        //  get a reference to Go Ubiquitous Button
        final Button btn_go_ubiquitous = (Button) container.findViewById(R.id.btn_go_ubiquitous);
        if (btn_go_ubiquitous != null) {
            // on click or on touch event handler
            btn_go_ubiquitous.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    showToast(String.valueOf(btn_go_ubiquitous.getText()));
                }
            });
        }

        //  get a reference to Capstone  Button
        final Button btn_capstone = (Button) container.findViewById(R.id.btn_capstone);
        if (btn_capstone != null) {
            // on click or on touch event handler
            btn_capstone.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    showToast(String.valueOf(btn_capstone.getText()));
                }
            });
        }

        return true;
    }

    // generating the toast message
    public void showToast(String msg) {
        Toast.makeText(getApplicationContext(), "This button will launch "+msg.toLowerCase()+" app!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(LOG_TITLE, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(LOG_TITLE, "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(LOG_TITLE, "onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(LOG_TITLE, "onStart");
    }


}
