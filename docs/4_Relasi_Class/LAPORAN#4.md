# Laporan Praktikum #4 - Pengantar Konsep PBO

## Kompetensi

Setelah menempuh pokok bahasan ini, mahasiswa mampu: 
1. Memahami konsep relasi kelas;
2. Mengimplementasikan relasi has‑a dalam program. 

## Ringkasan Materi

Pada kasus yang lebih kompleks, dalam suatu sistem akan ditemukan lebih dari satu class yang saling memiliki keterkaitan antara class satu dengan yang lain. Pada percobaan‑percobaan sebelumnya, mayoritas kasus yang sudah dikerjakan hanya fokus pada satu class saja. Pada jobsheet ini akan dilakukan percobaan yang melibatkan beberapa class yang saling berelasi. Misalnya terdapat class Laptop yang memiliki atribut berupa merk dan prosesor. Jika diperhatikan lebih rinci, maka atribut prosesor sendiri didalamnya memiliki data berupa merk, nilai cache memori, dan nilai clock‑nya. Artinya, ada class lain yang namanya Processor yang memiliki atribut merk, cache dan clock, dan atribut prosesor yang ada di dalam class Laptop itu merupakan objek dari class Proceessor tersebut. Sehingga terlihat antara class Laptop dan class Processor memiliki relasi (has‑a). 


### Percobaan 1

1. Screenshot kode program class Processor.

![screenshot](img/pb1a.PNG) 

2. Screenshot kode program class Laptop.

![screenshot](img/pb1b.PNG) 

3. Screenshot kode program class MainPercobaan1 beserta outputnya.

![screenshot](img/pb1c.PNG) 

link kode program : [Processor1841720132Nining.java](../../src/4_Relasi_Class/Processor1841720132Nining.java)

link kode program Barang: [Laptop1841720132Nining.java](../../src/4_Relasi_Class/Laptop1841720132Nining.java)

link kode program Barang: [MainPercobaan11841720132Nining.java](../../src/4_Relasi_Class/MainPercobaan11841720132Nining.java)

## Pertanyaan

1.	Di dalam class Processor dan class Laptop, terdapat method setter dan getter untuk masing-masing atributnya. Apakah gunanya method setter dan getter tersebut?

Jawab : fungsinya sesuai dengan namanya yaitu untu menge-set (memberi nilai) dan menge-get (mendapatkan/melihat nilai) pada suatu variabel atau class dengan contructor default

2.	Di dalam calss processor dan class Laptop, masing-masing terdapat kontruktor default dan kontruktor berparameter. Bagaimana beda penggunaan dari kedua jenis konstruktor tersebut?

Jawab : bila konstruktor default, untuk memberi nilai menggunakan setter, tetapi jika kita menggunakan konstruktor berparameter, kita hanya perlu memberi nilai di parameter pada objek di class main.

3.	Perhatikan class Laptop, diantara 2 atribut yang dimiliki (merk dan proc), atribut mana yang bertipe object?

Jawab : proc, karena inisiasi tipe variabel ditandai dengan nama object.

4.	Perhatikan class Laptop, pada baris manakah yang menunjukan bahwa class Laptop memiliki relasi dengan class Processor?
Jawab :  Terlihat jelas pada constructor, terdapat parameter yang menggunakan object Processor yang telah diinisiasi sebelumnya.
![screenshot](img/prtnypb1.PNG)

5.	Perhatikan class Laptop, apakah guna dari sintaks proc.Info()?

Jawab : proc.Info(), merupakan syntax yang digunakan untuk menjalankan method Info() pada class Processor.

6.	Pada class MainPercobaan1, terdapat baris kode Laptop l = new Laptop(“Thinkpad”, p);  . apakah p tersebut? Dan apakah yang tejadi jika baris tersebut diubah menjadi Laptop l = new Laptop(“Thinkpad”, new Processor(“Intel i5”, 3)); . Bagaimana hasil program saat dijalankan, apakah ada perubahan?

Jawab : p merupakan object dari class Processor yang tadi telah diinstansiasi, Lalu kode program yang baru hasilnya sama saja, kode program tersebut memiliki perbedaan pada instansiasi dalam bentuk variabel object, bila pada kode program tersebut object tidak perlu diinstansiasi kedalam variabel lain tetapi ter nested atau bisa dibilang melakukan instansiasi objek dialam instansiasi object.

### Percobaan 2

1. Screenshot kode program class Mobil.

![screenshot](img/pb2b.PNG)

2. Screenshot kode program class Sopir.

![screenshot](img/pb2a.PNG) 

3. Screenshot kode program class Pelanggan.

![screenshot](img/pb2c.PNG) 

4. Screenshot kode program class MainPercobaan2 dan beserta outputnya.

![screenshot](img/pb2d.PNG) 

link kode program : [MobilNining1841720132.java](../../src/4_Relasi_Class/MobilNining1841720132.java)

link kode program Barang: [SopirNining1841720132.java](../../src/4_Relasi_Class/SopirNining1841720132.java)

link kode program : [PelangganNining.java](../../src/4_Relasi_Class/PelangganNining.java)

link kode program Barang: [MainPecobaan21841720132Nining.java](../../src/4_Relasi_Class/MainPecobaan21841720132Nining.java)


## Pertanyaan

1.	Perhatikan class Pelanggan. Pada baris program makanan yang menunjukan bahwa class Pelanggan memiliki relasi dengan class Mobil dan class Sopir?

Jawab :  Dapat dilihat pada inisiasi  variabel object di class pelanggan.
![screenshot](img/prtnypb2.PNG)
    
2.	Perhatikan method hitungBiayaSopir pada class Sopir, serta method hitungBiayaMobil pada calss Mobil. Mengapa menurut anda method tersebut harus memiliki argument hari?

Jawab : argumen tersebut nantinya digunakan untuk diisi dengan variabel int hari pada class Pelanggan 
 
3.	Perhatikan class Pelanggan. Untuk apakah perintah
mobil.hitungBiayaMobil(hari) dan sopir.hitungBiayaSopir(hari)?

Jawab : kode program tersebut digunakan untuk menjumlahkan biaya mobil yang diambil dari harga sopir dikali dengan hari lalu yang dijumlahkan dengan biaya sopir yang diambil dari harga sopir dikali hari.

4.	Perhatikan class MainPercobaan2. Untuk apakah sintaks p.setMobil(m) dan p.setSopir(s)?

Jawab : kode program tersebut digunakan untuk memberi atau mengisi nilai dari namaMobil dan namaSopir yang ada pada objek pelanggan

5.	Perhatikan class MainPercobaan2. Untuk apakah proses p.hitungBiayaTotal() tersebut?

Jawab : Digunakan untuk menghitung biaya total dari penjumlahan antara biaya sopir dan biaya mobil.

6.	Perhatikan class MainPercobaan2 coba tambahkan pada baris terakhir dari method main dan amati perubahan saat di-run!
System.out.println(p.getMobil().getMerk();
Jadi untuk apakah sintaks diatas yang ada didalam method main tersebut?

Jawab : perintah tersebut digunakan untuk menggembalikan atau me return nilai atribut dari method  getMerk() pada class Mobil melalui objek pelanggan, atau setelah me return object Mobil pada class pelanggan, object mobil akan me return String getMerk() pada class mobil

### Percobaan 3

1. Screenshot kode program class Pegawai.

![screenshot](img/pb3a.PNG)

2. Screenshot kode program class KeretaApi.

![screenshot](img/pb3b.PNG) 

3. Screenshot kode program class MainPercobaan3 dan beserta outputnya.

![screenshot](img/pb3c.PNG)  

link kode program : [PegawaiNining1841720132.java](../../src/4_Relasi_Class/PegawaiNining1841720132.java)

link kode program Barang: [KeretaApiNining1841720132.java](../../src/4_Relasi_Class/KeretaApiNining1841720132.java)

link kode program Barang: [MainPercobaan3Nining1841720132.java](../../src/4_Relasi_Class/MainPerobaan3Nining1841720132.java)

## Pertanyaan

1.	Dalam method info() pada class KeretaApi, baris this.masinis.info() dan this.asisten.info() digunakan untuk apa?

Jawab : digunakan untuk memanggil method Info yang berada di class Pegawai melalui object masinis dan asisten

2.	Buatlah main program baru dengan nama class MainPertanyaan pada package yang sama. Tambahkan kode berikut pada method main()

Jawab : ![screenshot](img/prtnypb3no.2.PNG)

3.	Apakah hasil output dari main program tersebut? Mengapa hal tersebut dapat terjadi?

Jawab : ![screenshot](img/prtnypb3no.3.PNG)
Dapat dilihat dalam gambar diatas karane ada variabel yang tidak bernilai atau disebut dengan null, dan variabel tersebut adalah object asisten pada class KeretaApi.

4.	Perbaiki class KeretaApi sehingga program dapat berjalan!

Jawab :  
- perbaiki class KeretaApi
![screenshot](img/prtnypb3no.4.PNG)
- Cek output:
![screenshot](img/prtnypb3no.5.PNG)

### Percobaan 4

1. Screenshot kode program class Penumpang.

![screenshot](img/pb4a.PNG)

2. Screenshot kode program class Kursi.

![screenshot](img/pb4b.PNG) 

3. Screenshot kode program class Gerbong.

![screenshot](img/pb4c.PNG) 

4. Screenshot kode program class MainPercobaan4 dan beserta outputnya.

![screenshot](img/pb4d.PNG) 

link kode program : [PenumpangNining1841720132.java](../../src/4_Relasi_Class/PenumpangNining1841720132.java)

link kode program Barang: [KursiNining1841720132.java](../../src/4_Relasi_Class/KursiNining1841720132.java)

link kode program : [GerbongNining1841720132.java](../../src/4_Relasi_Class/GerbongNining1841720132.java)

link kode program Barang: [MainPercobaan3Nining1841720132.java](../../src/4_Relasi_Class/MainPecobaan21841720132Nining.java)

## Pertanyaan

1.	Pada main program dalam class MainPercobaan4, berapakah jumlah kursi dalam Gerbong A?

Jawab : 10, dapat dilihat pada instansiasi new Gerbong atau pada output bisa dilihat perulangan “Nomer : 10” 

2.	Perhatikan potongan kode pada method info() dalam class Kursi. Apa maksud kode tersebut?
 ![screenshot](img/a.PNG) 

Jawab : potongan kode program tersebut digunakan untuk menampilkan kursi yang terisi oleh penumpang, tetapi bila penumpang tidak bernilai atau null, maka kode program yang terdapat pada if tidak dijalankan atau berarti kursi tersebut masih kosong

3.	Mengapa pada method setPenumpang() dalam class Gerbang, nilai nomer dikurangi dengan angka 1?

Jawab : karena index array selalu dimulai dari 0, oleh karena itu nilai nomer harus dikurangi 1 agar array di index 0 atau di index pertama dapat terisi

4.	Intansiasi object baru budi dengan tipe Penumpang, kemudian masukan object baru tersebut pada gerbong dengan gerbong.setPenumpang(budi,1). Apakah yang terjadi?

Jawab : 
- Kode program : ![screenshot](img/prtnypb4.PNG) 
- Outputnya : ![screenshot](img/prtnypb4a.PNG) 


## Tugas

Buatlah sebuah studi kasus, rancang dengan class diagram, kemudian implementasikan ke dalam program! Studi kasus harus mewakili relasi class dari percobaan‑percobaan yang telah dilakukan pada materi ini, setidaknya melibatkan minimal 4 class (class yang berisi main tidak dihitung).

JAWAB: 
- Class Diagram

![screenshot](img/tgs1.PNG) 

- Class Pegawai
![screenshot](img/tgs2.PNG) 

- Class Nasabah
![screenshot](img/tgs3.PNG) 

- Class Bank
![screenshot](img/tgs4.PNG)

- Class Rekening
![screenshot](img/tgs5.PNG)

- Class MainTugas
![screenshot](img/tgs6.PNG) 

link kode program : [PegawaiNining1841720132.java](../../src/4_Relasi_Class/PegawaiNiningg1841720132.java)

link kode program Barang: [NasabahNining1841720132.java](../../src/4_Relasi_Class/NasabahNining1841720132.java)

link kode program : [BankNining1841720132.java](../../src/4_Relasi_Class/BankNining1841720132.java)

link kode program : [RekeningNining1841720132.java](../../src/4_Relasi_Class/RekeningNining1841720132.java)

link kode program Barang: [MainTugasNining1841720132.java](../../src/4_Relasi_Class/MainTugas1841720132Nining.java)

## Kesimpulan

Kesimpulan yang didapat setelah melakukan praktikum adalah: 
1. mengetahui hubungan relasi kelas. 
2. Mengetahui konsep dari relasi kelas tersebut. 
3. Dapat menerapkan relasi kelas dalam tugas praktikum. 

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

DIMAHYANTI DWI LESTARININGSIH