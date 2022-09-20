package com.TicTacToe.io;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Game_Activity_4x4 extends AppCompatActivity implements View.OnClickListener {
    private int iterationCounter(int iterationCounter) {
        return ++iterationCounter;
    }
    private boolean game_win_check=false;
    private TextView textPlayer1,textPlayer2,textCurrentPlayer,textScore,textPlayer1Score,textPlayer2Score;
    private LottieAnimationView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15,img16,arrowRow1,arrowRow2,arrowRow3,arrowRow4,arrowRow5,arrowRow6,arrowRow7,arrowRow8,arrowColumn1,arrowColumn2,arrowColumn3,arrowColumn4,arrowColumn5,arrowColumn6,arrowColumn7,arrowColumn8,arrowDiagonal1,arrowDiagonal2,arrowDiagonal3,arrowDiagonal4,arrowDiagonal5,arrowDiagonal6,arrowDiagonal7,arrowDiagonal8;
    private LottieAnimationView alertLottie,player_cross,player_tick,imageCurrentLottie;
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
            case R.id.image10:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    setupPlayer1(img10);
                }
                else if(!Utils.getInstance().getTurn()){
                    setupPlayer2(img10);
                }
                break;
            case R.id.image11:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    setupPlayer1(img11);
                }
                else if(!Utils.getInstance().getTurn()){
                    setupPlayer2(img11);
                }
                break;
            case R.id.image12:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    setupPlayer1(img12);
                }
                else if(!Utils.getInstance().getTurn()){
                    setupPlayer2(img12);
                }
                break;
            case R.id.image13:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    setupPlayer1(img13);
                }
                else if(!Utils.getInstance().getTurn()){
                    setupPlayer2(img13);
                }
                break;
            case R.id.image14:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    setupPlayer1(img14);
                }
                else if(!Utils.getInstance().getTurn()){
                    setupPlayer2(img14);
                }
                break;
            case R.id.image15:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    setupPlayer1(img15);
                }
                else if(!Utils.getInstance().getTurn()){
                    setupPlayer2(img15);
                }
                break;
            case R.id.image16:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    setupPlayer1(img16);
                }
                else if(!Utils.getInstance().getTurn()){
                    setupPlayer2(img16);
                }
                break;
            default:break;
        }
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_activity4x4);
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
        img10.setOnClickListener(this);
        img11.setOnClickListener(this);
        img12.setOnClickListener(this);
        img13.setOnClickListener(this);
        img14.setOnClickListener(this);
        img15.setOnClickListener(this);
        img16.setOnClickListener(this);
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
            arrowRow1.setAnimation(R.raw.path_anim);
            applyGameOverRule(player_won,arrowRow1);
        }
        else if(img4.getId()==img5.getId()&&img5.getId()==img6.getId()){
            arrowRow2.setAnimation(R.raw.path_anim);
            applyGameOverRule(player_won,arrowRow2);
        }
        else if(img7.getId()==img8.getId()&&img8.getId()==img9.getId()){
            arrowRow3.setAnimation(R.raw.path_anim);
            applyGameOverRule(player_won,arrowRow3);
        }
        else if(img1.getId()==img4.getId()&&img4.getId()==img7.getId()){
            arrowColumn1.setAnimation(R.raw.path_anim);
            applyGameOverRule(player_won,arrowColumn1);
        }
        else if(img2.getId()==img5.getId()&&img5.getId()==img8.getId()){
            arrowColumn2.setAnimation(R.raw.path_anim);
            applyGameOverRule(player_won,arrowColumn2);
        }
        else if(img3.getId()==img6.getId()&&img6.getId()==img9.getId()){
            arrowColumn3.setAnimation(R.raw.path_anim);
            applyGameOverRule(player_won,arrowColumn3);
        }
        else if(img4.getId()==img7.getId()&&img7.getId()==img13.getId()){
            arrowColumn4.setAnimation(R.raw.path_anim);
            applyGameOverRule(player_won,arrowColumn4);
        }
        else if(img5.getId()==img8.getId()&&img8.getId()==img14.getId()){
            arrowColumn5.setAnimation(R.raw.path_anim);
            applyGameOverRule(player_won,arrowColumn5);
        }
        else if(img6.getId()==img9.getId()&&img9.getId()==img15.getId()){
            arrowColumn6.setAnimation(R.raw.path_anim);
            applyGameOverRule(player_won,arrowColumn6);
        }
        else if(img10.getId()==img11.getId()&&img11.getId()==img12.getId()){
            arrowColumn7.setAnimation(R.raw.path_anim);
            applyGameOverRule(player_won,arrowColumn7);
        }
        else if(img11.getId()==img12.getId()&&img12.getId()==img16.getId()){
            arrowColumn8.setAnimation(R.raw.path_anim);
            applyGameOverRule(player_won,arrowColumn8);
        }
        else if(img1.getId()==img5.getId()&&img5.getId()==img9.getId()){
            arrowDiagonal1.setAnimation(R.raw.path_anim_long);
            applyGameOverRule(player_won,arrowDiagonal1);
        }
        else if(img3.getId()==img5.getId()&&img5.getId()==img7.getId()){
            arrowDiagonal2.setAnimation(R.raw.path_anim_long);
            applyGameOverRule(player_won,arrowDiagonal2);
        }
        else if(img2.getId()==img6.getId()&&img6.getId()==img12.getId()){
            arrowDiagonal3.setAnimation(R.raw.path_anim_long);
            applyGameOverRule(player_won,arrowDiagonal3);
        }
        else if(img10.getId()==img6.getId()&&img6.getId()==img8.getId()){
            arrowDiagonal4.setAnimation(R.raw.path_anim_long);
            applyGameOverRule(player_won,arrowDiagonal4);
        }
        else if(img4.getId()==img8.getId()&&img8.getId()==img15.getId()){
            arrowDiagonal5.setAnimation(R.raw.path_anim_long);
            applyGameOverRule(player_won,arrowDiagonal5);
        }
        else if(img6.getId()==img8.getId()&&img8.getId()==img13.getId()){
            arrowDiagonal6.setAnimation(R.raw.path_anim_long);
            applyGameOverRule(player_won,arrowDiagonal6);
        }
        else if(img5.getId()==img9.getId()&&img9.getId()==img16.getId()){
            arrowDiagonal7.setAnimation(R.raw.path_anim_long);
            applyGameOverRule(player_won,arrowDiagonal7);
        }
        else if(img11.getId()==img9.getId()&&img9.getId()==img14.getId()){
            arrowDiagonal8.setAnimation(R.raw.path_anim_long);
            applyGameOverRule(player_won,arrowDiagonal8);
        }
        else if(img2.getId()==img3.getId()&&img3.getId()==img10.getId()){
            arrowRow4.setAnimation(R.raw.path_anim);
            applyGameOverRule(player_won,arrowRow4);
        }
        else if(img5.getId()==img6.getId()&&img6.getId()==img11.getId()){
            arrowRow5.setAnimation(R.raw.path_anim);
            applyGameOverRule(player_won,arrowRow5);
        }
        else if(img8.getId()==img9.getId()&&img9.getId()==img12.getId()){
            arrowRow6.setAnimation(R.raw.path_anim);
            applyGameOverRule(player_won,arrowRow6);
        }
        else if(img13.getId()==img14.getId()&&img14.getId()==img15.getId()){
            arrowRow7.setAnimation(R.raw.path_anim);
            applyGameOverRule(player_won,arrowRow7);
        }
        else if(img14.getId()==img15.getId()&&img15.getId()==img16.getId()){
            arrowRow8.setAnimation(R.raw.path_anim);
            applyGameOverRule(player_won,arrowRow8);
        }
        else if(Utils.getInstance().getIterationCounter()==16&&!game_win_check){
            AlertDialog.Builder builder = new AlertDialog.Builder(Game_Activity_4x4.this);
            builder.setCancelable(false);
            builder.setTitle("Game Over");
            builder.setMessage("No possible move. Game Draw.");
            builder.setPositiveButton("Re-match", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent =new Intent(Game_Activity_4x4.this,Game_Activity_4x4.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    Utils.getInstance().setIterationCounter(0);
                    finish();
                    startActivity(intent);
                }
            });
            builder.setPositiveButton("Go Back", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent(Game_Activity_4x4.this,MainActivity.class);
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

    private void applyGameOverRule(String player_won,LottieAnimationView lottieImage) {
        disableButtons();
        lottieImage.setVisibility(View.VISIBLE);
        lottieImage.playAnimation();
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
                AlertDialog.Builder builder= new AlertDialog.Builder(Game_Activity_4x4.this);
                builder.setTitle("Winner");
                builder.setMessage(player_won);
                builder.setCancelable(false);
                builder.setNegativeButton("Re-match", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent= new Intent(Game_Activity_4x4.this,Game_Activity_4x4.class);
                        Utils.getInstance().setIterationCounter(0);
                        finish();
                        startActivity(intent);
                    }
                });
                builder.setPositiveButton("Go Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Game_Activity_4x4.this,MainActivity.class);
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
        img10=findViewById(R.id.image10);
        img11=findViewById(R.id.image11);
        img12=findViewById(R.id.image12);
        img13=findViewById(R.id.image13);
        img14=findViewById(R.id.image14);
        img15=findViewById(R.id.image15);
        img16=findViewById(R.id.image16);
        textPlayer1Score=findViewById(R.id.textPlayer1Score);
        textPlayer2Score=findViewById(R.id.textPlayer2Score);
        textCurrentPlayer=findViewById(R.id.textCurrentPlayer);
        textScore=findViewById(R.id.textScore);
        alertLottie=findViewById(R.id.alertWinner);
        arrowRow1=findViewById(R.id.arrowRow1);
        arrowRow2=findViewById(R.id.arrowRow2);
        arrowRow3=findViewById(R.id.arrowRow3);
        arrowRow4=findViewById(R.id.arrowRow4);
        arrowRow5=findViewById(R.id.arrowRow5);
        arrowRow6=findViewById(R.id.arrowRow6);
        arrowRow7=findViewById(R.id.arrowRow7);
        arrowRow8=findViewById(R.id.arrowRow8);
        arrowColumn1=findViewById(R.id.arrowColumn1);
        arrowColumn2=findViewById(R.id.arrowColumn2);
        arrowColumn3=findViewById(R.id.arrowColumn3);
        arrowColumn4=findViewById(R.id.arrowColumn4);
        arrowColumn5=findViewById(R.id.arrowColumn5);
        arrowColumn6=findViewById(R.id.arrowColumn6);
        arrowColumn7=findViewById(R.id.arrowColumn7);
        arrowColumn8=findViewById(R.id.arrowColumn8);
        arrowDiagonal1=findViewById(R.id.arrowDiagonal1);
        arrowDiagonal2=findViewById(R.id.arrowDiagonal2);
        arrowDiagonal3=findViewById(R.id.arrowDiagonal3);
        arrowDiagonal4=findViewById(R.id.arrowDiagonal4);
        arrowDiagonal5=findViewById(R.id.arrowDiagonal5);
        arrowDiagonal6=findViewById(R.id.arrowDiagonal6);
        arrowDiagonal7=findViewById(R.id.arrowDiagonal7);
        arrowDiagonal8=findViewById(R.id.arrowDiagonal8);
        player_cross=findViewById(R.id.imageCross);
        player_tick=findViewById(R.id.imageCircle);
        imageCurrentLottie=findViewById(R.id.imageCurrentLottie);
    }
}