package com.example.danielasanchezollervides.images;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void checkNumber (View view) {

        EditText numberone = (EditText) findViewById(R.id.numberone);
        EditText numbertwo = (EditText) findViewById(R.id.numbertwo);
        TextView errormessage = (TextView) findViewById(R.id.errormessage);
        TextView comparison = (TextView) findViewById(R.id.comparison);
        TextView addition = (TextView) findViewById(R.id.addition);
        Button btn = (Button) findViewById(R.id.calculate);
        TextView subtraction = (TextView) findViewById(R.id.subtraction);
        TextView productII = (TextView) findViewById(R.id.productII);
        TextView productI = (TextView) findViewById(R.id.productI);
        Button clean = (Button) findViewById(R.id.clean);
        clean.setEnabled(false);
        clean.setVisibility(View.INVISIBLE);


// Only whole numbers
        String sNumberI = numberone.getText().toString().trim();
        String sNumberII = numbertwo.getText().toString().trim();

        Integer numberI = Integer.parseInt(sNumberI);
        Integer numberII = Integer.parseInt(sNumberII);

        // If zero error messages

        String message;

        if (IsZero(numberI)) {
            message = "Error, try using numbers different of zero";

            errormessage.setText(message);

        }
        if (Alsozero(numberII)) {
            message = "Error, try using whole numbers";

            errormessage.setText(message);
        }
        //Comparison
        if (numberI > numberII) {
            comparison.setText("the first number is biggest");

        } else if (numberI < numberII) {
            comparison.setText("the second number is the biggest");

        } else if (numberI == numberII) {
            comparison.setText("the numbers are equals");
        }

        //Addition
        int x = new Integer(numberone.getText().toString());
        int y = new Integer(numbertwo.getText().toString());
        int sum = x + y;
        addition.setText(sum);

        //Subtraction
        int sub = x - y;
        subtraction.setText(sub);

        // Division
        int div = x/y;
        productII.setText(div);

        // Multiply

        int mult = x*y;
        productI.setText(mult);}

      // If zero condition
    public boolean IsZero(int numberI) {
        if (numberI == 0){
        return true;
    }else{
            return false;
        }
    }
    // If Alsozero condition
    public boolean Alsozero (int numberII) {
        if (numberII == 0) {
            return true;
        } else {
            return false;


        }
    }
    //Set clean visible
    public void resetVisibility (View view){
        Button calculate = (Button) findViewById(R.id.calculate);
        Button clean = (Button) findViewById(R.id.clean);
        clean.setEnabled(true);
        clean.setVisibility(View.VISIBLE);}

        //Clean button
        public void clean(View view){
        EditText numberone = (EditText) findViewById(R.id.numberone);
        EditText numbertwo = (EditText) findViewById(R.id.numbertwo);
        TextView comparison = (TextView) findViewById(R.id.comparison);
        TextView addition = (TextView) findViewById(R.id.addition);
        TextView subtraction = (TextView) findViewById(R.id.subtraction);
        TextView productII = (TextView) findViewById(R.id.productII);
        TextView productI = (TextView) findViewById(R.id.productI);

        numberone.setText("");
        numbertwo.setText("");
        comparison.setText("");
        addition.setText("");
        subtraction.setText("");
        productI.setText("");
        productII.setText("");}


//Set clean invisible

    public void Setinvisible (View view) {
        Button calculate = (Button) findViewById(R.id.calculate);
        Button clean = (Button) findViewById(R.id.clean);
        clean.setEnabled(false);
        clean.setVisibility(View.INVISIBLE);}}








