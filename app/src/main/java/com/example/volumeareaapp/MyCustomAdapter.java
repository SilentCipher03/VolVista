package com.example.volumeareaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter <Shape>{

    private ArrayList<Shape> shapesArrayList;
    Context context;

    public MyCustomAdapter(ArrayList<Shape> shapesArrayList, Context context1) {
        super(context1, R.layout.grid_item_layout, shapesArrayList);
        this.shapesArrayList = shapesArrayList;
        this.context = context1;
    }

    // View Holder
    private static class MyViewHolder{

        TextView shapeName;
        ImageView shapeImg;
    }

    // getView() method


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Get the shape object for the current positions

        Shape shapes = getItem(position);

        //Inflating the layout we check whether convertView is null or not if null then create a new one

        MyViewHolder myViewHolder;
        if(convertView == null){
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());

            convertView = inflater.inflate(
                 R.layout.grid_item_layout,
                 parent,
                 false
            );

            // finding views
            myViewHolder.shapeName = (TextView) convertView.findViewById(R.id.itemTextView);
            myViewHolder.shapeImg = (ImageView) convertView.findViewById(R.id.itemImageView);

            convertView.setTag(myViewHolder);

        }else {

            //
            myViewHolder = (MyViewHolder) convertView.getTag();

        }

        myViewHolder.shapeName.setText(shapes.getShapeName());
        myViewHolder.shapeImg.setImageResource(shapes.getShapeImg());

        return convertView;

    }
}
