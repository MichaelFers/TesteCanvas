package com.michael.testecanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import java.util.Random;

public class Tela extends View {

    private Paint paint = new Paint();
    private Random  rnd = new Random();


    private Canvas canvas;

    public Tela(Context context){
        super(context);
    }
    @Override
    protected void onDraw(Canvas canvas){

        int wArea = 200;
        int hArea = 200;

        this.canvas = canvas;
        super.onDraw(canvas);

        //drawPoint(1000,500, paint);
        drawLine(550,150,100,100, paint);
        //drawRect(400,400,200,200, paint);
        drawCircle(300,300, 10, paint);
    }

    public void drawPoint(int px, int py, Paint paint){
        paint.setColor(Color.rgb(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256)));//Cor
        canvas.drawPoint(px,py, paint);
    }

    public void drawLine(int p1x, int p1y, int p2x, int p2y, Paint paint){
        paint.setColor(Color.rgb(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256)));//Cor
        canvas.drawLine(p1x,p1y,p2x,p2y, paint);
    }
    public void drawRect(int p1x, int p1y, int p2x, int p2y, Paint paint){
        paint.setColor(Color.rgb(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256)));//Cor
        canvas.drawRect(p1x,p1y,p2x,p2y, paint);
    }
    public void drawCircle(int p1x, int p1y, int raio, Paint paint){
        paint.setColor(Color.rgb(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256)));//Cor
        canvas.drawCircle(p1x,p1y,raio, paint);
    }
}
