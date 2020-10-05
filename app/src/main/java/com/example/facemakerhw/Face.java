/**
 * @author Shane Matsushima
 */

package com.example.facemakerhw;

import android.graphics.Color;

import java.util.Random;

public class Face {
    private int skinColor;
    private int eyeColor;
    private int hairColor;
    private int hairStyle;

    public int blueHair;
    public int redHair;
    public int greenHair;

    public int blueEye;
    public int redEye;
    public int greenEye;

    public int blueSkin;
    public int redSkin;
    public int greenSkin;

    public int blueCurrent;
    public int redCurrent;
    public int greenCurrent;

    public boolean isRandom = false;

    public Face(){
        randomize();
    }

    public void randomize() {
        /**
         * External Citation
         * Date: 9/9/2020
         * Problem: Did not know how to randomize numbers
         * Resource: https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
         * Solution: I used the sample code to guide the construction of generating random numbers
         */
        Random rand = new Random();
        int upperBound = 255;

        //generates values from 0 - 254
        skinColor = Color.rgb(redSkin = rand.nextInt(upperBound), greenSkin = rand.nextInt(upperBound), blueSkin = rand.nextInt(upperBound));
        eyeColor = Color.rgb( redEye = rand.nextInt(upperBound), greenEye = rand.nextInt(upperBound), blueEye = rand.nextInt(upperBound));
        hairColor = Color.rgb(redHair = rand.nextInt(upperBound), greenHair = rand.nextInt(upperBound), blueHair = rand.nextInt(upperBound));
        hairStyle = rand.nextInt(3); //not a color, only has 3 choices (0 - 2)


    }

    public int getSkinColor(){ return skinColor; }
    public int getHairColor(){ return hairColor; }
    public int getEyeColor(){ return eyeColor; }
    public int getHairStyle(){ return hairStyle;}




}
