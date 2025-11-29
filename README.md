Nama  : Reza Afzaal Faizullah Taqy <br>
NRP   : 5025241051 <br>

Soal 1 <br>
<img width="196" height="131" alt="image" src="https://github.com/user-attachments/assets/6f22017f-4fd8-4995-a2df-7c641aa612b3" />


Soal 2 <br>
<img width="223" height="116" alt="image" src="https://github.com/user-attachments/assets/67817478-1ccb-4b49-8868-f85274f42619" />


A. Fungsi Program
1. `Program Login`: Program ini berfungsi sebagai gerbang keamanan (security gate) antarmuka. Aplikasi memvalidasi identitas pengguna dengan mencocokkan input username dan password. Jika cocok, akses diberikan; jika tidak, akses ditolak. Ini adalah implementasi dasar dari form autentikasi pada aplikasi nyata.

2. `Program Image Viewer`: Program ini berfungsi sebagai alat visualisasi media. Aplikasi memungkinkan pengguna menelusuri sistem file komputer (directory browsing), memilih file gambar (JPG/PNG), dan me-render (menampilkan) gambar tersebut ke dalam antarmuka aplikasi secara dinamis.

B. Cara Kerja Program <br>
Kedua program ini menggunakan konsep Event-Driven Programming. Berbeda dengan program konsol yang berjalan urut dari atas ke bawah, program GUI "diam" menunggu aksi pengguna.

1. Mekanisme Login:

-> Program menginisialisasi jendela (JFrame) dan komponen input (JTextField, JPasswordField).

-> Program "mendengarkan" (listening) tombol Login. <br>
<img width="425" height="245" alt="image" src="https://github.com/user-attachments/assets/e2587740-e1df-4b89-99e8-01d9ec77eb13" />


-> Saat user mengetik password, karakter diubah menjadi bintang/titik (*) untuk keamanan visual. <br>
<img width="420" height="238" alt="image" src="https://github.com/user-attachments/assets/5ba17ecc-e33a-41ea-94b7-7b675815ac60" />


-> Ketika tombol diklik, Event Listener aktif -> mengambil teks -> membandingkan String -> memunculkan Pop-up Dialog (JOptionPane) sesuai hasil validasi. <br>
<img width="339" height="138" alt="image" src="https://github.com/user-attachments/assets/39b0ad5c-29ad-43ba-ad51-fe010b0ea4b6" />


2. Mekanisme Image Viewer:

-> Program menyiapkan area kosong (JLabel) di tengah layar. <br>
<img width="597" height="611" alt="image" src="https://github.com/user-attachments/assets/782bb1df-93f5-4fed-92f5-09dcac453158" />


-> Ketika tombol "Buka Gambar" diklik, program memanggil kelas JFileChooser. Ini membuka jendela standar sistem operasi untuk memilih file. <br>
<img width="611" height="438" alt="image" src="https://github.com/user-attachments/assets/aca14329-e698-4234-bcd7-cd8a2fe92fb0" />



-> Setelah file dipilih, program mengambil path (alamat file) tersebut.

-> Objek ImageIcon dibuat berdasarkan path, lalu "ditempelkan" ke JLabel sehingga gambar muncul di layar. <br>
<img width="598" height="609" alt="image" src="https://github.com/user-attachments/assets/f4a88ced-9ee2-46e1-b6ad-ebd1f513d2ea" />


C. Penjelasan Masing-Masing Class <br>

-> JFrame <br>
Kanvas Utama. Ini adalah Container level teratas. Mewakili jendela aplikasi itu sendiri (yang ada tombol close, minimize, maximize). Semua program GUI Java Swing harus menempel di atas JFrame.

-> JTextField <br>
Input Teks Biasa. Kotak input satu baris untuk memasukkan username.

-> JPasswordField <br>
Input Teks Rahasia. Turunan dari JTextField, namun memiliki fitur masking (menyembunyikan karakter asli) untuk keamanan password.

-> JButton <br>
Tombol Interaktif. Komponen yang bisa diklik. Kita menambahkan ActionListener pada komponen ini untuk memicu kode program saat tombol ditekan.

-> JOptionPane <br>
Dialog Box. Class utilitas untuk memunculkan jendela pop-up standar (seperti pesan "Login Berhasil" atau "Error"). Sangat berguna untuk feedback cepat ke user.

-> JFileChooser <br>
File Explorer. Komponen siap pakai yang menyediakan antarmuka untuk memilih file dari hard drive komputer. Kita tidak perlu membuat kodingan browse file dari nol.

-> ImageIcon <br>
Wrapper Gambar. Class untuk memuat file gambar (JPG, PNG, GIF) menjadi objek yang bisa dimengerti oleh Java Swing untuk kemudian ditampilkan di Label atau Tombol.
