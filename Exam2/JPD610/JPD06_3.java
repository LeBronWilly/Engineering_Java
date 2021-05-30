
...

public class JPD06_3 {
    public static void main(String argv[]) {
      SalaryWorker sw1 = new SalaryWorker("96001",180000);        
        HourlyWorker hw1 = new HourlyWorker("96002", 100, 160);        
        Manager ma1 = new Manager("97001", 240000, 5000);
       
        System.out.println("SalaryWorker稅額：" + sw1.monthTaxes());
        System.out.println("HourlyWorker稅額：" + hw1.monthTaxes());
        System.out.println("Manager稅額：" + ma1.monthTaxes()); 
        System.out.println("平均稅額：" + Employee.getAverageTax());
    }
}