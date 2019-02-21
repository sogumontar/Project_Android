package com.dicoding.myproject;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Frgmnt1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//         Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frgmnt1, container, false);
    }
    public void goToLink(View v){
        Uri uri=Uri.parse("http://cis.del.ac.id");
        Intent in= new Intent(Intent.ACTION_VIEW, uri);
        startActivity(in);
    }

}
