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

public class QuizQuestionsAdapter extends RecyclerView.Adapter<QuizQuestionsAdapter.MyViewHolder> {
    Context context;
    List<ListData.UpdateModel> drawerItemList;

    public QuizQuestionsAdapter(Context context, List<ListData.UpdateModel> listItems) {
        this.context = context;
        this.drawerItemList = listItems;
    }

    @Override
    public QuizQuestionsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.questions_item, parent, false);
        return new QuizQuestionsAdapter.MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(QuizQuestionsAdapter.MyViewHolder holder, final int position) {
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {


        MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}