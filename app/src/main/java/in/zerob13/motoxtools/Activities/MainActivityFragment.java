package in.zerob13.motoxtools.Activities;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import in.zerob13.motoxtools.Modules.Simfake;
import in.zerob13.motoxtools.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {
    private Button fakeSimAll;
    private Button fakeSimNum;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        fakeSimAll = (Button) rootView.findViewById(R.id.fakesimall);
        fakeSimNum = (Button) rootView.findViewById(R.id.fakenumonly);
        fakeSimNum.setOnClickListener(this);
        fakeSimAll.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View view) {
        if(view.equals(fakeSimAll)){
            Simfake.fakeSimAll();
        }
        if(view.equals(fakeSimNum)){
            Simfake.fakeSimNum();
        }
    }
}
