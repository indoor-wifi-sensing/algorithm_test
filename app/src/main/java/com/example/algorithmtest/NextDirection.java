package com.example.algorithmtest;

import java.util.ArrayList;
import java.util.HashMap;

public class NextDirection {
        String[][] groupAlpha4f = {
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
                {"stairsAlpha", "40"},
                {"401", "45"},
                {"402", "50"},
                {"403", "60"},
                {"404", "70"},
                {"405", "80"},
                {"F", "80"},
                {"406", "85"},
                {"G", "90"}
        };
        String[][] groupBeta4f = {
                {"A", "0"},
                {"425", "2"},
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
                {"stairsBeta", "40"},
                {"415", "44"},
                {"414", "50"},
                {"413", "60"},
                {"C", "70"},
                {"412", "80"},
                {"411", "90"},
                {"D", "90"}
        };
        String[][] groupCharlie4f = {
                {"E", "0"},
                {"433", "0"},
                {"434", "0"},
                {"betweenEB", "10"},
                {"418", "20"},
                {"B", "20"}
        };
        String[][] groupDelta4f = {
                {"F", "0"},
                {"405", "0"},
                {"betweenFC1", "6"},
                {"betweenFC2", "14"},
                {"betweenFC3", "22"},
                {"412", "30"},
                {"C", "30"}
        };
        String[][] groupEcho4f = {
                {"G", "0"},
                {"407", "0"},
                {"408", "7"},
                {"409", "14"},
                {"410", "21"},
                {"411", "27"},
                {"D", "27"}
        };
        String[][] groupAlpha5f = {
                {"A", "0"},
                {"526", "5"},
                {"527", "10"},
                {"528", "15"},
                {"529", "20"},
                {"530", "26"},
                {"531", "32"},
                {"E", "32"},
                {"532", "36"},
                {"stairsAlpha", "40"},
                {"501", "44"},
                {"502", "50"},
                {"I", "53"},
                {"503", "58"},
                {"504", "68"},
                {"505", "80"},
                {"F", "80"},
                {"506", "85"},
                {"G", "90"}
        };
        String[][] groupBeta5f = {
                {"A", "0"},
                {"525", "5"},
                {"524", "11"},
                {"523", "17"},
                {"522", "21"},
                {"521", "25"},
                {"B", "29"},
                {"520", "33"},
                {"519", "36"},
                {"stairsBeta", "40"},
                {"518", "45"},
                {"517", "51"},
                {"516", "55"},
                {"515", "60"},
                {"H", "61"},
                {"514", "65"},
                {"513", "68"},
                {"C", "75"},
                {"512", "80"},
                {"511", "88"},
                {"D", "88"}
        };
        String[][] groupCharlie5f = {
                {"E", "0"},
                {"531", "0"},
                {"betweenEB", "10"},
                {"B", "20"}
        };
        String[][] groupDelta5f = {
                {"F", "0"},
                {"505", "0"},
                {"betweenFC1", "6"},
                {"betweenFC2", "14"},
                {"betweenFC3", "22"},
                {"512", "30"},
                {"C", "30"}
        };
        String[][] groupEcho5f = {
                {"G", "0"},
                {"507", "0"},
                {"508", "7"},
                {"509", "14"},
                {"510", "21"},
                {"511", "27"},
                {"D", "27"},
        };
        String[][] groupFox5f = {
                {"I", "0"},
                {"betweenIH", "10"},
                {"H", "20"},
                {"507", "20"}
        };


    public int getDirection (String startPos, String endPos){
        // 아이디어는
        // 1. 같은 라인 그룹에 있으면 각 배열별 정적 각도를 계산
        // 2. 다른 라인 그룹에 있으면 (사실 근접해있으면 그럴일이 없음) 각 라인의 소속 그룹을 찾고, 두 라인의 공통점 기준으로
        // 3. 층 이동이 있으면 방위각 대신 계단을 이용하라는 신호
        HashMap<String, Integer> groupDegree = new HashMap<>();
        groupDegree.put("4A", 115);
        groupDegree.put("4B", 90);
        groupDegree.put("4C", 180);
        groupDegree.put("4D", 180);
        groupDegree.put("4E", 180);
        groupDegree.put("5A", 115);
        groupDegree.put("5B", 90);
        groupDegree.put("5C", 180);
        groupDegree.put("5D", 180);
        groupDegree.put("5E", 180);
        groupDegree.put("5F", 150);

        ArrayList<String> startGroup = new ArrayList<>();
        ArrayList<String> endGroup = new ArrayList<>();
        for (String[] selectGroup : groupAlpha4f) {
            if (selectGroup[0].equals(startPos) ) startGroup.add("4A");
            if (selectGroup[0].equals(endPos) ) endGroup.add("4A");
        }
        for (String[] selectGroup : groupBeta4f) {
            if (selectGroup[0].equals(startPos) ) startGroup.add("4B");
            if (selectGroup[0].equals(endPos) ) endGroup.add("4B");
        }
        for (String[] selectGroup : groupCharlie4f) {
            if (selectGroup[0].equals(startPos) ) startGroup.add("4C");
            if (selectGroup[0].equals(endPos) ) endGroup.add("4C");
        }
        for (String[] selectGroup : groupDelta4f) {
            if (selectGroup[0].equals(startPos) ) startGroup.add("4D");
            if (selectGroup[0].equals(endPos) ) endGroup.add("4D");
        }
        for (String[] selectGroup : groupEcho4f) {
            if (selectGroup[0].equals(startPos) ) startGroup.add("4E");
            if (selectGroup[0].equals(endPos) ) endGroup.add("4E");
        }
        for (String[] selectGroup : groupAlpha5f) {
            if (selectGroup[0].equals(startPos) ) startGroup.add("5A");
            if (selectGroup[0].equals(endPos) ) endGroup.add("5A");
        }
        for (String[] selectGroup : groupBeta5f) {
            if (selectGroup[0].equals(startPos) ) startGroup.add("5B");
            if (selectGroup[0].equals(endPos) ) endGroup.add("5B");
        }
        for (String[] selectGroup : groupCharlie5f) {
            if (selectGroup[0].equals(startPos) ) startGroup.add("5C");
            if (selectGroup[0].equals(endPos) ) endGroup.add("5C");
        }
        for (String[] selectGroup : groupDelta5f) {
            if (selectGroup[0].equals(startPos) ) startGroup.add("5D");
            if (selectGroup[0].equals(endPos) ) endGroup.add("5D");
        }
        for (String[] selectGroup : groupEcho5f) {
            if (selectGroup[0].equals(startPos) ) startGroup.add("5E");
            if (selectGroup[0].equals(endPos) ) endGroup.add("5E");
        }
        for (String[] selectGroup : groupFox5f) {
            if (selectGroup[0].equals(startPos) ) startGroup.add("5F");
            if (selectGroup[0].equals(endPos) ) endGroup.add("5F");
        }


        return 0;
    }
}
