package com.example.android.trackmysleepquality.sleeptracker

import androidx.recyclerview.widget.DiffUtil
import com.example.android.trackmysleepquality.database.SleepNight

// DONE (01) Create a new class called SleepNightDiffCallback that extends
// DiffUtil.ItemCallback<SleepNight>.
class SleepNightDiffCallback : DiffUtil.ItemCallback<SleepNight>() {
    // DOHE (02) In SleepNightDiffCallback, override areItemsTheSame() and areContentsTheSame().
    override fun areContentsTheSame(oldItem: SleepNight, newItem: SleepNight): Boolean {
        // If the ids are different, than the item is new
        return oldItem.nightId != newItem.nightId
    }

    override fun areItemsTheSame(oldItem: SleepNight, newItem: SleepNight): Boolean {
        //Since SleepNight is a data class, this comparison will work when any of it's variables are different, thanks to helper functions of the data class
        return oldItem == newItem
    }
}