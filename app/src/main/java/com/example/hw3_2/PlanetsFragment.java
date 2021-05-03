package com.example.hw3_2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class PlanetsFragment extends Fragment {


    RecyclerView recyclerView;

     String s1[],s2[];
     int images[] = {R.drawable.earth,R.drawable.venera,R.drawable.uran,R.drawable.jupiter};

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public PlanetsFragment() {
    }

    public static PlanetsFragment newInstance(String param1, String param2) {
        PlanetsFragment fragment = new PlanetsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_planets, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);

        s1 = getResources().getStringArray(R.array.Planets);
        s2 = getResources().getStringArray(R.array.description);

        return view;
    }
}