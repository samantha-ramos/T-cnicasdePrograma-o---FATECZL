package com.mycompany.exerciciotp;
import javax.swing.JOptionPane;

public class EstimaFin {
    //Declaração das variáveis
    private double consumo;
    private double icms;
    private double cofins;
    private double pispasesp;
    private double fornecimento;
    private double icmssobrecofins;
    private double icmssobrepispasesp;
    private double fatura;  

    //Método construtor
    public EstimaFin(double consumo) {
    this.consumo = consumo;
            }
    
    
    //Métodos de acesso e modificador (Get e Set):
    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getIcms() {
        return icms;
    }

    public void setIcms(double icms) {
        this.icms = icms;
    }

    public double getCofins() {
        return cofins;
    }

    public void setCofins(double cofins) {
        this.cofins = cofins;
    }

    public double getPispasesp() {
        return pispasesp;
    }

    public void setPispasesp(double pispasesp) {
        this.pispasesp = pispasesp;
    }

    public double getFornecimento() {
        return fornecimento;
    }

    public void setFornecimento(double fornecimento) {
        this.fornecimento = fornecimento;
    }

    public double getIcmssobrecofins() {
        return icmssobrecofins;
    }

    public void setIcmssobrecofins(double icmssobrecofins) {
        this.icmssobrecofins = icmssobrecofins;
    }

    public double getIcmssobrepispasesp() {
        return icmssobrepispasesp;
    }

    public void setIcmssobrepispasesp(double icmssobrepispasesp) {
        this.icmssobrepispasesp = icmssobrepispasesp;
    }

    public double getFatura() {
        return fatura;
    }

    public void setFatura(double fatura) {
        this.fatura = fatura;
        
    }
   
    
    //Métodos para os cálculos da Fatura:
            
    public void fornecimento(double consumo){
        this.setFornecimento(consumo*0.28172);
       if (consumo<=200){
           this.setIcms(fornecimento*0.136363);
           this.setCofins(fornecimento*0.0614722);
           this.setPispasesp(fornecimento*0.013346);
           this.setIcmssobrecofins(fornecimento*0.0136363*0.0614722);
           this.setIcmssobrepispasesp(fornecimento*0.0136363*0.013346);
       }
       else{
           this.setIcms(fornecimento*0.333333);
           this.setCofins(fornecimento*0.0730751);
           this.setPispasesp(fornecimento*0.0158651);
           this.setIcmssobrecofins(fornecimento*0.333333*0.730751);
           this.setIcmssobrepispasesp(fornecimento*0.333333*0.0158651);
       }
        
        }
        
   public void faturaEstimada(){
       this.setFatura(fornecimento + icms + cofins + pispasesp + icmssobrecofins + icmssobrepispasesp);
       JOptionPane.showMessageDialog(null,"Fornecimento = " + getFornecimento ()+ 
       "\nICMS = " + getIcms() +
       "\nCOFINS = " + getCofins() + 
       "\nPIS/PASESP = " + getPispasesp() +
       "\nICMS sobre Cofins = " + getIcmssobrecofins()+
       "\nICMS sobre PIS/PASESP = " + getIcmssobrepispasesp() +
       "\nFatura = " + getFatura());
   }

    }
   
