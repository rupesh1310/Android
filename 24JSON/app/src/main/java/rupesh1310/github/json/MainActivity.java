package rupesh1310.github.json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
//        Student student = new Student("Rupesh", 5, "a@gmail.com");
//
//        String json = gson.toJson(student);

//        String json = "{\"course_count\":5, \"email\":\"a@gmail.com\",\"name\":\"Rupesh\"}";
//        Student student = gson.fromJson(json, Student.class);
//        Log.d("TEST", student.toString());

        List<Video> videos = new ArrayList<>();
        videos.add(new Video("Intro", 4));
        videos.add(new Video("Exercise files", 8));
        videos.add(new Video("Installation", 12));



        Course course = new Course("JAVA", "Bootcamp");
        Student student = new Student("Rupesh", 3, "a@gmail.com", course, videos);
        String json = gson.toJson(student);

//        String json = "{\"course_count\":3,\"email\":\"a@gmail.com\",\"course\":{\"description\":\"Bootcamp\",\"name\":\"Java\"},\"name\":\"Rupesh\"}";
//        Student student = gson.fromJson(json, Student.class);


//        Log.d("TEST", student.toString());
        Log.d("TEST", json);





    }
}
