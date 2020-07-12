package com.example.dallastourapp;


import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VenueAdapter extends RecyclerView.Adapter<VenueHolder>{

    private final ArrayList<Venue> venues;

    VenueAdapter(ArrayList<Venue> venues) {this.venues = venues; }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @NonNull
    @Override
    public VenueHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new VenueHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull VenueHolder holder, int position) {
        holder.setVenue(venues.get(position));
    }

    @Override
    public int getItemCount() {
        return venues.size();
    }
}
