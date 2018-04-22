package com.example.android.miwok;

/**
 * Created by ADMIN on 6/3/2017.
 */
import android.view.View;
import android.widget.Toast;


public class NumbersClickListener implements  View.OnClickListener {
    @Override
    public void onClick(View view)
    {
        Toast.makeText(view.getContext(),"open list of contacts",Toast.LENGTH_SHORT).show();
    }
}
