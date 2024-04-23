import java.util.*;

public class MenorCaminho {
    static final int INF = Integer.MAX_VALUE; // Valor infinito para representar a distância desconhecida

    // Função para encontrar o menor caminho a partir de um vértice de origem até um vértice de destino
    static int menorCaminho(int[][] graph, int origem, int destino) {
        int V = graph.length; // Número de vértices no grafo
        boolean visitado[] = new boolean[V]; // Array para rastrear os vértices visitados
        int distancia[] = new int[V]; // Array para armazenar as distâncias da origem
        int anterior[] = new int[V]; // Array para armazenar os predecessores no caminho mínimo

        // Inicializar todas as distâncias como infinito e os vértices como não visitados
        Arrays.fill(distancia, INF);
        Arrays.fill(visitado, false);

        // A distância da origem para ela mesma é sempre 0
        distancia[origem] = 0;

        // Fila para executar o BFS
        Queue<Integer> fila = new LinkedList<>();
        fila.add(origem); // Adicionar a origem à fila

        // Executar BFS
        while (!fila.isEmpty()) {
            int u = fila.poll(); // Retirar o primeiro vértice da fila

            // Para cada vértice adjacente a u
            for (int v = 0; v < V; v++) {
                // Se v é adjacente a u e não foi visitado ainda
                if (graph[u][v] != 0 && !visitado[v]) {
                    visitado[v] = true; // Marcar v como visitado
                    distancia[v] = distancia[u] + 1; // Atualizar a distância de v
                    anterior[v] = u; // Atualizar o predecessor de v no caminho mínimo
                    fila.add(v); // Adicionar v à fila para visitar seus vizinhos
                }
            }
        }

        // Construir o caminho mínimo do destino até a origem
        List<Integer> caminho = new ArrayList<>();
        int atual = destino;
        while (atual != origem) {
            caminho.add(atual);
            atual = anterior[atual];
        }
        caminho.add(origem);
        Collections.reverse(caminho);

        // Retornar o primeiro vértice do caminho mínimo (segundo vértice, pois o primeiro é a origem)
        return caminho.get(1);
    }
}
