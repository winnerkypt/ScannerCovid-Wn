
package scanercovid;

import java.util.Scanner;

public class temperature {
    static double temperature = 0; //temperature of person
    
    public static void temp() {

        Scanner scn = new Scanner(System.in);

        StringBuilder temp = new StringBuilder();
        System.out.println("อุณหภูมิของร่างกาย");
        temperature = scn.nextDouble();
        if (temperature >= 37.5) {

            temp.append("======================");
            temp.append("===อุณหภูมิเกินห้ามเข้า===");
            temp.append("======================");
            System.out.println(temp.toString());
           
            ScanerCovid.menu();

        }

       person.personJoin();
    }
}
