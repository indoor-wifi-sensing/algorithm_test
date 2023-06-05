package com.example.algorithmtest;

// 여기의 inputData 부분에 거리정보를 노가다로 입력
public class ClassroomGraphData {

    ClassroomGraph data;

    public ClassroomGraphData() {
        data = new ClassroomGraph();
    }

    public ClassroomGraph inputData() {
        // 전체 노드 위치 입력
        {
            this.data.addVertex("426");
            this.data.addVertex("427");
            this.data.addVertex("428");
            this.data.addVertex("429");
            this.data.addVertex("430");
            this.data.addVertex("431");
            this.data.addVertex("432");
            this.data.addVertex("435");
            this.data.addVertex("stairsAlpha_1");
            this.data.addVertex("401");
            this.data.addVertex("402");
            this.data.addVertex("403");
            this.data.addVertex("404");
            this.data.addVertex("406");
            this.data.addVertex("425");
            this.data.addVertex("424");
            this.data.addVertex("423");
            this.data.addVertex("422");
            this.data.addVertex("421");
            this.data.addVertex("420");
            this.data.addVertex("419");
            this.data.addVertex("417");
            this.data.addVertex("416");
            this.data.addVertex("stairsBeta_1");
            this.data.addVertex("415");
            this.data.addVertex("414");
            this.data.addVertex("433");
            this.data.addVertex("434");
            this.data.addVertex("betweenEB");
            this.data.addVertex("418");
            this.data.addVertex("405");
            this.data.addVertex("betweenFC1");
            this.data.addVertex("betweenFC2");
            this.data.addVertex("betweenFC3");
            this.data.addVertex("412");
            this.data.addVertex("413");
            this.data.addVertex("407");
            this.data.addVertex("408");
            this.data.addVertex("409");
            this.data.addVertex("410");
            this.data.addVertex("411");
        }
        // ...노가다...

        // 각 노드의 연결점
        {
            this.data.addEdge("425", "426", 6);
            this.data.addEdge("426", "427", 4);
            this.data.addEdge("427", "428", 3);
            this.data.addEdge("428", "429", 3);
            this.data.addEdge("429", "430", 4);
            this.data.addEdge("430", "431", 3);
            this.data.addEdge("431", "432", 3);
            this.data.addEdge("432", "433", 4);
            this.data.addEdge("433", "434", 3);
            this.data.addEdge("434", "435", 3);
            this.data.addEdge("435", "stairsAlpha_1", 4);
            this.data.addEdge("stairsAlpha_1", "401", 5);
            this.data.addEdge("401", "402", 5);
            this.data.addEdge("402", "403", 10);
            this.data.addEdge("403", "404", 10);
            this.data.addEdge("404", "405", 10);
            this.data.addEdge("405", "406", 5);
            this.data.addEdge("406", "407", 5);
            this.data.addEdge("425", "424", 4);
            this.data.addEdge("424", "423", 4);
            this.data.addEdge("423", "422", 4);
            this.data.addEdge("422", "421", 4);
            this.data.addEdge("421", "420", 4);
            this.data.addEdge("420", "419", 4);
            this.data.addEdge("419", "418", 4);
            this.data.addEdge("418", "417", 8);
            this.data.addEdge("417", "416", 2);
            this.data.addEdge("416", "stairsBeta_1", 2);
            this.data.addEdge("stairsBeta_1", "415", 4);
            this.data.addEdge("415", "414", 6);
            this.data.addEdge("414", "413", 10);
            this.data.addEdge("413", "412", 10);
            this.data.addEdge("412", "411", 10);
            this.data.addEdge("434", "betweenEB", 10);
            this.data.addEdge("betweenEB", "418", 10);
            this.data.addEdge("405", "betweenFC1", 6);
            this.data.addEdge("betweenFC1", "betweenFC2", 8);
            this.data.addEdge("betweenFC2", "betweenFC3", 8);
            this.data.addEdge("betweenFC3", "412", 8);
            this.data.addEdge("407", "408", 7);
            this.data.addEdge("408", "409", 7);
            this.data.addEdge("409", "410", 7);
            this.data.addEdge("410", "411", 6);
        }

        return this.data;
    }
}