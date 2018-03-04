package Laborator3.Exercitii_Poli;

/**
 * Problema 7, sa se creeze un Graph in care arcele nu au cost,
 * iar nodurile sunt numerotate de la 1;
 * @author Ceachi Bogdan
 */
public class Ex7Graph {
    
    static class Graph {
        private boolean adiacentMatrix[][];
        private  int V; // nr de noduri
        
       public  Graph(int n) {
            V = n;
            adiacentMatrix = new boolean[V+1][V+1];
        }
        
        int size() {
            return V;
        }
        
        void addArc(int v, int w) {
            adiacentMatrix[v][w] = true;
        }
        
        boolean isArc(int v, int w) {
            return adiacentMatrix[v][w];
        }
        
        void print() {
            for (int i = 1; i <= V; i++) {
                for (int j = 1; j <= V; j++) {
                    System.out.print(adiacentMatrix[i][j] + " ");
                }
                System.out.println("");
            }
        }
        
        public void dfs(int v, boolean vazut[]) {
            int w;
            vazut[v] = true;
            
            for(w = 1; w <= V; w++) {
                if(isArc(v,w) && !vazut[w]) {
                    System.out.println(v + "-" + w);
                    dfs(w,vazut);
                }
            }
        }
        
    }
    
    
    public static void main(String args[] ) {
        Graph graph = new Graph(8);
        
        graph.addArc(1, 2);
        graph.addArc(1, 3);
        graph.addArc(2, 4);
        graph.addArc(2, 5);
        graph.addArc(3, 6);
        graph.addArc(3, 7);
        
        graph.print();
        boolean vazut[] = new boolean[8];
        graph.dfs(1, vazut);
        
    }
    
}
