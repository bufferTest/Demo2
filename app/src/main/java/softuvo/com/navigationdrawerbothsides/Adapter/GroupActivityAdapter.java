package softuvo.com.navigationdrawerbothsides.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import softuvo.com.navigationdrawerbothsides.ListData;
import softuvo.com.navigationdrawerbothsides.R;

public class GroupActivityAdapter extends RecyclerView.Adapter<GroupActivityAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<ListData.events> mValues;

    @Override
    public GroupActivityAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item, parent, false);
        return new GroupActivityAdapter.MyViewHolder(listItem);
    }

    public GroupActivityAdapter(Context context, ArrayList<ListData.events> myValues) {
        this.context = context;
        this.mValues = myValues;
    }

    @Override
    public void onBindViewHolder(GroupActivityAdapter.MyViewHolder holder, int position) {
        Glide.with(context).load(R.drawable.photo1).into(holder.iv_group_icon);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_group_icon;

        MyViewHolder(View itemView) {
            super(itemView);
            iv_group_icon = itemView.findViewById(R.id.iv_group_icon);
        }
    }
}
