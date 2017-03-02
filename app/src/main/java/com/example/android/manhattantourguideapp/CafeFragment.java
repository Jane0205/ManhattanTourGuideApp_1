package com.example.android.manhattantourguideapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;

/**
 * Created by 재은 on 2017-02-28.
 */

public class CafeFragment extends Fragment {

    public CafeFragment(){
    }

    public static CafeFragment newInstance(){
        CafeFragment fragment = new CafeFragment();
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.detail_list,container,false);

        final ArrayList<Detail> details = new ArrayList<Detail>();
        details.add(new Detail(R.string.cafe_name_2, R.string.cafe_location_2,R.drawable.cafe,R.string.cafe_num_2));
        details.add(new Detail(R.string.cafe_name_3, R.string.cafe_location_3, R.drawable.cafe,R.string.cafe_num_3));
        details.add(new Detail(R.string.cafe_name_4, R.string.cafe_location_4, R.drawable.cafe,R.string.cafe_num_4));
        details.add(new Detail(R.string.cafe_name_5, R.string.cafe_location_5, R.drawable.cafe,R.string.cafe_num_5));
        details.add(new Detail(R.string.cafe_name_6, R.string.cafe_location_6, R.drawable.cafe,R.string.cafe_num_6));
        details.add(new Detail(R.string.cafe_name_8, R.string.cafe_location_8, R.drawable.cafe,R.string.cafe_num_8));
        details.add(new Detail(R.string.cafe_name_7, R.string.cafe_location_7, R.drawable.cafe,R.string.cafe_num_7));

        DetailAdapter adapter = new DetailAdapter(getActivity(),details,R.color.cafe);

        ListView listView = (ListView)rootView.findViewById(R.id.detail_list);

        listView.setAdapter(adapter);
        return rootView;

    }
}
