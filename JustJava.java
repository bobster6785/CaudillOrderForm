/**
 * IMPORTANT: Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava; 
 *
 */
package com.example.jbcaudill.coffee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class JustJava extends AppCompatActivity {
    int quantity=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_just_java);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        displayp(quantity*5);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    public void increment(View view) {
        quantity+=1;
        display(quantity);
    }

    public void decrement(View view) {
        quantity-=1;
        display(quantity);
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayp(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("You owe $" + number+". \n Thank you!");
    }
}