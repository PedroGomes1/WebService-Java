/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 23848-5
 */
public class Pessoa {
    
    
   String nome;

    public String getNome() {
        return nome;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
}
