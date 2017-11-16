package softuvo.com.navigationdrawerbothsides;

import java.util.ArrayList;
import java.util.List;

class ListData {
    public static List<UpdateModel> getGroupList() {

        List<UpdateModel> updateListData = new ArrayList<UpdateModel>();
        UpdateModel updatemodel = new UpdateModel();
        updatemodel = new UpdateModel("Soccer","2","Best Team",R.drawable.photo1);
        updateListData.add(updatemodel);

        updatemodel = new UpdateModel("Soccer","2","Best Team",R.drawable.photo1);
        updateListData.add(updatemodel);

        updatemodel = new UpdateModel("Barcelona","3","Best Team",R.drawable.photo1);
        updateListData.add(updatemodel);

        return updateListData;
    }

    public static class UpdateModel {
        String title;

        public UpdateModel(String title, String subtitle, String comments, int image) {
            this.title = title;
            this.subtitle = subtitle;
            this.comments = comments;
            Image = image;
        }

        public UpdateModel() {}

        String subtitle;
        String comments;
        int Image;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubTitle() {
            return subtitle;
        }

        public void setSubTitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public int getImage() {
            return Image;
        }

        public void setImage(int Image) {
            this.Image = Image;
        }

        public String getComments() {
            return comments;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }
    }
}
