package com.example.offline_database_brand_model.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.offline_database_brand_model.R;
import com.example.offline_database_brand_model.activitys.DataBaseHelper;
import com.example.offline_database_brand_model.activitys.MainActivity;

import java.util.ArrayList;

public class adapter1 extends BaseAdapter {

    MainActivity mainActivity;
    ArrayList brand_id,brand_name;
    DataBaseHelper dataBaseHelper;
    public adapter1(MainActivity mainActivity, ArrayList brand_id, ArrayList brand_name) {
        this.mainActivity=mainActivity;
        this.brand_id=brand_id;
        this.brand_name=brand_name;
        dataBaseHelper = new DataBaseHelper(mainActivity);
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
        view= LayoutInflater.from(mainActivity).inflate(R.layout.item1,viewGroup,false);

        TextView tv_brand_id=view.findViewById(R.id.brand_id);
        TextView tv_brand_name=view.findViewById(R.id.brand_name);

        tv_brand_id.setText(brand_id.get(i).toString());
        tv_brand_name.setText(brand_name.get(i).toString());
        return view;
    }
}
