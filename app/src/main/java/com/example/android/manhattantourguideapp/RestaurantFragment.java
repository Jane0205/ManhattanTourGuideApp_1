package com.example.android.manhattantourguideapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import android.app.Fragment;


import java.util.ArrayList;

/**
 * Created by 재은 on 2017-02-28.
 */

public class RestaurantFragment extends android.support.v4.app.Fragment {
    public RestaurantFragment(){
    }

    public static RestaurantFragment newInstance(){
        RestaurantFragment fragment = new RestaurantFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.detail_list,container,false);

        final ArrayList<Detail> details = new ArrayList<Detail>();
        details.add(new Detail(R.string.restaurant_name_1,R.string.restaurant_location_1, R.drawable.restaurant,R.string.restaurant_num_1));
        details.add(new Detail(R.string.restaurant_name_2,R.string.restaurant_location_2, R.drawable.restaurant,R.string.restaurant_num_2));
        details.add(new Detail(R.string.restaurant_name_3,R.string.restaurant_location_3, R.drawable.restaurant,R.string.restaurant_num_3));
        details.add(new Detail(R.string.restaurant_name_4,R.string.restaurant_location_4, R.drawable.restaurant,R.string.restaurant_num_4));
        details.add(new Detail(R.string.restaurant_name_5,R.string.restaurant_location_5, R.drawable.restaurant,R.string.restaurant_num_5));
        details.add(new Detail(R.string.restaurant_name_6,R.string.restaurant_location_6, R.drawable.restaurant,R.string.restaurant_num_6));
        details.add(new Detail(R.string.restaurant_name_7,R.string.restaurant_location_7, R.drawable.restaurant,R.string.restaurant_num_7));
        details.add(new Detail(R.string.restaurant_name_8,R.string.restaurant_location_8, R.drawable.restaurant,R.string.restaurant_num_8));

        DetailAdapter adapter = new DetailAdapter(getActivity(),details,R.color.colorAccent);

        ListView listView = (ListView)rootView.findViewById(R.id.detail_list);

        listView.setAdapter(adapter);
        return rootView;

    }
}
