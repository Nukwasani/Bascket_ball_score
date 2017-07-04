package com.example.thandiwe.bascket_ball_score;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


            Button btn_increment;
            TextView tv_score, tvDec, tvteam1, tvteam2 ;
            EditText etSave, etSave2;

            // private boolean num = false;
            int number = 0;


            int score = 0;
            int score2 =0;


            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);


                btn_increment =(Button)findViewById(R.id.btn_score);

                tv_score =(TextView)findViewById(R.id.tv_score);

                tvteam1 =(TextView)findViewById(R.id.tv_pirates);

                tvteam2=(TextView)findViewById(R.id.tvChifs);

                tvDec =(TextView)findViewById(R.id.tv_dec);

        etSave =(EditText)findViewById(R.id.et_name);

        etSave2 =(EditText)findViewById(R.id.et_name2);

    }



    public void score_decremet(View v){



        if(score < 1)
        {
            Toast.makeText(getApplicationContext(),"YOUR SCORE CAN NOT BE LESS THAN 0 ",Toast.LENGTH_LONG).show();
        }

     else
        {
            score = score - 1;
            tvDec.setText("" + score);

        }


    }


    public void increment_score(View view) {

        score = ++score;

        tvDec.setText("" + score);


    }

    public void increment_score2(View view) {

        score2 = ++score2;

        tv_score.setText("" + score2);


    }

    public void score_decremet2(View v){




        if(score2 < 1)
        {
            Toast.makeText(getApplicationContext(),"YOUR SCORE CAN NOT BE LESS THAN 0 ",Toast.LENGTH_LONG).show();
        }

        else
        {
            score2 = score2 - 1;
            tv_score.setText("" + score2);


        }


    }

    public void btn_save(View v)

    {





        String team1 = etSave.getText().toString();
        String team2=  etSave2.getText().toString();



        tvteam1.setText(team1);
        tvteam2.setText(team2);

        etSave.setText("");
        etSave2.setText(" ");

    }



}
