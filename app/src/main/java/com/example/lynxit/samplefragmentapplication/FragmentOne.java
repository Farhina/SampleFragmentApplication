package com.example.lynxit.samplefragmentapplication;

import android.app.ListFragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by farhina on 25/01/2016.
 */
public class FragmentOne extends ListFragment {

    int colors[] = new int[] {Color.RED, Color.DKGRAY,Color.BLUE,Color.CYAN,Color.GREEN,Color.MAGENTA,Color.YELLOW};
    String color_name[] = new String[] {"RED", "DKGRAY", "BLUE","CYAN", "GREEN","MAGENTA","YELLOW"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.fragment_one,container);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,color_name);
        setListAdapter(adapter);
        return view;
    }

    @Override
    public void onListItemClick(ListView l,View v,int position, long id)
    {
        FragmentTwo fragment_two=(FragmentTwo) getFragmentManager().findFragmentById(R.id.fragment_two);
        fragment_two.setImageViewBackground(colors[position]);
        super.onListItemClick(l,v,position,id);
    }
}
