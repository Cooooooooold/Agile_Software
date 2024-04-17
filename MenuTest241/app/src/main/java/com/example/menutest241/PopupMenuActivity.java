package com.example.menutest241;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class PopupMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);
        actionBarConfig();
    }
    private void actionBarConfig(){
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setTitle("弹出式菜单");
        supportActionBar.setDisplayHomeAsUpEnabled(true);

        supportActionBar.setDisplayShowHomeEnabled(true);
        supportActionBar.setLogo(R.drawable.ic_baseline_help_24);
        supportActionBar.setDisplayUseLogoEnabled(true);
    }
    public void popUpMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this,view);
//        popupMenu.setGravity(Gravity.RIGHT);
        popupMenu.inflate(R.menu.menu_popup);
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int itemId = item.getItemId();
                Toast.makeText(PopupMenuActivity.this,"点击了"+item.getTitle(),Toast.LENGTH_SHORT).show();
                switch (itemId) {
                    case R.id.menu_about:
                        Toast.makeText(PopupMenuActivity.this,"点击了关于",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu_help:
                        Toast.makeText(PopupMenuActivity.this,"点击了帮助",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu_home:
                        Toast.makeText(PopupMenuActivity.this,"点击了主页",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu_setting:
                        Toast.makeText(PopupMenuActivity.this,"点击了设置",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu_exit:
                        Toast.makeText(PopupMenuActivity.this,"点击了退出",Toast.LENGTH_SHORT).show();
                        return true;
                    default:

                        break;
                }
                return true;
            }
        });
    }

    public void popUpChooseMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this,view);
//        popupMenu.setGravity(Gravity.RIGHT);
        popupMenu.inflate(R.menu.menu_choose);
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int itemId = item.getItemId();
                Toast.makeText(PopupMenuActivity.this,"点击了"+item.getTitle(),Toast.LENGTH_SHORT).show();
                if (item.isChecked()) {
                    item.setChecked(false);
                }else {
                    item.setChecked(true);
                }
                switch (itemId) {
                    case R.id.menu_about:

                        Toast.makeText(PopupMenuActivity.this,"点击了关于",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu_help:
                        Toast.makeText(PopupMenuActivity.this,"点击了帮助",Toast.LENGTH_SHORT).show();
                        return true;
                    default:

                        break;
                }
                return true;
            }
        });
    }

    public void popUpGroupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this,view);
//        popupMenu.setGravity(Gravity.RIGHT);
        popupMenu.inflate(R.menu.menu_sub);
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int itemId = item.getItemId();
                Toast.makeText(PopupMenuActivity.this,"点击了"+item.getTitle(),Toast.LENGTH_SHORT).show();
                switch (itemId) {
                    case R.id.menu_about:
                        Toast.makeText(PopupMenuActivity.this,"点击了关于",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu_help:
                        Toast.makeText(PopupMenuActivity.this,"点击了帮助",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu_home:
                        Toast.makeText(PopupMenuActivity.this,"点击了主页",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu_setting:
                        Toast.makeText(PopupMenuActivity.this,"点击了设置",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu_exit:
                        Toast.makeText(PopupMenuActivity.this,"点击了退出",Toast.LENGTH_SHORT).show();
                        return true;
                    default:

                        break;
                }
                return true;
            }
        });
    }
}