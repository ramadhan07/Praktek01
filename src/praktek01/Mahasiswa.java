/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author rama
 */
public class Mahasiswa {
    String nama;
    String kelas;
    String NPM;
    String jurusan;
    String semester;
    double IPK;
    
    void cetakInfo(){
        System.out.println("nama"+nama);
        System.out.println("kelas"+kelas);
        System.out.println("NPM"+NPM);
        System.out.println("jurusan"+jurusan);
        System.out.println("semester"+semester);
        System.out.println("IPK"+IPK);
    }
}
