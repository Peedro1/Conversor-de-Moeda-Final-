package com.example.v2;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView dollar;
    private ImageView iene;
    private ImageView euro;
    private TextView valor;
    private TextView result;
    
    private float cot_dollar;
    private float cot_euro;
    private float cot_iene;

    public MainActivity() {
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView dollar = findViewById(R.id.im_dollar);
        ImageView iene = findViewById(R.id.im_iene);
        ImageView euro = findViewById(R.id.im_euro);
        valor= findViewById((R.id.et_valor));
        result=findViewById(R.id.et_valor1);
        cot_dollar= (float) (0.20%.2f);
        cot_euro= (float) (0.19%.2f);
        cot_iene= (float) (0.16%.3f);


        dollar.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
               String str1 = valor.getText().toString();
               float str2 = Float.parseFloat(str1);
                if (dollar.isClickable()) {

                    float r = str2 * (float) (0.20%.2f); 

                    TextView textView1 = findViewById(R.id.et_valor1);
                    textView1.setText("O valor é: "+r);

                }
           }
        });
               iene.setOnClickListener(new View.OnClickListener() {
                      @Override
                       public void onClick(View view) {
                           String str1 = valor.getText().toString();
                                 float str2 = Float.parseFloat(str1);
                               if (iene.isClickable()) {

                                    float r = (float) (str2 *(30.05));

                                         TextView textView1 = findViewById(R.id.et_valor1);
                                         textView1.setText("O valor é: "+r);
                               }
                      }

                                });

             euro.setOnClickListener(new View.OnClickListener() {
                  @Override
                   public void onClick(View view) {
                       String str1 = valor.getText().toString();
                             float str2 = Float.parseFloat(str1);
                           if (euro.isClickable()) {

                                  float r = str2 *(float) (0.19%.2f);

                                       TextView textView1 = findViewById(R.id.et_valor1);
                                       textView1.setText("O valor é: "+ r);
                                                                                            }
                                   }

             });
              }
 }

