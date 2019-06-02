package objetos;

public interface PanelMenuListener {
	public void pintarNodo();
	public void eliminarNodoArista(Boolean activado);
	public void pintarArista(AristaStatus pintarArista);
	public void resolverDijkstra(Dijkstra solucion);
	public void abrirArchivo();
}
