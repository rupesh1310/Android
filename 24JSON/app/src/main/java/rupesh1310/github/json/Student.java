package rupesh1310.github.json;

import com.google.gson.annotations.SerializedName;

public class Student {

    private String name;
    @SerializedName("course_count")
    private int courseCount;
    private String email;

    public Student(String name, int course_count, String email) {
        this.name = name;
        this.courseCount = course_count;
        this.email = email;
    }
}
