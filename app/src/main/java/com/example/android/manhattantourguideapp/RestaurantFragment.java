package com.example.android.manhattantourguideapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by 재은 on 2017-02-28.
 */

public class RestaurantFragment extends Fragment {
    public RestaurantFragment(){
    }

    public static RestaurantFragment newInstance(){
        RestaurantFragment fragment = new RestaurantFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.detail_list,container,false);

        final ArrayList<Detail> details = new ArrayList<Detail>();
        details.add(new Detail("Jean-Georges", "Trump International Hotel & Tower New York", R.drawable.restaurant, 2122993900));
        details.add(new Detail("Gotham Bar and Grill", "12 E 12th St, New York, NY 10003", R.drawable.restaurant, 2126204020));
        details.add(new Detail("Gramercy Tavern", "42 E 20th St, New York, NY 10003", R.drawable.restaurant, 2124770777));
        details.add(new Detail("Babbo", "110 Waverly Pl, New York, NY 10011", R.drawable.restaurant, 2122213800));
        details.add(new Detail("Carmine's", "200 W 44th St, New York, NY 10036", R.drawable.restaurant, 2122993900));
        details.add(new Detail("Blue Ribbon Sushi", "119 Sullivan St, New York, NY 10012", R.drawable.restaurant, 2123430404));
        details.add(new Detail("ABC Kitchen", "35 E 18th St, New York, NY 10003", R.drawable.restaurant, 2124755829));
        details.add(new Detail("Tamarind Tribeca", "99 Hudson St, New York, NY 10013", R.drawable.restaurant, 2127759000));

        DetailAdapter adapter = new DetailAdapter(getActivity(),details,R.color.colorAccent);

        ListView listView = (ListView)rootView.findViewById(R.id.detail_list);

        listView.setAdapter(adapter);
        return rootView;

    }
}
