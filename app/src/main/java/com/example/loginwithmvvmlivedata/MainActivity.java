package com.example.loginwithmvvmlivedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.loginwithmvvmlivedata.databinding.ActivityMainBinding;
import com.example.loginwithmvvmlivedata.model.User;
import com.example.loginwithmvvmlivedata.viewModel.UserViewModel;

/////https://www.youtube.com/watch?v=moc8x8uXOsw
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

            UserViewModel userViewModel = ViewModelProviders.of(this, new UserViewModelFactory(this,new User())).get(UserViewModel.class);
       binding.setUserModel(userViewModel);
    }
}