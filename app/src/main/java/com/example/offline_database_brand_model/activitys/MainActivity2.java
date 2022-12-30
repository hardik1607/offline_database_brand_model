package com.example.offline_database_brand_model.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;

import com.example.offline_database_brand_model.R;
import com.example.offline_database_brand_model.activitys.DataBaseHelper;
import com.example.offline_database_brand_model.adapters.adapter1;
import com.example.offline_database_brand_model.adapters.adapter2;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    String id;
    ListView listView;
    ArrayList brand_id,brand_name,model_base_price;
    DataBaseHelper dataBaseHelper = new DataBaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView=findViewById(R.id.list1);

        brand_id = new ArrayList();
        brand_name = new ArrayList();
        model_base_price = new ArrayList();

        id=getIntent().getStringExtra("id");

        Cursor c = dataBaseHelper.getmodel(Integer.parseInt(id));

        while (c.moveToNext())
        {
            brand_id.add(c.getInt(0));
            brand_name.add(c.getString(1));
            model_base_price.add(c.getString(1));
        }

        adapter2 adapter2 = new adapter2(this,brand_id,brand_name,model_base_price);
        listView.setAdapter(adapter2);
    }
}