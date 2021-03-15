package com.leavesc.myapplicationdatabindingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.SeekBar;

//最好加上这个，方便拿取变量，要不然变量名就会变得很长
import com.leavesc.myapplicationdatabindingtest.databinding.ActivityMainBinding;
import com.leavesc.myapplicationdatabindingtest.adapter.TextViewBindingAdapter;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //一定要用下面那两句替换，要不然不能够绑定
        //setContentView(R.layout.activity_main);

        //以下那两句，就是说明绑定
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());

        //绑定后，就可以通过绑定的页面中，给某个变量（android:id="@+id/sbStart"），进行操作
        binding.sbStart.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                //给自己写的类TextViewBindingAdapter，进行操作
                TextViewBindingAdapter.setColorText(binding.tv6, binding.tv4.getText(), binding.sbStart.getProgress(), binding.sbEnd.getProgress(),
                        Color.rgb(binding.sbR.getProgress(), binding.sbG.getProgress(), binding.sbB.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //绑定后，就可以通过绑定的页面中，给某个变量（android:id="@+id/sbEnd"），进行操作
        binding.sbEnd.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                TextViewBindingAdapter.setColorText(
                        binding.tv6
                        , binding.tv4.getText()
                        , binding.sbStart.getProgress()
                        , binding.sbEnd.getProgress()
                        , Color.rgb(binding.sbR.getProgress(), binding.sbG.getProgress(), binding.sbB.getProgress())
                );

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //绑定后，就可以通过绑定的页面中，给某个变量（android:id="@+id/sbR"），进行操作
        binding.sbR.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                TextViewBindingAdapter.setColorText(binding.tv6, binding.tv4.getText(), binding.sbStart.getProgress(), binding.sbEnd.getProgress(),
                        Color.rgb(binding.sbR.getProgress(), binding.sbG.getProgress(), binding.sbB.getProgress()));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //绑定后，就可以通过绑定的页面中，给某个变量（android:id="@+id/sbG"），进行操作
        binding.sbG.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                TextViewBindingAdapter.setColorText(binding.tv6, binding.tv4.getText(), binding.sbStart.getProgress(), binding.sbEnd.getProgress(),
                        Color.rgb(binding.sbR.getProgress(), binding.sbG.getProgress(), binding.sbB.getProgress()));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //绑定后，就可以通过绑定的页面中，给某个变量（android:id="@+id/sbB"），进行操作
        binding.sbB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                TextViewBindingAdapter.setColorText(binding.tv6, binding.tv4.getText(), binding.sbStart.getProgress(), binding.sbEnd.getProgress(),
                        Color.rgb(binding.sbR.getProgress(), binding.sbG.getProgress(), binding.sbB.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
