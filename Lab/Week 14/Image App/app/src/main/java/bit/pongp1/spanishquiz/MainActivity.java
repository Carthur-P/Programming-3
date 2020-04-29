package bit.pongp1.spanishquiz;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //global image variable
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //making the button clickable
        Button btncheck = (Button)findViewById(R.id.btnCheck);
        btncheck.setOnClickListener(this);

        //setting starting image
        image = (ImageView)findViewById(R.id.imageView);
        image.setImageResource(R.drawable.hello);

        loadQuestion();
    }

    public void loadQuestion()
    {
        //referencing the radio button components
        RadioButton rb1 = (RadioButton)findViewById(R.id.radioButton1);
        rb1.setText("Choa");

        RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton2);
        rb2.setText("Gracias");

        RadioButton rb3 = (RadioButton)findViewById(R.id.radioButton3);
        rb3.setText("Hola");

        RadioButton rb4 = (RadioButton)findViewById(R.id.radioButton4);
        rb4.setText("Adios");
    }

    @Override
    public void onClick(View v) {
        RadioGroup rb = (RadioGroup)findViewById(R.id.radioGroup);

        //getting the chosen radio button
        RadioButton chosen = (RadioButton)findViewById(rb.getCheckedRadioButtonId());

        if (chosen.getText().equals("Hola")) {
            image.setImageResource(R.drawable.correct);
        }

        else
        {
            image.setImageResource(R.drawable.question);
        }
    }
}
