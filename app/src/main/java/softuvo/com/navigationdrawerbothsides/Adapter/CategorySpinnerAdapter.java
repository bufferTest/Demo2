package softuvo.com.navigationdrawerbothsides.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import softuvo.com.navigationdrawerbothsides.R;

public class CategorySpinnerAdapter extends BaseAdapter implements SpinnerAdapter {

    private final Context activity;
    private ArrayList<String> asr;

    public CategorySpinnerAdapter(Context context, ArrayList<String> asr) {
        this.asr = asr;
        activity = context;
    }


    public int getCount() {
        return asr.size();
    }

    public Object getItem(int i) {
        return asr.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }


    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.category_spinner_item, parent, false);
        TextView txt1 = row.findViewById(R.id.tv_spinner_item);
        txt1.setText(asr.get(position));
        return txt1;
    }

    public View getView(int i, View view, ViewGroup viewgroup) {
        LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.category_spinner_heading, viewgroup, false);
        TextView txt = (TextView) row.findViewById(R.id.tv_spinner_heading);
        txt.setText(asr.get(i));
        return txt;
    }
}