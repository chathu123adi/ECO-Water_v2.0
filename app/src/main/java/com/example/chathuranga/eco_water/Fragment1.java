package com.example.chathuranga.eco_water;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

//    Button click;
//    public static TextView data;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceStage){
        View rootView = inflater.inflate(R.layout.fragment_fragment1,container, false);



        //handle button here
        View aboutButton= rootView.findViewById(R.id.button2);

        aboutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), fetchActivity.class);
                startActivity(intent);
//                FetchData fetchData2= new FetchData();
//                fetchData2.execute();
            }
        });
        return rootView;
    }

    //When the activity containing the fragment is paused
    public void onPause(){
        super.onPause();
    }

}
