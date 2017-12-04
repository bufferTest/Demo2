package softuvo.com.navigationdrawerbothsides.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import softuvo.com.navigationdrawerbothsides.ListData;
import softuvo.com.navigationdrawerbothsides.R;

public class ShowActivityPointsAdapter extends RecyclerView.Adapter<ShowActivityPointsAdapter.MyViewHolder> {
    public Context context;
    public ArrayList<ListData.activityPoints> mValues;


    @Override
    public ShowActivityPointsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_points_item, parent, false);
        return new ShowActivityPointsAdapter.MyViewHolder(listItem);
    }

    public ShowActivityPointsAdapter(Context context, ArrayList<ListData.activityPoints> myValues) {
        this.context = context;
        this.mValues = myValues;
    }

    @Override
    public void onBindViewHolder(ShowActivityPointsAdapter.MyViewHolder holder, int position) {
        holder.tv_item_title.setText(mValues.get(position).getItem());
        holder.tv_item_count.setText(mValues.get(position).getValue());
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_item_title, tv_item_count;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv_item_title = itemView.findViewById(R.id.tv_item_title);
            tv_item_count = itemView.findViewById(R.id.tv_item_count);

        }
    }
}
