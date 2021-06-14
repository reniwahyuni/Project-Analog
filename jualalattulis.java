package reni;

import java.awt.EventQueue;

import java.util.ArrayList;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class jualalattulis {

	private JFrame frame;
	private JTextField txtnama;
	private JTextField txtnamabarang;
	private JTextField txthargabarang;
	private JTextField txtjumlahbeli;
	private JTextField txtsatuan;
	private JTextField txtdiskon;
	private JTextField txttotalharga;
	private JTextField txtuangbayar;
	private JTextField txtuangkembalian;
	private JTextField txtketerangan;
	private int kodekonsumen;
	
	public int getKodekonsumen() {
		return kodekonsumen;
	}

	public void setKodekonsumen(int kodekonsumen) {
		this.kodekonsumen = kodekonsumen;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	private String keterangan;
	
	ArrayList<jualalattulis> jualalattulis;

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTxtnama() {
		return txtnama;
	}

	public void setTxtnama(JTextField nama) {
		this.txtnama = nama;
	}

	public JTextField getTxtnamabarang() {
		return txtnamabarang;
	}

	public void setTxtnamabarang(JTextField namabarang) {
		this.txtnamabarang = namabarang;
	}

	public JTextField getTxthargabarang() {
		return txthargabarang;
	}

	public void setTxthargabarang(JTextField hargabarang) {
		this.txthargabarang = hargabarang;
	}

	public JTextField getTxtjumlahbeli() {
		return txtjumlahbeli;
	}

	public void setTxtjumlahbeli(JTextField jumlahbeli) {
		this.txtjumlahbeli = jumlahbeli;
	}

	public JTextField getTxtsatuan() {
		return txtsatuan;
	}

	public void setTxtsatuan(JTextField satuan) {
		this.txtsatuan = satuan;
	}

	public JTextField getTxtdiskon() {
		return txtdiskon;
	}

	public void setTxtdiskon(JTextField diskon) {
		this.txtdiskon = diskon;
	}

	public JTextField getTxttotalharga() {
		return txttotalharga;
	}

	public void setTxttotalharga(JTextField totalharga) {
		this.txttotalharga = totalharga;
	}

	public JTextField getTxtuangbayar() {
		return txtuangbayar;
	}

	public void setTxtuangbayar(JTextField uangbayar) {
		this.txtuangbayar = uangbayar;
	}

	public JTextField getTxtuangkembalian() {
		return txtuangkembalian;
	}

	public void setTxtuangkembalian(JTextField uangkembalian) {
		this.txtuangkembalian = uangkembalian;
	}

	public JTextField getTxtketerangan() {
		return txtketerangan;
	}

	public void setTxtketerangan(JTextField keterangan) {
		this.txtketerangan = keterangan;
	}
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jualalattulis window = new jualalattulis();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public jualalattulis() {
		
		jualalattulis = new ArrayList<>();
		initialize();
		
			
			
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 954, 624);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("KR  BOOK");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 23));
		lblNewLabel.setBounds(388, 39, 128, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Penjualan Alat Tulis");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(350, 66, 211, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nama Konsumen :");
		lblNewLabel_2.setFont(new Font("Sitka Subheading", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(110, 132, 128, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtnama = new JTextField();
		txtnama.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtnama.setBounds(248, 128, 232, 20);
		frame.getContentPane().add(txtnama);
		txtnama.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Kode Konsumen :");
		lblNewLabel_2_1.setFont(new Font("Sitka Subheading", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(110, 157, 128, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Keterangan :");
		lblNewLabel_2_2.setFont(new Font("Sitka Subheading", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(110, 182, 128, 14);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Kode Barang        :");
		lblNewLabel_2_3.setFont(new Font("Sitka Subheading", Font.PLAIN, 16));
		lblNewLabel_2_3.setBounds(47, 238, 128, 14);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Nama Barang       :");
		lblNewLabel_2_4.setFont(new Font("Sitka Subheading", Font.PLAIN, 16));
		lblNewLabel_2_4.setBounds(47, 268, 128, 14);
		frame.getContentPane().add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Harga Barang      :");
		lblNewLabel_2_5.setFont(new Font("Sitka Subheading", Font.PLAIN, 16));
		lblNewLabel_2_5.setBounds(47, 296, 128, 14);
		frame.getContentPane().add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("Jumlah Beli          :");
		lblNewLabel_2_6.setFont(new Font("Sitka Subheading", Font.PLAIN, 16));
		lblNewLabel_2_6.setBounds(47, 322, 128, 14);
		frame.getContentPane().add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("Satuan                  :");
		lblNewLabel_2_7.setFont(new Font("Sitka Subheading", Font.PLAIN, 16));
		lblNewLabel_2_7.setBounds(47, 347, 128, 14);
		frame.getContentPane().add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_2_8 = new JLabel("Diskon                  :");
		lblNewLabel_2_8.setFont(new Font("Sitka Subheading", Font.PLAIN, 16));
		lblNewLabel_2_8.setBounds(47, 372, 128, 14);
		frame.getContentPane().add(lblNewLabel_2_8);
		
		JLabel lblNewLabel_2_10 = new JLabel("Uang Bayar          :");
		lblNewLabel_2_10.setFont(new Font("Sitka Subheading", Font.PLAIN, 16));
		lblNewLabel_2_10.setBounds(498, 296, 128, 14);
		frame.getContentPane().add(lblNewLabel_2_10);
		
		JLabel lblNewLabel_2_11 = new JLabel("Uang Kembalian :");
		lblNewLabel_2_11.setFont(new Font("Sitka Subheading", Font.PLAIN, 16));
		lblNewLabel_2_11.setBounds(498, 372, 128, 14);
		frame.getContentPane().add(lblNewLabel_2_11);
		
		JLabel lblNewLabel_2_9 = new JLabel("Total Harga         :");
		lblNewLabel_2_9.setBackground(Color.WHITE);
		lblNewLabel_2_9.setBounds(498, 265, 128, 21);
		frame.getContentPane().add(lblNewLabel_2_9);
		lblNewLabel_2_9.setFont(new Font("Sitka Subheading", Font.PLAIN, 16));
		
		txtnamabarang = new JTextField();
		txtnamabarang.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtnamabarang.setColumns(10);
		txtnamabarang.setBounds(197, 264, 232, 20);
		frame.getContentPane().add(txtnamabarang);
		
		txthargabarang = new JTextField();
		txthargabarang.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txthargabarang.setColumns(10);
		txthargabarang.setBounds(197, 292, 232, 20);
		frame.getContentPane().add(txthargabarang);
		
		txtjumlahbeli = new JTextField();
		txtjumlahbeli.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtjumlahbeli.setColumns(10);
		txtjumlahbeli.setBounds(197, 318, 232, 20);
		frame.getContentPane().add(txtjumlahbeli);
		
		txtsatuan = new JTextField();
		txtsatuan.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtsatuan.setColumns(10);
		txtsatuan.setBounds(197, 343, 232, 20);
		frame.getContentPane().add(txtsatuan);
		
		txtdiskon = new JTextField();
		txtdiskon.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtdiskon.setColumns(10);
		txtdiskon.setBounds(197, 368, 232, 20);
		frame.getContentPane().add(txtdiskon);
		
		txttotalharga = new JTextField();
		txttotalharga.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txttotalharga.setColumns(10);
		txttotalharga.setBounds(654, 263, 232, 20);
		frame.getContentPane().add(txttotalharga);
		
		txtuangbayar = new JTextField();
		txtuangbayar.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtuangbayar.setColumns(10);
		txtuangbayar.setBounds(654, 291, 232, 20);
		frame.getContentPane().add(txtuangbayar);
		
		txtuangkembalian = new JTextField();
		txtuangkembalian.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtuangkembalian.setColumns(10);
		txtuangkembalian.setBounds(654, 367, 232, 20);
		frame.getContentPane().add(txtuangkembalian);
		
		JComboBox cmbkodekonsumen = new JComboBox();
		cmbkodekonsumen.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cmbkodekonsumen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String kodeks, keterangan;
				
				kodeks = String.valueOf(cmbkodekonsumen.getSelectedItem());
				if (kodeks.equals("PB001")) {
					keterangan = "Members";
				}else
					if (kodeks.equals("PB002")) {
						keterangan = "Konsumen Biasa";
				}else
					{
						keterangan = "Tidak Terdaftar";
					}
				txtketerangan.setText(""+keterangan);
			}
		});
		cmbkodekonsumen.setModel(new DefaultComboBoxModel(new String[] {"-Pilih-", "PB001", "PB002"}));
		cmbkodekonsumen.setBounds(248, 152, 232, 22);
		frame.getContentPane().add(cmbkodekonsumen);
		
		txtketerangan = new JTextField();
		txtketerangan.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtketerangan.setColumns(10);
		txtketerangan.setBounds(248, 178, 232, 20);
		frame.getContentPane().add(txtketerangan);
		
		JComboBox cmbkodebarang = new JComboBox();
		cmbkodebarang.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cmbkodebarang.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
				String kdbarang,namabarang,satuan;
				double hargabarang;
				
				kdbarang = String.valueOf(cmbkodebarang.getSelectedItem());
				
				if (kdbarang.equals("BK001")) {
					namabarang= "Buku";
					hargabarang = 110000;
					satuan = "lusin";
				}else
					if (kdbarang.equals("PN002")) {
						namabarang= "Pena";
						hargabarang = 40000;
						satuan = "box";
				}else
					if (kdbarang.equals("PS003")) {
						namabarang= "Pensil";
						hargabarang = 30000;
						satuan = "pack";
				}else
					if (kdbarang.equals("TP004")) {
						namabarang= "Tipe X";
						hargabarang = 40000;
						satuan = "box";
				}else
					if (kdbarang.equals("PG005")) {
						namabarang= "Penghapus";
						hargabarang = 25000;
						satuan = "box";
				}else
					{kdbarang = "BN006";
					namabarang= "Binder";
					hargabarang = 30000;
					satuan = "pcs";
				}
				txtnamabarang.setText(""+namabarang);
				txthargabarang.setText(""+hargabarang);
				txtsatuan.setText(""+satuan);
						
						
					
			
			}
		});
		cmbkodebarang.setModel(new DefaultComboBoxModel(new String[] {"-Silahkan Pilih-", "BK001", "PN002", "PS003", "TP004", "PG005", "BN006"}));
		cmbkodebarang.setBounds(197, 233, 232, 22);
		frame.getContentPane().add(cmbkodebarang);
		
		JButton btnproses = new JButton("Proses Diskon");
		btnproses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double hargabarang, diskon;
				int jumlahbeli;
				
				jumlahbeli = Integer.parseInt(txtjumlahbeli.getText());
				hargabarang = Double.parseDouble(txthargabarang.getText());
				
				if (jumlahbeli >= 10) {
					diskon = hargabarang * 0.1 ;
					
				}else
					{
						diskon = 0;
					}
				txtdiskon.setText(""+diskon);
		
			}
		});
		btnproses.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnproses.setBounds(47, 399, 112, 23);
		frame.getContentPane().add(btnproses);
		
		JButton btnprosestotalharga = new JButton("Proses Total Harga");
		btnprosestotalharga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double hargabarang, diskon, totalbayar;
				int jumlahbeli;
				
				hargabarang = Double.parseDouble(txthargabarang.getText());
				diskon = Double.parseDouble(txtdiskon.getText());
				jumlahbeli = Integer.parseInt(txtjumlahbeli.getText());
				
				totalbayar = (hargabarang * jumlahbeli) - diskon ;
				txttotalharga.setText(""+totalbayar);
				
			}
		});
		btnprosestotalharga.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnprosestotalharga.setBounds(483, 232, 143, 23);
		frame.getContentPane().add(btnprosestotalharga);
		
		JButton btnprosesuangbayar = new JButton("Proses Uang Bayar");
		btnprosesuangbayar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double totalbayar, uangbayar, uangkembalian;
				
				totalbayar = Double.parseDouble(txttotalharga.getText());
				uangbayar = Double.parseDouble(txtuangbayar.getText());
				
				if (uangbayar > totalbayar) {
					uangkembalian = uangbayar - totalbayar;
					txtuangkembalian.setText(""+uangkembalian);
				}else
					{
						txtuangkembalian.setText("Uang Anda Kurang");
					}
			}
		});
		btnprosesuangbayar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnprosesuangbayar.setBounds(654, 333, 143, 23);
		frame.getContentPane().add(btnprosesuangbayar);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(877, 11, 51, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnhapus = new JButton("Hapus");
		btnhapus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtnama.setText("");
				txtketerangan.setText("");
				txtnamabarang.setText("");
				txtsatuan.setText("");
				txtjumlahbeli.setText("");
				txtdiskon.setText("");
				txthargabarang.setText("");
				txttotalharga.setText("");
				txtuangbayar.setText("");
				txtuangkembalian.setText("");
				cmbkodebarang.setSelectedItem(null);
				cmbkodekonsumen.setSelectedItem(null);
				txtnama.requestFocus();
			
			}
		});
		btnhapus.setFont(new Font("Sitka Subheading", Font.PLAIN, 15));
		btnhapus.setBounds(790, 471, 96, 26);
		frame.getContentPane().add(btnhapus);
	}
}
