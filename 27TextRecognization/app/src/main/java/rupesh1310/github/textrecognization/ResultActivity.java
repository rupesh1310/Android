package rupesh1310.github.textrecognization;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private Button backButton;
    private TextView resultTextView;
    private  String resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultTextView = findViewById(R.id.result_textview);
        backButton = findViewById(R.id.back_button);
        resultText = getIntent().getStringExtra(LCOTextRecognization.RESULT_TEXT);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
