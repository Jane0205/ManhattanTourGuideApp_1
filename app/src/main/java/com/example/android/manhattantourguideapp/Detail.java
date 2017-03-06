package com.example.android.manhattantourguideapp;

/**
 * Created by 재은 on 2017-02-28.
 */

public class Detail {

    private int dname;
    private int dlocation;
    private int dnum;
    private int mImageResourceId;

    public Detail(int name,int location,int imageResourceId,int num){
        dname = name;
        dlocation = location;
        dnum = num;
        mImageResourceId = imageResourceId;
    }

    public int getdname(){return dname;}

    public int getdlocation(){return dlocation;}

    public int getImageResourceId(){return mImageResourceId;}
    public int getdnum(){return dnum;}


}
