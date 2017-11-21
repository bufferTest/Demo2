package softuvo.com.navigationdrawerbothsides.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import softuvo.com.navigationdrawerbothsides.ListData;
import softuvo.com.navigationdrawerbothsides.R;

public class GroupEventsAdapter extends RecyclerView.Adapter<GroupEventsAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<ListData.events> mValues;

    @Override
    public GroupEventsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_item, parent, false);
        return new GroupEventsAdapter.MyViewHolder(listItem);
    }

    public GroupEventsAdapter(Context context, ArrayList<ListData.events> myValues) {
        this.context = context;
        this.mValues = myValues;
    }

    @Override
    public void onBindViewHolder(GroupEventsAdapter.MyViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}