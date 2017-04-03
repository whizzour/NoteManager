package net.ucl.notemanager;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by User on 27.3.2017.
 */

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        setListAdapter(new SubjectsAdapter(this, R.layout.list_row, getResources().getStringArray(R.array.subjects)));
    }
}
