/**
 * @author Shane Matsushima
 */

package com.example.facemakerhw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * External Citation
         * Date: 9/9/2020
         * Problem: Did not know how to add items into a spinner display
         * Resource: https://stackoverflow.com/questions/5241660/how-to-add-items-to-a-spinner-in-android
         * Solution: I used the sample code to guide the construction and addition of items into a spinner
         */
        Spinner hairStyleSpinner = (Spinner) findViewById(R.id.spinnerHairChoice);
        String[]  hairStyle = new String[] {"Curly", "Straight", "Wild"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, hairStyle);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hairStyleSpinner.setAdapter(adapter);


    }
}