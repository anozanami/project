package com.example.qquimz;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list_view);

        ArrayList<QuizItem> items = new ArrayList<>();
        items.add(new QuizItem("2023-04-01", R.drawable.quiz_image_1, "문제1", "이것은 첫 번째 문제입니다", "정답", "카테고리1"));
        items.add(new QuizItem("2023-04-02", R.drawable.quiz_image_2, "문제2", "이것은 두 번째 문제입니다", "오답", "카테고리2"));
        // 더 많은 아이템을 추가할 수 있음

        QuizItemAdapter adapter = new QuizItemAdapter(this, items);
        listView.setAdapter(adapter);
    }
}
