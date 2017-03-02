package com.elysewarren.inclassassignment05_ew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView textType;
    private TextView textAge;
    private TextView textInfo;
    private TextView textAllergies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textType = (TextView) findViewById(R.id.display_dog_type);
        textAge = (TextView) findViewById(R.id.display_dog_age);
        textInfo = (TextView) findViewById(R.id.display_contact_info);
        textAllergies = (TextView) findViewById(R.id.display_allergies);


        Intent intent = getIntent();
        Dog dog = (Dog) intent.getSerializableExtra(Keys.DOG);

        textType.setText("Type: " + dog.getDogType());
        textAge.setText("Age: " + String.valueOf(dog.getAge()));
        textInfo.setText("Contact Information: " + dog.getContactInfo());

        if (dog.isAllergies())
            textAllergies.setText("Is allergic");
        else
            textAllergies.setText("Not allergic");
    }


}
