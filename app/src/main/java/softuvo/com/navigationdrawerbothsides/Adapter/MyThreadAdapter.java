package softuvo.com.navigationdrawerbothsides.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import softuvo.com.navigationdrawerbothsides.Activity.GroupInformationActivity;
import softuvo.com.navigationdrawerbothsides.ListData;
import softuvo.com.navigationdrawerbothsides.R;

public class MyThreadAdapter extends RecyclerView.Adapter<MyThreadAdapter.MyViewHolder> {
    Context context;
    List<ListData.UpdateModel> drawerItemList;

    public MyThreadAdapter(Context context, List<ListData.UpdateModel> listItems) {
        this.context = context;
        this.drawerItemList = listItems;
    }

    @Override
    public MyThreadAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.group_item, parent, false);
        return new MyThreadAdapter.MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(MyThreadAdapter.MyViewHolder holder, final int position) {
        holder.tvGroupTitle.setText(drawerItemList.get(position).getTitle());
        holder.TVListSubTitle.setText(drawerItemList.get(position).getSubTitle());
        holder.tvComments.setText(drawerItemList.get(position).getComments());
        Glide.with(context).load(drawerItemList.get(position).getImage()).into(holder.drawer_icon);
        holder.layGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, GroupInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return drawerItemList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvGroupTitle;
        TextView TVListSubTitle;
        TextView tvComments;
        ImageView drawer_icon;
        ConstraintLayout layGroup;


        MyViewHolder(View itemView) {
            super(itemView);
            tvGroupTitle = itemView.findViewById(R.id.tv_group_title);
            TVListSubTitle = itemView.findViewById(R.id.tv_members);
            tvComments = itemView.findViewById(R.id.tv_comments);
            drawer_icon = itemView.findViewById(R.id.iv_group_icon);
            layGroup = itemView.findViewById(R.id.lay_group);
        }
    }
}