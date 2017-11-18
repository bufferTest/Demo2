package softuvo.com.navigationdrawerbothsides.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import softuvo.com.navigationdrawerbothsides.R;

public class GroupMemberShowAdapter extends RecyclerView.Adapter<GroupMemberShowAdapter.MyViewHolder> {
    public Context context;
    public ArrayList<Integer> mValues;


    @Override
    public GroupMemberShowAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.member_show_item, parent, false);
        return new GroupMemberShowAdapter.MyViewHolder(listItem);
    }

    public GroupMemberShowAdapter(Context context, ArrayList<Integer> myValues) {
        this.context = context;
        this.mValues = myValues;
    }

    @Override
    public void onBindViewHolder(GroupMemberShowAdapter.MyViewHolder holder, int position) {
        Glide.with(context).load(mValues.get(position)).into(holder.userPic);
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
