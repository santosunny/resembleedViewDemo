package com.example.sunny.myresembledview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MyResembledView extends RelativeLayout {

    private ImageView ivLeft;
    private ImageView ivRight;
    private TextView tvCenter;

    public MyResembledView(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.layout_resembled_view, this);

        ivLeft = findViewById(R.id.iv_left);
        ivRight = findViewById(R.id.iv_right);
        tvCenter = findViewById(R.id.tv_center);
    }

    public void setOnLeftImgClickListener(OnClickListener listener) {
        ivLeft.setOnClickListener(listener);
    }

    public void setOnRightImgClickListener(OnClickListener listener) {
        ivRight.setOnClickListener(listener);
    }

    public void setTvCenterText(String s) {
        tvCenter.setText(s);
    }

}