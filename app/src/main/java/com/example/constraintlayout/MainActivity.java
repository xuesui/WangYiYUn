package com.example.constraintlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login_main = (Button) findViewById(R.id.button_login);
        Button register_main = (Button) findViewById(R.id.button_register);
        Button QQ_main = (Button) findViewById(R.id.button_qq_main);
        Button WX_main = (Button) findViewById(R.id.button_wx_main);
        Button WB_main = (Button) findViewById(R.id.button_wb_main);
        Button WY_main = (Button) findViewById(R.id.button_wy_main);
        login_main.setOnClickListener(this);
        register_main.setOnClickListener(this);
        QQ_main.setOnClickListener(this);
        WX_main.setOnClickListener(this);
        WB_main.setOnClickListener(this);
        WY_main.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_login:
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.button_register:
                Intent intent1 = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent1);
                break;
            case R.id.button_qq_main:
                Intent intent2 = new Intent(MainActivity.this, OtherRegisterActivity.class);
                startActivity(intent2);
                break;
            case R.id.button_wx_main:
                Intent intent3 = new Intent(MainActivity.this, OtherRegisterActivity.class);
                startActivity(intent3);
                break;
            case R.id.button_wb_main:
                Intent intent4 = new Intent(MainActivity.this, OtherRegisterActivity.class);
                startActivity(intent4);
                break;
            case R.id.button_wy_main:
                Intent intent5 = new Intent(MainActivity.this, OtherRegisterActivity.class);
                startActivity(intent5);
                break;
            default:
                break;
        }
    }
}
