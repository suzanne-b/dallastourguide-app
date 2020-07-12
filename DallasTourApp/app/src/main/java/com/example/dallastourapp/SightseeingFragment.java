package com.example.dallastourapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * A  {@link Fragment} subclass.
 */
public class SightseeingFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main,container,false);

        ArrayList<Venue> venues = new ArrayList<>();
        venues.add(new Venue(getString(R.string.ss_jfk_museum),getString(R.string.dallas),getString(R.string.jfk_museum_expl),R.drawable.jfk_museum));
        venues.add(new Venue(getString(R.string.ss_fort_worth_stockyards),getString(R.string.fort_worth),getString(R.string.fort_stock_stockyards_expl),R.drawable.fortworth_stockyards));
        venues.add(new Venue(getString(R.string.ss_south_fork_ranch),getString(R.string.parker),getString(R.string.south_fork_ranch_expl),R.drawable.southfork_ranch));
        venues.add(new Venue(getString(R.string.ss_dallas_museum_of_arts),getString(R.string.dallas),getString(R.string.dallas_museum_of_arts_expl),R.drawable.dallas_museum_of_arts));

        RecyclerView recyclerView = rootView.findViewById(R.id.section_container);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        VenueAdapter venueAdapter = new VenueAdapter(venues);
        recyclerView.setAdapter(venueAdapter);

        return rootView;

    }
}
