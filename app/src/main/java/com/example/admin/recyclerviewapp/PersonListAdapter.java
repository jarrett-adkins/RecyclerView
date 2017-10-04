package com.example.admin.recyclerviewapp;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 10/3/2017.
 */

public class PersonListAdapter extends RecyclerView.Adapter<PersonListAdapter.ViewHolder> {

    private static final String TAG = "PersonListAdapter";
    List<Person> personList = new ArrayList<>();

    public PersonListAdapter(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: ");

        View view = LayoutInflater.from( parent.getContext() ).inflate(
                R.layout.person_list_item, parent, false );

        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: ");

        Person p = personList.get( position );
        holder.personName.setText( p.getName() );
        holder.personAge.setText( p.getAge() );
    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: ");

        return personList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView personName, personAge;

        public ViewHolder(View itemView) {
            super(itemView);

            personName = itemView.findViewById( R.id.tvName );
            personAge =  itemView.findViewById( R.id.tvAge );
        }
    }
}
