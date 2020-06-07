package com.example.bcspro.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bcspro.R;
import com.example.bcspro.adapter.FeatureAdapter;
import com.example.bcspro.model.Feature;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    ArrayList<Feature> featuresList;
    RecyclerView feature_container;
    RelativeLayout layout_exam;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.navigation_home_fragment,container,false);
        feature_container=view.findViewById(R.id.item_container);
        layout_exam=view.findViewById(R.id.layout_exam);
        layout_exam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Layout Clicked",Toast.LENGTH_LONG).show();
            }
        });

        initView(view);
        setUpAdapter();


        return view;

    }

    private void setUpAdapter() {

        feature_container.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getActivity(),3);
        feature_container.setLayoutManager(gridLayoutManager);
        FeatureAdapter adapter=new FeatureAdapter(getActivity(),featuresList);
        feature_container.setAdapter(adapter);
    }

    private void initView(View view) {

        featuresList=new ArrayList<>();
        featuresList.add(new Feature(R.drawable.algorithm,"Question"));
        featuresList.add(new Feature(R.drawable.bonfire,"Listed Question"));
        featuresList.add(new Feature(R.drawable.coffee,"Syllabus"));
        featuresList.add(new Feature(R.drawable.security,"Study"));
        featuresList.add(new Feature(R.drawable.seo,"Home"));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
