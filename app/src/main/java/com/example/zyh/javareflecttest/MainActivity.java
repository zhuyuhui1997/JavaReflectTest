package com.example.zyh.javareflecttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
//运行时确定

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public  Buttonq buttonq;
    public TextView textView;
    public Button button;
    public  static Class<?> demo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.text);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(this);
    }
public  void onClick(View v){

    try {

      buttonq=(Buttonq) Class.forName("com.example.zyh.javareflecttest.Buttonq").newInstance();
      //button=new Buttonq()
       //
      //
       //
        Field field=Buttonq.class.getDeclaredField("string");
       field.setAccessible(true);
      //  String s=(String) field.get(buttonq);
        field.setInt(buttonq,3);
        int a=(int)field.get(buttonq);
         textView.setText(a+"");




    }
    catch (Exception e){
        e.printStackTrace();
        textView.setText("111");
    }


}
}





