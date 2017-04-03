package net.ucl.notemanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by User on 27.3.2017.
 */

public class SubjectsAdapter extends ArrayAdapter {
    private int resource;
    private String[] items;

    public SubjectsAdapter(Context context, int resource, String[] items) {
        super(context, resource, items);
        this.resource = resource;
        this.items = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;

        if (rowView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(resource, parent, false);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.index = (TextView) rowView.findViewById(R.id.list_index);
            viewHolder.text = (TextView) rowView.findViewById(R.id.list_text);
            rowView.setTag(viewHolder);
        }
        ViewHolder viewHolder = (ViewHolder) rowView.getTag();
        viewHolder.index.setText(String.valueOf(position));
        viewHolder.text.setText(items[position]);

        return rowView;
    }
}
