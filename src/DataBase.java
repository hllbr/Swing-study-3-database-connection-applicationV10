
public class DataBase {
      //yapılarımı static yapıda kuruyorum her yerden erişebileyim final anahtar kelimesini kullanıyorumki değiştirilmesinler
    
    public static final String KullanıcıAdı = "root";
    
    public static final String parola = "";
    
    public static final String db_isim = "demo";
    
    public static final String host = "localhost";
    
    public static final int port = 3306;//bu alandaki yapıalrım database iletişimim için gerekli değerler.
    
    
        /*
        Çoğunlukla biz veritabanımızı yedeklemek istiyor olabiliriz.
        Veritabanı içerisinde 100lerdsece tablom bulunuyor olabilir.
        Bu 100lerdece tabloyu yedekleme sayesinde başka bir sunucuya direkt olarak atabiliriz.
        
        Diyelimki bizim uzakta bir adet sunucumuz var bu sunucunun içerisindsede bir mysql veritabanımız var 
        ve mysql veritabanında sunucuyu kapattığım zaman veritabanımın gitmesini istemiyorsam .Yani tablolarımın ve verilerimin gitmesini istemiyorsam 
        bu veritabanını ben dışraı aktararak yani bir sql dosyasına dönüştürerek bu veritabanını direkt olarak yedeklemek istiyor olabilirim.
        Projeyi dışa aktardığımda elle yapmış olduğum işlemlerin sql sorguları şeklinde yazılı bulunduğu bir ifade bütünü oluşturuluyor.
        Eğer ben bunu bir database'e  import edersem içerideki yapılarım direkt olarak çalışıp benim tablolarımı oluşturacak 
        
        
        BU ALANDA DATABASE BİLGİLERİMİ TUTTUĞUM CLASS OLARAK KULLANICAM
        Burara özelliklerimi static ve final olarak tanımlıyoum.Başka kısımlarda bu bilgilerim değiştirilemesin.
        */
        
}
