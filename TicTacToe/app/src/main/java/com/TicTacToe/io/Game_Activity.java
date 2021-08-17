package com.TicTacToe.io;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

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
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                btn1.setVisibility(View.GONE);
                img1.setVisibility(View.VISIBLE);
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    textCurrentPlayer.setText(Utils.getInstance().getPerson1()+"'s turn");
//                    img1.setImageDrawable(getResources().getDrawable(R.drawable.ic_circle));
                    img1.setAnimation(R.raw.tick);
                    img1.playAnimation();
                    img1.setSpeed(1.5f);
                    btn1.setText("1");
                    check_condition(Utils.getInstance().getPerson2());
                }
                else if(!Utils.getInstance().getTurn()){
                    textCurrentPlayer.setText(Utils.getInstance().getPerson2()+"'s turn");
//                    img1.setImageDrawable(getResources().getDrawable(R.drawable.ic_cross));
                    img1.setAnimation(R.raw.cross);
                    img1.playAnimation();
                    img1.setSpeed(1.5f);
                    btn1.setText("0");
                    check_condition(Utils.getInstance().getPerson1());
                }
                break;
            case R.id.button2:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                btn2.setVisibility(View.GONE);
                img2.setVisibility(View.VISIBLE);
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    textCurrentPlayer.setText(Utils.getInstance().getPerson1()+"'s turn");
//                    img2.setImageDrawable(getResources().getDrawable(R.drawable.ic_circle));
                    img2.setAnimation(R.raw.tick);
                    img2.playAnimation();
                    img2.setSpeed(1.5f);
                    btn2.setText("1");
                    check_condition(Utils.getInstance().getPerson2());
                }
                else if(!Utils.getInstance().getTurn()){
                    textCurrentPlayer.setText(Utils.getInstance().getPerson2()+"'s turn");
//                    img2.setImageDrawable(getResources().getDrawable(R.drawable.ic_cross));
                    img2.setAnimation(R.raw.cross);
                    img2.playAnimation();
                    img2.setSpeed(1.5f);
                    btn2.setText("0");
                    check_condition(Utils.getInstance().getPerson1());
                }
                break;
            case R.id.button3:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                btn3.setVisibility(View.GONE);
                img3.setVisibility(View.VISIBLE);
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    textCurrentPlayer.setText(Utils.getInstance().getPerson1()+"'s turn");
//                    img3.setImageDrawable(getResources().getDrawable(R.drawable.ic_circle));
                    img3.setAnimation(R.raw.tick);
                    img3.playAnimation();
                    img3.setSpeed(1.5f);
                    btn3.setText("1");
                    check_condition(Utils.getInstance().getPerson2());
                }
                else if(!Utils.getInstance().getTurn()){
                    textCurrentPlayer.setText(Utils.getInstance().getPerson2()+"'s turn");
//                    img3.setImageDrawable(getResources().getDrawable(R.drawable.ic_cross));
                    img3.setAnimation(R.raw.cross);
                    img3.playAnimation();
                    img3.setSpeed(1.5f);
                    btn3.setText("0");
                    check_condition(Utils.getInstance().getPerson1());
                }
                break;
            case R.id.button4:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                btn4.setVisibility(View.GONE);
                img4.setVisibility(View.VISIBLE);
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    textCurrentPlayer.setText(Utils.getInstance().getPerson1()+"'s turn");
//                    img4.setImageDrawable(getResources().getDrawable(R.drawable.ic_circle));
                    img4.setAnimation(R.raw.tick);
                    img4.playAnimation();
                    img4.setSpeed(1.5f);
                    btn4.setText("1");
                    check_condition(Utils.getInstance().getPerson2());
                }
                else if(!Utils.getInstance().getTurn()){
                    textCurrentPlayer.setText(Utils.getInstance().getPerson2()+"'s turn");
//                    img4.setImageDrawable(getResources().getDrawable(R.drawable.ic_cross));
                    img4.setAnimation(R.raw.cross);
                    img4.playAnimation();
                    img4.setSpeed(1.5f);
                    btn4.setText("0");
                    check_condition(Utils.getInstance().getPerson1());
                }
                break;
            case R.id.button5:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                btn5.setVisibility(View.GONE);
                img5.setVisibility(View.VISIBLE);
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    textCurrentPlayer.setText(Utils.getInstance().getPerson1()+"'s turn");
//                    img5.setImageDrawable(getResources().getDrawable(R.drawable.ic_circle));
                    img5.setAnimation(R.raw.tick);
                    img5.playAnimation();
                    img5.setSpeed(1.5f);
                    btn5.setText("1");
                    check_condition(Utils.getInstance().getPerson2());
                }
                else if(!Utils.getInstance().getTurn()){
                    textCurrentPlayer.setText(Utils.getInstance().getPerson2()+"'s turn");
//                    img5.setImageDrawable(getResources().getDrawable(R.drawable.ic_cross));
                    img5.setAnimation(R.raw.cross);
                    img5.playAnimation();
                    img5.setSpeed(1.5f);
                    btn5.setText("0");
                    check_condition(Utils.getInstance().getPerson1());
                }
                break;
            case R.id.button6:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                btn6.setVisibility(View.GONE);
                img6.setVisibility(View.VISIBLE);
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    textCurrentPlayer.setText(Utils.getInstance().getPerson1()+"'s turn");
//                    img6.setImageDrawable(getResources().getDrawable(R.drawable.ic_circle));
                    img6.setAnimation(R.raw.tick);
                    img6.playAnimation();
                    img6.setSpeed(1.5f);
                    btn6.setText("1");
                    check_condition(Utils.getInstance().getPerson2());
                }
                else if(!Utils.getInstance().getTurn()){
                    textCurrentPlayer.setText(Utils.getInstance().getPerson2()+"'s turn");
//                    img6.setImageDrawable(getResources().getDrawable(R.drawable.ic_cross));
                    img6.setAnimation(R.raw.cross);
                    img6.playAnimation();
                    img6.setSpeed(1.5f);
                    btn6.setText("0");
                    check_condition(Utils.getInstance().getPerson1());
                }
                break;
            case R.id.button7:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                btn7.setVisibility(View.GONE);
                img7.setVisibility(View.VISIBLE);
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    textCurrentPlayer.setText(Utils.getInstance().getPerson1()+"'s turn");
//                    img7.setImageDrawable(getResources().getDrawable(R.drawable.ic_circle));
                    img7.setAnimation(R.raw.tick);
                    img7.playAnimation();
                    img7.setSpeed(1.5f);
                    btn7.setText("1");
                    check_condition(Utils.getInstance().getPerson2());
                }
                else if(!Utils.getInstance().getTurn()){
                    textCurrentPlayer.setText(Utils.getInstance().getPerson2()+"'s turn");
//                    img7.setImageDrawable(getResources().getDrawable(R.drawable.ic_cross));
                    img7.setAnimation(R.raw.cross);
                    img7.playAnimation();
                    img7.setSpeed(1.5f);
                    btn7.setText("0");
                    check_condition(Utils.getInstance().getPerson1());
                }
                break;
            case R.id.button8:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                btn8.setVisibility(View.GONE);
                img8.setVisibility(View.VISIBLE);
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    textCurrentPlayer.setText(Utils.getInstance().getPerson1()+"'s turn");
//                    img8.setImageDrawable(getResources().getDrawable(R.drawable.ic_circle));
                    img8.setAnimation(R.raw.tick);
                    img8.playAnimation();
                    img8.setSpeed(1.5f);
                    btn8.setText("1");
                    check_condition(Utils.getInstance().getPerson2());
                }
                else if(!Utils.getInstance().getTurn()){
                    textCurrentPlayer.setText(Utils.getInstance().getPerson2()+"'s turn");
//                    img8.setImageDrawable(getResources().getDrawable(R.drawable.ic_cross));
                    img8.setAnimation(R.raw.cross);
                    img8.playAnimation();
                    img8.setSpeed(1.5f);
                    btn8.setText("0");
                    check_condition(Utils.getInstance().getPerson1());
                }
                break;
            case R.id.button9:
                Utils.getInstance().setIterationCounter(iterationCounter(Utils.getInstance().getIterationCounter()));
                btn9.setVisibility(View.GONE);
                img9.setVisibility(View.VISIBLE);
                Utils.getInstance().setTurn(!Utils.getInstance().getTurn());
                if(Utils.getInstance().getTurn()){
                    textCurrentPlayer.setText(Utils.getInstance().getPerson1()+"'s turn");
//                    img9.setImageDrawable(getResources().getDrawable(R.drawable.ic_circle));
                    img9.setAnimation(R.raw.tick);
                    img9.playAnimation();
                    img9.setSpeed(1.5f);
                    btn9.setText("1");
                    check_condition(Utils.getInstance().getPerson2());
                }
                else if(!Utils.getInstance().getTurn()){
                    textCurrentPlayer.setText(Utils.getInstance().getPerson2()+"'s turn");
//                    img9.setImageDrawable(getResources().getDrawable(R.drawable.ic_cross));
                    img9.setAnimation(R.raw.cross);
                    img9.playAnimation();
                    img9.setSpeed(1.5f);
                    btn9.setText("0");
                    check_condition(Utils.getInstance().getPerson1());
                }
                break;
            default:break;
        }
    }

    private int iterationCounter(int iterationCounter) {
        return ++iterationCounter;
    }

    private TextView textPlayer1,textPlayer2,textCurrentPlayer,textScore,textPlayer1Score,textPlayer2Score;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private LottieAnimationView img1,img2,img3,img4,img5,img6,img7,img8,img9,arrowRow1,arrowRow2,arrowRow3,arrowColumn1,arrowColumn2,arrowColumn3,arrowDiagonal1,arrowDiagonal2;
    private LottieAnimationView alertLottie,player_cross,player_tick;
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
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        textPlayer1Score.setText(""+Utils.getInstance().getPlayer1());
        textPlayer2Score.setText(""+Utils.getInstance().getPlayer2());
        if(Utils.getInstance().getTurn()){
            textCurrentPlayer.setText(Utils.getInstance().getPerson1()+"'s turn");
        }
        else if(!Utils.getInstance().getTurn()){
            textCurrentPlayer.setText(Utils.getInstance().getPerson2()+"'s turn");
        }
    }
    private void check_condition(String player_won){
       if(btn1.getText().toString().equals(btn2.getText().toString())&&btn2.getText().toString().equals(btn3.getText().toString())){
           disableButtons();
           arrowRow1.setVisibility(View.VISIBLE);
           arrowRow1.setAnimation(R.raw.path_anim);
           arrowRow1.playAnimation();
           applyGameOverRule(player_won);
       }
       if(btn4.getText().toString().equals(btn5.getText().toString())&&btn5.getText().toString().equals(btn6.getText().toString())){
            arrowRow2.setVisibility(View.VISIBLE);
            arrowRow2.setAnimation(R.raw.path_anim);
            arrowRow2.playAnimation();
            applyGameOverRule(player_won);
        }
       if(btn7.getText().toString().equals(btn8.getText().toString())&&btn8.getText().toString().equals(btn9.getText().toString())){
        arrowRow3.setVisibility(View.VISIBLE);
        arrowRow3.setAnimation(R.raw.path_anim);
        arrowRow3.playAnimation();
           applyGameOverRule(player_won);
        }
       if(btn1.getText().toString().equals(btn4.getText().toString())&&btn4.getText().toString().equals(btn7.getText().toString())){
        arrowColumn1.setVisibility(View.VISIBLE);
        arrowColumn1.setAnimation(R.raw.path_anim);
        arrowColumn1.playAnimation();
           applyGameOverRule(player_won);
       }
       if(btn2.getText().toString().equals(btn5.getText().toString())&&btn5.getText().toString().equals(btn8.getText().toString())){
        arrowColumn2.setVisibility(View.VISIBLE);
        arrowColumn2.setAnimation(R.raw.path_anim);
        arrowColumn2.playAnimation();
           applyGameOverRule(player_won);
        }
       if(btn3.getText().toString().equals(btn6.getText().toString())&&btn6.getText().toString().equals(btn9.getText().toString())){
        arrowColumn3.setVisibility(View.VISIBLE);
        arrowColumn3.setAnimation(R.raw.path_anim);
        arrowColumn3.playAnimation();
           applyGameOverRule(player_won);
        }
       if(btn1.getText().toString().equals(btn5.getText().toString())&&btn5.getText().toString().equals(btn9.getText().toString())){
           arrowDiagonal1.setVisibility(View.VISIBLE);
           arrowDiagonal1.setAnimation(R.raw.path_anim_long);
           arrowDiagonal1.playAnimation();
           applyGameOverRule(player_won);
        }
       if(btn3.getText().toString().equals(btn5.getText().toString())&&btn5.getText().toString().equals(btn7.getText().toString())){
           arrowDiagonal2.setVisibility(View.VISIBLE);
           arrowDiagonal2.setAnimation(R.raw.path_anim_long);
           arrowDiagonal2.playAnimation();
           applyGameOverRule(player_won);
        }
       if(Utils.getInstance().getIterationCounter()==9){
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
           builder.show();
       }
    }

    private void disableButtons() {
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
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
        },3000);
    }

    @Override
    public void onBackPressed() {
        finish();
       Utils.getInstance().setPlayer1(0);
       Utils.getInstance().setPlayer2(0);
        Utils.getInstance().setIterationCounter(0);
        super.onBackPressed();
    }

    private void initData() {
        textPlayer1=findViewById(R.id.textPlayer1);
        textPlayer2=findViewById(R.id.textPlayer2);
        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        btn5=findViewById(R.id.button5);
        btn6=findViewById(R.id.button6);
        btn7=findViewById(R.id.button7);
        btn8=findViewById(R.id.button8);
        btn9=findViewById(R.id.button9);

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
    }
}