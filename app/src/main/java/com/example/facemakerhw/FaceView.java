package com.example.facemakerhw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class FaceView extends SurfaceView {

    public Face face = new Face();

    private float viewWidth;
    private float viewHeight;

    public int hairStyle;

    Paint facePaint = new Paint();
    Paint eyePaint = new Paint();
    Paint hairPaint = new Paint();
    Paint outerEyePaint = new Paint();


    /**
     * Constructor that was inherited from SurfaceView class
     */

    public FaceView(Context context, AttributeSet attrs) {
        super(context, attrs);

        setWillNotDraw(false);

        face.isRandom = true;

        setBackgroundColor(Color.WHITE);
        outerEyePaint.setColor(Color.WHITE);

    }



    @Override
    public void onDraw(Canvas canvas){

        viewHeight = this.getHeight();
        viewWidth = this.getWidth();


        if(face.isRandom){
            drawRandom(canvas);
            face.isRandom = false;
        } else {
            drawFace(canvas);
        }

    }

    public void drawRandom(Canvas canvas) {
        facePaint.setColor(face.getSkinColor());
        facePaint.setStyle(Paint.Style.FILL);

        canvas.drawCircle(viewWidth/2, viewHeight/2, 200, facePaint);

        eyePaint.setColor(face.getEyeColor());
        eyePaint.setStyle(Paint.Style.FILL);

        canvas.drawCircle((viewWidth/2)-75,(viewHeight/2)-75,50, outerEyePaint);
        canvas.drawCircle((viewWidth/2)+75,(viewHeight/2)-75,50, outerEyePaint);

        canvas.drawCircle((viewWidth/2)-75,(viewHeight/2)-75,25, eyePaint);
        canvas.drawCircle((viewWidth/2)+75,(viewHeight/2)-75,25, eyePaint);

        hairPaint.setColor(face.getHairColor());
        hairPaint.setStyle(Paint.Style.FILL);

        drawHair(canvas, face.getHairStyle(), hairPaint);


    }

    public void drawFace(Canvas canvas){
        facePaint.setColor(Color.rgb(face.redSkin, face.greenSkin, face.blueSkin));
        facePaint.setStyle(Paint.Style.FILL);

        canvas.drawCircle(viewWidth/2, viewHeight/2, 200, facePaint);

        eyePaint.setColor(Color.rgb(face.redEye,face.greenEye, face.blueEye));
        eyePaint.setStyle(Paint.Style.FILL);

        canvas.drawCircle((viewWidth/2)-75,(viewHeight/2)-75,50, outerEyePaint);
        canvas.drawCircle((viewWidth/2)+75,(viewHeight/2)-75,50, outerEyePaint);

        canvas.drawCircle((viewWidth/2)-75,(viewHeight/2)-75,25, eyePaint);
        canvas.drawCircle((viewWidth/2)+75,(viewHeight/2)-75,25, eyePaint);

        hairPaint.setColor(Color.rgb(face.redHair, face.greenHair, face.blueHair));
        hairPaint.setStyle(Paint.Style.FILL);

        drawHair(canvas, hairStyle, hairPaint);
    }

    @SuppressLint("NewApi")
    public void drawHair(Canvas canvas, int hairStyle, Paint paint){
        switch (hairStyle){
            case 0: //curly
                int hair = 125;
                for(int i = 0; i < 9; i++) {
                    canvas.drawCircle((viewWidth / 2) - (125 - 30*i), (viewHeight / 2) - 180, 35, paint);
                }
                break;
            case 1: //straight
                canvas.drawOval((viewWidth/2)-75,(viewHeight/2)-200,(viewWidth/2)+75,(viewHeight/2)-175,paint);
                canvas.drawRect((viewWidth/2)-75,(viewHeight/2)-190,(viewWidth/2)+75,(viewHeight/2)-145, paint);
                break;
            case 2: //wild
                for(int i = 0; i < 30; i++) {
                    canvas.drawLine((viewWidth / 2) - (75 - 5*i), (viewHeight / 2) - 150, viewWidth / 2, (viewHeight / 2) - 250, hairPaint);
                }
                break;
        }

    }

    public Face getFaceModel(){return this.face;}


}
