package rupesh1310.github.sqllitestudentrecord;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    DatabaseHelper myDB;
    EditText editTextId, editName, editEmail, editCC;
    Button buttonAdd, buttonGetData, buttonUpdate, buttonDelete, buttonViewAll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDB = new DatabaseHelper(this);
        editTextId = findViewById(R.id.editText_id);
        editName = findViewById(R.id.editText_name);
        editEmail = findViewById(R.id.editText_email);
;        editCC  = findViewById(R.id.editText_CC);
        buttonAdd = findViewById(R.id.button_add);
        buttonDelete = findViewById(R.id.button_delete);
        buttonUpdate = findViewById(R.id.button_update);
        buttonGetData = findViewById(R.id.button_view);
        buttonViewAll = findViewById(R.id.button_viewAll);

        showMessage("test","testing done");


    }
    private void showMessage(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.create();
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();

    }
}
