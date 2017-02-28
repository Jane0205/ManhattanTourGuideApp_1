package com.example.android.manhattantourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 재은 on 2017-02-28.
 */

public class FragmentHolder extends Fragment{

    private static final String ARG_SECTION_NUMBER = "section_number";

    public FragmentHolder(){}

    public static FragmentHolder newInstance(int sectionNumber){
        FragmentHolder fragment = new FragmentHolder();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER,sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.list_detail,container,false);
        return rootView;
    }
}
