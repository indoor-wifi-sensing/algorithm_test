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
                String startPosition = startPoint.getText().toString();
                String endPosition = endPoint.getText().toString();

                List<String> shortestPath = classInfo.getShortestPath(startPosition, endPosition);
                Log.i("dataResult2", "Shortest path from " + startPosition + " to " + endPosition + ": " + shortestPath);

                // 만약 위치가 하나 차이나거나 차이가 없을 경우 도착 메세지 리턴
                if (shortestPath.size() <= 2) {
                    Log.i("dataResult2", "Arrive to target position");
                    return;
                }

                NextDirection eee = new NextDirection();

                int finalDirection = eee.getDirection(shortestPath.get(0), shortestPath.get(1));
                if (finalDirection == 1002) {
                    Log.i("dataResult2", "Use stair Now");
                }
                else if (finalDirection == 1001) {
                    Log.i("dataResult2", "Error for return");
                }
                Log.i("dataResult2", "Direction : " + finalDirection);
            }
        });

    }
}