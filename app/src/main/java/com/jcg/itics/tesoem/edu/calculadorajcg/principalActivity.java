package com.jcg.itics.tesoem.edu.calculadorajcg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class principalActivity extends AppCompatActivity {
    EditText opcionsuma;

    Button btnir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        opcionsuma = (EditText) findViewById(R.id.opcionsuma);

        btnir = (Button) findViewById(R.id.btnir);



    }
}
