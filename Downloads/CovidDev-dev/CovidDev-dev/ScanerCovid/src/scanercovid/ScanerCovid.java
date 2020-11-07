
package scanercovid;

import java.util.Arrays;
import java.util.Scanner;
import static scanercovid.person.listAllName;
import static scanercovid.person.numberNow;
import static scanercovid.person.nowPerson;
import static scanercovid.person.pointer;
import static scanercovid.person.potiionAdd;

public class ScanerCovid {  ////==============ตัวแปร=============
    static String nameOfplace;   /////name of store
    static int queue = 0;  ////queue for enter the shop 
    static String[] numberOfTel;
 
    
    public ScanerCovid(String nameOfpalce, int numPerson, int num) {  ///==========constructure============
        this.nameOfplace = nameOfpalce;
        nowPerson = new String[numPerson];
        listAllName = new String[num];
        this.numberOfTel = new String[num];

    }

    public static void menu() {    ////////========menu for stated===========////////

        Scanner scn = new Scanner(System.in);
        int menu;

        System.out.print("ยินดีต้อนรับเข้าสู่ " + nameOfplace
                + "\n กด 1 เพื่อลงชื่อเข้าร้าน"
                + "\n กด 2 เพื่อลงชื่อออกร้าน"
                + "\n กด 3 เพื่อเช็คคนทั้งหมดที่เข้าร้าน"
                + "\n ===จำนวนคนที่สามารถอยู๋ในร้านได้คือ " + nowPerson.length + "==="
                + "\n ===จำนวนคนในร้านตอนนี้ " + numberNow + "==="
                + "\n ===จำนวนที่คงเหลือที่สามารถเข้าร้านได้ " + (nowPerson.length-numberNow) + "==="
        );

        menu = scn.nextInt();

        switch (menu) {     ////-------------select menu----------------
            case 1:
                temperature.temp();
                break;
            case 2:
                person.personLeft();
                break;
            case 3:
                checkAllPerson();
                break;
            default:
                menu();

        }

    }

        public static void position() {

        Scanner scn = new Scanner(System.in);
        
        System.out.println("====================");
        System.out.println("คนในร้านทั้งหมดตอนนี้" + Arrays.toString(nowPerson));
        System.out.println("ตำแหน่งในร้าน");

        potiionAdd = scn.nextInt();
        queue = potiionAdd - 1;
    }

    public static void checkAllPerson() {
        if(pointer>0){
          for (int i = 0; i < pointer; i++) {
            System.out.println("คนที่ " + (i + 1) + " " + listAllName[i] + "," + numberOfTel[i]);
        }   
        }else{
            System.out.println("\n== ยังไม่มีประวัติการเข้า ==\n");
        }
       
        menu();
    }
}
