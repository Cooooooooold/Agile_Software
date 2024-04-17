package com.example.menutest241;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class OptionsMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_menu);
        actionBarConfig();

    }

    private void actionBarConfig(){
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setTitle("选项菜单");
        supportActionBar.setDisplayHomeAsUpEnabled(true);

        supportActionBar.setDisplayShowHomeEnabled(true);
        supportActionBar.setLogo(R.drawable.ic_baseline_help_24);
        supportActionBar.setDisplayUseLogoEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_options,menu);
//        menuInflater.inflate(R.menu.menu_choose,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        item.setChecked(true);
//        if (item.isChecked()) {
//            item.setChecked(false);
//        }else {
//            item.setChecked(true);
//        }
        Toast.makeText(this,"点击了"+item.getTitle(),Toast.LENGTH_SHORT).show();
        switch (itemId) {
            case R.id.menu_about:
                Toast.makeText(this,"点击了关于",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_help:
                Toast.makeText(this,"点击了帮助",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_home:
                Toast.makeText(this,"点击了主页",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_setting:
                Toast.makeText(this,"点击了设置",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_exit:
                Toast.makeText(this,"点击了退出",Toast.LENGTH_SHORT).show();
                return true;
            case android.R.id.home:
//                this.finish();
                break;
            default:

                break;
        }

        return super.onOptionsItemSelected(item);
    }
}