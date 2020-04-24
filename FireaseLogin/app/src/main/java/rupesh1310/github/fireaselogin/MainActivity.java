package rupesh1310.github.fireaselogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    Button button;

    //Make sure to check your email & password are not empty & null
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String myEmail = email.getText().toString();
        String myPass = password.getText().toString();



    }
}
