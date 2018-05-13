package com.news.free.core.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.news.free.core.DaggerNewsComponent;
import com.news.free.core.NewsModule;
import com.news.free.core.R;

import javax.inject.Inject;
import javax.inject.Named;

public class NewsActivity extends AppCompatActivity {

    @Inject
    @Named(NewsModule.APP_NAME)
    String appName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_view);

        //how to inject it

        if (appName != null) {
            ((TextView) findViewById(R.id.appName_textView)).setText(appName);
        }
    }
}
