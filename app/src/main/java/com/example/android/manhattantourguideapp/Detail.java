package com.example.android.manhattantourguideapp;

/**
 * Created by 재은 on 2017-02-28.
 */

public class Detail {

    private String dname;
    private String dlocation;
    private int dnum;
    private int mImageResourceId;

    public Detail(String name,String location,int imageResourceId,int num){
        dname = name;
        dlocation = location;
        dnum = num;
        mImageResourceId = imageResourceId;
    }

    public Detail(String name, String location,int imageResourceId){
        dname = name;
        dlocation = location;
        mImageResourceId = imageResourceId;
    }
    public String getdname(){return dname;}

    public String getdlocation(){return dlocation;}

    public int getImageResourceId(){return mImageResourceId;}
    public int getdnum(){return dnum;}

    @Override
    public String toString() {
        return "Detail{" +
                "dname='" + dname + '\'' +
                ", dlocation='" + dlocation + '\'' +
                ", dnum=" + dnum +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }

}
