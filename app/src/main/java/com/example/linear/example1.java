package com.example.linear;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class example1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_example1 ,container,false);
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("lifecycle","onCreate1 invoked");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart1 invoked");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume1 invoked");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause1 invoked");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop1 invoked");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy1 invoked");
    }
}

