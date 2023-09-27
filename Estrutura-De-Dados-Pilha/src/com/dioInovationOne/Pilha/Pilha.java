package com.dioInovationOne.Pilha;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha(){
        this.refNoEntradaPilha = null;
    }

    public void push(int novoDado) {
        No novoNo = new No(novoDado);
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    };

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getNext();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return this.refNoEntradaPilha;
    }

    public boolean isEmpty(){

        return this.refNoEntradaPilha == null ? true : false;

    };

    @Override
    public String toString(){
        String stringRetorno = "-------------\n";
        stringRetorno += "Pilha\n";
        stringRetorno += "-------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while(true){
            if(noAuxiliar != null){
                stringRetorno += "{No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getNext();
            } else {
                break;
            }
        }
        stringRetorno += "==================\n";
        return stringRetorno;
    }

}
