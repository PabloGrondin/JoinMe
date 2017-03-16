package com.example.pablo.joinme;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.onClick;


public class Create_event extends Fragment{


    SeekBar seekBarLevel ;
    ImageButton imageButton ;
    TextView textView ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_create_event, container, false);
        seekBarLevel = (SeekBar)view.findViewById(R.id.level) ;
        imageButton = (ImageButton)view.findViewById(R.id.imgTime) ;
        textView = (TextView)view.findViewById(R.id.txtEssai) ;


        seekBarLevel.setMax(5);

        // Inflate the layout for this fragment
        imageButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                //Context context = v.getContext() ;
               // Toast.makeText(getActivity(),"coucou",Toast.LENGTH_SHORT).show(); ;
                //textView.setText("Connard de merde");

                DialogFragment newFragment = new TimePickerFragment();
                newFragment.show(getFragmentManager(),"Time Picker");


            }
            public void showTimePickerDialog(View v) {
                DialogFragment newFragment = new TimePickerFragment();
                newFragment.show(getFragmentManager(),"Time Picker");

            }

        });

        return view ;

    }





}
