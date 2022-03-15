import java.io.Serializable;

public interface DAO<E> extends Serializable{
    public void inserir(E e);
    
    public void alterar(E e);
    
    public void remover(E e);
    
    public E listarPorID(E e);
    
}
