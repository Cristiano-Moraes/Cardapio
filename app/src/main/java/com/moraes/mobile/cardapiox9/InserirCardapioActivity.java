package com.moraes.mobile.cardapiox9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.text.DateFormat;
import java.util.Calendar;

public class InserirCardapioActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    Button btnDatePicker;
    String dataAtual;
    Calendar c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserir_cardapio);
        btnDatePicker = findViewById(R.id.buttonShowDatePicker);
        c = Calendar.getInstance();
        dataAtual = DateFormat.getDateInstance(DateFormat.SHORT).format(c.getTime());
        btnDatePicker.setText(dataAtual);
        btnDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment dp = new DatePickerFragment();
                dp.show(getSupportFragmentManager(),"teste calendario");
            }
        });
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        //Calendar c = Calendar.getInstance();
        c = Calendar.getInstance();
        c.set(Calendar.YEAR,year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH,dayOfMonth);
        String dataAtual = DateFormat.getDateInstance(DateFormat.SHORT).format(c.getTime());
        btnDatePicker.setText(dataAtual);

    }
}
