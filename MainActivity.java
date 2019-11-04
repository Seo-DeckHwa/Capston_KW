package com.example.key;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

    public class MainActivity extends AppCompatActivity {
        private TextView editText;
        private Button button0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            editText= findViewById(R.id.editText);

            findViewById(R.id.button0).setOnClickListener(mClickListener);
            findViewById(R.id.button1).setOnClickListener(mClickListener);
            findViewById(R.id.button2).setOnClickListener(mClickListener);
            findViewById(R.id.button3).setOnClickListener(mClickListener);
            findViewById(R.id.button4).setOnClickListener(mClickListener);
            findViewById(R.id.button5).setOnClickListener(mClickListener);
            findViewById(R.id.button6).setOnClickListener(mClickListener);
            findViewById(R.id.button7).setOnClickListener(mClickListener);
            findViewById(R.id.button8).setOnClickListener(mClickListener);
            findViewById(R.id.button9).setOnClickListener(mClickListener);

        }

        Button.OnClickListener mClickListener = new View.OnClickListener() {
            public void onClick(View view) {
                Button a= (Button) view;
                editText.setText(editText.getText().toString() + a.getText().toString());
            }
        };
        public void perform_action(View v)
        {
            String[] ans = new String[10];

            ans[0]= String.valueOf(0);
            ans[1]= String.valueOf(1);
            ans[2]= String.valueOf(2);
            ans[3]= String.valueOf(3);
            ans[4]= String.valueOf(4);
            ans[5]= String.valueOf(5);
            ans[6]= String.valueOf(6);
            ans[7]= String.valueOf(7);
            ans[8]= String.valueOf(8);
            ans[9]= String.valueOf(9);

            List<Button> btns = new ArrayList<Button>(10);

            btns.add((Button)findViewById(R.id.button0));
            btns.add((Button)findViewById(R.id.button1));
            btns.add((Button)findViewById(R.id.button2));
            btns.add((Button)findViewById(R.id.button3));
            btns.add((Button)findViewById(R.id.button4));
            btns.add((Button)findViewById(R.id.button5));
            btns.add((Button)findViewById(R.id.button6));
            btns.add((Button)findViewById(R.id.button7));
            btns.add((Button)findViewById(R.id.button8));
            btns.add((Button)findViewById(R.id.button9));

            Collections.shuffle(btns);

            for (int i = 0; i < 10; i++) {
                btns.get(i).setText(ans[i]);
            }

 /*
  the following example code demonstrate us how can we
   generate a random number programmaitically in java code
  */

            //define a new Random class
            Random r = new Random();

            //get the next random number
 /*
  nextInt(int n) method return a random number
  between 0 and provided integer value.

  including zero and excluding provided integer value.

  random number will be bellow than
  provided integer

  if we set the argument inetger to 3 then system will
  generate a random number from 0,1 or 2
  */
            int randomNumber = r.nextInt(10);

            //reference the textview widget
            TextView tv = (TextView) findViewById(R.id.editText);

            //display the random number to textview

        }
    /*Button.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button0:
                    editText.setText("0");
                    break;
                case R.id.button1:
                    editText.setText("1");
                    break;
            }
        }
    };*/
    }

