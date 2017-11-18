package softuvo.com.navigationdrawerbothsides;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

class GroupEventsAdapter extends RecyclerView.Adapter<GroupEventsAdapter.MyViewHolder> {
    public Context context;
    public ArrayList<ListData.events> mValues;


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

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView userPic;

        public MyViewHolder(View itemView) {
            super(itemView);
            userPic = itemView.findViewById(R.id.iv_user_pic);
        }
    }
}