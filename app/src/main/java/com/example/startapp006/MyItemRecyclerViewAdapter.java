package com.example.startapp006;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {

    private final List<Items> mValues;

    public MyItemRecyclerViewAdapter(List<Items> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Items item = mValues.get(position);
        holder.msurnameView.setText(item.surname);
        holder.mnameView.setText(item.name);
        holder.meMailView.setText(item.eMail);
        holder.mphoneNumberView.setText(item.phoneNumber);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView msurnameView;
        public final TextView mnameView;
        public final TextView meMailView;
        public final TextView mphoneNumberView;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            msurnameView = (TextView) view.findViewById(R.id.lSurname);
            mnameView = (TextView) view.findViewById(R.id.lName);
            meMailView = (TextView) view.findViewById(R.id.leMail);
            mphoneNumberView = (TextView) view.findViewById(R.id.lPhoneNumber);

            view.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                }
            });
        }

//        @Override
//        public String toString() {
//            return super.toString() + " '" + mnameView.getText() + "'";
//        }
    }

}