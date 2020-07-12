package com.example.dallastourapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/**
 * A  {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main,container,false);

        ArrayList<Venue> venues = new ArrayList<>();
        venues.add(new Venue(getString(R.string.restau_truck_yard),getString(R.string.dallas),getString(R.string.truck_yard_expl),R.drawable.truck_yard));
        venues.add(new Venue(getString(R.string.restau_pecan_lodge),getString(R.string.dallas),getString(R.string.pecan_lodge_expl),R.drawable.pecan_lodge));
        venues.add(new Venue(getString(R.string.restau_rodeo_goat),getString(R.string.dallas),getString(R.string.rodeo_goat_expl),R.drawable.rodeo_goat));
        venues.add(new Venue(getString(R.string.restau_town_hearth),getString(R.string.dallas),getString(R.string.town_hearth_expl),R.drawable.town_hearth));

        RecyclerView recyclerView = rootView.findViewById(R.id.section_container);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        VenueAdapter venueAdapter = new VenueAdapter(venues);
        recyclerView.setAdapter(venueAdapter);

        return rootView;

    }
}
