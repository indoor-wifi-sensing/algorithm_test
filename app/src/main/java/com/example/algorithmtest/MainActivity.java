package com.example.algorithmtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[][] groupAlpha = {
            {"A", "3"},
            {"426", "6"},
            {"427", "10"},
            {"428", "13"},
            {"429", "16"},
            {"430", "20"},
            {"431", "23"},
            {"432", "26"},
            {"433", "30"},
            {"E", "32"},
            {"434", "33"},
            {"435", "36"},
            {"stairsAlpha_1", "40"},
            {"401", "45"},
            {"402", "50"},
            {"403", "60"},
            {"404", "70"},
            {"405", "80"},
            {"F", "80"},
            {"406", "85"},
            {"G", "90"}
    };

    String[][] groupBeta = {
            {"A", "0"},
            {"425", "0"},
            {"424", "4"},
            {"423", "8"},
            {"422", "12"},
            {"421", "16"},
            {"420", "20"},
            {"419", "24"},
            {"418", "28"},
            {"B", "32"},
            {"417", "36"},
            {"416", "36"},
            {"stairsBeta_1", "40"},
            {"415", "44"},
            {"414", "50"},
            {"413", "60"},
            {"C", "70"},
            {"412", "80"},
            {"411", "90"},
            {"D", "90"}
    };

    String[][] groupCharlie = {
            {"E", "0"},
            {"433", "0"},
            {"434", "0"},
            {"betweenEB", "10"},
            {"418", "20"},
            {"B", "20"}
    };

    String[][] groupDelta = {
            {"F", "0"},
            {"405", "0"},
            {"betweenFC1", "6"},
            {"betweenFC2", "14"},
            {"betweenFC3", "22"},
            {"412", "30"},
            {"413", "30"},
            {"G", "30"}
    };

    String[][] groupEcho = {
            {"G", "-10"},
            {"407", "0"},
            {"408", "7"},
            {"409", "14"},
            {"410", "21"},
            {"411", "27"},
            {"D", ""},
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText startPointEditText = findViewById(R.id.startPointEditText);
        EditText endPointEditText = findViewById(R.id.endPointEditText);


    }
}