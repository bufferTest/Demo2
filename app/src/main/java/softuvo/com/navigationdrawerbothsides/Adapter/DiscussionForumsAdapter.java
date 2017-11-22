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

import java.util.ArrayList;
import java.util.List;

import softuvo.com.navigationdrawerbothsides.Activity.GroupInformationActivity;
import softuvo.com.navigationdrawerbothsides.ListData;
import softuvo.com.navigationdrawerbothsides.R;

public class DiscussionForumsAdapter extends RecyclerView.Adapter<DiscussionForumsAdapter.MyViewHolder> {
    Context context;
    ArrayList<String> forumNamesList;

    public DiscussionForumsAdapter(Context context,
                                   ArrayList<String> listItems) {
        this.context = context;
        this.forumNamesList = listItems;

    }

    @Override
    public DiscussionForumsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.discussion_item, parent, false);
        return new DiscussionForumsAdapter.MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(DiscussionForumsAdapter.MyViewHolder holder, final int position) {
        holder.tv_title.setText(forumNamesList.get(position));
        /*holder.layGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, GroupInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return forumNamesList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_title;


        MyViewHolder(View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_title);
        }
    }
}