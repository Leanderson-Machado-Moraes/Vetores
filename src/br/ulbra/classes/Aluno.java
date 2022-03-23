package br.ulbra.classes;

import javax.swing.JOptionPane;

public class Aluno {

    private String nome;
    private double notas[];

    public Aluno() {
        notas = new double[3];

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas(int i) {
        return notas[i];
    }

    public void setNotas(double nota, int i) {
        this.notas[i] = nota;
    }

    public int getSize() {
        return notas.length;
    }

    public double calcularMedia() {
        double ac = 0;
        int i;
        for (i = 0; i < getSize(); i++) {
            ac = ac + notas[i];
        }
        ac = ac / i;
        return ac;
    }
    @Override
    public String toString(){
        String resp = "     B O L E T I M \n";
        
        resp += " ==================== \n"
             +  "Nome: "+getNome();
         String resp1="";
         for(int i = 0; i<getSize();i++){
             resp += "\nNota"+(i+1)+":"
                             +getNotas(i);
         }
         resp += resp1 + "\n ==================== \n"
         +"Média: "+calcularMedia();
         
         return resp;
    }
    public static void main(String[] args) {
        Aluno a = new Aluno();
        
        a.setNome(JOptionPane.showInputDialog("Nome:"));
      
       for (int i=0; i<a.getSize();i++){
        a.setNotas(Double.parseDouble(
                JOptionPane.showInputDialog("Nota:")), i);
       
    }
        JOptionPane.showMessageDialog(null, a.toString());
    }
}
