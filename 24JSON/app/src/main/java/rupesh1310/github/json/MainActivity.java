package rupesh1310.github.json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
        Student student = new Student("Rupesh", 5, "a@gmail.com");

        String json = gson.toJson(student);

        Log.d("TEST", json);



    }
}
