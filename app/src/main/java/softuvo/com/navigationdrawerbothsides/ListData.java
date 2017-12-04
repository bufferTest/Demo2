package softuvo.com.navigationdrawerbothsides;

import java.util.ArrayList;
import java.util.List;

public class ListData {
    public static List<UpdateModel> getGroupList() {

        List<UpdateModel> updateListData = new ArrayList<UpdateModel>();
        UpdateModel updatemodel = new UpdateModel();
        updatemodel = new UpdateModel("Soccer", "2", "Best Team", R.drawable.photo1);
        updateListData.add(updatemodel);

        updatemodel = new UpdateModel("Soccer", "2", "Best Team", R.drawable.photo1);
        updateListData.add(updatemodel);

        updatemodel = new UpdateModel("Barcelona", "3", "Best Team", R.drawable.photo1);
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

        public UpdateModel() {
        }

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

    public static List<events> getEvents() {

        List<events> updateListData = new ArrayList<>();
        events updatemodel;
        updatemodel = new events("Birthday", "Chandigarh", "Lovkesh", "19", "NOV");
        updateListData.add(updatemodel);
        updatemodel = new events("Birthday", "Chandigarh", "Lovkesh", "19", "NOV");
        updateListData.add(updatemodel);
        updatemodel = new events("Birthday", "Chandigarh", "Lovkesh", "19", "NOV");
        updateListData.add(updatemodel);


        return updateListData;
    }

    public static class events {
        String eventType;
        String place;
        String memberType;
        String date;

        public events(String eventType, String place, String memberType, String date, String Month) {
            this.eventType = eventType;
            this.place = place;
            this.memberType = memberType;
            this.date = date;
        }

        public String getEventType() {
            return eventType;
        }

        public String getPlace() {
            return place;
        }

        public String getMemberType() {
            return memberType;
        }

        public String getDate() {
            return date;
        }
    }

    public static ArrayList<Integer> dummyPhotos() {
        ArrayList<Integer> users1 = new ArrayList<>();
        users1.add(R.drawable.photo1);
        users1.add(R.drawable.photo1);
        users1.add(R.drawable.photo1);
        return users1;
    }

    public static class activityPoints {
        String item, value;

        public activityPoints(String item, String value) {
            this.item = item;
            this.value = value;
        }

        public String getItem() {
            return item;
        }

        public String getValue() {
            return value;
        }
    }

    public static List<activityPoints> getItems() {

        List<activityPoints> updateListData = new ArrayList<>();
        activityPoints updatemodel;
        updatemodel = new activityPoints("Total Items:", "319");
        updateListData.add(updatemodel);
        updatemodel = new activityPoints("Activity Points:", "319");
        updateListData.add(updatemodel);
        updatemodel = new activityPoints("Advance Photos:", "319");
        updateListData.add(updatemodel);
        updatemodel = new activityPoints("Attachments:", "319");
        updateListData.add(updatemodel);
        updatemodel = new activityPoints("Blogs:", "319");
        updateListData.add(updatemodel);
        updatemodel = new activityPoints("Comments:", "319");
        updateListData.add(updatemodel);
        updatemodel = new activityPoints("Events:", "319");
        updateListData.add(updatemodel);
        updatemodel = new activityPoints("Forum Posts:", "319");
        updateListData.add(updatemodel);
        updatemodel = new activityPoints("Groups:", "319");
        updateListData.add(updatemodel);
        updatemodel = new activityPoints("Invites:", "319");
        updateListData.add(updatemodel);
        updatemodel = new activityPoints("MarketPlace Listings:", "319");
        updateListData.add(updatemodel);
        updatemodel = new activityPoints("Music Songs:", "319");
        updateListData.add(updatemodel);
        updatemodel = new activityPoints("Pages:", "319");
        updateListData.add(updatemodel);
        updatemodel = new activityPoints("Photos:", "319");
        updateListData.add(updatemodel);
        updatemodel = new activityPoints("Polls:", "319");
        updateListData.add(updatemodel);
        updatemodel = new activityPoints("Quizzes:", "319");
        updateListData.add(updatemodel);
        updatemodel = new activityPoints("Ultimate Videos(Videos):", "319");
        updateListData.add(updatemodel);
        updatemodel = new activityPoints("Ultimate Videos(PlayLists):", "319");
        updateListData.add(updatemodel);

        return updateListData;
    }
}
