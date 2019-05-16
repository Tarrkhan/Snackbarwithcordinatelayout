package com.example.snackbarwithcordinatelayout;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton floatingActionButton;
    Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton = findViewById(R.id.fab_id);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                snackbar = Snackbar.make(v,"Message changed",Snackbar.LENGTH_INDEFINITE);
                snackbar.setDuration(4000);
                snackbar.setAction("ok", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                   snackbar.dismiss();
                    }
                });

                View view = snackbar.getView();
                view.setBackgroundColor(getResources().getColor(R.color.colorbackground));
                TextView txt = view.findViewById(android.support.design.R.id.snackbar_text);
                txt.setTextColor(getResources().getColor(R.color.colorText));
                TextView txtAction = view.findViewById(android.support.design.R.id.snackbar_action);
                txtAction.setTextColor(getResources().getColor(R.color.snackbarActionText));
                snackbar.show();
            }
        });
    }
}
