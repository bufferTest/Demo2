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

import java.util.ArrayList;

import softuvo.com.navigationdrawerbothsides.Activity.PersonProfileActivity;
import softuvo.com.navigationdrawerbothsides.Activity.QuizInformationActivity;
import softuvo.com.navigationdrawerbothsides.R;

public class AllQuizzesAdapter extends RecyclerView.Adapter<AllQuizzesAdapter.MyViewHolder> {
    public Context context;
    public ArrayList<Integer> mValues;


    @Override
    public AllQuizzesAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.all_quizzes_row_item, parent, false);
        return new AllQuizzesAdapter.MyViewHolder(listItem);
    }

    public AllQuizzesAdapter(Context context, ArrayList<Integer> myValues) {
        this.context = context;
        this.mValues = myValues;
    }

    @Override
    public void onBindViewHolder(AllQuizzesAdapter.MyViewHolder holder, int position) {
        Glide.with(context).load(mValues.get(position)).into(holder.userPic);

        holder.layQuize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, QuizInformationActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
        holder.tv_members.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, PersonProfileActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
       private ImageView userPic;
       private ConstraintLayout layQuize ;
       private TextView tv_members;

        public MyViewHolder(View itemView) {
            super(itemView);
            userPic = itemView.findViewById(R.id.iv_group_icon);
            layQuize = itemView.findViewById(R.id.lay_quize);
            tv_members = itemView.findViewById(R.id.tv_members);

        }
    }
}

