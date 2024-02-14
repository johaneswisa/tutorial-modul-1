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
adalah dengan mengikuti saran dari SonarCloud yaitu menambahkan elemen caption di tags table.
2. Implementasi saya sudah memenuhi CI/CD, karena:
   1. Terdapat workflows  “Continuous Integration (CI)” terimplementasi di
   ci.yml yang menjalankan job test. 
   2. Workflows untuk code scanning/analysis di sonarcloud.yml untuk mendeteksi code quality issues.
   3. Continuous deployment yaitu auto-deploy dengan platform koyeb.