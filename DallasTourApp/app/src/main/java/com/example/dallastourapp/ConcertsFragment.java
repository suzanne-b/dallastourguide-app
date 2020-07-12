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
public class ConcertsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main,container,false);

        ArrayList<Venue> venues = new ArrayList<>();
        venues.add(new Venue(getString(R.string.con_winspear_opera_house),getString(R.string.dallas),getString(R.string.winspear_opera_house_expl),R.drawable.winspear_opera));
        venues.add(new Venue(getString(R.string.con_granada_theater),getString(R.string.dallas),getString(R.string.granada_theater_expl),R.drawable.granada_theater));
        venues.add(new Venue(getString(R.string.con_the_rustic),getString(R.string.dallas),getString(R.string.the_rustic_expl),R.drawable.rustic_dallas));
        venues.add(new Venue(getString(R.string.con_adair_saloon),getString(R.string.dallas),getString(R.string.adair_saloon_expl),R.drawable.adair_saloon));

        RecyclerView recyclerView = rootView.findViewById(R.id.section_container);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        VenueAdapter venueAdapter = new VenueAdapter(venues);
        recyclerView.setAdapter(venueAdapter);

        return rootView;

    }
}
