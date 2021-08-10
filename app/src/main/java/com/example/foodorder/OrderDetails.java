package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OrderDetails extends AppCompatActivity {

    TextView orderView, priceView;
    String list_choice;
    Double price_usd;
    Double price_ugshs;
    Intent incomingIntent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        orderView = (TextView) findViewById(R.id.orderView);
        priceView = (TextView) findViewById(R.id.priceView);

        //getting the passed value from MainActivity!
        incomingIntent = getIntent();
        list_choice = incomingIntent.getStringExtra("choices");
        price_usd = incomingIntent.getDoubleExtra("price", 0.00);

        //converting price in Ug.shs!!
        price_ugshs = price_usd * 3350.00;

        priceView.setText("USD :" + price_usd.toString() + " UG.SHS :" + price_ugshs.toString());
        orderView.setText(" You ordered: \n" + list_choice);
    }
}