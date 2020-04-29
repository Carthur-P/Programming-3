package bit.pongp1.welcomeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get reference to the components
        Button btnGetData = (Button)findViewById(R.id.button);
        btnGetData.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //get reference for all the other components
        EditText txtFirstName = (EditText)findViewById(R.id.editText1);
        EditText txtLastName = (EditText)findViewById(R.id.editText2);
        TextView txtResults = (TextView)findViewById(R.id.textView2);

        //write the result to the txtResult component
        txtResults.setText("First app by: " + txtFirstName.getText() + " " + txtLastName.getText());
    }
}
