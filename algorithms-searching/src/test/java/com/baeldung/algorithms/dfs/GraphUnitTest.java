package com.baeldung.algorithms.dfs;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GraphUnitTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(GraphUnitTest.class);

    @Test
    public void givenDirectedGraph_whenDFS_thenPrintAllValues() {
        Graph graph = createDirectedGraph();
        graph.dfs(0);
        graph.dfsWithoutRecursion(0);
    }

    @Test
    public void givenDirectedGraph_whenGetTopologicalSort_thenPrintValuesSorted() {
        Graph graph = createDirectedGraph();
        List<Integer> list = graph.topologicalSort(0);
        LOGGER.debug(list.toString());
    }

    private Graph createDirectedGraph() {
        Graph graph = new Graph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        return graph;
    }
}
