/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA.Graphs;

import java.util.*;

/**
 *
 * @author Ceachi Bogdan
 */
public class Graph {
    
    private int V; // number of vertices
    private List<Edge> list[]; // un vector de liste
    
    /**
     * 
     * @param n numarul de noduri
     */
    public Graph(int n) {
        V = n;
        // alocam n referinte la liste
        list = new LinkedList[n];
        // pentru fiecare componenta din list, alocam un link list de un anumit tip
        for (int i = 0; i < list.length; i++) {
            list[i] = new LinkedList<Edge>();
        }
    }
    /**
     * 
     * @param u nodul de start
     * @param v nodul de sfarsit
     * @param w costul
     */
    public void addEdge (int u , int v, int w) {
        list[u].add(0, new Edge(v,w));
    }
    
    public String toString() {
        String result = "";
        for (int i = 0; i < list.length; i++) {
            result += i + "=>" + list[i] + "\n";
        }
        return result;
    }
    
    boolean isConnected(int u, int v) {
        for (Edge i : list[u]) {
            if(i.v == v) return true;
        }
        return false;
    }
    
    class Edge {
        // (v,u) legatura dintre nodul v si u
        private int v;
        private int u;
        public Edge(int v, int u) {
            this.v = v;
            this.u = u;
        }
        public String toString() {
            return "(" + v + "," + u + ")";
        } 
    }
    
    
    public static void main(String args[]) {
        
        Graph g = new Graph(10);
        g.addEdge(0, 2, 10);
        g.addEdge(0, 5, 15);
        g.addEdge(2, 5, 10);
        g.addEdge(9, 3, 16);
        
        
        System.out.println(g);
        
    }
}
