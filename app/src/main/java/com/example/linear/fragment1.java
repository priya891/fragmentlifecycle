package com.example.linear;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment1 extends Fragment{
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("lifecycle","onAttach invoked");
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("lifecycle","onCreate2 invoked");
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("lifecycle","onCreateView invoked");
        return inflater.inflate(R.layout.activity_fragment1,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("lifecycle","onActivityCreated invoked");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart2 invoked");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume2 invoked");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause2 invoked");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop2 invoked");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("lifecycle","ondestroyview invoked");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy2 invoked");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("lifecycle","onDetach invoked");
    }
}


