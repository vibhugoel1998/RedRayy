package com.example.vibhu.redrayy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class AllRequests extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<String> arrayAdapter;
    ArrayList<String> arrayList;
    private DatabaseReference mdatabase;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_requests);
        textView=findViewById(R.id.norequest);
        listView=findViewById(R.id.requestlist);
        textView.setVisibility(View.INVISIBLE);
        arrayList=new ArrayList<>();
        arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        mdatabase= FirebaseDatabase.getInstance().getReference();
        if(mdatabase.child("BloodBanks").child("Request")==null){
            textView.setVisibility(View.VISIBLE);
        }
        else{
            mdatabase.child("BloodBanks").child("Request").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    for(DataSnapshot snapshot:dataSnapshot.getChildren())
                    {
                        String name=snapshot.getKey();
                        String address=snapshot.child("address").getValue(String.class);
                        String email=snapshot.child("email").getValue(String.class);
                        String phone=snapshot.child("phone").getValue(String.class);
                        String date=snapshot.child("date").getValue(String.class);
                        String blood=snapshot.child("blood").getValue(String.class);
                        String stat=name+" requires "+blood+" at "+date+".Contact:"+phone+" or"+email;
                        arrayList.add(stat);
                        arrayAdapter.notifyDataSetChanged();
                    }

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }


    }
}
