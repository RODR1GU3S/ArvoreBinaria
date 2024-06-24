/**
 *
 * @author ronal
 */
// Exemplo de criação de uma árvore binária
public class ExemploArvoreBinaria
{
    public static void main(String[] args)
    {
        ArvoreBinaria a = new ArvoreBinaria(); // cria a árvore binária
        a.insere(10, "A");
        a.insere(5, "B");
        a.insere(15, "C");
        a.insere(2, "D");
        a.insere(7, "E");
        a.insere(12, "F");
        a.insere(6, "G");
        a.insere(8, "H");

        // Incluido por MIM
        // Chama os métodos de caminhamento
        //a.preFixado();
        //a.posFixado();
        //a.simFixado();
        //a.inOrderTraversal();
        
        // Material Didático
        a.imprimeElementosArvore();
        System.out.println("Altura da Árvore Binária: "+a.alturaArvore());
    }
}
// final do exemplo de criação de uma árvore binária