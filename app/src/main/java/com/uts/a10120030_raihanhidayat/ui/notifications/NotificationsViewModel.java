/**
 *
 * Nim : 10120030
 * Kelas : IF1
 * Nama : Muhammad Raihan Hidayat
 * Email : mrhidayat420@gmail.com
 *
 */

package com.uts.a10120030_raihanhidayat.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}