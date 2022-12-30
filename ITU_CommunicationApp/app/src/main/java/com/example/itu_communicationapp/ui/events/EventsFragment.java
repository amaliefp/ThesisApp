package com.example.itu_communicationapp.ui.events;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.itu_communicationapp.databinding.FragmentEventsBinding;


public class EventsFragment extends Fragment {

    private FragmentEventsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        EventsViewModel eventsViewModel =
                new ViewModelProvider(this).get(EventsViewModel.class);

        //View contentView = inflater.inflate(R.layout.fragment_events, container, false);
        //ListView listView = contentView.findViewById(R.id.eventList);
        //return contentView;

        binding = FragmentEventsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // ArrayList<Event> events = eventsViewModel.getEventList();

        // ArrayAdapter<Event> itemsAdapter =
        // new ArrayAdapter<Event>(this, android.R.layout.simple_list_item_1, items);

        // ListView listView = (ListView) findViewById(R.id.lvItems);
        // listView.setAdapter(itemsAdapter);

        // final ListView listView = binding.eventList;

        final TextView textView = binding.textEvent;
        //final ImageButton firstEvent = binding.firstEventEvent;
        //final ImageButton secondEvent = binding.secondEventEvent;
        eventsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        //eventsViewModel.getEventList().observe(getViewLifecycleOwner(), listView::setScrollX);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}