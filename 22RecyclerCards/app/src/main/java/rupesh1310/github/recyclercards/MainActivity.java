package rupesh1310.github.recyclercards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();

        exampleList.add(new ExampleItem(R.drawable.node, "Clicked at Studio"));
        exampleList.add(new ExampleItem(R.drawable.oner, "Clicked at Italy"));
        exampleList.add(new ExampleItem(R.drawable.twor, "Clicked at Rome"));
        exampleList.add(new ExampleItem(R.drawable.threer, "Clicked at Greece"));
        exampleList.add(new ExampleItem(R.drawable.fourr, "Clicked at Rome"));
        exampleList.add(new ExampleItem(R.drawable.fiver, "Clicked at Santorini"));
        exampleList.add(new ExampleItem(R.drawable.sixr, "Clicked at India"));



        //config for recyclerView







    }
}
