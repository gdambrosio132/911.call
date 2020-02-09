package com.example.a911call;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
//import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
//import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtPhn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button)findViewById(R.id.button1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:5165134284"));
                if (ActivityCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(i);
            }
        });
    }
}
