/**
 * Copyright (c) 2012 Todoroo Inc
 *
 * See the file "LICENSE" for the full license governing this code.
 */
package com.todoroo.astrid.people;

import android.app.Activity;

import com.timsu.astrid.R;
import com.todoroo.astrid.activity.FilterListFragment;
import com.todoroo.astrid.adapter.FilterAdapter;
import com.todoroo.astrid.utility.AstridPreferences;

public class PeopleListFragment extends FilterListFragment {

    @Override
    protected FilterAdapter instantiateAdapter() {
        return new PeopleFilterAdapter(getActivity(), null, R.layout.filter_adapter_row, false);
    }

    @Override
    protected int getLayout(Activity activity) {
        if (AstridPreferences.useTabletLayout(activity))
            return R.layout.filter_list_fragment_alternative_3pane;
        else
            return R.layout.filter_list_fragment_alternative;
    }
}
