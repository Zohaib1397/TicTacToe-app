package com.TicTacToe.io;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;

import android.app.ActionBar;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private Dialog dialog;
    private EditText edtTextPlayer1,edtTextPlayer2;
    private TextView errorPlayer1,errorPlayer2;
    private Button btnPlay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtTextPlayer1.getText().toString().isEmpty()){
                    errorPlayer1.setVisibility(View.VISIBLE);
                }
                if(edtTextPlayer2.getText().toString().isEmpty()){
                    errorPlayer2.setVisibility(View.VISIBLE);
                }
                if(!edtTextPlayer1.getText().toString().isEmpty()&&!edtTextPlayer2.getText().toString().isEmpty()){
                    errorPlayer1.setVisibility(View.GONE);
                    errorPlayer2.setVisibility(View.GONE);
                    Utils.getInstance().setPerson1(edtTextPlayer1.getText().toString());
                    Utils.getInstance().setPerson2(edtTextPlayer2.getText().toString());
                    Intent intent = new Intent(MainActivity.this,Board_Selection_Activity.class);
                    Pair<View,String> pair1 = Pair.create(findViewById(R.id.btnPlay),"toCardView");
                    ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,pair1);
                    startActivity(intent,optionsCompat.toBundle());

                }
            }
        });
    }

    private void initData(){
        edtTextPlayer1=findViewById(R.id.editTextPerson1);
        edtTextPlayer2=findViewById(R.id.editTextPerson2);
        btnPlay=findViewById(R.id.btnPlay);
        errorPlayer1=findViewById(R.id.textErrorPlayer1);
        errorPlayer2=findViewById(R.id.textErrorPlayer2);
    }
}