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

public class PBOIF210119044Latihan47NilaiMahasiswa {

    public static void main(String[] args) {
        Nilai objNilai = new Nilai();
        objNilai.setQuiz(75);
        objNilai.setUts(45);
        objNilai.setUas(34);
        System.out.println("QUIZ            = "+objNilai.getQuiz());
        System.out.println("UTS             = "+objNilai.getUts());
        System.out.println("UAS             = "+objNilai.getUas()+"\n");
        System.out.println("Nilai Akhir     = "+objNilai.nilaiAkhir()+"\n");
        System.out.println("Index           = "+objNilai.Index(objNilai.nilaiAkhir()));
        System.out.println("Keterangan      = "+objNilai.aturanKeterangan(objNilai.nilaiAkhir()));    
    }   
}
