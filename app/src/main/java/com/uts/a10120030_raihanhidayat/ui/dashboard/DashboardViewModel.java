/**
 *
 * Nim : 10120030
 * Kelas : IF1
 * Nama : Muhammad Raihan Hidayat
 * Email : mrhidayat420@gmail.com
 *
 */

package com.uts.a10120030_raihanhidayat.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}