package io.github.tuchangwei.notes;

import com.activeandroid.ActiveAndroid;

/**
 * Created by vale on 6/21/15.
 */
public class Application extends com.activeandroid.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //清除数据库
        //ActiveAndroid.dispose();
        //初始化数据库
        ActiveAndroid.initialize(this);
        
    }
}
