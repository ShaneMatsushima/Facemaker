package com.example.facemakerhw;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class FaceView extends SurfaceView {

    private Face face = new Face();


    /**
     *
     * Constructors that were inherited from SurfaceView class
     */

    public FaceView(Context context, AttributeSet attrs) {
        super(context, attrs);

        setWillNotDraw(false);
    }


    @Override
    public void onDraw(Canvas canvas){
        if(face.isRandom){

            //draw random face

            //set false after so that when random is pressed again, face will randomize
            face.isRandom = false;
        }

    }

    public Face getFaceModel(){return this.face;}


}
