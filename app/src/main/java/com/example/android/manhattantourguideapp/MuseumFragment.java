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

public class MuseumFragment extends Fragment {

    public static RestaurantFragment newInstance(){
        RestaurantFragment fragment = new RestaurantFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.detail_list,container,false);

        final ArrayList<Detail> details = new ArrayList<Detail>();
        details.add(new Detail("The Museum of Modern Art", "11 W 53rd St, New York, NY 10019", R.drawable.museum, 2127089400));
        details.add(new Detail("The Metropolitan Museum of Art", "1000 5th Ave, New York, NY 10028", R.drawable.museum, 2125357710));
        details.add(new Detail("American Museum of Natural History", " Central Park West & 79th St, New York, NY 10024", R.drawable.museum, 2127695100));
        details.add(new Detail("Solomon R. Guggenheim Museum", "1071 5th Ave, New York, NY 10128", R.drawable.museum, 2124233500));
        details.add(new Detail("Whitney Museum of American Art", "99 Gansevoort St, New York, NY 10014", R.drawable.museum, 2125703600));
        details.add(new Detail("Museum of Sex", "233 5th Ave, New York, NY 10016", R.drawable.museum, 2126896337));
        details.add(new Detail("The Morgan Library & Museum", " 225 Madison Ave, New York, NY 10016", R.drawable.museum, 2126850008));

        DetailAdapter adapter = new DetailAdapter(getActivity(),details,R.color.colorAccent);

        ListView listView = (ListView)rootView.findViewById(R.id.detail_list);

        listView.setAdapter(adapter);
        return rootView;

    }
}
