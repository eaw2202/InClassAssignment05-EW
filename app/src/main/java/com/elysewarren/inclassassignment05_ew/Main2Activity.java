package com.elysewarren.inclassassignment05_ew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView textType;
    private TextView textAge;
    private TextView textInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textType = (TextView) findViewById(R.id.display_dog_type);
        textAge = (TextView) findViewById(R.id.display_dog_age);
        textInfo = (TextView) findViewById(R.id.display_contact_info);


        Intent intent = getIntent();
        Dog dog= (Dog) intent.getSerializableExtra(Keys.DOG);

        textType.setText(dog.toString());

    }


}
