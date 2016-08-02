package com.lmntrx.basilarackal.munchits;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by nihal on 8/2/2016.
 */
public class HintAdapter extends ArrayAdapter<String> {
    public HintAdapter(Context theContext, ArrayList<String> objects, int theLayoutResId) {
        super(theContext, theLayoutResId, objects);
    }

    @Override
    public int getCount() {
        // don't display last item. It is used as hint.
        int count = super.getCount();
        return count > 0 ? count - 1 : count;
    }
}
