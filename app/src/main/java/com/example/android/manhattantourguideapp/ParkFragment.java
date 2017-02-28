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

    public static RestaurantFragment newInstance(){
        RestaurantFragment fragment = new RestaurantFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.detail_list,container,false);

        final ArrayList<Detail> details = new ArrayList<Detail>();
        details.add(new Detail("Central park","location",R.drawable.park));
        details.add(new Detail("Bryant park","location",R.drawable.park));
        details.add(new Detail("Union square","location",R.drawable.park));
        details.add(new Detail("Washington square","location",R.drawable.park));
        details.add(new Detail("Highline park","location",R.drawable.park));

        DetailAdapter adapter = new DetailAdapter(getActivity(),details,R.color.colorAccent);

        ListView listView = (ListView)rootView.findViewById(R.id.detail_list);

        listView.setAdapter(adapter);
        return rootView;

    }
}
