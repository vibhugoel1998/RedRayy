package com.example.vibhu.redrayy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Nearest extends AppCompatActivity {
    String help;
    Double lat;
    Double lon;
    Double latMax;
    Double lonMax;
    Double latGanga;
    Double lonGanga;
    Double latiCity;
    Double loniCity;
    Double disCity;
    Double disGanga;
    Double disMax;
    String Hospitalname;
    TextView nearView;
    private DatabaseReference mdatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearest);
        mdatabase= FirebaseDatabase.getInstance().getReference();
        Intent intent=getIntent();
        nearView=findViewById(R.id.linearLay);
        help=intent.getStringExtra("type");

        lat=intent.getDoubleExtra("lat",0.0);
        lon=intent.getDoubleExtra("lon",0.0);
        mdatabase.child("BloodBanks").child("14").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String quan=dataSnapshot.child(help).getValue(Long.class)+"";
                    nearView.setText("Paras Hospital :"+quan+" ml");

                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }
    private double distance(double lat1, double lon1, double lat2, double lon2) {
        // haversine great circle distance approximation, returns meters
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2))
                + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2))
                * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60; // 60 nautical miles per degree of seperation
        dist = dist * 1852; // 1852 meters per nautical mile
        return (dist);
    }

    private double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    private double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }
}
