/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan47.nilaimahasiswa;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan nilai mahasiswa
 */

class Nilai {
    private double quiz;
    private double uts;
    private double uas;
    
    public double getQuiz(){
        return quiz;
    }
    
    public void setQuiz(double quiz){
        this.quiz = quiz;
    }
    
    public double getUts(){
        return uts;
    }
    
    public void setUts(double uts){
        this.uts = uts;
    }
    
    public double getUas(){
        return uas;
    }
    
    public void setUas(double uas){
        this.uas = uas;
    }
    
    public double nilaiAkhir(){
        double na;
        na = 0.2*getQuiz()+0.3*getUts()+0.5*getUas();
        return na;
    }
    
    public String Index(double na){
        if (na>=80 && na<=100){
            return "A";
        } else if (na>=68 && na<80){
            return "B";
        } else if (na>=56 && na<68){
            return "C";
        } else if (na>=45 && na<56){
            return "D";
        } else {
            return "E";
        }
    }
    
    public String aturanKeterangan(double na){
        if (na>=80 && na<=100){
            return "Sangat Baik";
        } else if (na>=68 && na<80){
            return "Baik";
        } else if (na>=56 && na<68){
            return "Cukup";
        } else if (na>=45 && na<56){
            return "Kurang";
        } else {
            return "Sangat Kurang";
        }
    }    
}
