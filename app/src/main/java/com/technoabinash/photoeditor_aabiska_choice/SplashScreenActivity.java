package com.technoabinash.photoeditor_aabiska_choice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.technoabinash.photoeditor_aabiska_choice.databinding.ActivitySplashScreenBinding;

public class SplashScreenActivity extends AppCompatActivity {
    Animation topAni,buttonAni,leftAni,rightAni;
    ActivitySplashScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
       binding=ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        topAni= AnimationUtils.loadAnimation(this,R.anim.top_anim);
        buttonAni= AnimationUtils.loadAnimation(this,R.anim.bottom_anim);
        leftAni= AnimationUtils.loadAnimation(this,R.anim.left_anim);
        rightAni= AnimationUtils.loadAnimation(this,R.anim.right_anim);

        binding.topImg.setAnimation(buttonAni);
        binding.bottomImg.setAnimation(topAni);
        binding.leftTxt.setAnimation(rightAni);
        binding.rightTxt.setAnimation(leftAni);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashScreenActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },7000);
    }
}