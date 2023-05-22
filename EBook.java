public class EBook {
    private final String titulo;
    private final int paginas;
    private int lendoPagina;

    public EBook(String titulo, int paginas) {
        if (titulo.isEmpty()) {
            throw new IllegalArgumentException("O título não pode ser vazio.");
        }
        if (paginas <= 0 || paginas > 5000) {
            throw new IllegalArgumentException("A quantidade de páginas deve estar entre 1 e 5000.");
        }

        this.titulo = titulo;
        this.paginas = paginas;
        this.lendoPagina = 1;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getLendoPagina() {
        return lendoPagina;
    }

    
}
