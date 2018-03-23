package com.heguodong.template;

import android.util.Log;

/**
 * Created by 何国栋 on 2018/3/23.
 */

public class Teacher extends AbstractPerson {
    @Override
    public void dressUp() {
        Log.i("heguodong","穿工作服");
    }

    @Override
    public void eatBreakfast() {
        Log.i("heguodong","做早饭，照顾孩子吃早饭");
    }

    @Override
    public void takeThings() {
        Log.i("heguodong","带上昨晚准备的考卷");
    }
}
