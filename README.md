# ArvoreBinaria
 Implementação da classe árvore binária, com construtor e o método insere()

O objetivo desse código é criar uma estrutura de dados de árvore binária que permite inserção, travessia e cálculo da altura da árvore.
Essa estrutura é útil para organizar dados hierarquicamente e realizar operações eficientes em árvores. 

------------------------------------------------------------     Analise:     ------------------------------------------------------------
 Cada parte do código é uma implementação de uma árvore binária em Java:

1.	Classe ArvoreBinaria:
 	Essa classe representa uma árvore binária.
 	Ela possui um atributo privado chamado raiz, que é um nó da árvore.
 	O construtor ArvoreBinaria() inicializa a árvore como vazia, definindo raiz como null.

2.	Método insere(long id, Object elemento):
 	Esse método insere um novo nó na árvore com um ID (chave) e um elemento associado.
 	Ele percorre a árvore para encontrar a posição correta para inserir o novo nó com base no valor do ID.
 	Se a árvore estiver vazia, o novo nó se torna a raiz.
 	Caso contrário, ele percorre a árvore comparando IDs e decide se o novo nó deve ser inserido à esquerda ou à direita do nó atual.

3.	Métodos de travessia (caminhamento):
 	Os métodos preFixado(), posFixado(), simFixado() e inOrderTraversal() são responsáveis por percorrer a árvore e imprimir os nós em diferentes ordens.
 	Eles usam recursão para percorrer os nós e exibir informações (ID e elemento) de cada nó.

4.	Método calcAltura(No atual, long a):
 	Esse método calcula a altura da árvore (número máximo de níveis).
	 Ele percorre a árvore recursivamente, comparando as alturas das subárvores esquerda e direita.
 	Retorna a altura total da árvore.

5.	Método alturaArvore():
 	Esse método chama calcAltura() para obter a altura da árvore.
 	Retorna a altura total da árvore.

6.	Método getRaiz():
 	Retorna o nó raiz da árvore.
