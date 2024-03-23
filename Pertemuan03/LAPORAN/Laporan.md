# Laporan Praktikum Pertemuan 3

<b>NAMA : GHETSA RAMADHANI RISKA ARRYANTI</b><br>
<b>KELAS : TI-1H</b><br>
<b>NIM : 2341720004</b><br>
<b>ABSEN : 12</b><br>


### 3.1 Percobaan 1 : Membuat Array dari Object, Mengisi dan Menampilkan 


pada percobaan pertama dalam praktikum 3.1 ini, saya membuat file java bernama Arrayobjects.java yang akan di isi array dari object, kemudian mengisi dan menampilkan array tersebut

### 3.1.1 Verifikasi Hasil Percobaan
---


<img src="per3_1.png"> 

### 3.1.2 Jawaban
---

1. Berdasarkan uji coba 3.1, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!
- Jawaban:
Class yang akan dibuat array of object harus memiliki atribut namun tidak harus memiliki method, karena fungsi dari atribut adalah untuk menyimpan nilai dari setiap variabel

2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut : 
        
        ppArray[1] = new PersegiPanjang();
- Jawaban:
class PersegiPanjang memiliki konstruktor namun hanyak konstruktor kosong

3. Apa yang dimaksud kode berikut

        PersesgiPanjang[] ppArray = new PersegiPanjang[3];
- Jawaban:
Baris kode tersebut bertujuan untuk menginisiasi Array of Object ppArray yang index array berjumlah 3

4. Apa yang dimaksud dengan kode berikut ini

        ppArray[1] = new PresegiPanjang();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40 ;
- Jawaban:    
Baris kode tersebut bertjuan untuk memasukkan nilai kedalam atrubut pada class PersegiPanjang()

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?
- Jawaban:
Karena dalam java tidak bisa menempatkan class di dalam class, hal itu akan menimbulkan error, sehingga penempatannya harus dipisahkan

### 3.2 Percobaan 2 : Menerima Input Isian Array Menggunakan Looping
---
Pada percobaan ke-2 ini saya akan membuat program untuk menerima input dan menggunakan looping untuk mengisikan atribut dari semua persegi panjang yang ada di ppArray

### 3.2.1 Verifikasi Hasil Percobaan
---
Berikut adalah hasil output dari percobaan kedua

<img src="per3_2.png"> 

### 3.2.2 Jawaban 
---

1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi? 
- Jawaban: Bisa, karena array of object sama seperti implementasi array pada umumnya

2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan !
- Jawaban: untuk membuat array 2 dimensi membutuhkan kode seperti berikut

            PresegiPanjang[][] ppArray = new PresegiPanjang[i][j];

3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode dibawah ini akan memunculkan error saat dijalankan. Mengapa? 
- Jawaban:
        Persegi[]pgArray = new Persegi[100]
        pgArray[5].sisi = 20;
    >Akan muncul error karena belum ada instansiasi

4. Modifikasi kode program pada praktikum 3.2 agar length array menjadi inputan dengan Scanner! 

    >modifikasi bisa dengna menambahkan baris kode seperti berikut
    
        System.out.print("Berapa banyak persegi panjang ? : ");
        int j = sc.nextInt();
        PresegiPanjang[] ppArray = new PresegiPanjang[j];

5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan pada ppArray[i] sekaligus ppArray[0]?Jelaskan ! 

    >Boleh saja, karena dalam ppArray[i] adalah looping sehingga instansiasi sebenarnya sudah dilakukan

### 3.3 Percobaan 3 : Penambahan Operasi Matematika di Dalam Method 
---
Pada percobaan ke-3 ini saya akan melakukan pengoprasian matematika beberapa atribut pada masing-masing anggota array

### 3.3.1 Verifikasi Hasil Percobaan
---
Berikut adalah hasil run dari kode percobaan 3.3

<img src="Gambar\Verifikasi3.png"> 

### 3.3.2 Jawaban
---
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan 
contoh!

    > bisa, dalam satu class dapat memuat banyak konstrukor, contoh sebagai berikut

        public balok(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;    
        }
            public int hitungVolume(){
            return panjang * lebar * tinggi;
        }

2. Jika diketahui terdapat class <b> Segitiga </b> seperti berikut ini
        
        Public class segitiga{ 
            public int alas; 
            public int tinggi;
        }
    tambahkan konstruktor pada class <b> Segitiga </b> tersebut yang berisi parameter <b> int a, int t </b> yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi;
