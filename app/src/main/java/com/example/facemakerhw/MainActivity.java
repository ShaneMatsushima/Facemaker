/**
 * @author Shane Matsushima
 */

package com.example.facemakerhw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;

import static com.example.facemakerhw.R.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        FaceView  newFaceView = findViewById(id.faceView);
        FaceController newFaceController = new FaceController(newFaceView);

        /**
         * External Citation
         * Date: 9/9/2020
         * Problem: Did not know how to add items into a spinner display
         * Resource: https://stackoverflow.com/questions/5241660/how-to-add-items-to-a-spinner-in-android
         * Solution: I used the sample code to guide the construction and addition of items into a spinner
         */
        Spinner hairStyleSpinner = (Spinner) findViewById(id.spinnerHairChoice);
        String[]  hairStyle = new String[] {"Curly", "Straight", "Wild"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, hairStyle);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hairStyleSpinner.setAdapter(adapter);
        hairStyleSpinner.setOnItemSelectedListener(newFaceController);


        Button randomButton = findViewById(id.randomButton);
        randomButton.setOnClickListener(newFaceController);

        RadioGroup radioGroup = (RadioGroup)findViewById(id.radioButtonGroup);
        radioGroup.setOnCheckedChangeListener(newFaceController);

        SeekBar redBar = findViewById((id.redSeekBar));
        redBar.setOnSeekBarChangeListener(newFaceController);
        redBar.setProgress(newFaceView.face.redCurrent);
        redBar.refreshDrawableState();

        SeekBar blueBar = findViewById(id.blueSeekBar);
        blueBar.setOnSeekBarChangeListener(newFaceController);
        blueBar.setProgress(newFaceView.face.blueCurrent);
        blueBar.refreshDrawableState();

        SeekBar greenBar = findViewById(id.greenSeekBar);
        greenBar.setOnSeekBarChangeListener(newFaceController);
        greenBar.setProgress(newFaceView.face.greenCurrent);
        greenBar.refreshDrawableState();





    }
}