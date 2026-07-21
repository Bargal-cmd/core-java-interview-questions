import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

class CustomerDetail {
    private int cid;
    private long mobileno;
    private String email;
    private String name;
    private String city;
    private long balance;
    private long cardno;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public long getMobileno() {
        return mobileno;
    }

    public void setMobileno(long mobileno) {
        this.mobileno = mobileno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getCardno() {
        return cardno;
    }

    public void setCardno(long cardno) {
        this.cardno = cardno;
    }

    @Override
    public String toString() {

        return cid + "~ " + name + " ~" + city + " ~" + cardno + "~ " + mobileno + " ~" + email + "~ " + balance + " ";

    }
}

public class Customer_main {
    public static void main(String[] args) {
        CustomerDetail c22 = new CustomerDetail();
        c22.setCid(1);
        c22.setName("raju");
        c22.setBalance(23454);
        c22.setMobileno(9759569033l);
        c22.setCardno(883465683394l);
        c22.setEmail("raju@gmail.com");
        c22.setCity("Pune");

        CustomerDetail c1 = new CustomerDetail();
        c1.setCid(1);
        c1.setName("Raju");
        c1.setBalance(25000);
        c1.setMobileno(9876543210L);
        c1.setCardno(111122223333L);
        c1.setEmail("raju@gmail.com");
        c1.setCity("Pune");

        CustomerDetail c2 = new CustomerDetail();
        c2.setCid(2);
        c2.setName("Amit");
        c2.setBalance(30000);
        c2.setMobileno(9876543211L);
        c2.setCardno(111122223334L);
        c2.setEmail("amit@gmail.com");
        c2.setCity("Mumbai");

        CustomerDetail c3 = new CustomerDetail();
        c3.setCid(3);
        c3.setName("Suresh");
        c3.setBalance(40000);
        c3.setMobileno(9876543212L);
        c3.setCardno(111122223335L);
        c3.setEmail("suresh@gmail.com");
        c3.setCity("Delhi");

        CustomerDetail c4 = new CustomerDetail();
        c4.setCid(4);
        c4.setName("Karan");
        c4.setBalance(28000);
        c4.setMobileno(9876543213L);
        c4.setCardno(111122223336L);
        c4.setEmail("karan@gmail.com");
        c4.setCity("Pune");

        CustomerDetail c5 = new CustomerDetail();
        c5.setCid(4);
        c5.setName("Vijay");
        c5.setBalance(50000);
        c5.setMobileno(9876543214L);
        c5.setCardno(111122223337L);
        c5.setEmail("vijay@gmail.com");
        c5.setCity("Mumbai");

        CustomerDetail c6 = new CustomerDetail();
        c6.setCid(6);
        c6.setName("Ankit");
        c6.setBalance(35000);
        c6.setMobileno(9876543215L);
        c6.setCardno(111122223338L);
        c6.setEmail("ankit@gmail.com");
        c6.setCity("Hyderabad");

        CustomerDetail c7 = new CustomerDetail();
        c7.setCid(7);
        c7.setName("Rahul");
        c7.setBalance(45000);
        c7.setMobileno(9876543216L);
        c7.setCardno(111122223339L);
        c7.setEmail("rahul@gmail.com");
        c7.setCity("Chennai");

        CustomerDetail c8 = new CustomerDetail();
        c8.setCid(8);
        c8.setName("Rohit");
        c8.setBalance(37000);
        c8.setMobileno(9876543217L);
        c8.setCardno(111122223340L);
        c8.setEmail("rohit@gmail.com");
        c8.setCity("Pune");

        CustomerDetail c9 = new CustomerDetail();
        c9.setCid(9);
        c9.setName("Ajay");
        c9.setBalance(60000);
        c9.setMobileno(9876543218L);
        c9.setCardno(111122223341L);
        c9.setEmail("ajay@gmail.com");
        c9.setCity("Delhi");

        CustomerDetail c10 = new CustomerDetail();
        c10.setCid(10);
        c10.setName("Nikhil");
        c10.setBalance(33000);
        c10.setMobileno(9876543219L);
        c10.setCardno(111122223342L);
        c10.setEmail("nikhil@gmail.com");
        c10.setCity("Mumbai");

        CustomerDetail c11 = new CustomerDetail();
        c11.setCid(22);
        c11.setName("Tejas");
        c11.setBalance(42000);
        c11.setMobileno(9876543220L);
        c11.setCardno(111122223343L);
        c11.setEmail("tejas@gmail.com");
        c11.setCity("Pune");

        CustomerDetail c12 = new CustomerDetail();
        c12.setCid(12);
        c12.setName("Arjun");
        c12.setBalance(39000);
        c12.setMobileno(9876543221L);
        c12.setCardno(111122223344L);
        c12.setEmail("arjun@gmail.com");
        c12.setCity("Hyderabad");

        CustomerDetail c13 = new CustomerDetail();
        c13.setCid(13);
        c13.setName("Mahesh");
        c13.setBalance(48000);
        c13.setMobileno(9876543222L);
        c13.setCardno(111122223345L);
        c13.setEmail("mahesh@gmail.com");
        c13.setCity("Chennai");

        CustomerDetail c14 = new CustomerDetail();
        c14.setCid(14);
        c14.setName("Ramesh");
        c14.setBalance(52000);
        c14.setMobileno(9876543223L);
        c14.setCardno(111122223346L);
        c14.setEmail("ramesh@gmail.com");
        c14.setCity("Delhi");

        CustomerDetail c15 = new CustomerDetail();
        c15.setCid(15);
        c15.setName("Deepak");
        c15.setBalance(27000);
        c15.setMobileno(9876543224L);
        c15.setCardno(111122223347L);
        c15.setEmail("deepak@gmail.com");
        c15.setCity("Pune");

        CustomerDetail c16 = new CustomerDetail();
        c16.setCid(16);
        c16.setName("Kishor");
        c16.setBalance(62000);
        c16.setMobileno(9876543225L);
        c16.setCardno(111122223348L);
        c16.setEmail("kishor@gmail.com");
        c16.setCity("Mumbai");

        CustomerDetail c17 = new CustomerDetail();
        c17.setCid(17);
        c17.setName("Sameer");
        c17.setBalance(41000);
        c17.setMobileno(9876543226L);
        c17.setCardno(111122223349L);
        c17.setEmail("sameer@gmail.com");
        c17.setCity("Hyderabad");

        CustomerDetail c18 = new CustomerDetail();
        c18.setCid(18);
        c18.setName("Ganesh");
        c18.setBalance(55000);
        c18.setMobileno(9876543227L);
        c18.setCardno(111122223350L);
        c18.setEmail("ganesh@gmail.com");
        c18.setCity("Pune");

        CustomerDetail c19 = new CustomerDetail();
        c19.setCid(19);
        c19.setName("Manoj");
        c19.setBalance(47000);
        c19.setMobileno(9876543228L);
        c19.setCardno(111122223351L);
        c19.setEmail("manoj@gmail.com");
        c19.setCity("Delhi");

        CustomerDetail c20 = new CustomerDetail();
        c20.setCid(20);
        c20.setName("Sunil");
        c20.setBalance(36000);
        c20.setMobileno(9876543229L);
        c20.setCardno(111122223352L);
        c20.setEmail("sunil@gmail.com");
        c20.setCity("Mumbai");

        System.out.println("HEllo");
        List<CustomerDetail> list = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16,c17, c18, c19, c20, c22);
        list.stream().forEach(t -> System.out.println(t));
        System.out.println("city name is pune");
        list.stream().filter(t -> t.getCity() == "Pune").forEach(t -> System.out.println(t));
        System.out.println("Balance is greter than 40000");
        list.stream().filter(t -> t.getBalance() > 40000).forEach(t -> System.out.println(t));
        System.out.println("get customer name only");
        list.stream().map(t ->t.getName()+"  :"+ t.getBalance()).forEach(t ->System.out.println(t) );
        list.stream().map(t ->t.getCity() ).forEach(t -> System.out.println(t));
    }

}
