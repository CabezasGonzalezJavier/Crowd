package com.javier.crowd.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.javier.crowd.R;
import com.javier.crowd.model.Task;

import java.util.List;

/**
 * Created by javiergonzalezcabezas on 8/11/15.
 */
public class TaskAdapter extends ArrayAdapter<Task> {
    private final Context mContext;
    private final List<Task> mList;

    public TaskAdapter(Context context, List<Task> list) {
        super(context, -1, list);
        this.mContext = context;
        this.mList = list;
    }

    static class ViewHolder {
        public TextView text;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;

        if (rowView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.row_task, null);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.text = (TextView) rowView.findViewById(R.id.row_task_text_view);
            rowView.setTag(viewHolder);
        }
        // fill data
        ViewHolder holder = (ViewHolder) rowView.getTag();
        String title = mList.get(position).getTitle();
        holder.text.setText(title);
        return rowView;
    }

}
