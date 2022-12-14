package com.example.itu_communicationapp.ui.channels;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.itu_communicationapp.databinding.FragmentChannelsBinding;

/**
 * This fragment contains the UI for the Channels screen, which is created upon opening the app and then binding the data
 */
public class ChannelsFragment extends Fragment{

    private FragmentChannelsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ChannelsViewModel channelsViewModel =
                new ViewModelProvider(this).get(ChannelsViewModel.class);

        binding = FragmentChannelsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textChannels;
        channelsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}