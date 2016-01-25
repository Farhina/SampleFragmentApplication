package com.example.lynxit.samplefragmentapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by farhina on 25/01/2016.
 */
public class FragmentTwo extends Fragment {

    private ImageView imgView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_two,container);
        imgView = (ImageView) view.findViewById(R.id.imageView);

        return view;
    }

    public void setImageViewBackground(int colorValue){
        if(imgView!=null)
        {
            imgView.setBackgroundColor(colorValue);
        }
    }
}
