
package scanercovid;

import java.util.Arrays;
import java.util.Scanner;
import static scanercovid.ScanerCovid.numberOfTel;
import static scanercovid.ScanerCovid.position;
import static scanercovid.ScanerCovid.queue;

public class person {
    static String namePerson;    ////name for coming in store
    static String[] nowPerson;     ////name of person in store now
    static String[] listAllName; /////list all of name of person entered in store
    
    
    static int pointer = 0;
    static int addName = 0; /////position of list all name for add name for person
    static int numberNow = 0; //number of person in store now
    static int potiionAdd;
   
    
    public static void personJoin() {     ///=================medthod for add person====================////
        Scanner scn = new Scanner(System.in);

        int LoopOfJoin = 0;
        int test = 0;

        
        while (LoopOfJoin == 0) {

            position();
            if (nowPerson[queue] != null) {
                System.out.println("***********คิวเต็ม*************");
                System.out.println("********กรุณาเลือกตำแหน่งอื่น***********");
                personJoin();
            }

            personadd();
            pointer++;

            ///=================choose for loop or not =================== ////
            System.out.println("===พิมพ์ 0 เพื่อลงชื่อต่อ===");
            System.out.println("===พิมพ์ 1 เพื่อไปที่เมนู===");
            LoopOfJoin = scn.nextInt();

        }

        ScanerCovid.menu();

    }
    
    public static void personLeft() {
        Scanner scn = new Scanner(System.in);
        int loopOfleft=0;
        while(loopOfleft==0){
            System.out.println("คนในร้านทั้งหมดตอนนี้" + Arrays.toString(nowPerson));
            System.out.println("ตำแหน่งในร้าน");
            
            potiionAdd =scn.nextInt();
            queue = potiionAdd-1;
            numPersonLeft();
            
//         potiionAdd = scn.nextInt();
//        queue = potiionAdd - 1;
            nowPerson[queue] = null;
            
            System.out.println("คนในร้านทั้งหมดตอนนี้" +Arrays.toString(nowPerson));
            System.out.println("===พิมพ์ 0 เพื่อลงชื่อต่อ===");
            System.out.println("===พิมพ์ 1 เพื่อไปที่เมนู===");
            loopOfleft = scn.nextInt();
        }
        ScanerCovid.menu();
    }
    
    public static void numPersonLeft(){
        int menu = 1;
        if(nowPerson[queue]==null){
            Scanner scn = new Scanner(System.in);
            System.out.println("==ไม่มีคนให้ออก==");
            System.out.println("===พิมพ์ 1 เพื่อไปที่เมนู===");
            menu = scn.nextInt();
            ScanerCovid.menu();
        }
        numberNow--;
        
    }

    public static void allPersonWhoJoinMyPlace() {

        listAllName[addName] = namePerson;
        addName = addName + 1;

    }

    public  static void personadd() {

        Scanner scn = new Scanner(System.in);

        System.out.println("ใส่ชื่อคนที่เข้าร้าน");
        namePerson = scn.next();
        nowPerson[queue] = namePerson;
        allPersonWhoJoinMyPlace();
        numberNow += 1;

        System.out.println("ใส่เบอร์โทร");
        numberOfTel[queue] = scn.next();

    }
}
