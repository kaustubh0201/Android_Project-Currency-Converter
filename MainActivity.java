package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Spinner mySpinner, mySpinner2;
    Button button_convert;
    TextView input, output;
    String from, to;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySpinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                from = parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        mySpinner2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner2.setAdapter(myAdapter2);

        mySpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                to = parent.getItemAtPosition(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        button_convert = (Button) findViewById(R.id.button);
        button_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = (TextView) findViewById(R.id.editText);
                output = (TextView) findViewById(R.id.editText2);
                double inp = Double.valueOf(input.getText().toString());
                double out;
                if(from.equals("Dollar"))
                {
                    if(to.equals("Dollar"))
                    {
                        out = inp;
                    }
                    else if(to.equals("Rupees"))
                    {
                        out = inp * 76.5;
                    }
                    else if(to.equals("Euros"))
                    {
                        out = inp * 0.92;
                    }
                    else if(to.equals("Yen"))
                    {
                        out = inp * 107.56;
                    }
                    else if(to.equals("Yuan"))
                    {
                        out = inp * 7.07;
                    }
                    else
                    {
                        out = inp * 3.76;
                    }
                }
                else if (from.equals("Rupees"))
                {
                    if(to.equals("Dollar"))
                    {
                        out = inp * 0.013;
                    }
                    else if(to.equals("Rupees"))
                    {
                        out = inp;
                    }
                    else if(to.equals("Euros"))
                    {
                        out = inp * 0.012;
                    }
                    else if(to.equals("Yen"))
                    {
                        out = inp * 1.41;
                    }
                    else if(to.equals("Yuan"))
                    {
                        out = inp * 0.093;
                    }
                    else
                    {
                        out = inp * 0.049;
                    }
                }
                else if (from.equals("Euros"))
                {
                    if(to.equals("Dollar"))
                    {
                        out = inp * 1.09;
                    }
                    else if(to.equals("Rupees"))
                    {
                        out = inp * 83.19;
                    }
                    else if(to.equals("Euros"))
                    {
                        out = inp;
                    }
                    else if(to.equals("Yen"))
                    {
                        out = inp * 116.93;
                    }
                    else if(to.equals("Yuan"))
                    {
                        out = inp * 7.69;
                    }
                    else
                    {
                        out = inp * 4.09;
                    }
                }
                else if (from.equals("Yen"))
                {
                    if(to.equals("Dollar"))
                    {
                        out = inp * 0.0093;
                    }
                    else if(to.equals("Rupees"))
                    {
                        out = inp * 0.71;
                    }
                    else if(to.equals("Euros"))
                    {
                        out = inp * 0.0086;
                    }
                    else if(to.equals("Yen"))
                    {
                        out = inp;
                    }
                    else if(to.equals("Yuan"))
                    {
                        out = inp * 0.066;
                    }
                    else
                    {
                        out = inp * 0.035;
                    }
                }
                else if (from.equals("Yuan"))
                {
                    if(to.equals("Dollar"))
                    {
                        out = inp * 0.14;
                    }
                    else if(to.equals("Rupees"))
                    {
                        out = inp * 10.77;
                    }
                    else if(to.equals("Euros"))
                    {
                        out = inp * 0.13;
                    }
                    else if(to.equals("Yen"))
                    {
                        out = inp * 15.20;
                    }
                    else if(to.equals("Yuan"))
                    {
                        out = inp;
                    }
                    else
                    {
                        out = inp * 0.53;
                    }
                }
                else
                {
                    if(to.equals("Dollar"))
                    {
                        out = inp * 0.27;
                    }
                    else if(to.equals("Rupees"))
                    {
                        out = inp * 20.36;
                    }
                    else if(to.equals("Euros"))
                    {
                        out = inp * 0.24;
                    }
                    else if(to.equals("Yen"))
                    {
                        out = inp * 15.20;
                    }
                    else if(to.equals("Yuan"))
                    {
                        out = inp * 1.88;
                    }
                    else
                    {
                        out = inp;
                    }
                }


                DecimalFormat formatVal = new DecimalFormat("##.##");
                output.setText(formatVal.format(out));

            }
        });


    }


}
