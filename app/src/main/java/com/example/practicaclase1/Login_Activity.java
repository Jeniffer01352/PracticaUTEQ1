package com.example.practicaclase1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login_Activity extends AppCompatActivity {

    private EditText etUsuario, etClave;
    private Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsuario = findViewById(R.id.txt1);
        etClave = findViewById(R.id.txt2);
        btnIngresar = findViewById(R.id.button5);

        btnIngresar.setOnClickListener(v -> {
            String usuario = etUsuario.getText().toString().trim();
            String clave = etClave.getText().toString().trim();

            if (usuario.isEmpty()) {
                etUsuario.setError("Usuario requerido");
                return;
            }

            if (clave.isEmpty()) {
                etClave.setError("Clave requerida");
                return;
            }

            Toast.makeText(Login_Activity.this, "Usted ha sido iniciado correctamente", Toast.LENGTH_LONG).show();
        });
    }

}