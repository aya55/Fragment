package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.os.Bundle;
import  android.app.FragmentManager;
import  android.app.FragmentTransaction;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public  void  changeFragment(View view){
        Fragment fragment;
        if(view==findViewById(R.id.bttn1)){

          fragment=new Fragment1();
          FragmentManager fragmentManager=getFragmentManager();
          FragmentTransaction ft=fragmentManager.beginTransaction();
          ft.replace(R.id.frag1,fragment);
          ft.commit();
        }
        if(view==findViewById(R.id.bttn2)) {
            fragment = new  Fragment2();
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction ft=fragmentManager.beginTransaction();
            ft.replace(R.id.frag1,fragment);
            ft.commit();
        }
    }
}

