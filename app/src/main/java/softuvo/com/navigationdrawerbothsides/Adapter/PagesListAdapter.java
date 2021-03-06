package softuvo.com.navigationdrawerbothsides.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import softuvo.com.navigationdrawerbothsides.Activity.GroupInformationActivity;
import softuvo.com.navigationdrawerbothsides.Activity.PageInformationActivity;
import softuvo.com.navigationdrawerbothsides.ListData;
import softuvo.com.navigationdrawerbothsides.R;

public class PagesListAdapter extends RecyclerView.Adapter<PagesListAdapter.MyViewHolder> {
    Context context;
    List<ListData.UpdateModel> drawerItemList;

    public PagesListAdapter(Context context,
                             List<ListData.UpdateModel> listItems) {
        this.context = context;
        this.drawerItemList = listItems;
    }

    @Override
    public PagesListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.pages_item, parent, false);
        return new PagesListAdapter.MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(PagesListAdapter.MyViewHolder holder, final int position) {
        /*holder.tvGroupTitle.setText(drawerItemList.get(position).getTitle());*/
        holder.lay_pages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, PageInformationActivity.class);
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
        ConstraintLayout lay_pages;

        MyViewHolder(View itemView) {
            super(itemView);
            lay_pages = itemView.findViewById(R.id.lay_pages);
        }
    }
}