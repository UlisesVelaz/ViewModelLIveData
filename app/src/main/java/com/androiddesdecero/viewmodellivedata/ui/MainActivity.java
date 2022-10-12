package com.androiddesdecero.viewmodellivedata.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.androiddesdecero.viewmodellivedata.R;

/**
 * Created by ulisesvelázquez on 11/oct/22
 */
public class MainActivity extends AppCompatActivity {

    private Button btViewModelSumarActivity, btViewModelUserActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configview();
    }

    private void configview() {
        btViewModelSumarActivity = findViewById(R.id.mainActivityBtViewModelSumar);
        btViewModelSumarActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ViewModelSumarActivity.class));
            }
        });

        btViewModelUserActivity = findViewById(R.id.mainActivityBtViewModelUser);
        btViewModelUserActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ViewModelUserActivity2.class));
            }
        });
    }
}