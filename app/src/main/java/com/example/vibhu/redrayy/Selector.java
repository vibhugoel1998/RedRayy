package com.example.vibhu.redrayy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;



import com.google.android.gms.tasks.OnSuccessListener;

public class Selector extends AppCompatActivity {
    Spinner dropdown;
    ArrayAdapter<String> adapter;
    String[] items;
    String help;
    FusedLocationProviderClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);
        dropdown = findViewById(R.id.spinner1);
        items = new String[]{"Choose one", "Oneg", "Opos", "Aneg", "Apos", "Bpos", "Bneg", "Apos", "ABneg", "ABpos"};
        adapter = new ArrayAdapter<>(this, R.layout.spinner_item, items);
        adapter.setDropDownViewResource(R.layout.spinner_item);
        dropdown.setAdapter(adapter);
        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                help=items[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    public void Find(View view){
        if(help!="Choose one"){
            Intent intent=new Intent(this,Details.class);
            intent.putExtra("type",help);
            startActivity(intent);

        }
    }
    public void Near(View view){
        if(help!="Choose one"){
            AlertDialog.Builder builder1 = new AlertDialog.Builder(Selector.this);
            builder1.setMessage("Fetch Location");
            builder1.setCancelable(true);

            builder1.setPositiveButton(
                    "Yes",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            client = LocationServices.getFusedLocationProviderClient(Selector.this);
                            if (ActivityCompat.checkSelfPermission(Selector.this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(Selector.this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                                // TODO: Consider calling
                                //    ActivityCompat#requestPermissions
                                // here to request the missing permissions, and then overriding
                                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                //                                          int[] grantResults)
                                // to handle the case where the user grants the permission. See the documentation
                                // for ActivityCompat#requestPermissions for more details.
                                return;
                            }
                            client.getLastLocation().addOnSuccessListener(new OnSuccessListener<Location>() {
                                @Override
                                public void onSuccess(Location location) {
                                    if(location!=null)
                                    {
                                        Intent intent=new Intent(Selector.this,Nearest.class);
                                        intent.putExtra("type",help);
                                        intent.putExtra("lat",location.getLatitude());
                                        intent.putExtra("lon",location.getLongitude());
                                        Log.d("hello",help);
                                        startActivity(intent);

                                    }
                                }
                            });
                        }
                    });

            builder1.setNegativeButton(
                    "No",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });

            AlertDialog alert11 = builder1.create();
            alert11.show();



        }

    }
}
