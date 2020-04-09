package com.example.ramen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.SettingsSlicesContract;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btDel = findViewById(R.id.btDelete);
        Button btMenu = findViewById(R.id.btMenu);

        //ceckboxを取得
        final CheckBox currentCb = findViewById(R.id.cbGen1);
        currentCb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentCb.isChecked() == true) {
                    //チェックされてるときの処理

                }
            }
        });

        //ボタンにリスナを設定させる
        btMenu.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btMenu) {
            DetailDialogFragment ddFragment = new DetailDialogFragment();
            ddFragment.show(getSupportFragmentManager(), "DetailDialogFragment");
        }
    }
}
