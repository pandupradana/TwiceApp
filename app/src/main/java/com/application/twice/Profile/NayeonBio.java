package com.application.twice.Profile;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.application.twice.R;

public class NayeonBio extends Fragment {

    public NayeonBio() {


    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //inflate
        return inflater.inflate(R.layout.activity_nayeon_bio, container, false);
    }


}
