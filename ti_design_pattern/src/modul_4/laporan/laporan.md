# LAPORAN PRAKTIKUM DESIGN PATTERN
## MODUL 4: SINGLE RESPONSIBILITY PRINCIPLE (SRP)

**Nama:** Teuku Alam Faziansyah  
**NIM:** 2024573010068  
**Kelas:** TI 2A

---

## 1. Abstrak
Pada praktikum ini dipelajari salah satu konsep utama dalam prinsip SOLID, yaitu Single Responsibility Principle (SRP). Prinsip tersebut menyatakan bahwa setiap class sebaiknya difokuskan hanya pada satu fungsi atau satu tujuan utama dalam program.

Dalam pelaksanaannya, praktikum diawali dengan pembuatan program yang belum menerapkan prinsip SRP, kemudian dilakukan perbaikan (refactoring) agar sesuai dengan konsep tersebut. Dari proses ini dapat diamati perbedaan antara struktur kode sebelum dan sesudah penerapan SRP.

Berdasarkan hasil praktikum, penerapan SRP terbukti mampu menghasilkan kode yang lebih terorganisir, mudah dipahami, dan lebih fleksibel untuk dikembangkan. Selain itu, perubahan yang terjadi pada satu bagian program tidak memberikan dampak langsung terhadap bagian lainnya.

---

## 2. Praktikum

### 2.1 Praktikum 1: Report Manager

#### Percobaan (Tanpa SRP)
```java
public class ReportManager {
    public void generateReport() {
        System.out.println("Laporan dibuat");
    }

    public void saveReport() {
        System.out.println("Laporan disimpan");
    }

    public void printReport() {
        System.out.println("Laporan dicetak");
    }
}
```

#### Analisa
Pada implementasi awal, satu class menangani beberapa fungsi sekaligus seperti pembuatan, penyimpanan, dan pencetakan laporan. Kondisi ini menyebabkan class menjadi kurang terfokus karena memegang lebih dari satu peran.

Dampaknya, ketika terjadi perubahan pada salah satu proses, misalnya mekanisme penyimpanan, maka seluruh class berpotensi ikut terdampak. Hal ini meningkatkan kemungkinan kesalahan serta menyulitkan proses pemeliharaan kode. Selain itu, struktur program menjadi kurang modular.

---

#### Perbaikan (Dengan SRP)
```java
class ReportGenerator {
    public String generateReport() {
        return "Laporan dibuat";
    }
}

class ReportSaver {
    public void saveToFile(String report) {
        System.out.println("Laporan disimpan: " + report);
    }
}

class ReportPrinter {
    public void print(String report) {
        System.out.println("Laporan dicetak: " + report);
    }
}
```

#### Analisa
Setelah dilakukan pemisahan, setiap class hanya mengerjakan satu tugas spesifik. Hal ini membuat alur program lebih jelas dan terstruktur.

Keuntungan lainnya adalah kemudahan dalam melakukan perubahan, karena hanya bagian tertentu saja yang perlu diperbaiki tanpa memengaruhi bagian lain. Pengujian program juga menjadi lebih sederhana karena tiap class dapat diuji secara independen.

---

### 2.2 Praktikum 2: User Manager

#### Percobaan (Tanpa SRP)
```java
public class UserManager {
    public void registerUser(String name) {
        System.out.println("User terdaftar: " + name);
        System.out.println("Data disimpan");
        System.out.println("Email dikirim");
    }
}
```

#### Analisa
Pada kode awal, satu class mengelola beberapa proses sekaligus seperti registrasi pengguna, penyimpanan data, dan pengiriman informasi. Hal ini menunjukkan bahwa class tersebut memiliki banyak tanggung jawab.

Akibatnya, jika terdapat perubahan pada salah satu sistem, seperti database atau layanan email, maka class ini harus ikut dimodifikasi. Ini tidak sesuai dengan prinsip SRP karena satu class memiliki lebih dari satu alasan untuk berubah.

---

#### Perbaikan (Dengan SRP)
```java
class User {
    String name;

    User(String name) {
        this.name = name;
    }
}

class UserRepository {
    public void save(User user) {
        System.out.println("Data disimpan: " + user.name);
    }
}

class UserService {
    public void register(User user) {
        System.out.println("User terdaftar: " + user.name);
    }
}
```

#### Analisa
Setelah dilakukan pemisahan fungsi, setiap class memiliki peran yang lebih jelas. Class data hanya menyimpan informasi, class repository menangani penyimpanan, dan class service mengelola proses bisnis.

Dengan pendekatan ini, pengembangan sistem menjadi lebih fleksibel. Penambahan fitur baru dapat dilakukan tanpa mengganggu struktur yang sudah ada, sehingga mempermudah proses pengembangan di masa depan.

---

### 2.3 Latihan: Order Management

#### Solusi
```java
class Order {
    String namaBarang;

    Order(String namaBarang) {
        this.namaBarang = namaBarang;
    }
}

class OrderRepository {
    public void save(Order order) {
        System.out.println("Pesanan disimpan: " + order.namaBarang);
    }
}

class InvoicePrinter {
    public void print(Order order) {
        System.out.println("Invoice: " + order.namaBarang);
    }
}
```

#### Analisa
Pada solusi yang dibuat, setiap class dirancang dengan tanggung jawab yang berbeda. Pemisahan ini membantu menciptakan struktur program yang lebih rapi dan mudah dipahami.

Selain itu, perubahan pada satu komponen tidak akan memengaruhi komponen lain secara langsung, sehingga meningkatkan stabilitas program dan memudahkan proses pengembangan lanjutan.

---

## 3. Kesimpulan
Berdasarkan hasil praktikum, dapat disimpulkan bahwa penerapan Single Responsibility Principle (SRP) sangat berperan dalam membangun struktur program yang baik dalam konsep OOP.

Dengan membatasi setiap class hanya pada satu tugas utama, kode menjadi lebih teratur dan mudah dipahami. Selain itu, dampak perubahan dapat diminimalkan karena tidak menyebar ke seluruh bagian program.

Penerapan prinsip ini juga memberikan kemudahan dalam pengembangan dan pemeliharaan aplikasi, terutama pada sistem yang terus berkembang. Programmer dapat menambahkan fitur baru tanpa harus melakukan perubahan besar pada kode yang sudah ada.

Meskipun demikian, penggunaan SRP tetap perlu disesuaikan dengan kondisi. Pemisahan yang berlebihan dapat menyebabkan jumlah class menjadi terlalu banyak dan justru menyulitkan pengelolaan program.

---

## 4. Referensi
1. Modul Praktikum Design Pattern – Politeknik Negeri Lhokseumawe
2. Robert C. Martin (2003), Agile Software Development: Principles, Patterns, and Practices
3. Clean Code oleh Robert C. Martin (2008)