package botecodigital.info.abastest;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by rodrigo on 26/01/18.
 */

public class TerceiroFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.terceiro_fragment, container, false);

        TextView tv = view.findViewById(R.id.text3);
        tv.setText("Você está na teceiro aba");
        
        return view;
    }

}
