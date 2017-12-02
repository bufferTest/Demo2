package softuvo.com.navigationdrawerbothsides.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.List;

import softuvo.com.navigationdrawerbothsides.ListData;
import softuvo.com.navigationdrawerbothsides.R;
import softuvo.com.navigationdrawerbothsides.Views.RoundedImageView;

public class PersonFriendsAdapter extends RecyclerView.Adapter<PersonFriendsAdapter.MyViewHolder> {
    Context context;
    List<ListData.UpdateModel> drawerItemList;

    public PersonFriendsAdapter(Context context, List<ListData.UpdateModel> listItems) {
        this.context = context;
        this.drawerItemList = listItems;
    }

    @Override
    public PersonFriendsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.friends_item, parent, false);
        return new PersonFriendsAdapter.MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(PersonFriendsAdapter.MyViewHolder holder, final int position) {
        Glide.with(context).load(R.drawable.photo1).into(holder.iv_profile_icon);
    }

    @Override
    public int getItemCount() {
        return drawerItemList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView iv_profile_icon;

        MyViewHolder(View itemView) {
            super(itemView);
            iv_profile_icon = itemView.findViewById(R.id.iv_profile_icon);
        }
    }
}