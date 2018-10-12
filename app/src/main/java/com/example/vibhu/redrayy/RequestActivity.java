package com.example.vibhu.redrayy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;
import java.util.Date;

public class RequestActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    private DatabaseReference mdatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
        editText1=findViewById(R.id.name);
        editText2=findViewById(R.id.address);
        editText3=findViewById(R.id.email);
        editText4=findViewById(R.id.phone);
        editText5=findViewById(R.id.blood);
        mdatabase= FirebaseDatabase.getInstance().getReference();


    }
    public void Submit(View view){
        String name=editText1.getText().toString();
        String address=editText2.getText().toString();
        String email=editText3.getText().toString();
        String phone=editText4.getText().toString();
        Date currentTime = Calendar.getInstance().getTime();
        String date=currentTime+"";
        String bl=editText5.getText().toString();
        mdatabase.child("BloodBanks").child("Request").child(name).child("address").setValue(address);
        mdatabase.child("BloodBanks").child("Request").child(name).child("email").setValue(email);
        mdatabase.child("BloodBanks").child("Request").child(name).child("phone").setValue(phone);
        mdatabase.child("BloodBanks").child("Request").child(name).child("date").setValue(date);
        mdatabase.child("BloodBanks").child("Request").child(name).child("blood").setValue(bl);
        finish();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.action_settings){
            Intent intent=new Intent(this,AllRequests.class);
            startActivity(intent);
        }
    return true;
    }


}
