package pilhas.java.com;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    // Guarda a referencia de topo para novoNo
    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    // Remove e retorna o nó do topo da pilha
    public No pop() {
        if (this.isEmpty()) {
            return null; // Retorna null se a pilha estiver vazia
        }
        No noRemovido = refNoEntradaPilha; // Armazena o nó que será removido
        refNoEntradaPilha = refNoEntradaPilha.getRefNo(); // Atualiza o topo da pilha
        return noRemovido; // Retorna o nó removido
    }

    public No top() {
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {
        return refNoEntradaPilha == null; // Verifica se a pilha está vazia
    }

    @Override
    public String toString() {
        StringBuilder stringRetorno = new StringBuilder(); // Usando StringBuilder para melhor performance
        stringRetorno.append("----------\n");
        stringRetorno.append(" Pilha\n");
        stringRetorno.append("----------\n");

        No noAuxiliar = refNoEntradaPilha;
        while (noAuxiliar != null) {
            stringRetorno.append("[No{dado=").append(noAuxiliar.getDado()).append("}]\n");
            noAuxiliar = noAuxiliar.getRefNo();
        }
        stringRetorno.append("==========\n");
        return stringRetorno.toString(); // Retorna a string final
    }

}
