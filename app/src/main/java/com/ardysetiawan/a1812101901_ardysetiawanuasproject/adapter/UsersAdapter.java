package com.ardysetiawan.a1812101901_ardysetiawanuasproject.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ardysetiawan.a1812101901_ardysetiawanuasproject.R;
import com.ardysetiawan.a1812101901_ardysetiawanuasproject.model.UserModel;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.MyViewHolder> {
    List<UserModel>mUserModelList;

    public UsersAdapter(List<UserModel> userModelList){
        mUserModelList = userModelList;
    }

    @NonNull
    @Override
    public UsersAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.users_list,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(mView);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull UsersAdapter.MyViewHolder holder, int position) {
        holder.mTextViewID.setText("Id = "+mUserModelList.get(position).getId());
        holder.mTextViewFirstName.setText("First Name = "+mUserModelList.get(position).getFirstname());
        holder.mTextViewLastName.setText("Last Name = "+mUserModelList.get(position).getLastname());
        holder.mTextViewEmail.setText("Email = "+mUserModelList.get(position).getEmail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(view.getContext(), EditText.class);
                mIntent.putExtra("id",mUserModelList.get(position).getId());                mIntent.putExtra("id",mUserModelList.get(position).getId());
                mIntent.putExtra("first name",mUserModelList.get(position).getFirstname());
                mIntent.putExtra("last name",mUserModelList.get(position).getLastname());
                mIntent.putExtra("email",mUserModelList.get(position).getEmail());
                view.getContext().startActivity(mIntent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mUserModelList;
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder{
        public TextView mTextViewID, mTextViewFirstName, mTextViewLastName, mTextViewEmail;

        public  MyViewHolder(View mView){
            super(itemView);
            mTextViewID= (TextView) itemView.findViewById(R.id.tvId);
            mTextViewFirstName= (TextView) itemView.findViewById(R.id.tvFirstName);
            mTextViewLastName= (TextView) itemView.findViewById(R.id.tvLastName);
            mTextViewEmail= (TextView) itemView.findViewById(R.id.tvEmail);
        }
    }
}
