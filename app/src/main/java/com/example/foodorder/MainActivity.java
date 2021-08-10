package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bananasButton, blackBeansButton, redMeatButton, chickenButton;
    //Declire a string to take any choices!
    String choices = " ";
    Double price = 0.00;
    Button placer_order;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    bananasButton = (Button)findViewById(R.id.bananasButton);
    blackBeansButton = (Button)findViewById(R.id.blackBeansButton);
    redMeatButton = (Button)findViewById(R.id.redMeatButton);
    chickenButton = (Button)findViewById(R.id.chickenButton);
    placer_order = (Button)findViewById(R.id.placeorderButton);

    // create methods!!
        bananasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choices = choices + "Bananas" + "\n";
                price = price + 12;
            }
        });
        blackBeansButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choices = choices + "Black-Beans" + "\n";
                price = price + 3;
            }
        });
        redMeatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choices = choices + "Red-Meat" + "\n";
                price = price + 5;
            }
        });
        chickenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choices = choices + "Chicken" + "\n";
                price = price + 2;
            }
        });
        placer_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent comfirmation = new Intent(MainActivity.this,OrderDetails.class );
               comfirmation.putExtra("choices", choices);
               comfirmation.putExtra("price", price);
                startActivity(comfirmation);
            }
        });

    }

// created string for list of cart with prices!
//    public void add_to_list(View view)
//    {
//        if (view == findViewById(R.id.bananasButton))
//        {
//            choices = choices + "Bananas" + "\n";
//            price = price + 12;
//        }
//        else if (view == findViewById(R.id.blackBeansButton))
//        {
//            choices = choices + "Black-Beans" + "\n";
//            price = price + 3;
//        }
//        else if (view == findViewById(R.id.blackBeansButton))
//        {
//            choices = choices + "Red-Meat" + "\n";
//            price = price + 5;
//        }
//        else if (view == findViewById(R.id.blackBeansButton))
//        {
//            choices = choices + "Chicken" + "\n";
//            price = price + 2;
//        }
//    }

//    public void placeorder(View view){
//
//        Intent i = new Intent(MainActivity.this,OrderDetails.class);
//       Bundle bundle = new Bundle();
//       bundle.putString("choices", choices);
//        bundle.putDouble("price", price);
//        i.putExtras(bundle);
//        startActivity(i);
//
//    }


}