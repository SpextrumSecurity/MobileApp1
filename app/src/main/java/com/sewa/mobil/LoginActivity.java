package com.sewa.mobil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("nama");
        String telepon = bundle.getString("telepon");
        String email = bundle.getString("email");

        Toast.makeText(
                this, "Extras : \n"
                        + nama + "\n"
                        + telepon + "\n"
                        + email + "\n",
                Toast.LENGTH_SHORT).show();

    }
}
