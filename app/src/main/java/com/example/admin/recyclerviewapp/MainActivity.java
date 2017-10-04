package com.example.admin.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPersonList;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.ItemAnimator itemAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPersonList = findViewById( R.id.rvPersonList );

        //create person objects
        List<Person> personList = new ArrayList<>();
        personList.add( new Person( "John", "34" ));
        personList.add( new Person( "Jacob", "12" ));
        personList.add( new Person( "Janice", "27" ));
        personList.add( new Person( "Joan", "67" ));

        layoutManager = new LinearLayoutManager( this );
        itemAnimator = new DefaultItemAnimator();

        PersonListAdapter pla = new PersonListAdapter( personList );

        rvPersonList.setLayoutManager( layoutManager );
        rvPersonList.setItemAnimator( itemAnimator );
        rvPersonList.setAdapter( pla );
    }
}
