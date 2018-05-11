package com.example.hegaz.otcvat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class adapter extends BaseAdapter {

    LayoutInflater mInflator;
    String [] Questions;


    public adapter (Context c , String[] i){
    Questions = i;
    mInflator = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return Questions.length;
    }

    @Override
    public Object getItem(int position) {
        return Questions[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = mInflator.inflate(R.layout.listadapter, null);
        TextView questionTextView =  (TextView) v.findViewById(R.id.questionTextView);

        questionTextView.setText(Questions[position]);

        return v;

    }

}
