package com.demo.widget.huige;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class RoundRectView extends View {
    Paint mPaint;

    private PorterDuff.Mode mTintMode = PorterDuff.Mode.SRC_IN;
    public RoundRectView(Context context) {
        super(context);
    }

    public RoundRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public RoundRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint = new Paint();
//        ColorFilter m = new PorterDuffColorFilter(Color.TRANSPARENT, mTintMode);
//        mPaint.setColorFilter(m);
        mPaint.setColor(Color.WHITE);
        mPaint.setStrokeWidth(5f);

        // 绘制一个矩形作为背景，可以进行观察
        RectF rect =new RectF(50f, 50f, 800f, 600f);
//        canvas.drawRect(rect, mPaint);

        // 绘制圆角，半径小于矩形宽的一半
        mPaint.setColor(Color.BLACK);
        // 发现，绘制后，圆角弧度与
        canvas.drawRoundRect(rect, 100f, 100f, mPaint);

    }
}
