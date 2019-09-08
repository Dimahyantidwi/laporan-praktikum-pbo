# Laporan Praktikum #2 - Pengantar Konsep PBO

## Kompetensi

( Mahasiswa dapat memahami deskripsi dari class dan object  Mahasiswa memahami implementasi dari class  Mahasiswa dapat memahami implementasi dari attribute.
 Mahasiswa dapat memahami implementasi dari method. 
 Mahasiswa dapat memahami implementasi dari proses instansiasi. 
 Mahasiswa dapat memahami implementasi dari try-catch. 
 Mahasiswa dapat memahami proses pemodelan class diagram menggunakan UML. )

## Ringkasan Materi

(Di pemrograman berorientasi objek memiliki beberapa konsep yang sangat mendasar untuk kalian ketahui, antara lain sebagai berikut:

1. Class adalah gabungan data dalam satu kesatuan untuk suatu tujuan yang ditentukan. Suatu class itu Greader adalah dasar dari bahan dan struktur dalam pemrograman berorientasi objek tersebut. Sahabat GCI melalui bahan ajar, struktur program akan terkait dengan aspek dalam masalah yang akan diselesaikan melalui program tersebut. Cara ini yang dipakai untuk menyederhanakan masalah pada suatu program.
2. Objek merupakan perangkat data dan fungsi menjadi kesatuan suatu program komputer. Objek itu ialah dasar dari bentuk dan struktur dalam suatu program pada komputer.
3. Abstraksi adalah kemampuan suatu program untuk melewati bagian informasi yang akan diolah olehnya, yaitu kegunaan untuk memfokuskan ke dalam intinya. Proses, fungsi atau cara bisa juga dibuat abstrak, dan beberapa cara untuk dipakai untuk penggembangan program abstrak.
4.Enkapsulasi adalah pembungkusan data yang memastikan pengguna sebuah objek tidak bisa menukar kondisi dari dalam suatu objek dengan cara yang tidak pantas. Tetapi hanya cara yang terdapat di dalam objek itu yang bisa untuk mengakses keadaan.)

## Percobaan

### Percobaan 1

( 1.
![screenshot](img/1.PNG) 

2. Class yang bisa dibuat : Karyawan dan Mahasiswa 2 class

3. Class karyawan : +Idkaryawan: int, +nama: String, +jeniskelamin: String, +jabatan: String, +gaji:int

4. tampilData(): void)

### Percobaan 2

`contoh screenshot yang benar, menampilkan 3 komponen, yaitu struktur project, kode program, dan hasil kompilasi`

![screenshot](img/2.PNG)

![screenshot](img/3.PNG)

( 2. Pendeklarasian atribut pada program di atas :
    
    public class Mahasiswa {
    public int nim;
    public String nama;
    public String alamat;
    public String kelas; 

![screenshot](img/4.PNG)

3.  Pendeklarasian method pada program di atas :
    
    public void tampilBiodata() {
    System.out.println("Nim   : " +nim);
    System.out.println("Nama  : " +nama);
    System.out.println("Alamat: " +alamat);
    System.out.println("Kelas : " +kelas);

![screenshot](img/5.PNG)

4. 1 objek yaitu Mahasiswa mhs1 = new Mahasiswa();

5. Yang sebenarnya dilakukan pada sintaks program “mhs1.nim=101" adalah memasukkan data atau nilai pada nim tersebut.

6. Yang sebenarnya dilakukan pada sintaks program “mhs1.tampilBiodata()” adalah menampilkan atau mencetak keselulurahan data yang dimasukkan dalam atribut.

7. 
![screenshot](img/6.PNG) )

Contoh link kode program : [ini contoh link ke kode program](../../src/2_Class_dan_Object/SepedaGunung.java)

## Pertanyaan

(1. Sebutkan dan jelaskan aspek-aspek yang ada pada pemrograman berorientasi objek! 
Jawab : a. Object Object adalah suatu rangkaian dalam program yang terdiri dari state dan behaviour. Object pada software dimodelkan sedemikian rupa sehingga mirip dengan objek yang ada di dunia nyata. Objek memiliki state dan behaviour.
b. Class Class adalah blueprint atau prototype dari objek. Ambil contoh objek sepeda.
c. Enkapsulasi Disebut juga dengan information-hiding. Dalam berinteraksi dengan objek, seringkali kita tidak perlu mengetahui kompleksitas yang ada didalamnya.
d. Inheritance Disebut juga pewarisan. Inheritance memungkinkan kita untuk mengorganisir struktur program dengan natural.
e. Polimorfisme Polimorfisme juga meniru sifat objek di dunia nyata, dimana sebuah objek dapat memiliki bentuk, atau menjelma menjadi bentuk-bentuk lain. Misalkan saja objek pesawat terbang.

2. Apa yang dimaksud dengan object dan apa bedanya dengan class? 

Jawab : Object adalah pemanfaatan dari class yang siap untuk digunakan, misalnya kita sudah membuat class Roda, yang di dalamnya itu berisi konsep bagaimana Roda itu bisa berjalan, bagaimana Roda itu bisa berputar dan lain-lain, jika semua konsep Roda sudah oke, barulah kita akan dirubah menjadi sebuah Roda yang siap untuk dipakai. Nah itulah yang dinamakan Object Roda. Sedangkan, perbedaannya dengan class Class merupakan kumpulan dari suatu fungsi-fungsi yang dibuat untuk suatu tujuan tertentu. Misalnya kita akan membuat sebuah Mobil. Maka yang perlu kita buatkan adalah beberapa class yang didalamnya berisi fungsi-fungsi yang dapat membuat Mobil itu dapat berjalan sebagaimana mestinya, misalnya class Roda, class Mesin, class Kerangka Mobil, class Body Mobil dan lain lain. 
contoh yang menjelaskan perbedaan Object dan Class.
Object: Manusia
Class: Manusia dapat berjalan, melihat, berlari, memiliki kaki, mata, rambut, hidung, dapat berbicara dan lain-lain.
Object: Komputer
Class: Komputer memiliki layar, prosesor, ram, bisa dimatikan, dihidupkan, bisa memutar musik dan lain-lain.

3. Sebutkan salah satu kelebihan utama dari pemrograman berorientasi objek dibandingkan dengan pemrograman struktural! 

Jawab : Kelebihan PBO adalah program dapat lebih fleksibel dan modular, jika ada perubahan fitur, maka dapat dipastikan keseluruhan program tidak akan terganggu. Berbeda dengan struktural, perubahan sedikit fitur saja kemungkinan dapat mengganggu keseluruhan program.

4. Pada class Sepeda, terdapat state/atribut apa saja? 

Jawab : memiliki state merek, kecepatan, gear dan sebagainya.

5. Tambahkan atribut warna pada class Sepeda. 

Jawab : 

![contoh screenshot](img/ya.png)

6. Mengapa pada saat kita membuat class SepedaGunung, kita tidak perlu membuat class nya dari nol? 

Jawab : Karena pada class Sepedagunung merupakan turunan dari class sepeda. Keduanya sama, hanya saja pada class sepedagunung terdapat tipe suspense.


## Tugas

(silakan kerjakan tugas di sini beserta `screenshot` hasil kompilasi program. Jika ada rujukan ke file program, bisa dibuat linknya di sini.)

`contoh screenshot yang benar, menampilkan 3 komponen, yaitu struktur project, kode program, dan hasil kompilasi`

![contoh screenshot](img/hp1.png)

![contoh screenshot](img/hp2.png)

![contoh screenshot](img/hp3.png)

Contoh link kode program : [ini contoh link ke kode program](../../src/1_Pengantar_Konsep_PBO/HandphoneNiningMain.java)

## Kesimpulan

(Kesimpulan yang saya peroleh yaitu Pemrograman Berorientasi Objek ( PBO ) dalam bahasa inggris dikenal dengan Object Oriented Programming adalah sebuah paradigma pemrograman yang memandang penyelesaian masalah berdasarkan objek yang di targetkan atau hendak di buat. Pemrograman ini digunakan dalam beberapa bahasa Pemrograman seperti C++, Pascal, Java, dan lain lain. Pemrograman berorientasi objek sangat kental kaitannya dengan bahasa pemrograman Java, karena java adalah bahasa pemrograman yang menitik beratkan pada Objeck Oriented Programming atau Pemrograman Berorientasi Objek.)

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

DIMAHYANTI DWI LESTARININGSIH