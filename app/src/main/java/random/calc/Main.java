package random.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main extends AppCompatActivity implements View.OnClickListener{

    EditText first;
    EditText second;
    Button button_plus;
    Button button_minus;
    Button button_umn;
    Button button_del;
    TextView vivod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        first = (EditText) findViewById(R.id.first);
        second = (EditText) findViewById(R.id.second);
        button_plus = (Button) findViewById(R.id.button_plus);
        button_minus = (Button) findViewById(R.id.button_minus);
        button_umn = (Button) findViewById(R.id.button_umn);
        button_del = (Button) findViewById(R.id.button_del);
        vivod = (TextView) findViewById(R.id.vivod);

        button_plus.setOnClickListener(this);
        button_minus.setOnClickListener(this);
        button_umn.setOnClickListener(this);
        button_del.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        float num1 = 0, num2 = 0, result = 0;

        num1 = Float.parseFloat(first.getText().toString());
        num2 = Float.parseFloat(second.getText().toString());

        switch(v.getId()){

            case R.id.button_plus:
                result = num1 + num2;
                break;
            case R.id.button_minus:
                result = num1 - num2;
                break;
            case R.id.button_umn:
                result = num1 * num2;
                break;
            case R.id.button_del:
                result = num1 / num2;
                break;
            default:
                break;
        }

        vivod.setText("result " + result);


    }
}
