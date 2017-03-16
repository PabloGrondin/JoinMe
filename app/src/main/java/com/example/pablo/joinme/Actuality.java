package com.example.pablo.joinme;

import android.app.LauncherActivity;
import android.app.ListFragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;

import android.support.v4.app.FragmentManager ;


import java.util.ArrayList;

import static android.R.id.list;


public class Actuality extends Fragment{

/*
This fragment will display the actuality so we use a list fragment
 */

    SimpleAdapter simpleAdapter ;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Lik to the layout fragment activity
        ViewGroup viewGroup = (ViewGroup)inflater.inflate(R.layout.fragment_actuality,container,false) ;

        String[] place = {"English","French","Khmer","Japanese","Russian","Chinese"};
        String[] topic = {"Osef","txt2","Lieu evenement","Encore autre chose","Biblio","cafe"} ;
        String[] time = {"12h00","13h15","20h30 20h30","13h15","12h00","20h30"} ;
        int[] level = {1,4,3,6,8,3,2} ;


        // // Link to the listView which belong to the fragment activity (here the viewGroup)
        ListView listView = (ListView)viewGroup.findViewById(R.id.list_fragment) ;

        /*
        ArrayAdapter which take the text in the layout content_list and affect it to the data
        Then we link the text with our list view

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.content_list,R.id.txtList1,data) ;
        listView.setAdapter(adapter);
        */
        // ArrayList<LauncherActivity.ListItem> myList = new ArrayList<LauncherActivity.ListItem>();

        ArrayList<List_actuality> pays = new ArrayList<List_actuality>();

        for (int i = 0; i < place.length ; i++)
        {
            pays.add(new List_actuality(place[i],topic[i],time[i],level[i])) ;
        }


        List_adapter list_adapter = new List_adapter(getContext(),pays) ;


        listView.setAdapter(list_adapter);

        setRetainInstance(true);

        return viewGroup ;

    }






}
/*
 SimpleAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list_view__personnalise);

        listView = (ListView) findViewById(R.id.listView1);

        String[] names = new String[] { "Cristiano Ronaldo", "Lionel Messi",
                "Pelé", "Maradona" };

        int[] ages = { 30, 27, 74, 54 };

        int[] images = { R.mipmap.ic_img_osf, R.mipmap.ic_launcher,
                R.mipmap.ic_limg, R.mipmap.ic_launcher};

        ArrayList<ListItem> myList = new ArrayList<ListItem>();

        for (int i = 0; i < names.length; i++) {
            myList.add(new ListItem(names[i], ages[i], images[i]));
        }

        CustomAdapter adapter = new CustomAdapter(this, myList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(adapter);
 */

/*
Person person;

        ArrayList<Person> persons = new ArrayList<Person>();

        person = new Person();
        person.setName("Vipul");
        person.setAge(20);
        persons.add(person);

        person = new Person();
        person.setName("Anil");
        person.setAge(22);
        persons.add(person);

        setListAdapter(new MyAdapter(this, persons));
 */