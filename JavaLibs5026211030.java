import javax.swing.JOptionPane;

public class JavaLibs5026211030 {
    public static void main(String[] Args) {
	String nama = null;
    	String makananFavorit = null;
    	String tempatTinggal = null;
	int berapaBersaudara, bulanLahir;
	double tinggiBadan, tinggi2;
	 

	nama = JOptionPane.showInputDialog(null,"Nama Lengkap :");
	makananFavorit = JOptionPane.showInputDialog(null,"Makanan Favorit:");
	bulanLahir = Integer.parseInt(JOptionPane.showInputDialog(null,"Kamu lahir bulan berapa"));
	tempatTinggal = JOptionPane.showInputDialog(null,"Tinggal dimana");
	
	JOptionPane.showMessageDialog(null,"Wah! " +tempatTinggal+ " itu tempat yang bagus, aku juga ingin kesana !");

	tinggiBadan = Double.parseDouble(JOptionPane.showInputDialog(null,"Ngomong-ngomong tinggi badan kamu berapa =____centimeter"));
	tinggi2 = tinggiBadan/100;

	
	makananFavorit = JOptionPane.showInputDialog(null,"Apa makanan favoritmu? ");
	berapaBersaudara = Integer.parseInt(JOptionPane.showInputDialog(null,"Kamu berapa bersaudara dirumah?"));
	
	JOptionPane.showMessageDialog(null,"Halo " +nama+ "!, ternyata kamu suka makan " +makananFavorit+ " ya. Tinggimu " +tinggiBadan+ " cm. Kalau dalam satuan meter tinggimu yaitu " +tinggi2+ ".");
	}
}

	



    
  