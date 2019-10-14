package com.example.avgofnum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText editText1,editText2,editText3;
Button button;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);
        editText3=findViewById(R.id.editText3);
        textView=findViewById(R.id.textView);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1= String.valueOf(editText1.getText());
                String s2= String.valueOf(editText2.getText());
                String s3= String.valueOf(editText3.getText());
                int result = Integer.parseInt(s1)+Integer.parseInt(s2)+Integer.parseInt(s3);
                int avg=result/3;
                //Toast.makeText(MainActivity.this, "AVG Value"+avg, Toast.LENGTH_SHORT).show();
                textView.setText(String.valueOf(avg));
            }
        });
    }
}
