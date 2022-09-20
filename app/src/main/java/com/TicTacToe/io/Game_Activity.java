package com.TicTacToe.io;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class Game_Activity extends AppCompatActivity implements View.OnClickListener {
    private boolean game_win_check=false;
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.image1:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    setupPlayer1(img1);
                }
                else if(!Utils.getInstance().getTurn()){
                    setupPlayer2(img1);
                }
                break;
            case R.id.image2:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    setupPlayer1(img2);
                }
                else if(!Utils.getInstance().getTurn()){
                    setupPlayer2(img2);
                }
                break;
            case R.id.image3:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    setupPlayer1(img3);
                }
                else if(!Utils.getInstance().getTurn()){
                    setupPlayer2(img3);
                }
                break;
            case R.id.image4:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    setupPlayer1(img4);
                }
                else if(!Utils.getInstance().getTurn()){
                    setupPlayer2(img4);
                }
                break;
            case R.id.image5:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    setupPlayer1(img5);
                }
                else if(!Utils.getInstance().getTurn()){
                    setupPlayer2(img5);
                }
                break;
            case R.id.image6:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    setupPlayer1(img6);
                }
                else if(!Utils.getInstance().getTurn()){
                    setupPlayer2(img6);
                }
                break;
            case R.id.image7:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    setupPlayer1(img7);
                }
                else if(!Utils.getInstance().getTurn()){
                    setupPlayer2(img7);
                }
                break;
            case R.id.image8:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    setupPlayer1(img8);
                }
                else if(!Utils.getInstance().getTurn()){
                    setupPlayer2(img8);
                }
                break;
            case R.id.image9:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    setupPlayer1(img9);
                }
                else if(!Utils.getInstance().getTurn()){
                    setupPlayer2(img9);
                }
                break;
            default:break;
        }
    }

    private int iterationCounter(int iterationCounter) {
        return ++iterationCounter;
    }

    private TextView textPlayer1,textPlayer2,textCurrentPlayer,textScore,textPlayer1Score,textPlayer2Score;
    private LottieAnimationView img1,img2,img3,img4,img5,img6,img7,img8,img9,arrowRow1,arrowRow2,arrowRow3,arrowColumn1,arrowColumn2,arrowColumn3,arrowDiagonal1,arrowDiagonal2;
    private LottieAnimationView alertLottie,player_cross,player_tick,imageCurrentLottie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        initData();
        textPlayer1.setText(Utils.getInstance().getPerson1());
        textPlayer2.setText(Utils.getInstance().getPerson2());
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                player_cross.playAnimation();
                player_tick.playAnimation();
            }
        },1000);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);
        textPlayer1Score.setText(""+Utils.getInstance().getPlayer1());
        textPlayer2Score.setText(""+Utils.getInstance().getPlayer2());
        if(Utils.getInstance().getTurn()){
            textCurrentPlayer.setText(Utils.getInstance().getPerson1()+"'s turn");
            imageCurrentLottie.setAnimation(R.raw.cross);
            imageCurrentLottie.playAnimation();
            imageCurrentLottie.setSpeed(1.5f);
        }
        else if(!Utils.getInstance().getTurn()){
            textCurrentPlayer.setText(Utils.getInstance().getPerson2()+"'s turn");
            imageCurrentLottie.setAnimation(R.raw.tick);
            imageCurrentLottie.playAnimation();
            imageCurrentLottie.setSpeed(1.5f);
        }
    }
    private void check_condition(String player_won){
       if(img1.getId()==img2.getId()&&img2.getId()==img3.getId()){
           disableButtons();
           arrowRow1.setVisibility(View.VISIBLE);
           arrowRow1.setAnimation(R.raw.path_anim);
           arrowRow1.playAnimation();
           applyGameOverRule(player_won);
       }
       else if(img4.getId()==img5.getId()&&img5.getId()==img6.getId()){
           disableButtons();
            arrowRow2.setVisibility(View.VISIBLE);
            arrowRow2.setAnimation(R.raw.path_anim);
            arrowRow2.playAnimation();
            applyGameOverRule(player_won);
        }
       else if(img7.getId()==img8.getId()&&img8.getId()==img9.getId()){
           disableButtons();
        arrowRow3.setVisibility(View.VISIBLE);
        arrowRow3.setAnimation(R.raw.path_anim);
        arrowRow3.playAnimation();
           applyGameOverRule(player_won);
        }
       if(img1.getId()==img4.getId()&&img4.getId()==img7.getId()){
           disableButtons();
        arrowColumn1.setVisibility(View.VISIBLE);
        arrowColumn1.setAnimation(R.raw.path_anim);
        arrowColumn1.playAnimation();
           applyGameOverRule(player_won);
       }
       else if(img2.getId()==img5.getId()&&img5.getId()==img8.getId()){
           disableButtons();
        arrowColumn2.setVisibility(View.VISIBLE);
        arrowColumn2.setAnimation(R.raw.path_anim);
        arrowColumn2.playAnimation();
           applyGameOverRule(player_won);
        }
       else if(img3.getId()==img6.getId()&&img6.getId()==img9.getId()){
           disableButtons();
        arrowColumn3.setVisibility(View.VISIBLE);
        arrowColumn3.setAnimation(R.raw.path_anim);
        arrowColumn3.playAnimation();
           applyGameOverRule(player_won);
        }
       else if(img1.getId()==img5.getId()&&img5.getId()==img9.getId()){
           disableButtons();
           arrowDiagonal1.setVisibility(View.VISIBLE);
           arrowDiagonal1.setAnimation(R.raw.path_anim_long);
           arrowDiagonal1.playAnimation();
           applyGameOverRule(player_won);
        }
       else if(img3.getId()==img5.getId()&&img5.getId()==img7.getId()){
           disableButtons();
           arrowDiagonal2.setVisibility(View.VISIBLE);
           arrowDiagonal2.setAnimation(R.raw.path_anim_long);
           arrowDiagonal2.playAnimation();
           applyGameOverRule(player_won);
        }
       else if(Utils.getInstance().getIterationCounter()==9&&!game_win_check){
           AlertDialog.Builder builder = new AlertDialog.Builder(Game_Activity.this);
           builder.setCancelable(false);
           builder.setTitle("Game Over");
           builder.setMessage("No possible move. Game Draw.");
           builder.setPositiveButton("Re-match", new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialogInterface, int i) {
                   Intent intent =new Intent(Game_Activity.this,Game_Activity.class);
                   intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    Utils.getInstance().setIterationCounter(0);
                    finish();
                   startActivity(intent);
               }
           });
           builder.setPositiveButton("Go Back", new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialogInterface, int i) {
                   Intent intent = new Intent(Game_Activity.this,MainActivity.class);
                   intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
                   Utils.getInstance().setPlayer1(0);
                   Utils.getInstance().setPlayer2(0);
                   Utils.getInstance().setIterationCounter(0);
                   startActivity(intent);
               }
           });
           builder.show();
       }
    }

    private void disableButtons() {
        game_win_check=true;
        img1.setEnabled(false);
        img2.setEnabled(false);
        img3.setEnabled(false);
        img4.setEnabled(false);
        img5.setEnabled(false);
        img6.setEnabled(false);
        img7.setEnabled(false);
        img8.setEnabled(false);
        img9.setEnabled(false);
    }

    private void applyGameOverRule(String player_won) {
        alertLottie.setVisibility(View.VISIBLE);
        final Handler handler= new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run() {
                if(player_won.equals(Utils.getInstance().getPerson1())){
                    int increment=Utils.getInstance().getPlayer1();
                    increment++;
                    Utils.getInstance().setPlayer1(increment);
                }else{
                    int increment=Utils.getInstance().getPlayer2();
                    increment++;
                    Utils.getInstance().setPlayer2(increment);
                }
                AlertDialog.Builder builder= new AlertDialog.Builder(Game_Activity.this);
                builder.setTitle("Winner");
                builder.setMessage(player_won);
                builder.setCancelable(false);
                builder.setNegativeButton("Re-match", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent= new Intent(Game_Activity.this,Game_Activity.class);
                        Utils.getInstance().setIterationCounter(0);
                        finish();
                        startActivity(intent);
                    }
                });
                builder.setPositiveButton("Go Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Game_Activity.this,MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        Utils.getInstance().setPlayer1(0);
                        Utils.getInstance().setPlayer2(0);
                        Utils.getInstance().setIterationCounter(0);
                        startActivity(intent);
                    }
                });
                builder.show();
            }
        },3000);
    }
    private void setupPlayer1(LottieAnimationView desiredLottie) {
        textCurrentPlayer.setText(Utils.getInstance().getPerson1()+"'s turn");
        desiredLottie.setAnimation(R.raw.tick);
        desiredLottie.playAnimation();
        desiredLottie.setSpeed(1.5f);
        desiredLottie.setId(R.id.textCheckInput);
        imageCurrentLottie.setAnimation(R.raw.cross);
        imageCurrentLottie.playAnimation();
        imageCurrentLottie.setSpeed(1.5f);
        check_condition(Utils.getInstance().getPerson2());
    }
    private void setupPlayer2(LottieAnimationView desiredLottie){
        textCurrentPlayer.setText(Utils.getInstance().getPerson2()+"'s turn");
        desiredLottie.setAnimation(R.raw.cross);
        desiredLottie.playAnimation();
        desiredLottie.setSpeed(1.5f);
        desiredLottie.setId(R.id.textCheckInput2);
        imageCurrentLottie.setAnimation(R.raw.tick);
        imageCurrentLottie.playAnimation();
        imageCurrentLottie.setSpeed(1.5f);
        check_condition(Utils.getInstance().getPerson1());
    }
    @Override
    public void onBackPressed() {
       Utils.getInstance().setPlayer1(0);
       Utils.getInstance().setPlayer2(0);
        Utils.getInstance().setIterationCounter(0);
        super.onBackPressed();
    }

    private void initData() {
        textPlayer1=findViewById(R.id.textPlayer1);
        textPlayer2=findViewById(R.id.textPlayer2);
        img1=findViewById(R.id.image1);
        img2=findViewById(R.id.image2);
        img3=findViewById(R.id.image3);
        img4=findViewById(R.id.image4);
        img5=findViewById(R.id.image5);
        img6=findViewById(R.id.image6);
        img7=findViewById(R.id.image7);
        img8=findViewById(R.id.image8);
        img9=findViewById(R.id.image9);
        textPlayer1Score=findViewById(R.id.textPlayer1Score);
        textPlayer2Score=findViewById(R.id.textPlayer2Score);
        textCurrentPlayer=findViewById(R.id.textCurrentPlayer);
        textScore=findViewById(R.id.textScore);
        alertLottie=findViewById(R.id.alertWinner);
        arrowRow1=findViewById(R.id.arrowRow1);
        arrowRow2=findViewById(R.id.arrowRow2);
        arrowRow3=findViewById(R.id.arrowRow3);
        arrowColumn1=findViewById(R.id.arrowColumn1);
        arrowColumn2=findViewById(R.id.arrowColumn2);
        arrowColumn3=findViewById(R.id.arrowColumn3);
        arrowDiagonal1=findViewById(R.id.arrowDiagonal1);
        arrowDiagonal2=findViewById(R.id.arrowDiagonal2);
        player_cross=findViewById(R.id.imageCross);
        player_tick=findViewById(R.id.imageCircle);
        imageCurrentLottie=findViewById(R.id.imageCurrentLottie);
    }
}