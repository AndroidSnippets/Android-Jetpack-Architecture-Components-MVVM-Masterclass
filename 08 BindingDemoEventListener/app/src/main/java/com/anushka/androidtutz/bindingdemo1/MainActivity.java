package com.anushka.androidtutz.bindingdemo1;

import androidx.databinding.DataBindingUtil;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.view.View;
import android.widget.Toast;

import com.anushka.androidtutz.bindingdemo1.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    MainActivityClickHandlers handlers;

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setStudent(getCurrentStudent());
        handlers = new MainActivityClickHandlers(this);
        activityMainBinding.setClickHandlers(handlers);

    }

    private Student getCurrentStudent(){

        Student student = new Student();
        student.setStudentName("Alex");
        student.setStudentEmail("alex@gmail.com");
        return student;

    }


    public class MainActivityClickHandlers {
        Context context;

        public MainActivityClickHandlers(Context context) {
            this.context = context;
        }

        public void onEnrollButtonClicked (View view){
            Toast.makeText(context, "Enroll Clicked", Toast.LENGTH_SHORT).show();
        }

        public void onCancelButtonClicked (View view){
            Toast.makeText(context, "Cancel Clicked", Toast.LENGTH_SHORT).show();
        }
    }
}
