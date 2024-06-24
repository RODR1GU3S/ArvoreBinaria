/**
 *
 * @author ronal
 */
// Implementação da classe árvore binária, com construtor e o método insere()
public class ArvoreBinaria
{
    private No raiz;

  // construtor da classe Arvore Binaria
  public ArvoreBinaria() 
  {
    this.raiz = null; // inicia a árvore vazia
  }

  // método para inserção de elemento
  public void insere(long id, Object elemento) 
  {
    No novoNo = new No(id, elemento, null, null);
    if (raiz == null) {
      raiz = novoNo;
    } else {
      No atual = raiz;
      No pai;
      while (true) {
        pai = atual;
        if (id < atual.getId()) { // vai inserir à esquerda
          atual = atual.getEsq();
          if (atual == null) { // pode inserir à esquerda
            pai.setEsq(novoNo);
            return;
          } // se não é nulo, vai tentar o próximo filho
        } 
        else { // vai inserir à direita
          atual = atual.getDir();
          if (atual == null) { // pode inserir à direita
            pai.setDir(novoNo);
            return;
          }
        }
      }
    }
  } // final método insere

    /*
    // Incluido por MIM
    public void preFixado()
    {
        System.out.println("Caminhamento pré-fixado:");
        preFixado(raiz);
    }
    */
    // caminhamento pré-fixado da árvore binária
    private void preFixado(No atual)
    {
        if (atual != null)
        {
            System.out.println("Id: "+atual.getId()+" Elemento: "+atual.getElemento());
            preFixado(atual.getEsq());
            preFixado(atual.getDir());
        }
    } 
    // final método preFixado
    
    
    /*
    // Incluido por MIM
    public void posFixado()
    {
        System.out.println("\nCaminhamento pós-fixado:");
        posFixado(raiz);
    }
    */
    
    // caminhamento pós-fixado da árvore binária
    private void posFixado(No atual)
    {
        if (atual != null)
        {
            posFixado(atual.getEsq());
            posFixado(atual.getDir());
            System.out.println("Id: "+atual.getId()+" Elemento: "+atual.getElemento());
        }
    }
    // final método posFixado
    
  
    /*
    // Incluido por MIM
    public void simFixado()
    {
        System.out.println("\nCaminhamento sim-fixado:");
        simFixado(raiz);
    }
    */
    // caminhamento simétrico fixado da árvore binária
    private void simFixado(No atual)
    {
        if (atual != null)
        {
            simFixado(atual.getEsq());
            System.out.println("Id: "+atual.getId()+" Elemento: "+atual.getElemento());
            simFixado(atual.getDir());
        }
    }
    // final método sinFixado
    
    
    // Material Didático
    // impressão dos elementos da árvore
    public void imprimeElementosArvore()
    {
        System.out.println("Caminhamento pré-fixado:");// Incluido por MIM
        preFixado(raiz);
        System.out.println();
        
        System.out.println("Caminhamento pós-fixado:");// Incluido por MIM
        posFixado(raiz);// Incluido por MIM
        System.out.println();
        
        System.out.println("Caminhamento sim-fixado:");// Incluido por MIM
        simFixado(raiz);// Incluido por MIM
        System.out.println();
    }
    // final do método para impressão
    
  
    /*
    //     Incluido por MIM >>>>> IGUAL AO simFixado "SIMÉTRICO"
    public void inOrderTraversal()
    {
        System.out.println("\nCaminhamento em ordem:");
        inOrderTraversal(raiz);
    }

    // Incluido por MIM
    public void inOrderTraversal(No atual)
    {
        if (atual != null)
        {
            inOrderTraversal(atual.getEsq());
            System.out.println("Id: " + atual.getId() + " Elemento: " + atual.getElemento());
            inOrderTraversal(atual.getDir());
        }
    }
    */

    
    // calcula a altura da árvore
    private long calcAltura(No atual, long a)
    {
        if (atual != null)
        {
            long e,d;
            e = calcAltura(atual.getEsq(),a)+1;
            d = calcAltura(atual.getDir(),a)+1;
            if (e > d)
            {
                return a+e;
            }
            else
            {
                return a+d;
            }
        }
        return a;
    } 
    // final método calcAltura
 
    public long alturaArvore()
    {
        long a = 0;
        return calcAltura(raiz,a);
    }
    // final do método alturaArvore
    
    
    /*
    // Incluido por MIM
    public No getRaiz()
    {
        return this.raiz;
    }
    */
}
// Final da classe ArvoreBinaria
