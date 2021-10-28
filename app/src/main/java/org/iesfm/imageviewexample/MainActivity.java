package org.iesfm.imageviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cambiarImagen(View v) {
        ImageView ivFrutas = (ImageView) findViewById(R.id.ivFrutas);

        switch (v.getId()){
            case R.id.btnNaranjas:
                ivFrutas.setImageResource(R.drawable.naranjas);
                break;
            case R.id.btnPlatanos:
                ivFrutas.setImageResource(R.drawable.platano);
                break;
            case R.id.btnAguacates:
                ivFrutas.setImageResource(R.drawable.aguacates);
                break;
        }
    }
}