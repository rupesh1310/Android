package rupesh1310.github.facedetection;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class ResultDialog extends DialogFragment {

    private Button okButton;
    private TextView resultTV;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_resultdialog, container, false);
        String resultText = "";
        okButton = view.findViewById(R.id.result_ok_button);
        resultTV  = view.findViewById(R.id.result_text_view);

        Bundle bundle = getArguments();
        resultText = bundle.getString(LCOFacedetection.RESULT_TEXT);

        resultTV.setText(resultText);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        return super.onCreateView(inflater, container, savedInstanceState);


    }
}
