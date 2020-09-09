/**
 * @author Shane Matsushima
 */

package com.example.facemakerhw;

import java.util.Random;

public class Face {
    private int skinColor;
    private int eyeColor;
    private int hairColor;
    private int hairStyle;

    public Face(){
        randomize();
    }

    private void randomize() {
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
        skinColor = rand.nextInt(upperBound);
        eyeColor = rand.nextInt(upperBound);
        hairColor = rand.nextInt(upperBound);
        hairStyle = rand.nextInt(4); //not a color, only has 3 choices

    }

}
