package com.example.johnkaehler.viewstubproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    ViewStub viewStub;
    View inflated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewStub = (ViewStub)findViewById(R.id.stub);
        ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleButton);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    viewStub.setVisibility(View.VISIBLE);
                } else {
                    // The toggle is disabled
                    viewStub.setVisibility(View.GONE);
                }
            }
        });

    }
}
