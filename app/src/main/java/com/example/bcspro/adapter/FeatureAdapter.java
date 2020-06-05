package com.example.bcspro.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bcspro.R;
import com.example.bcspro.model.Feature;

import java.util.ArrayList;

public class FeatureAdapter extends RecyclerView.Adapter<FeatureAdapter.FeatureViewHolder> {
     Context context;
    ArrayList<Feature> featuresList;
    public FeatureAdapter(Context context, ArrayList<Feature> featuresList) {
        this.context = context;
        this.featuresList = featuresList;
    }


    @NonNull
    @Override
    public FeatureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.feature_item_layout,parent,false);
        return new FeatureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeatureViewHolder holder, int position) {

        Feature feature=featuresList.get(position);
        holder.image_feature.setImageResource(feature.getImageResource());
        holder.name.setText(feature.getName());

    }

    @Override
    public int getItemCount() {
        return featuresList.size();
    }

    public class FeatureViewHolder extends RecyclerView.ViewHolder {
        ImageView image_feature;
        TextView name;
        public FeatureViewHolder(@NonNull View itemView) {
            super(itemView);
            image_feature=itemView.findViewById(R.id.feature_image);
            name=itemView.findViewById(R.id.f_name);
        }
    }
}
