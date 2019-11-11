import java.io.*;
import java.util.*;

import javafx.util.Pair;

public class sssp {
	static class Reader
    {
        BufferedReader br;
        StringTokenizer st;
        public Reader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException  e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
	
	static class Node {
		int src = 0;
		int cost = INF;
		HashMap<Integer, Integer> destinations = new HashMap<Integer, Integer>();
		public Node(int src) {
			this.src = src;
		}
		public void addDest(int dest, int len) {
			if(destinations.containsKey(dest)) {
				if(destinations.get(dest) > len) {
					destinations.remove(dest);
					destinations.put(dest, len);
				}
			}
			else {
				destinations.put(dest, len);
			}
		}
	}
	
	static class CostComparator implements Comparator<Node> {
		public int compare(Node a, Node b) {
			if(a.cost > b.cost) return 1;
			else if(a.cost < b.cost) return -1;
			return 0;
		}
	}
	
	static final int INF = 2*(int)1e9;
	private static Node[] graph;
	
	public static void main(String[] args) {
		Reader in = new Reader();
		int N = in.nextInt(); //number of cities (nodes)
		int M = in.nextInt(); //number of bidirectional edges
		graph = new Node[N];
		for(int i = 0; i < N; i++) {
			graph[i] = new Node(i);
		}
		for(int i = 0; i < M; i++) {
			int src = in.nextInt() - 1;
			int dest = in.nextInt() - 1; 
			int w = in.nextInt();
			graph[src].addDest(dest, w);
			graph[dest].addDest(src, w);
		}
		int[] distances = new int[N];
		Arrays.fill(distances, INF);
		distances[0] = 0;
		PriorityQueue<Node> pq = new PriorityQueue<Node>(1, new CostComparator());
		graph[0].cost = 0;
		pq.add(graph[0]);
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			HashMap<Integer, Integer> g = graph[cur.src].destinations;
			for(int dest: graph[cur.src].destinations.keySet()) {
				int w = g.get(dest);
				int dist = distances[cur.src] + w;
				if(distances[dest] > dist) {
					distances[dest] = dist;
					graph[dest].cost = dist;
					pq.add(graph[dest]);
				}
			}
		}
		for(int i: distances) System.out.println((i == INF) ? -1 : i);
	}
}