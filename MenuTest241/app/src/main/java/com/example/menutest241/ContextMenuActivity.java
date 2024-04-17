package com.example.menutest241;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ContextMenuActivity extends AppCompatActivity {

    private static final String TAG = "tag";
    private Button btnContextMenu;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);
        actionBarConfig();
        btnContextMenu = findViewById(R.id.btn_context_menu);
        mListView = findViewById(R.id.lv);
        String[] data = {
                "1",
                "2",
                "3",
                "4",
                "5",
                "1",
                "2",
                "3",
                "4",
                "5",
                "1",
                "2",
                "3",
                "4",
                "5",
        };
        mListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,data));

//        registerForContextMenu(btnContextMenu);
        registerForContextMenu(mListView);

    }

    private void actionBarConfig(){
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setTitle("上下文菜单");
        supportActionBar.setDisplayHomeAsUpEnabled(true);

        supportActionBar.setDisplayShowHomeEnabled(true);
        supportActionBar.setLogo(R.drawable.ic_baseline_help_24);
        supportActionBar.setDisplayUseLogoEnabled(true);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_context, menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        int itemId = item.getItemId();
        Log.d(TAG, "onContextItemSelected: --------------"+menuInfo.position+","+menuInfo.id);
//        Toast.makeText(this, "点击了" +menuInfo.position+","+menuInfo.id, Toast.LENGTH_SHORT).show();
        switch (itemId) {
            case R.id.menu_about:
                Toast.makeText(this, "点击了关于", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_help:
                Toast.makeText(this, "点击了帮助", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_home:
                Toast.makeText(this, "点击了主页", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_setting:
                Toast.makeText(this, "点击了设置", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_exit:
                Toast.makeText(this, "点击了退出", Toast.LENGTH_SHORT).show();
                return true;
            default:

                break;
        }

        return super.onContextItemSelected(item);
    }
}