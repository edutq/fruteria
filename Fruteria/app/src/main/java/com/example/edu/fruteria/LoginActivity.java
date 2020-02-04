package com.example.edu.fruteria;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void home(View view) {

        Intent intent = new Intent(this, TiendaPrincipal.class);
        startActivity(intent);
        finish();

    }

    public void registrar(View view) {
  /*      Intent intent = new Intent(this, RegistrarActivity.class);
        startActivity(intent);
        finish();
*/
    }
}
