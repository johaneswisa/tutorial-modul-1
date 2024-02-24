Johanes Wisanggeni - 2206032425 - Adpro A

Url App: https://adpro-eshop-tutorial-adpro-johaneswisa.koyeb.app/

Tutorial 1

Reflection 1

Prinsip clean code sangat membantu saya untuk membuat code yang "bersih". Beberapa coding standards yang telah saya terapkan
di modul ini adalah:
1. Meaningful names:
   Nama-nama variabel dan methods sudah mengikuti konvensi Java.
2. Comment di codes:
   Tidak ada comment yang tidak perlu. Tidak ada commented codes.
3. Abstraction:
   Memisahkan abstract class dengan implementasi (package service).
   
4. Yang masih bisa di-improve: Prinsip secure coding masih kurang; belum ada validasi input, autentikasi, dll. 

Reflection 2

1. Menjadi lebih tenang karena code kita sudah diverfikasi dan dites. 
2. Tergantung complexity dari classnya. Test lah segala fungsionalitas dari classnya. Pastikan sudah behave as expected.
3. Unit-test kita sudah meng-cover segala hal yang testable di program kita.
4. Belum tentu, karena code coverage sendiri hanya mengestimasi seberapa baik test case mengcover code kita. 

Tutorial 2

Reflection
1. Saya membetulkan reliability issue yaitu minor bug di ProductList.html. Strategi saya
adalah dengan mengikuti saran dari SonarCloud yaitu menambahkan elemen caption di tags table. Selain itu saya juga meremove public identifier karena test class dan methods JUnit5 harus memiliki visibilitas package default. 
2. Implementasi saya sudah memenuhi CI/CD, karena:
   1. Terdapat workflows  “Continuous Integration (CI)” terimplementasi di
   ci.yml yang menjalankan job test. 
   2. Workflows untuk code scanning/analysis di sonarcloud.yml untuk mendeteksi code quality issues.
   3. Continuous deployment yaitu auto-deploy dengan platform koyeb.

Tutorial 3

Reflection
1. Saya mengimplementasikan Single-responsibility Principle (SRP), Interface segregation principle (ISP),
dan Dependency inversion principle (DIP).

Berikut penjelasan dari Modul untuk prinsip-prinsip:

SRP is a class that has only one reason to change. In other words, a class should have only one responsibility or encapsulate only one aspect of the software's functionality.

ISPs recommend that large interfaces be broken down into smaller, more specific interfaces so that clients only need to know the methods that are relevant to them.

DIP recommends that high-level modules do not depend on low-level modules. Both must rely on abstractions. 
Additionally, abstraction should not depend on details; details must rely on abstraction.

Saya meng-implement ISP dengan cara memecah interface CarService
menjadi CarServiceGeneral dan CarServiceById.

Saya meng-implement SRP dengan cara memisahkan CarController dan ProductController
menjadi dua modul, masing-masing memiliki responsibility berbeda dalam konteks fungsionalitas software
secara keseluruhan.

Saya meng-implement DIP sejalan dengan implementasi ISP saya, yaitu di CarController
saya buat agar modul tersebut rely on CarServiceGeneral dan CarServiceById (interfaces) dan bukan CarServiceImpl (public class).

2. Explain the advantages of applying SOLID principles to your project with examples.

-Code lebih mudah dimengerti, dalam implementasi SRP misalnya
setiap class controller memiliki responsibilitinya masing-masing di codebase saya.

-ISP: interfaces dipecah-pecah agar interface lebih kecil dan spesifik, clients hanya
perlu tau method-method yang relevan, contoh: pemisahan interface CarService menjadi method yang lebih umum dan yang by id.

-DIP: modul high dan low level mesti rely dengan abstractions agar class-classnya terikat secara tidak ketat
sehingga saat mengubah satu class, class lain tidak ada kemungkinan untuk ikut rusak/break (saat terlalu tightly coupled). Contoh:
CarController rely on CarServiceGeneral dan CarServiceById (interfaces) dan bukan CarServiceImpl (public class).

3.  Explain the disadvantages of not applying SOLID principles to your project with examples.

-Code lebih sulit dimengerti. Satu class controller memiliki 2 responsibility bisa membuat code tidak clean dan menyulitkan programmer lain.

-Interfaces tidak dipecah-pecah: satu interface meng-handle banyak methods dan jadi menumpuk/tidak clean code.

-modul high dan low level tidak rely ke abstractions: Misal kelas A bergantung kuat pada kelas B. saat kelas B ingin diganti implementasinya maka kelas A juga harus dimodifikasi langsung implementasinya. 