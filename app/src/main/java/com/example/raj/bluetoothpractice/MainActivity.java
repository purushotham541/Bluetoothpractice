package com.example.raj.bluetoothpractice;

import android.bluetooth.BluetoothAdapter;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    BluetoothAdapter ba=BluetoothAdapter.getDefaultAdapter();;

    Switch sw;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw=(Switch)findViewById(R.id.sw1);
        tv=(TextView)findViewById(R.id.tv1);

        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked)
                {
                    ba.enable();
                    tv.setText("ON");

                }
                else
                {
                    ba.disable();
                    tv.setText("OFF");
                }

            }
        });
    }
}
