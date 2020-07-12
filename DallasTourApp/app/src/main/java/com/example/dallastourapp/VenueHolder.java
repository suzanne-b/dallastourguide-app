package com.example.dallastourapp;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

class VenueHolder extends RecyclerView.ViewHolder {

    private final TextView name;
    private final TextView location;
    private final TextView explanation;
    private final ImageView image;
    private boolean isHidden = true;

    /**
     * The constructor is required for ViewHolder.
     *
     * @param itemView View used by the Adapter
     */
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    VenueHolder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name_text);
        location = itemView.findViewById(R.id.location_text);
        explanation = itemView.findViewById(R.id.explanation_text);
        image = itemView.findViewById(R.id.image);

        //Sets the action to toggle when  the CardView is clicked.
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleVisibility();
            }
        });
    }

    /**
     * Sets properties of Views inside of CardView.
     *
     * @param venue Venue object containing the data to fill up CardView details
     */
    void setVenue(Venue venue) {
        name.setText(venue.getName());
        location.setText(venue.getLocation());
        explanation.setText(venue.getExplanation());
        image.setImageResource(venue.getImageResourceId());
    }

    /**
     * Expands or shrinks CardView based current state.
     */
    private void toggleVisibility() {
        if (isHidden) {
            location.setVisibility(View.VISIBLE);
            explanation.setVisibility(View.VISIBLE);
        } else {
            location.setVisibility(View.GONE);
            explanation.setVisibility(View.GONE);
        }
        isHidden = !isHidden;
    }
}
