package com.example.vibhu.redrayy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Details extends AppCompatActivity {
    private DatabaseReference mdatabase;
    ListView list;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;
    String bloodgroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        list=findViewById(R.id.listView);
        arrayList=new ArrayList<>();
        arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrayList);
        list.setAdapter(arrayAdapter);
        Intent intent=getIntent();
        String bg=intent.getStringExtra("type");
        bloodgroup=bg;

        mdatabase= FirebaseDatabase.getInstance().getReference();
        mdatabase.child("BloodBanks").child("0").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String hospital=dataSnapshot.child("name").getValue(String.class);
                    String quan=dataSnapshot.child(bloodgroup).getValue(Long.class)+"";
                    Double dis=distance(dataSnapshot.child("Lat").getValue(Double.class),dataSnapshot.child("Lon").getValue(Double.class),19.0265,73.0551);
                    arrayList.add(hospital+" : "+quan+"ml     at "+dis+" km");
                    arrayAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mdatabase.child("BloodBanks").child("1").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String hospital=dataSnapshot.child("name").getValue(String.class);
                    String quan=dataSnapshot.child(bloodgroup).getValue(Long.class)+"";
                    Double dis=distance(dataSnapshot.child("Lat").getValue(Double.class),dataSnapshot.child("Lon").getValue(Double.class),19.0265,73.0551);
                    arrayList.add(hospital+" : "+quan+"ml     at "+dis+" km");
                    arrayAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mdatabase.child("BloodBanks").child("2").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String hospital=dataSnapshot.child("name").getValue(String.class);
                    String quan=dataSnapshot.child(bloodgroup).getValue(Long.class)+"";
                    Double dis=distance(dataSnapshot.child("Lat").getValue(Double.class),dataSnapshot.child("Lon").getValue(Double.class),19.0265,73.0551);
                    arrayList.add(hospital+" : "+quan+"ml     at "+dis+" km");
                    arrayAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mdatabase.child("BloodBanks").child("3").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String hospital=dataSnapshot.child("name").getValue(String.class);
                    String quan=dataSnapshot.child(bloodgroup).getValue(Long.class)+"";
                    Double dis=distance(dataSnapshot.child("Lat").getValue(Double.class),dataSnapshot.child("Lon").getValue(Double.class),19.0265,73.0551);
                    arrayList.add(hospital+" : "+quan+"ml     at "+dis+" km");
                    arrayAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mdatabase.child("BloodBanks").child("4").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String hospital=dataSnapshot.child("name").getValue(String.class);
                    String quan=dataSnapshot.child(bloodgroup).getValue(Long.class)+"";
                    Double dis=distance(dataSnapshot.child("Lat").getValue(Double.class),dataSnapshot.child("Lon").getValue(Double.class),19.0265,73.0551);
                    arrayList.add(hospital+" : "+quan+"ml     at "+dis+" km");
                    arrayAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mdatabase.child("BloodBanks").child("5").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String hospital=dataSnapshot.child("name").getValue(String.class);
                    String quan=dataSnapshot.child(bloodgroup).getValue(Long.class)+"";
                    Double dis=distance(dataSnapshot.child("Lat").getValue(Double.class),dataSnapshot.child("Lon").getValue(Double.class),19.0265,73.0551);
                    arrayList.add(hospital+" : "+quan+"ml     at "+dis+" km");
                    arrayAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mdatabase.child("BloodBanks").child("6").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String hospital=dataSnapshot.child("name").getValue(String.class);
                    String quan=dataSnapshot.child(bloodgroup).getValue(Long.class)+"";
                    Double dis=distance(dataSnapshot.child("Lat").getValue(Double.class),dataSnapshot.child("Lon").getValue(Double.class),19.0265,73.0551);
                    arrayList.add(hospital+" : "+quan+"ml     at "+dis+" km");
                    arrayAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mdatabase.child("BloodBanks").child("7").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String hospital=dataSnapshot.child("name").getValue(String.class);
                    String quan=dataSnapshot.child(bloodgroup).getValue(Long.class)+"";
                    Double dis=distance(dataSnapshot.child("Lat").getValue(Double.class),dataSnapshot.child("Lon").getValue(Double.class),19.0265,73.0551);
                    arrayList.add(hospital+" : "+quan+"ml     at "+dis+" km");
                    arrayAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mdatabase.child("BloodBanks").child("8").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String hospital=dataSnapshot.child("name").getValue(String.class);
                    String quan=dataSnapshot.child(bloodgroup).getValue(Long.class)+"";
                    Double dis=distance(dataSnapshot.child("Lat").getValue(Double.class),dataSnapshot.child("Lon").getValue(Double.class),19.0265,73.0551);
                    arrayList.add(hospital+" : "+quan+"ml     at "+dis+" km");
                    arrayAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mdatabase.child("BloodBanks").child("9").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String hospital=dataSnapshot.child("name").getValue(String.class);
                    String quan=dataSnapshot.child(bloodgroup).getValue(Long.class)+"";
                    Double dis=distance(dataSnapshot.child("Lat").getValue(Double.class),dataSnapshot.child("Lon").getValue(Double.class),19.0265,73.0551);
                    arrayList.add(hospital+" : "+quan+"ml     at "+dis+" km");
                    arrayAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mdatabase.child("BloodBanks").child("10").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String hospital=dataSnapshot.child("name").getValue(String.class);
                    String quan=dataSnapshot.child(bloodgroup).getValue(Long.class)+"";
                    Double dis=distance(dataSnapshot.child("Lat").getValue(Double.class),dataSnapshot.child("Lon").getValue(Double.class),19.0265,73.0551);
                    arrayList.add(hospital+" : "+quan+"ml     at "+dis+" km");
                    arrayAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mdatabase.child("BloodBanks").child("11").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String hospital=dataSnapshot.child("name").getValue(String.class);
                    String quan=dataSnapshot.child(bloodgroup).getValue(Long.class)+"";
                    Double dis=distance(dataSnapshot.child("Lat").getValue(Double.class),dataSnapshot.child("Lon").getValue(Double.class),19.0265,73.0551);
                    arrayList.add(hospital+" : "+quan+"ml     at "+dis+" km");
                    arrayAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mdatabase.child("BloodBanks").child("12").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String hospital=dataSnapshot.child("name").getValue(String.class);
                    String quan=dataSnapshot.child(bloodgroup).getValue(Long.class)+"";
                    Double dis=distance(dataSnapshot.child("Lat").getValue(Double.class),dataSnapshot.child("Lon").getValue(Double.class),19.0265,73.0551);
                    arrayList.add(hospital+" : "+quan+"ml     at "+dis+" km");
                    arrayAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mdatabase.child("BloodBanks").child("13").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String hospital=dataSnapshot.child("name").getValue(String.class);
                    String quan=dataSnapshot.child(bloodgroup).getValue(Long.class)+"";
                    Double dis=distance(dataSnapshot.child("Lat").getValue(Double.class),dataSnapshot.child("Lon").getValue(Double.class),19.0265,73.0551);
                    arrayList.add(hospital+" : "+quan+"ml     at "+dis+" km");
                    arrayAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mdatabase.child("BloodBanks").child("14").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String hospital=dataSnapshot.child("name").getValue(String.class);
                    String quan=dataSnapshot.child(bloodgroup).getValue(Long.class)+"";
                    Double dis=distance(dataSnapshot.child("Lat").getValue(Double.class),dataSnapshot.child("Lon").getValue(Double.class),19.0265,73.0551);
                    arrayList.add(hospital+" : "+quan+"ml     at "+dis+" km");
                    arrayAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mdatabase.child("BloodBanks").child("15").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String hospital=dataSnapshot.child("name").getValue(String.class);
                    String quan=dataSnapshot.child(bloodgroup).getValue(Long.class)+"";
                    Double dis=distance(dataSnapshot.child("Lat").getValue(Double.class),dataSnapshot.child("Lon").getValue(Double.class),19.0265,73.0551);
                    arrayList.add(hospital+" : "+quan+"ml     at "+dis+" km");
                    arrayAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mdatabase.child("BloodBanks").child("16").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String hospital=dataSnapshot.child("name").getValue(String.class);
                    String quan=dataSnapshot.child(bloodgroup).getValue(Long.class)+"";
                    Double dis=distance(dataSnapshot.child("Lat").getValue(Double.class),dataSnapshot.child("Lon").getValue(Double.class),19.0265,73.0551);
                    arrayList.add(hospital+" : "+quan+"ml     at "+dis+" km");
                    arrayAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mdatabase.child("BloodBanks").child("17").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String hospital=dataSnapshot.child("name").getValue(String.class);
                    String quan=dataSnapshot.child(bloodgroup).getValue(Long.class)+"";
                    Double dis=distance(dataSnapshot.child("Lat").getValue(Double.class),dataSnapshot.child("Lon").getValue(Double.class),19.0265,73.0551);
                    arrayList.add(hospital+" : "+quan+"ml     at "+dis+" km");
                    arrayAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mdatabase.child("BloodBanks").child("18").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String hospital=dataSnapshot.child("name").getValue(String.class);
                    String quan=dataSnapshot.child(bloodgroup).getValue(Long.class)+"";
                    Double dis=distance(dataSnapshot.child("Lat").getValue(Double.class),dataSnapshot.child("Lon").getValue(Double.class),19.0265,73.0551);
                    arrayList.add(hospital+" : "+quan+"ml     at "+dis+" km");
                    arrayAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mdatabase.child("BloodBanks").child("19").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(dataSnapshot!=null){
                    String hospital=dataSnapshot.child("name").getValue(String.class);
                    String quan=dataSnapshot.child(bloodgroup).getValue(Long.class)+"";
                    Double dis=distance(dataSnapshot.child("Lat").getValue(Double.class),dataSnapshot.child("Lon").getValue(Double.class),19.0265,73.0551);
                    arrayList.add(hospital+" : "+quan+"ml     at "+dis+" km");
                    arrayAdapter.notifyDataSetChanged();
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
        return (dist/100000);
    }
    private double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    private double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }
}
