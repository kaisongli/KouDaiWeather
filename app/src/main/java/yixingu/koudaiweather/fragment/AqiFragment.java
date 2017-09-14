package yixingu.koudaiweather.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.yokeyword.fragmentation.SupportFragment;
import yixingu.koudaiweather.R;

/**
 * Created by likaisong on 17-4-29.
 */

public class AqiFragment extends SupportFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_aqi, container, false);
        return view;
    }
}
