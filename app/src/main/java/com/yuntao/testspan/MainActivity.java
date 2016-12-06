package com.yuntao.testspan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int radiusColor = getResources().getColor(R.color.colorAccent);
        mText = (TextView) findViewById(R.id.text);
        String content = getString(R.string.content);
        SpannableString spanString = new SpannableString(content);
        int start = content.indexOf("loves");
        int end = start + "loves".length();
        spanString.setSpan(new RadiusBackgroundSpan(radiusColor, 10), start, end, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        start = content.indexOf("enough");
        end = start + "enough".length();
        spanString.setSpan(new RadiusBackgroundSpan(radiusColor, 10), start, end, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        start = content.indexOf("important!");
        end = start + "important!".length();
        spanString.setSpan(new RadiusBackgroundSpan(radiusColor, 10), start, end, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        start = content.indexOf("Somewhere");
        end = start + "Somewhere".length();
        spanString.setSpan(new RadiusBackgroundSpan(radiusColor, 10), start, end, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        start = content.indexOf("himself");
        end = start + "himself".length();
        spanString.setSpan(new RadiusBackgroundSpan(radiusColor, 10), start, end, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        mText.append(spanString);
    }
}
