package com.example.loginwithmvvmlivedata.viewModel;

import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.loginwithmvvmlivedata.model.User;

public class UserViewModel extends ViewModel {
    public MutableLiveData<String> email = new MutableLiveData<>();
    public MutableLiveData<String> password = new MutableLiveData<>();

    public User user;
    private Context context;

    public UserViewModel(Context context,User user){
        this.context = context;
        this.user = user;
    }

    public void onSubmitClick(){
     user.setEmail(email.getValue());
     user.setPassword(password.getValue());

        Toast.makeText(context, user.getEmail(),Toast.LENGTH_SHORT).show();
    }
}
