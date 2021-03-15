package com.leavesc.myapplicationdatabindingtest.adapter;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

//声明绑定函数，
@BindingMethods(
        @BindingMethod(
                type = TextView.class       //类型为
                , attribute = "myText"      //对象
                , method = "setText"        //使用的函数，不是自己写的函数，是对象类型自带的函数
        )
)

public class TextViewBindingAdapter {

    //这个就是在MainActivity.java中，使用的函数
    /*TextViewBindingAdapter.setColorText(
    binding.tv6
    , binding.tv4.getText()
    , binding.sbStart.getProgress()
    , binding.sbEnd.getProgress(),
    Color.rgb(binding.sbR.getProgress(), binding.sbG.getProgress(), binding.sbB.getProgress())
    );*/

    //绑定的说明，一定要加上@BindingAdapter来说明下面setColorText中，使用函数与被绑定变量的对应关系。
    @BindingAdapter(            //    void setColorText(
            value = {           //        TextView textView
            "colorText"         //        , CharSequence colorText
            , "colorStart"      //        , int colorStart
            , "colorEnd"        //        , int colorEnd
            , "colorTextColor"  //        , int colorTextColor
    }, requireAll = false)      //    )


    //这个就是在MainActivity.java中，被绑定的函数对应上面的@BindingAdapter对接关系，实现下面的函数。
    public static void setColorText(
            TextView textView               //value对应某个对象，做
            , CharSequence colorText        //"colorText"
            , int colorStart                //"colorStart"
            , int colorEnd                  //"colorEnd"
            , int colorTextColor) {         //"colorTextColor"
        if (colorText != null) {
            SpannableString spannableString = new SpannableString(colorText);
            spannableString.setSpan(new ForegroundColorSpan(colorTextColor)
                    , Math.min(Math.min(colorStart, colorEnd), colorText.length())
                    , Math.min(Math.max(colorStart, colorEnd), colorText.length())
                    , Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
            textView.setText(spannableString);
        } else {
            textView.setText(colorText);
        }
    }
}
