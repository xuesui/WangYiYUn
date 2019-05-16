package com.example.constraintlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button register = (Button) findViewById(R.id.button_register_next);
        Button qq = (Button) findViewById(R.id.button_qq_register);
        Button wx = (Button) findViewById(R.id.button_wx_register);
        Button wb = (Button) findViewById(R.id.button_wb_register);
        Button wy = (Button) findViewById(R.id.button_wy_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_register);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        register.setOnClickListener(this);
        qq.setOnClickListener(this);
        wx.setOnClickListener(this);
        wb.setOnClickListener(this);
        wy.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_register_next:
                Intent intent = new Intent(RegisterActivity.this, FirstActivity.class);
                startActivity(intent);
                break;
            case R.id.button_qq_main:
                Intent intent2 = new Intent(RegisterActivity.this, OtherRegisterActivity.class);
                startActivity(intent2);
                break;
            case R.id.button_wx_main:
                Intent intent3 = new Intent(RegisterActivity.this, OtherRegisterActivity.class);
                startActivity(intent3);
                break;
            case R.id.button_wb_main:
                Intent intent4 = new Intent(RegisterActivity.this, OtherRegisterActivity.class);
                startActivity(intent4);
                break;
            case R.id.button_wy_main:
                Intent intent5 = new Intent(RegisterActivity.this, OtherRegisterActivity.class);
                startActivity(intent5);
                break;
            default:
                break;
        }
    }
}
