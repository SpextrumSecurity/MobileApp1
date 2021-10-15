package com.sewa.mobil;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private EditText txtNama, txtTelepon, txtEmail;
    private Button btnSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNama = (EditText) findViewById(R.id.txt_nama);
        txtTelepon = (EditText) findViewById(R.id.txt_telepon);
        txtEmail = (EditText) findViewById(R.id.txt_email);
        btnSimpan = (Button) findViewById(R.id.btn_simpan);

//        btnSimpan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

    }

    private boolean adaError() {
        boolean ada = false;

        if(TextUtils.isEmpty(txtNama.getText())) {
            ada = true;
            txtNama.setError("Tidak boleh kosong");
        }

        if(txtTelepon.getText().toString().isEmpty()) {
            ada = true;
            txtTelepon.setError("Tidak boleh kosong");
        }


        if(txtEmail.getText().toString().isEmpty()) {
            ada = true;
            txtEmail.setError("Tidak boleh kosong");
        }
        return ada;
    }

    public void daftar(View v) {
        if(!adaError()) {
            Toast.makeText(
                    this,
                    txtNama.getText().toString()
                    + " "
                    + txtTelepon.getText().toString()
                    + txtEmail.getText().toString(),
                    Toast.LENGTH_SHORT).show();

            Bundle bundle = new Bundle();
            bundle.putString("nama",txtNama.getText().toString());
            bundle.putString("telepon",txtTelepon.getText().toString());
            bundle.putString("email",txtEmail.getText().toString());

            Intent i = new Intent(this, LoginActivity.class);
            i.putExtras(bundle);
            startActivity(i);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }
}
