package com.dicoding.myproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;

public class Fragment2 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fragment2, container, false);
        ImageButton butt= (ImageButton) rootView.findViewById(R.id.button3);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pindah2();
            }
        });
        return rootView;
//        return inflater.inflate(R.layout.fragment_fragment2, container, false);

    }
    public void Pindah2(){
        Intent intent = new Intent(getActivity().getApplication(), MainActivity.class);
        startActivity(intent);
    }
}
