package com.agnt45.exceptionpt2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity {
    private EditText num1,num2;
    private Button div;
    private TextView res;
    private   int n1,n2,divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        num1 = (EditText) findViewById(R.id.editText2);
        num2 = (EditText) findViewById(R.id.editText3);
        div = (Button) findViewById(R.id.button);
        res = (TextView) findViewById(R.id.textView);

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                try{

                    divide=n1/n2;
                }catch (ArithmeticException e){
                    Toast.makeText(getApplicationContext(),"The Following Error occured",Toast.LENGTH_LONG).show();
                }
                res.setText(String.valueOf(divide));
            }
        });

    }
}
