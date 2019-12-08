package com.anushka.androidtutz.bindingdemo1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.TextView;

import com.anushka.androidtutz.bindingdemo1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setStudent(getCurrentStudent());
    }

    private Student getCurrentStudent(){

        Student student = new Student();
        student.setStudentName("Alex");
        student.setStudentEmail("alex@gmail.com");
        return student;

    }
}
