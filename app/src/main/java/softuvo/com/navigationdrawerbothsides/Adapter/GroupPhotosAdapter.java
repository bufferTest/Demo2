package softuvo.com.navigationdrawerbothsides.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

import softuvo.com.navigationdrawerbothsides.fragments.GroupPhotosFragment;
import softuvo.com.navigationdrawerbothsides.R;

public class GroupPhotosAdapter extends RecyclerView.Adapter<GroupPhotosAdapter.MyViewHolder> {
    public GroupPhotosFragment context;
    public ArrayList<Integer> mValues;


    @Override
    public GroupPhotosAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.group_photos_item, parent, false);
        return new GroupPhotosAdapter.MyViewHolder(listItem);
    }

    public GroupPhotosAdapter(GroupPhotosFragment context, ArrayList<Integer> myValues) {
        this.context = context;
        this.mValues = myValues;
    }

    @Override
    public void onBindViewHolder(GroupPhotosAdapter.MyViewHolder holder, int position) {
        Glide.with(context).load(mValues.get(position)).into(holder.groupPic);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView groupPic;

        public MyViewHolder(View itemView) {
            super(itemView);
            groupPic = itemView.findViewById(R.id.iv_group_pic);
        }
    }
}
