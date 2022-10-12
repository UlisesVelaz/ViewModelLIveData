package com.androiddesdecero.viewmodellivedata.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.androiddesdecero.viewmodellivedata.R;
import com.androiddesdecero.viewmodellivedata.Sumar;
import com.androiddesdecero.viewmodellivedata.viewmodel.SumarViewModel;

/**
 * Created by ulisesvelázquez on 11/oct/22
 */
public class ViewModelSumarActivity extends AppCompatActivity {

    private TextView tvSumar, tvSumarViewModel;
    private Button btSumar;

    private int numero;
    private SumarViewModel sumarViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_model_sumar);
        configView();
    }

    private void configView() {
        sumarViewModel = ViewModelProviders.of(this).get(SumarViewModel.class);

        tvSumar = findViewById(R.id.viewModelSumarActivityTvSumar);
        tvSumarViewModel = findViewById(R.id.viewModelSumarActivityTvSumarViewModel);

        tvSumar.setText(" " + numero);
        tvSumarViewModel.setText(" " + sumarViewModel.getResultado());


        btSumar = findViewById(R.id.viewModelSumarActivityBtSumar);
        btSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero = Sumar.sumar(numero);
                tvSumar.setText(" " + numero);
                sumarViewModel.setResultado(Sumar.sumar(sumarViewModel.getResultado()));
                tvSumarViewModel.setText(" " + sumarViewModel.getResultado());


            }
        });
    }
}