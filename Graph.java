import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Graph {
    private int[][] edge;
    private int size;

    public Graph(int size) {
        this.size = size;
        this.edge = new int[size][size];
    }

    public int size(){
        return size;
    }

    public void addEdge(int src, int dst) {
      // TODO
    }

    public void removeEdge(int src, int dst) {
      // TODO
    }

    public void readGraph(File file) throws IOException {
        if (file == null) {
            String currentPath = Paths.get(".", "src").toString();
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.setCurrentDirectory(new File(currentPath));
            jFileChooser.showOpenDialog(new JFrame());
            file = jFileChooser.getSelectedFile();
        }
        if (file != null) {
            BufferedReader br = new BufferedReader(new FileReader(file));
            this.size = Integer.parseInt(br.readLine());
            this.edge = new int[size][size];
            for (int i = 0; i < size; ++i) {
                String[] temps = br.readLine().split(" ");
                for (int j = 0; j < temps.length; ++j) {
                    edge[i][j] = Integer.parseInt(temps[j]);
                }
            }
            System.out.println("File selected!");
        } else {
            System.out.println("No file Selected");
        }
    }
    public void print() {
        System.out.println("This Graph ::\n");
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                System.out.print(edge[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void bfs(int vertex) {
      // TODO
    }

    public void dfs(boolean[] isFounds, int vertex) {
      // TODO
    }

    public void kruskalAlgorithm() {
      // TODO
    }

    public void primAlgorithm(int start){
      // TODO
    }
}
