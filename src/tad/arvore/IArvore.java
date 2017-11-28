package tad.arvore;

import java.util.Iterator;
/**
 * Interface que define os m�todos de Arvore
 */
public interface IArvore
{
	/* Mtodos gen�ricos */
	/** Retorna o n�mero de n�s da �rvore */
	public int size();
	/** retorna se a �rvore est� vazia */
	public boolean isEmpty();
	/** Retorna a altura da �rvore */
	public int height();
	/** Retorna um iterator com os elementos armazenados na �rvore */
	public Iterator elements();
	/** Retorna um iterator com as posi��es (n�s) da �rvore */
	public Iterator nos();

	/* M�todos de acesso*/
	/** Retorna a raiz da �rvore */
	public NoArvore root();
	/** Retorna o n� pai de um n� */
	public NoArvore parent(NoArvore v);
	/** Retorna os filhos de um n� */
	public Iterator children(NoArvore v);

	/* M�todos de consulta */
	/** Testa se um n� � interno */
	public boolean isInternal(NoArvore v);
	/** Testa se um n� � externo*/
	public boolean isExternal(NoArvore v);
	/** Testa se um n� � a raiz */
	public boolean isRoot(NoArvore v);
	/** Retorna a profundidade de um n� */
	public int depth(NoArvore v);

	/* M�todos de atualiza��o */
	/** Substitui o objeto de um um n� */
	public Object replace(NoArvore v, Object o);
	/** Retorna a profundidade de um n� */
}
