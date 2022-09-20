package com.TicTacToe.io;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Board_Selection_Activity extends AppCompatActivity {
    private ImageView imageButtonCross;
    private Button btn3x3,btn4x4,btn5x5;
    private ImageView image3x3,image4x4,image5x5,image6x6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_selection);
        initData();
        imageButtonCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        image3x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                board3x3_move();
            }
        });
        btn3x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                board3x3_move();
            }
        });
        image4x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                board4x4_move();
            }
        });
        btn4x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                board4x4_move();
            }
        });
    }

    private void board4x4_move() {
        Pair<View,String>pair1=Pair.create(image4x4,"imageView4x4");
        Pair<View,String>pair2 = Pair.create(findViewById(R.id.textPlayer1Transition),"toPlayer1");
        Pair<View,String>pair3 = Pair.create(findViewById(R.id.textPlayer2Transition),"toPlayer2");
        Pair<View,String>pair4 = Pair.create(findViewById(R.id.textCurrentPlayerTransition),"toCurrentPlayer");
        startActivity(new Intent(Board_Selection_Activity.this,Game_Activity_4x4.class),ActivityOptionsCompat.makeSceneTransitionAnimation(Board_Selection_Activity.this,pair1,pair2,pair3,pair4).toBundle());
    }

    private void board3x3_move() {
        Intent intent = new Intent(Board_Selection_Activity.this,Game_Activity.class);
        Pair<View,String>pair1=Pair.create(image3x3,"imageView3x3");
        Pair<View,String>pair2 = Pair.create(findViewById(R.id.textPlayer1Transition),"toPlayer1");
        Pair<View,String>pair3 = Pair.create(findViewById(R.id.textPlayer2Transition),"toPlayer2");
        Pair<View,String>pair4 = Pair.create(findViewById(R.id.textCurrentPlayerTransition),"toCurrentPlayer");
        startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(Board_Selection_Activity.this,pair1,pair2,pair3,pair4).toBundle());
    }

    private void initData() {
        imageButtonCross=findViewById(R.id.imageButtonCross);
        image3x3=findViewById(R.id.image3x3);
        btn3x3=findViewById(R.id.btn3x3);
        btn4x4=findViewById(R.id.btn4x4);
        image4x4=findViewById(R.id.image4x4);
    }
}