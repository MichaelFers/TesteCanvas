package com.michael.testecanvas;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

public class App extends Activity {

    private Tela tela;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        tela = new Tela(this);
        setContentView(tela);
    }
}
