package com.example.toko;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import org.json.JSONObject;

public class cateringEntry extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_catering_entry, container, false);
        MainActivity mainActivity = (MainActivity) getActivity();
        mainActivity.setListMenu((LinearLayout)rootView.findViewById(R.id.listMenuFragment));
        mainActivity.checkMenu(rootView.getContext());
        return rootView;
    }
}
