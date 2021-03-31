package com.example.andriodmenus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    int date,month,year,min,hours;
    Button btn;
    Spinner sp;
    TextView textView_lable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.activity_main);
        sp=findViewById(R.id.ShowButton);
        sp=findViewById(R.id.spin);
        textView_lable=findViewById()
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.alert
                showalert();
                break;
            case R.id.datepicker:
                showDate();
                break;
            case R.id.timepicker:
                showTime();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showalert() {
        AlertDialog.Builder builder=new AlertDialog.Builder( this)
        builder.setTitle("Alert..!");
        builder.setMessage("Do u close the app");
         builder.setIcon(R.drawable.ic_baseline_warning_24);
         builder.setCancelable(false);
         builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialog, int which) {
                 finish();
             }
         });
         builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialog, int which) {
                 dialog.dismiss();
             }
         });
         builder.show();




       // Toast.makeText(this, "Item Alert", Toast.LENGTH_SHORT).show();
    }

    private void showDate() {
       // Toast.makeText(this, "Item Date picker", Toast.LENGTH_SHORT).show();
    }

    private void showTime() {
        Calendar c=Calendar.getInstance();
        hours=c.get(Calendar.HOUR);
        min=c.get(Calendar.MINUTE);
        TimePickerDialog dialog=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
              String time=hourOfDay+"-"+minute;
                Toast.makeText(MainActivity.this, "select your time is:"+time, Toast.LENGTH_SHORT).show();
            }
        },hours,min,true);

        //Toast.makeText(this, "Item Time picker", Toast.LENGTH_SHORT).show();
    }


}
}

