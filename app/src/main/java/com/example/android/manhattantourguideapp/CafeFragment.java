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

public class CafeFragment extends Fragment {

    public static RestaurantFragment newInstance(){
        RestaurantFragment fragment = new RestaurantFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.detail_list,container,false);

        final ArrayList<Detail> details = new ArrayList<Detail>();
        details.add(new Detail("Café Carlyle", "The Carlyle, A Rosewood Hotel, 35 E 76th St, New York", R.drawable.cafe, 2127441600));
        details.add(new Detail("Mamajuana Cafe", "247 Dyckman St, New York", R.drawable.cafe,2123040140));
        details.add(new Detail("Piccolo Cafe", "313 Amsterdam Ave, New York", R.drawable.cafe, 2128730962));
        details.add(new Detail("Macaron Cafe", "44 E 59th St, New York, NY 10022", R.drawable.cafe, 2124862470));
        details.add(new Detail("Caffe Bene", "9 Edward M Morgan Pl, New York, NY 10032", R.drawable.cafe,467915518));
        details.add(new Detail("Europa Cafe", "205 W 57th St # 2, New York, NY 10019", R.drawable.cafe, 2129774030));
        details.add(new Detail("Café Habana", "17 Prince St, New York, NY 10012", R.drawable.cafe, 2126252001));
        details.add(new Detail("Joe Pro Shop & Headquarters", " 131 W 21st St, New York, NY 10011", R.drawable.cafe,2129247400));

        DetailAdapter adapter = new DetailAdapter(getActivity(),details,R.color.colorAccent);

        ListView listView = (ListView)rootView.findViewById(R.id.detail_list);

        listView.setAdapter(adapter);
        return rootView;

    }
}
