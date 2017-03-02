package com.elysewarren.inclassassignment05_ew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText dogType;
    private EditText dogAge;
    private EditText contactInfo;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dogType = (EditText) findViewById(R.id.dog_type);
        dogAge = (EditText) findViewById(R.id.dog_age);
        contactInfo = (EditText) findViewById(R.id.contact_text);
        checkBox = (CheckBox) findViewById(R.id.allergy_type);

    }

    public void submitActivity(View view) {

        String dType = dogType.getText().toString();
        String dAgeStr=dogAge.getText().toString();
        String contactStr=contactInfo.getText().toString();
        boolean allergies=checkBox.isChecked();
        int dAge=Integer.parseInt(dAgeStr);
        Dog d = new Dog(dType, dAge, contactStr,allergies);

        Intent intent = new Intent(this, Main2Activity.class);

        intent.putExtra(Keys.DOG,d);


        startActivity(intent);
    }
}
