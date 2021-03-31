package com.example.a512;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Textview text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findviewByid(R.id.tv);

    }

    public void showToast(view view) {
         /syntax of the toast message */
        Toast.makeText(context this "This is our first own app", Toast.LENGTH_SHORT).show();
    }

    public void showcount(View View) {
        count++;
        text.setText(String.valueOf(count));
    }

    @override
    protected void onSavedInstanceState(@NonNull Bundle outstate) {
        super.onSavedInstanceState(outstate);
        outstate.putInt("anykey", count);
    }
}