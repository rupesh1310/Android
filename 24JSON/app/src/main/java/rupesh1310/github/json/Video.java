package rupesh1310.github.json;

import com.google.gson.annotations.SerializedName;

public class Video {

    @SerializedName("name")
    private String mName;
    @SerializedName("duration")
    private int mDuration;


    public Video(String mName, int mDuration) {
        this.mName = mName;
        this.mDuration = mDuration;
    }
}
