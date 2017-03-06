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

public class MuseumFragment extends Fragment {

    public MuseumFragment(){}


    public static MuseumFragment newInstance(){
        MuseumFragment fragment = new MuseumFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.detail_list,container,false);

        final ArrayList<Detail> details = new ArrayList<Detail>();
        details.add(new Detail(R.string.museum_name_1, R.string.museum_location_1, R.drawable.museum_2, R.string.museum_num_1));
        details.add(new Detail(R.string.museum_name_2, R.string.museum_location_2, R.drawable.museum_1, R.string.museum_num_2));
        details.add(new Detail(R.string.museum_name_3, R.string.museum_location_3, R.drawable.museum_3, R.string.museum_num_3));
        details.add(new Detail(R.string.museum_name_4, R.string.museum_location_4, R.drawable.museum_4, R.string.museum_num_4));
        details.add(new Detail(R.string.museum_name_5, R.string.museum_location_5, R.drawable.museum_5, R.string.museum_num_5));
        details.add(new Detail(R.string.museum_name_6, R.string.museum_location_6, R.drawable.museum_6, R.string.museum_num_6));
        details.add(new Detail(R.string.museum_name_7, R.string.museum_location_7, R.drawable.museum_7, R.string.museum_num_7));


        DetailAdapter adapter = new DetailAdapter(getActivity(),details,R.color.museum);

        ListView listView = (ListView)rootView.findViewById(R.id.detail_list);

        listView.setAdapter(adapter);
        return rootView;

    }
}
