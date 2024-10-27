package com.example.qquimz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

public class QuizItemAdapter extends ArrayAdapter<QuizItem> {

    public QuizItemAdapter(Context context, ArrayList<QuizItem> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        QuizItem item = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.history, parent, false);
        }

        TextView date = convertView.findViewById(R.id.item_date);
        ImageView image = convertView.findViewById(R.id.item_image);
        TextView name = convertView.findViewById(R.id.item_name);
        TextView content = convertView.findViewById(R.id.item_content);
        TextView result = convertView.findViewById(R.id.item_result);
        TextView category = convertView.findViewById(R.id.item_category);

        date.setText(item.date);
        image.setImageResource(item.imageResourceId);
        name.setText(item.name);
        content.setText(item.content);
        result.setText(item.result);
        category.setText(item.category);

        return convertView;
    }
}
