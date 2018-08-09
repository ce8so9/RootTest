package com.example.sheikh.checkroot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public Button button;
    public TextView textView;
    boolean checker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        final RootUtil rootUtil =new RootUtil();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checker = rootUtil.isDeviceRooted();
                if (checker){
                    textView.setText(getString(R.string.rooted));

                } else {
                    textView.setText(getString(R.string.not_rooted));
                }



            }
        });

    }


}
