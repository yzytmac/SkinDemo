package com.example.yzy.skindemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.LayoutInflaterCompat;

public class BaseActivity extends Activity {

    protected SkinFactory mSkinFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String flag = MyShrep.getInstance(this).getFlag();
        SkinManger.getInstance().init(this,flag);
        mSkinFactory = new SkinFactory();
        //监听布局填充的情况
        LayoutInflaterCompat.setFactory(getLayoutInflater(),mSkinFactory);
    }
}
