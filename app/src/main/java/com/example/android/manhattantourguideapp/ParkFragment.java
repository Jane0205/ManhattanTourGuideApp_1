package com.example.android.manhattantourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by 재은 on 2017-02-28.
 */

public class ParkFragment extends Fragment {

    public ParkFragment(){}

    public static ParkFragment newInstance(){
        ParkFragment fragment = new ParkFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.detail_list,container,false);

        final ArrayList<Detail> details = new ArrayList<Detail>();
        details.add(new Detail(R.string.park_name_1,R.string.park_location_1,R.drawable.park,R.string.park_num));
        details.add(new Detail(R.string.park_name_2,R.string.park_location_2,R.drawable.park,R.string.park_num));
        details.add(new Detail(R.string.park_name_3,R.string.park_location_3,R.drawable.park,R.string.park_num));
        details.add(new Detail(R.string.park_name_4,R.string.park_location_4,R.drawable.park,R.string.park_num));
        details.add(new Detail(R.string.park_name_5,R.string.park_location_5,R.drawable.park,R.string.park_num));

        DetailAdapter adapter = new DetailAdapter(getActivity(),details,R.color.park);

        ListView listView = (ListView)rootView.findViewById(R.id.detail_list);

        listView.setAdapter(adapter);
        return rootView;

    }
}
