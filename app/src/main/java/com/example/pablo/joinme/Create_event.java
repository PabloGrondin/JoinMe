package com.example.pablo.joinme;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.onClick;


public class Create_event extends Fragment{


    SeekBar seekBarLevel ;
    Button buttonTimeEvent;
    TextView textView ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_create_event, container, false);
        seekBarLevel = (SeekBar)view.findViewById(R.id.level) ;
        buttonTimeEvent = (Button)view.findViewById(R.id.timeEvent) ;
        textView = (TextView)view.findViewById(R.id.txtSeekBar) ;
        textView.setText(String.valueOf(seekBarLevel.getProgress()));

        //seekBarLevel.setMax(5);
        //seekBarLevel.setProgress(2);

        // Inflate the layout for this fragment
        buttonTimeEvent.setOnClickListener(new View.OnClickListener()
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

        });

        seekBarLevel.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        }) ;
        return view ;

    }





}
