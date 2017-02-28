package com.example.android.manhattantourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 재은 on 2017-02-28.
 */

public class DetailAdapter extends ArrayAdapter<Detail>{

    private int mColorResourceId;

    public DetailAdapter(Context context,ArrayList<Detail> details,int colorResourceId){
        super(context,0,details);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_detail,parent,false);
        }
        Detail currentDetail = getItem(position);

        TextView nameTextView = (TextView)listItemView.findViewById(R.id.name);
        nameTextView.setText(currentDetail.getdname());

        TextView locationTextView = (TextView)listItemView.findViewById(R.id.location);
        locationTextView.setText(currentDetail.getdlocation());

        TextView numTextView = (TextView)listItemView.findViewById(R.id.num);
        numTextView.setText(currentDetail.getdnum());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image);
            imageView.setImageResource(currentDetail.getImageResourceId());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
