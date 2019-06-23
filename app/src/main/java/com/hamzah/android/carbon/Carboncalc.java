package com.hamzah.android.carbon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Carboncalc extends AppCompatActivity {


    public CheckBox gas, des;
    public EditText gallons;
    public Button submit;
    public TextView displayPounds;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carboncalc);


        submit = findViewById(R.id.submit);
        gas = findViewById(R.id.gas);
        des = findViewById(R.id.deisel);
        gallons = findViewById(R.id.input);
        displayPounds = findViewById(R.id.emmision);





        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String input = gallons.getText().toString();
                int galllonsNumber = Integer.parseInt(input);


                if (gas.isChecked()) {
                    int pounds = galllonsNumber * 20 ;
                    displayPounds.setText("You emit " + pounds + " Pounds of Co2");

                } else if (des.isChecked()) {

                    int pounds = galllonsNumber * 22;
                    displayPounds.setText("you emit " + pounds + " pounds of Co2");



                }



            }
        });

    }


}

