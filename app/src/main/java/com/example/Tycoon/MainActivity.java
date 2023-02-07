package com.example.Tycoon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    //https://stackoverflow.com/questions/4597690/how-to-set-timer-in-android

    TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textViewMoney;
    ProgressBar progressBar1, progressBar2, progressBar3, progressBar4, progressBar5, progressBar6;

    long starttime1, starttime2, starttime3, starttime4, starttime5, starttime6 = 0;

    Timer timer1, timer2, timer3, timer4, timer5, timer6 = new Timer();

    long millis1, seconds1, minutes1, millis2, seconds2, minutes2, millis3, seconds3, minutes3, millis4, seconds4, minutes4, millis5, seconds5, minutes5, millis6, seconds6, minutes6 = 0;

    Button button1, button2, button3, button4, button5, button6;

    ImageButton imgButton1, imgButton2, imgButton3, imgButton4, imgButton5, imgButton6;

    BusinessInfo business1, business2, business3, business4, business5, business6;

    double money = 0;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        business1 = new BusinessInfo(4,1, 1);//going up by $1 profit everytime u buy, cost goges up by 5%
        business2 = new BusinessInfo(30,10, 3);//60, 120, 180
        business3 = new BusinessInfo(100,25, 5);
        business4 = new BusinessInfo(2000,400, 10);
        business5 = new BusinessInfo(10000,2000, 20);
        business6 = new BusinessInfo(75000,10000, 50);



        progressBar1 = findViewById(R.id.progressBar1);
        progressBar2 = findViewById(R.id.progressBar2);
        progressBar3 = findViewById(R.id.progressBar3);
        progressBar4 = findViewById(R.id.progressBar4);
        progressBar5 = findViewById(R.id.progressBar5);
        progressBar6 = findViewById(R.id.progressBar6);

        textView1 = (TextView)findViewById(R.id.textView1);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);
        textView4 = (TextView)findViewById(R.id.textView4);
        textView5 = (TextView)findViewById(R.id.textView5);
        textView6 = (TextView)findViewById(R.id.textView6);
        textView7 = (TextView)findViewById(R.id.textView7);
        textView8 = (TextView)findViewById(R.id.textView8);
        textView9 = (TextView)findViewById(R.id.textView9);
        textView10 = (TextView)findViewById(R.id.textView10);
        textView11 = (TextView)findViewById(R.id.textView11);
        textView12 = (TextView)findViewById(R.id.textView12);
        textViewMoney = (TextView)findViewById(R.id.txtViewMoney);

        textView7.setText("$"+(double)(Math.round(business1.getProfit()*100))/100);
        textView8.setText("$"+(double)(Math.round(business2.getProfit()*100))/100);
        textView9.setText("$"+(double)(Math.round(business3.getProfit()*100))/100);
        textView10.setText("$"+(double)(Math.round(business4.getProfit()*100))/100);
        textView11.setText("$"+(double)(Math.round(business5.getProfit()*100))/100);
        textView12.setText("$"+(double)(Math.round(business6.getProfit()*100))/100);


        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);

        imgButton1 = (ImageButton)findViewById(R.id.imageButton1);
        imgButton2 = (ImageButton)findViewById(R.id.imageButton2);
        imgButton3 = (ImageButton)findViewById(R.id.imageButton3);
        imgButton4 = (ImageButton)findViewById(R.id.imageButton4);
        imgButton5 = (ImageButton)findViewById(R.id.imageButton5);
        imgButton6 = (ImageButton)findViewById(R.id.imageButton6);



        imgButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton imgButton1 = (ImageButton)v;

                if (millis1>1000 || millis1 == 0){
                    restartTimer1();
                }
            }
        });




        imgButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageButton imgButton2 = (ImageButton)v;
//                if(!stopped){
//                    timer.cancel();
//                    timer.purge();
////                    h.removeCallbacks(run);
//                    stopped = true;
//
//                }else{
                if (millis2>3000 || millis2 == 0){
                    restartTimer2();
                }
//
//                }
            }
        });


        imgButton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageButton imgButton3 = (ImageButton)v;
//                if(!stopped){
//                    timer.cancel();
//                    timer.purge();
////                    h.removeCallbacks(run);
//                    stopped = true;
//
//                }else{
                if (millis3>5000 || millis3 == 0){
                    restartTimer3();
                }
//
//                }
            }
        });


        imgButton4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageButton imgButton4 = (ImageButton)v;
//                if(!stopped){
//                    timer.cancel();
//                    timer.purge();
////                    h.removeCallbacks(run);
//                    stopped = true;
//
//                }else{
                if (millis4>10000 || millis4 == 0){
                    restartTimer4();
                }
//
//                }
            }
        });


        imgButton5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageButton imgButton5 = (ImageButton)v;
//                if(!stopped){
//                    timer.cancel();
//                    timer.purge();
////                    h.removeCallbacks(run);
//                    stopped = true;
//
//                }else{
                if (millis5>20000 || millis5 == 0){
                    restartTimer5();
                }
//
//                }
            }
        });


        imgButton6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageButton imgButton6 = (ImageButton)v;
//                if(!stopped){
//                    timer.cancel();
//                    timer.purge();
////                    h.removeCallbacks(run);
//                    stopped = true;
//
//                }else{
                if (millis6>50000 || millis6 == 0){
                    restartTimer6();
                }
//
//                }
            }
        });





        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (money>=business1.getCost()){
                    money-=business1.getCost();
                    business1.setProfit(business1.getProfit()+(business1.getProfit()*.05));
                    business1.setCost(business1.getCost() + (business1.getCost() * .1));
                }
                textViewMoney.setText("$" + (Math.round(money*100))/100);
//
                textView7.setText("$"+(double)(Math.round(business1.getProfit()*100))/100);

                button1.setText("BUY: $" + (double)(Math.round(business1.getCost()*100))/100);
//                }
            }
        });



        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (money>=business2.getCost()){
                    money-=business2.getCost();
                    business2.setProfit(business2.getProfit()+(business2.getProfit()*.05));
                    business2.setCost(business2.getCost() + (business2.getCost() * .1));
                }
                textViewMoney.setText("$" + (Math.round(money*100))/100);
                textView8.setText("$"+(double)(Math.round(business2.getProfit()*100))/100);

                button2.setText("BUY: $" + (double)(Math.round(business2.getCost()*100))/100);
//                }
            }
        });







        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (money>=business3.getCost()){
                    money-=business3.getCost();
                    business3.setProfit(business3.getProfit()+(business3.getProfit()*.05));
                    business3.setCost(business3.getCost() + (business3.getCost() * .1));
                }
                textViewMoney.setText("$" + (Math.round(money*100))/100);
                textView9.setText("$"+(double)(Math.round(business3.getProfit()*100))/100);

                button3.setText("BUY: $" + (double)(Math.round(business3.getCost()*100))/100);
//                }
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (money>=business4.getCost()){
                    money-=business4.getCost();
                    business4.setProfit(business4.getProfit()+(business4.getProfit()*.05));
                    business4.setCost(business4.getCost() + (business4.getCost() * .1));
                }
                textViewMoney.setText("$" + (Math.round(money*100))/100);
                textView10.setText("$"+(double)(Math.round(business4.getProfit()*100))/100);

                button4.setText("BUY: $" + (double)(Math.round(business4.getCost()*100))/100);
//                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (money>=business5.getCost()){
                    money-=business5.getCost();
                    business5.setProfit(business5.getProfit()+(business5.getProfit()*.05));
                    business5.setCost(business5.getCost() + (business5.getCost() * .1));
                }
                textViewMoney.setText("$" + (Math.round(money*100))/100);
                textView11.setText("$"+(double)(Math.round(business5.getProfit()*100))/100);

                button5.setText("BUY: $" + (double)(Math.round(business5.getCost()*100))/100);
//                }
            }
        });


        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (money>=business6.getCost()){
                    money-=business6.getCost();
                    business6.setProfit(business6.getProfit()+(business6.getProfit()*.05));
                    business6.setCost(business6.getCost() + (business6.getCost() * .1));
                }
                textViewMoney.setText("$" + (Math.round(money*100))/100);
                textView12.setText("$"+(double)(Math.round(business6.getProfit()*100))/100);

                button6.setText("BUY: $" + (double)(Math.round(business6.getCost()*100))/100);
//                }
            }
        });








    }








    //runs without timer be reposting self
//    Handler h = new Handler();
//    Runnable run = new Runnable() {
//
//        @Override
//        public void run() {
//
//            long millis = System.currentTimeMillis() - starttime;
//            int seconds = (int) (millis / 1000);
//            int minutes = seconds / 60;
//            seconds     = seconds % 60;
//
//            textView3.setText(String.format("%d:%02d", minutes, seconds));
//
//
//            h.postDelayed(this, 500);
//        }

//    };






    //tells activity to run on ui thread
    class Task1 extends TimerTask {
        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {

                @Override
                public void run() {
                    millis1 = System.currentTimeMillis() - starttime1;
                    seconds1 = (int) (millis1 / 1000);
                    minutes1 = seconds1 / 60;
                    seconds1     = seconds1 % 60;


                    progressBar1.setProgress((int)millis1/10);
                    textView1.setText(String.format("%d:%02d:%02d", minutes1, seconds1, (1000 -(millis1%1000))/10));


                    if (millis1 > 1000){
                        stopTimer1();
                    }



                }
            });
        }

    };






    //tells activity to run on ui thread
    class Task2 extends TimerTask {
        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {

                @Override
                public void run() {
                    millis2 = System.currentTimeMillis() - starttime2;
                    seconds2 = 2 - (int) (millis2 / 1000);
                    minutes2 = seconds2 / 60;
                    seconds2     = seconds2 % 60;

                    progressBar2.setProgress((int)millis2/30);
                    textView2.setText(String.format("%d:%02d:%02d", minutes2, seconds2, (1000 -(millis2%1000))/10));



                    if (millis2 > 3000){
                        stopTimer2();
                    }

                }
            });
        }

    };







    class Task3 extends TimerTask {
        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {

                @Override
                public void run() {
                    millis3 = System.currentTimeMillis() - starttime3;
                    seconds3 =  4 - (int) (millis3 / 1000);
                    minutes3 = seconds3 / 60;
                    seconds3     = seconds3 % 60;

                    progressBar3.setProgress((int)millis3/50);
                    textView3.setText(String.format("%d:%02d:%02d", minutes3, seconds3, (1000 -(millis3%1000))/10));


                    if (millis3 > 5000){
                        stopTimer3();
                    }

                }
            });
        }

    };









    class Task4 extends TimerTask {
        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {

                @Override
                public void run() {
                    millis4 = System.currentTimeMillis() - starttime4;
                    seconds4 =  9 - (int) (millis4 / 1000);
                    minutes4 = seconds4 / 60;
                    seconds4     = seconds4 % 60;

                    progressBar4.setProgress((int)millis4/100);
                    textView4.setText(String.format("%d:%02d:%02d", minutes4, seconds4, (1000 -(millis4%1000))/10));



                    if (millis4 > 10000){
                        stopTimer4();
                    }

                }
            });
        }

    };








    class Task5 extends TimerTask {
        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {

                @Override
                public void run() {
                    millis5 = System.currentTimeMillis() - starttime5;
                    seconds5 = 19 - (int) (millis5 / 1000);
                    minutes5 = seconds5 / 60;
                    seconds5     = seconds5 % 60;

                    progressBar5.setProgress((int)millis5/200);

                    textView5.setText(String.format("%d:%02d:%02d", minutes5, seconds5, (1000 -(millis5%1000))/10));


                    if (millis5 > 20000){
                        stopTimer5();
                    }

                }
            });
        }

    };









    class Task6 extends TimerTask {
        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {

                @Override
                public void run() {
                    millis6 = System.currentTimeMillis() - starttime6;
                    seconds6 = 49 - (int) (millis6 / 1000);
                    minutes6 = seconds6 / 60;
                    seconds6     = seconds6 % 60;

                    progressBar6.setProgress((int)millis6/500);
                    textView6.setText(String.format("%d:%02d:%02d", minutes6, seconds6, (1000 -(millis6%1000))/10));



                    if (millis6 > 50000){
                        stopTimer6();

                    }

                }
            });
        }

    };








    public void restartTimer1(){
        starttime1 = System.currentTimeMillis();
        timer1 = new Timer();
        timer1.schedule(new Task1(),  0,20);

    }



    public void stopTimer1(){
        timer1.cancel();
        timer1 = new Timer();

        millis1 = 0;
        seconds1 = 0;
        minutes1 = 0;

        progressBar1.setProgress(0);

        textView1.setText("0:01:00");



        money+=business1.getProfit();

        textViewMoney.setText("$" + (double)(Math.round(money*100.0))/100);






    }



    public void restartTimer2(){
        starttime2 = System.currentTimeMillis();
        timer2 = new Timer();
        timer2.schedule(new Task2(),  0,20);

    }

    public void stopTimer2(){
        timer2.cancel();
        timer2 = new Timer();

        millis2 = 0;
        seconds2 = 0;
        minutes2 = 0;

        progressBar2.setProgress(0);

        textView2.setText("0:03:00");

        money+=business2.getProfit();

        textViewMoney.setText("$" + (double)(Math.round(money*100.0))/100);


    }



    public void restartTimer3(){
        starttime3 = System.currentTimeMillis();
        timer3 = new Timer();
        timer3.schedule(new Task3(),  0,20);

    }

    public void stopTimer3(){
        timer3.cancel();
        timer3 = new Timer();

        millis3 = 0;
        seconds3 = 0;
        minutes3 = 0;

        progressBar3.setProgress(0);

        textView3.setText("0:05:00");

        money+=business3.getProfit();

        textViewMoney.setText("$" + (double)(Math.round(money*100.0))/100);


    }



    public void restartTimer4(){
        starttime4 = System.currentTimeMillis();
        timer4 = new Timer();
        timer4.schedule(new Task4(),  0,20);

    }

    public void stopTimer4(){
        timer4.cancel();
        timer4 = new Timer();

        millis4 = 0;
        seconds4 = 0;
        minutes4 = 0;

        progressBar4.setProgress(0);

        textView4.setText("0:10:00");

        money+=business4.getProfit();


        textViewMoney.setText("$" + (double)(Math.round(money*100.0))/100);


    }



    public void restartTimer5(){
        starttime5 = System.currentTimeMillis();
        timer5 = new Timer();
        timer5.schedule(new Task5(),  0,20);

    }

    public void stopTimer5(){
        timer5.cancel();
        timer5 = new Timer();

        millis5 = 0;
        seconds5 = 0;
        minutes5 = 0;

        progressBar5.setProgress(0);

        textView5.setText("0:20:00");

        money+=business5.getProfit();

        textViewMoney.setText("$" + (double)(Math.round(money*100.0))/100);


    }



    public void restartTimer6(){
        starttime6 = System.currentTimeMillis();
        timer6 = new Timer();
        timer6.schedule(new Task6(),  0,20);

    }

    public void stopTimer6(){
        timer6.cancel();
        timer6 = new Timer();

        millis6 = 0;
        seconds6 = 0;
        minutes6 = 0;

        progressBar6.setProgress(0);

        textView6.setText("0:50:00");

        money+=business6.getProfit();


        textViewMoney.setText("$" + (double)(Math.round(money*100.0))/100);


    }

//    @Override
//    public void onPause() {
//        super.onPause();
//        timer.cancel();
//        timer.purge();
////        h.removeCallbacks(run);
//        Button b = (Button)findViewById(R.id.button1);
//
//
//
//    }




}