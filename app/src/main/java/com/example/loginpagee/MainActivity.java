package com.example.loginpagee;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.latihan.R;

public class MainActivity extends AppCompatActivity {

    EditText usernameInput, passwordInput;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameInput = findViewById(R.id.usernameInput);
        passwordInput = findViewById(R.id.passwordInput);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = usernameInput.getText().toString();
                String pass = passwordInput.getText().toString();

                if (user.equals("admin") && pass.equals("1234")) {
                    Toast.makeText(MainActivity.this, "Login sukses!", Toast.LENGTH_SHORT).show();
                    // Bisa lanjut ke activity lain di sini
                } else {
                    Toast.makeText(MainActivity.this, "Username atau password salah", Toast.LENGTH_SHORT).show();
                }
            }
  });
}
}