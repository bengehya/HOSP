package com.example.aska;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.aska.databinding.FragmentNotificationsBinding;
import java.util.ArrayList;
import java.util.List;

public class NotificationsFragment extends Fragment {
    private FragmentNotificationsBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<String> notifications = new ArrayList<>();
        notifications.add("New message from Kapita");
        notifications.add("New message from Ally");
        notifications.add("System update available");
        notifications.add("Meeting at 2 PM");
        notifications.add("System update available");
        notifications.add("Apointment at 5 PM");
        notifications.add("New security patch available for your device");
        notifications.add("You have 5 new friend requests");
        notifications.add("Reminder: Submit your assignment by 5 PM today");
        notifications.add("Low battery warning");
        notifications.add("Your appointment with Dr. Smith is at 10 AM tomorrow");
        notifications.add("New message from your colleague");
        notifications.add("App version 2.0 update available");


        NotificationAdapter adapter = new NotificationAdapter(notifications);
        binding.recyclerView.setAdapter(adapter);

        return binding.getRoot();
    }
}
