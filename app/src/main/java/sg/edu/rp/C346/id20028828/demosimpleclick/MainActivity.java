package sg.edu.rp.C346.id20028828.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView textViewDisplay;
    Button buttonDisplay;
    EditText editTextInput;
    ToggleButton toggleButtonEnabled;
    RadioGroup rgGender;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewDisplay = findViewById(R.id.textViewDisplay);
        buttonDisplay = findViewById(R.id.buttonDisplay);
        editTextInput = findViewById(R.id.editTextInput);
        toggleButtonEnabled = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.rgGender);


        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textResponse = editTextInput.getText().toString();


                if (textResponse.isEmpty()) {
                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                } else {
                    textViewDisplay.setText(textResponse);
                    int checkedRB = rgGender.getCheckedRadioButtonId();
                    if (checkedRB == R.id.rbFemale){
                        textViewDisplay.setText("She said " + textResponse);
                    } else {
                        textViewDisplay.setText("He said " + textResponse);
                    }
                }

            }
        });

        toggleButtonEnabled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (toggleButtonEnabled.isChecked() == true){
                    editTextInput.setEnabled(true);
                    editTextInput.setBackgroundColor(Color.TRANSPARENT);
                } else {
                    editTextInput.setEnabled(false);
                    editTextInput.setBackgroundColor(Color.RED);
                }
            }
        });


    }
}