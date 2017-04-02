package ng.monoverse.kurrencykonvata;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private double nairaAmt;

    //EditText dollarAmt;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        addListenerOnButton();
    }

    public void convertDollarToNaira(View view){
        //final Context context = this;

        EditText dollarAmt = (EditText) findViewById(R.id.toNaira);
        //Double ConvertDollar = Double.parseDouble(dollarAmt.getText().toString());
        //Double nairaAmt = ConvertDollar * 350.0;

        //Log.i("Dollar amount given: ", dollarAmt.getText().toString());
        //Log.i("Value in Naira: ", nairaAmt.toString());
        Double dollarToConvert = Double.parseDouble(dollarAmt.getText().toString());
        Double nairaValue = dollarToConvert * 356;
        Toast.makeText(getApplicationContext(), String.format("N" + nairaValue),
                Toast.LENGTH_LONG).show();
    }

    public void addListenerOnButton() {
        final Context context = this;

        button = (Button) findViewById(R.id.nextPage_btn);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Main3Activity.class);
                startActivity(intent);
            }
        });


    }
}
