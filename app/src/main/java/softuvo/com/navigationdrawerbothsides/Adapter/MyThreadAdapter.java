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
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.thread_item, parent, false);
        return new MyThreadAdapter.MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(MyThreadAdapter.MyViewHolder holder, final int position) {

    }

    @Override
    public int getItemCount() {
        return drawerItemList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {


        MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}