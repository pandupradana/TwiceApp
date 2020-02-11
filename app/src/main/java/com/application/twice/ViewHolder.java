package com.application.twice;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;


public class ViewHolder extends RecyclerView.ViewHolder {

    View mView;


    public ViewHolder(View itemView){
        super(itemView);
        mView = itemView;

        //item click
        itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mClickListener.onItemClick(view, getAdapterPosition());
            }

        });
        //item long click
        itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mClickListener.onItemlongClick(view, getAdapterPosition());
                return true;
            }
        });
    }



    //set details to recycleview
    public void setDetails(Context ctx, String title, String description, String image){
        //views
        TextView mTitleTv = mView.findViewById(R.id.rTitleTv);
        TextView mDetailTv = mView.findViewById(R.id.rDescriptionTv);
        ImageView mImageTv = mView.findViewById(R.id.rImageView);
        //set data to view
        mTitleTv.setText(title);
        mDetailTv.setText(description);
        Picasso.get()
                .load(image)
                .resize(800,800)
                .centerCrop()
                .into(mImageTv);
    }

    private ViewHolder.ClickListener mClickListener;

    //interface to send callbacks
    public interface ClickListener{
        void onItemClick(View view, int Position);
        void onItemlongClick(View view, int position);
    }

    public void setOnClickListener (ViewHolder.ClickListener clickListener){
        mClickListener = clickListener;

    }

}

