package com.example.airmusic.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.airmusic.R;

import org.w3c.dom.Text;

public class adap extends RecyclerView.Adapter<adap.MyViewHolder> {

    Context cont;
    TextView tv;
    int image[];
    String data[];
    public adap(Context ct,String s1[],int info[],TextView textView)
    {
        cont = ct;
        data = s1;
        image = info;
        tv = textView;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(cont);
      View view = inflater.inflate(R.layout.row,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
holder.bt1.setText(data[position]);
holder.im.setImageResource(image[position]);
holder.tv.setText("");
    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView im;
        Button bt1;
        TextView tv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            bt1 = itemView.findViewById(R.id.button2);
            im = itemView.findViewById(R.id.imageView2);
            tv = itemView.findViewById(R.id.textView);
        }
    }
}
