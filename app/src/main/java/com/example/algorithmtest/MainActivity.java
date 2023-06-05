package com.example.algorithmtest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ClassroomGraph classInfo;
    EditText startPoint, endPoint;
    Button testBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 4층 교실을 표현하는 Graph를 일괄 삽입
        ClassroomGraphData dataGetHelp = new ClassroomGraphData();
        classInfo = dataGetHelp.inputData();

        startPoint = findViewById(R.id.startPointEditText);
        endPoint = findViewById(R.id.endPointEditText);
        testBtn = findViewById(R.id.saveRouteButton);

        Log.i("datas", "ArraySize : " + classInfo.adjacencyList.size() );

        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* 테스트용 알고리즘 확인 페이지
                Map<String, Integer> distances = classInfo.dijkstra("403");
                Log.i("datas", "distances : " + distances.size() );
                for (Map.Entry<String, Integer> entry : distances.entrySet()) {
                    Log.i("dataResult" , "Shortest distance from 418 to " + entry.getKey() + ": " + entry.getValue());
                }
                */
                List<String> shortestPath = classInfo.getShortestPath("429", "409");
                Log.i("dataResult2", "Shortest path from " + "429" + " to " + "409" + ": " + shortestPath);
            }
        });

    }
}