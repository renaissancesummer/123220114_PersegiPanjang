/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123220114_persegipanjang;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author A123220114
 */
class KotakFrame extends JFrame{
    JLabel tulisan1 = new JLabel("Welcome, Mr. Alvino");
    JLabel tulisan2 = new JLabel("123220114");
    JLabel tulisan3 = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung balok.");
    
    JLabel panjang = new JLabel("Panjang");
    JTextField inputpanjang = new JTextField();
    JLabel lebar = new JLabel("Lebar");
    JTextField inputlebar = new JTextField();
    JLabel tinggi = new JLabel("Tinggi");
    JTextField inputtinggi = new JTextField();
    
    JButton hitung = new JButton ("Hitung");
    JButton reset = new JButton ("Reset");
    
    JLabel hasil = new JLabel("Hasil");
    
    JLabel luas = new JLabel("Luas Persegi");
    JLabel hasilluas = new JLabel("[Hasil berupa angka]");
    
    JLabel keliling = new JLabel("Keliling Persegi");
    JLabel hasilkeliling = new JLabel("[Hasil berupa angka]");
    
    JLabel volume = new JLabel("Volume Persegi");
    JLabel hasilvolume = new JLabel("[Hasil berupa angka]");
    
    JLabel permukaan = new JLabel("Luas Permukaan Balok");
    JLabel hasilpermukaan = new JLabel("[Hasil berupa angka]");
    
    KotakFrame(){
        setVisible(true);
        setSize(700, 700);
        setTitle("Hitung Persegi Panjang");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        add(tulisan1);
        tulisan1.setBounds(30, 10, 700, 50);
        tulisan1.setFont (tulisan1.getFont().deriveFont (34.0f));
        
        add(tulisan2);
        tulisan2.setBounds(370, 17, 700, 50);
        tulisan2.setFont (tulisan2.getFont().deriveFont (15.0f));
        
        add(tulisan3);
        tulisan3.setBounds(30, 40, 700, 50);
        tulisan3.setFont (tulisan3.getFont().deriveFont (20.0f));
        
        add(panjang);
        panjang.setBounds(30, 100, 250, 50);
        panjang.setFont (panjang.getFont().deriveFont (20.0f));
        add(inputpanjang);
        inputpanjang.setBounds(150, 113, 450, 30);
        
        add(lebar);
        lebar.setBounds(30, 150, 250, 50);
        lebar.setFont (lebar.getFont().deriveFont (20.0f));
        add(inputlebar);
        inputlebar.setBounds(150, 163, 450, 30);
        
        add(tinggi);
        tinggi.setBounds(30, 200, 250, 50);
        tinggi.setFont (tinggi.getFont().deriveFont (20.0f));
        add(inputtinggi);
        inputtinggi.setBounds(150, 213, 450, 30);
        
        add(hitung);
        hitung.setBounds(70, 280, 500, 30);
        add(reset);
        reset.setBounds(70, 330, 500, 30);
        
        add(hasil);
        hasil.setBounds(295, 380, 500, 30);
        hasil.setFont (hasil.getFont().deriveFont (20.0f));
        
        add(luas);
        luas.setBounds(30, 420, 250, 50);
        luas.setFont (luas.getFont().deriveFont (20.0f));
        add(hasilluas);
        hasilluas.setBounds(300, 425, 500, 30);
        hasilluas.setFont (hasilluas.getFont().deriveFont (20.0f));
        
        add(keliling);
        keliling.setBounds(30, 470, 250, 50);
        keliling.setFont (keliling.getFont().deriveFont (20.0f));
        add(hasilkeliling);
        hasilkeliling.setBounds(300, 475, 500, 30);
        hasilkeliling.setFont (hasilluas.getFont().deriveFont (20.0f));
        
        add(volume);
        volume.setBounds(30, 520, 250, 50);
        volume.setFont (volume.getFont().deriveFont (20.0f));
        add(hasilvolume);
        hasilvolume.setBounds(300, 525, 500, 30);
        hasilvolume.setFont (hasilvolume.getFont().deriveFont (20.0f));
        
        add(permukaan);
        permukaan.setBounds(30, 570, 250, 50);
        permukaan.setFont (permukaan.getFont().deriveFont (20.0f));
        add(hasilpermukaan);
        hasilpermukaan.setBounds(300, 575, 500, 30);
        hasilpermukaan.setFont (hasilpermukaan.getFont().deriveFont (20.0f));
    }
}
public class PersegiPanjang123220114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KotakFrame kotakFrame = new KotakFrame();

    }
    
}
