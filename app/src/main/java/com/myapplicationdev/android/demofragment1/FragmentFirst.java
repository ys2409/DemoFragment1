package com.myapplicationdev.android.demofragment1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FragmentFirst extends Fragment {

    // TODO: Rename and change types of parameters
    Button btnAddText;
    TextView tvFrag1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        tvFrag1 = view.findViewById(R.id.tvFrag1);
        btnAddText = view.findViewById(R.id.btnAddTextFrag1);

        btnAddText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = tvFrag1.getText().toString() + "\n" + "New Data";
                tvFrag1.setText(data);
            }
        });
        return view;
    }
}