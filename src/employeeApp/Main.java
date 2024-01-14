package employeeApp;

import employeeApp.enums.Plan;
import employeeApp.model.Company;
import employeeApp.model.Employee;
import employeeApp.model.Healthplan;

import java.util.Arrays;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan h1=new Healthplan(1,"Ana Sigorta", Plan.BASIC);
        Healthplan h2=new Healthplan(2,"Hayat Sigorta",Plan.MEDIUM);
        System.out.println(h1);
        System.out.println(h2);

        //["Ana Sigorta","Hayat Sigorta",null]
        String[] healthPlans=new String[3];
        healthPlans[0]=h1.getName();
        healthPlans[1]=h2.getName();

        Employee employee=new Employee(1,"ali ali", "reer@ali.com", "123",healthPlans) ;
        employee.addHealthPlan(0,"Yurt Sigorta");
        employee.addHealthPlan(3,"mskdvm");
        employee.addHealthPlan(2,"Hayat Sigorta");
        employee.addHealthPlan(2,"Kazanç Sigorta");
        //System.out.println(employee.getHealthPlans());   referans değerini verdi aşağıdaki toString metodu ile değerlerini alabiliriz
        //Satic metodlar instance 'lara bağlı değildir direkt sınıfları üstünden erişebiliriz.
        System.out.println(Arrays.toString(employee.getHealthPlans()));

        System.out.println("***************************************************");

        String[] developerNames=new String[5];
        developerNames[0]="ayşe k";
        developerNames[1]="Yeşim k";
        Company company=new Company(1,"A",15000,developerNames);
       company.addEmployee(0,"ayse k");
       company.addEmployee(4,"tarık k");
       company.addEmployee(6,"hhhhhh");
       company.addEmployee(3,"ayşe k");
       
        System.out.println(Arrays.toString(company.getDeveloperNames()));


    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
