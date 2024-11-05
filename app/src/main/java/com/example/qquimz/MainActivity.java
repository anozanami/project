package com.example.qquimz;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qquimz.databinding.ActivityMainBinding;
import com.example.qquimz.databinding.HistoryItemBinding;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            list.add(i+"번 문제"); // 이 부분에서 문제의 이름을 받아서 쓰면 될 듯
        }

        // 리사이클러뷰에 LinearLayoutManager 객체 지정.
        binding.recycler.setLayoutManager(new LinearLayoutManager(this));
        // 리사이클러뷰에 SimpleTextAdapter 객체 지정.
        binding.recycler.setAdapter(new Myadapter(list));

    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        private HistoryItemBinding binding;

        private MyViewHolder(HistoryItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    private class Myadapter extends RecyclerView.Adapter<MyViewHolder> {
        private List<String> list;

        private Myadapter(List<String> list){this.list = list;}

        // recycler view가 호출할 메소드들
        // 새로운 행을 만드는 메소드
        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            HistoryItemBinding binding = HistoryItemBinding.inflate(LayoutInflater.from(parent.getContext()));
            return new MyViewHolder(binding);
        }

        // 특정 행에 있는 값을 바꿔주는 메소드
        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.binding.title.setText(list.get(position));
        } // position : position번째 행을 줄거야

        // 행의 개수를 반환하는 메소드
        @Override
        public int getItemCount() {
            return list.size();
        }
    }
}
