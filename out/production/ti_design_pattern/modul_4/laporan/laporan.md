# LAPORAN PRAKTIKUM DESIGN PATTERN
## MODUL 4: SINGLE RESPONSIBILITY PRINCIPLE (SRP)

**Nama:** Teuku Alam Faziansyah  
**NIM:** 2024573010068  
**Kelas:** TI 2A

---

## 1. Abstrak
Pada praktikum ini dibahas salah satu prinsip penting dalam SOLID, yaitu Single Responsibility Principle (SRP). Prinsip ini menekankan bahwa setiap class dalam program sebaiknya hanya memiliki satu tanggung jawab utama atau satu alasan untuk berubah.

Dalam praktikum ini, dilakukan percobaan dengan membuat program yang awalnya melanggar prinsip SRP, kemudian dilakukan refactoring agar sesuai dengan prinsip tersebut. Melalui proses ini, dapat dilihat perbedaan antara kode yang belum terstruktur dengan kode yang sudah menerapkan SRP.

Hasil dari praktikum menunjukkan bahwa penerapan SRP dapat membuat kode menjadi lebih rapi, mudah dipahami, serta lebih mudah dikembangkan. Selain itu, perubahan pada satu bagian program tidak akan mempengaruhi bagian lainnya secara langsung.

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
Pada kode di atas, satu class menangani tiga hal sekaligus, yaitu membuat, menyimpan, dan mencetak laporan. Hal ini membuat class menjadi terlalu “berat” karena memiliki banyak tanggung jawab.

Jika suatu saat ada perubahan, misalnya cara penyimpanan laporan diubah, maka class ini harus ikut diubah. Ini berpotensi menyebabkan error di bagian lain yang sebenarnya tidak berkaitan. Selain itu, kode juga menjadi kurang fleksibel karena semua fungsi digabung dalam satu tempat.

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
Setelah dipisahkan, setiap class hanya memiliki satu tugas. Hal ini membuat struktur program menjadi lebih jelas. Jika terjadi perubahan pada bagian penyimpanan, maka hanya class `ReportSaver` yang perlu diubah.

Kode juga menjadi lebih mudah dibaca karena setiap class memiliki fungsi yang spesifik. Selain itu, masing-masing class bisa diuji secara terpisah tanpa bergantung pada bagian lain.

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
Class ini menangani beberapa proses sekaligus, yaitu registrasi user, penyimpanan data, dan pengiriman email. Hal ini membuat class menjadi tidak fokus pada satu tugas saja.

Jika ada perubahan pada sistem database atau sistem email, maka class ini harus ikut diubah. Ini menunjukkan bahwa class tersebut memiliki lebih dari satu alasan untuk berubah, sehingga tidak sesuai dengan prinsip SRP.

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
Setelah dilakukan pemisahan, setiap class memiliki tanggung jawab masing-masing. `User` hanya menyimpan data, `UserRepository` menangani penyimpanan, dan `UserService` menangani proses registrasi.

Dengan struktur ini, program menjadi lebih mudah dikembangkan. Misalnya, jika ingin menambahkan fitur pengiriman email, cukup menambahkan class baru tanpa mengubah class yang sudah ada.

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
Pada solusi ini, setiap bagian dipisahkan sesuai tugasnya. Hal ini membuat program lebih terstruktur dan mudah dipahami. Selain itu, jika ada perubahan pada salah satu bagian, tidak akan mempengaruhi bagian lainnya.

---

## 3. Kesimpulan
Dari praktikum yang telah dilakukan, dapat disimpulkan bahwa Single Responsibility Principle (SRP) merupakan prinsip yang sangat penting dalam pengembangan perangkat lunak berbasis OOP.

Dengan menerapkan SRP, setiap class hanya memiliki satu tanggung jawab sehingga kode menjadi lebih terorganisir dan mudah dipahami. Selain itu, perubahan pada satu bagian tidak akan berdampak besar pada bagian lain, sehingga risiko terjadinya error dapat dikurangi.

Penerapan SRP juga membuat proses pengembangan menjadi lebih fleksibel. Programmer dapat menambahkan atau mengubah fitur tanpa harus mengubah keseluruhan program. Hal ini sangat membantu terutama dalam pengembangan aplikasi yang kompleks.

Namun, perlu diperhatikan bahwa penggunaan SRP juga harus seimbang. Jika terlalu banyak pemisahan class, maka program bisa menjadi terlalu kompleks. Oleh karena itu, penerapan SRP harus disesuaikan dengan kebutuhan program.

---

## 4. Referensi
1. Modul Praktikum Design Pattern – Politeknik Negeri Lhokseumawe
2. Martin, R. C. (2003). Agile Software Development
3. Martin, R. C. (2008). Clean Code