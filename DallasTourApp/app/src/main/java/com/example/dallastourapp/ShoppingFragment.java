package com.example.dallastourapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A  {@link Fragment} subclass.
 */
public class ShoppingFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main,container,false);

        ArrayList<Venue> venues = new ArrayList<>();
        venues.add(new Venue(getString(R.string.shop_galleria),getString(R.string.dallas),getString(R.string.galleria_expl),R.drawable.galleria));
        venues.add(new Venue(getString(R.string.shop_north_park_center),getString(R.string.dallas),getString(R.string.north_park_center_expl),R.drawable.north_park));
        venues.add(new Venue(getString(R.string.shop_dallas_farmer_market),getString(R.string.dallas),getString(R.string.dallas_farmer_market_expl),R.drawable.dallas_farmer_market));
        venues.add(new Venue(getString(R.string.shop_highland_park_village),getString(R.string.dallas),getString(R.string.highland_park_village_expl),R.drawable.highland_park));

        RecyclerView recyclerView = rootView.findViewById(R.id.section_container);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        VenueAdapter venueAdapter = new VenueAdapter(venues);
        recyclerView.setAdapter(venueAdapter);

        return rootView;

    }
}
