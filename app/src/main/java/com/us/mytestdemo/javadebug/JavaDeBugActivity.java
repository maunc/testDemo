package com.us.mytestdemo.javadebug;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.us.mytestdemo.R;
import com.us.mytestdemo.function.KzhsHelper;
import com.us.mytestdemo.function.KzhsHelperKt;

public class JavaDeBugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_de_bug);

        //这里是java调用Kotlin的扩展方法
        KzhsHelper kzhsHelper = new KzhsHelper();
        KzhsHelperKt.kzhs1(kzhsHelper);
    }
}