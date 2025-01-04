package com.example.parking.ui.parking;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.parking.R;

public class ParkingSimulatorFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.parking_simulator_layout, container, false);
        TextView cityView = view.findViewById(R.id.cityText);
        TextView parkView = view.findViewById(R.id.parkText);

       if (getArguments() == null){
           Toast.makeText(getContext(), "Error passing arguments..." , Toast.LENGTH_SHORT).show();

       }else{
           String city = getArguments().getString("city") + ",";
           String park = getArguments().getString("park") + ".";

            cityView.setText(city);
            parkView.setText(park);
       }

        return view;
    }
}
