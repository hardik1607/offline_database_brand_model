package com.example.offline_database_brand_model.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.offline_database_brand_model.R;
import com.example.offline_database_brand_model.activitys.DataBaseHelper;
import com.example.offline_database_brand_model.activitys.MainActivity2;

import java.util.ArrayList;

public class adapter2 extends BaseAdapter {

    MainActivity2 mainActivity2;
    ArrayList brand_id,brand_name,model_base_price;
    DataBaseHelper dataBaseHelper;

    public adapter2(MainActivity2 mainActivity2, ArrayList brand_id, ArrayList brand_name, ArrayList model_base_price) {
        this.mainActivity2=mainActivity2;
        this.brand_id=brand_id;
        this.brand_name=brand_name;
        dataBaseHelper = new DataBaseHelper(mainActivity2);
        this.model_base_price=model_base_price;
    }

    @Override
    public int getCount() {
        return brand_id.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(mainActivity2).inflate(R.layout.item2,viewGroup,false);

        TextView tv_brand_id=view.findViewById(R.id.brand_id);
        TextView tv_brand_name=view.findViewById(R.id.brand_name);
        TextView tv_model_base_price=view.findViewById(R.id.model_base_price);

        tv_brand_id.setText(brand_id.get(i).toString());
        tv_brand_name.setText(brand_name.get(i).toString());
        tv_model_base_price.setText(model_base_price.get(i).toString());

        return view;
    }
}
