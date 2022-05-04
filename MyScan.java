import java.util.Scanner;

public class MyScan {

    static int idx_key = 0;

    static Scanner input = new Scanner(System.in);
    static void m_input_pts(){
        System.out.println("input pts");

        String key_pts;
        do {
            System.out.println("input NEW UNIQUE vehicle passport");
            key_pts = input.nextLine();
            boolean ch_key = MyMainMap.a_map_vehiclePassport.containsValue(key_pts);

            if(ch_key)
            {
                System.out.println("that vehicle passport already exist");
            }
            if(!ch_key)
            {
                MyMainMap.a_vehiclePassport = key_pts;

            }
        } while (key_pts!= MyMainMap.a_vehiclePassport);

    }

    static void m_input_person(){
        System.out.println("input name");
        String FIO = input.nextLine();
        MyMainMap.a_name = FIO;
    }

    static void m_input_car() {
        System.out.println("input car");
        String automob = input.nextLine();
        MyMainMap.a_car = automob;
    }
    static void m_input_idx(){
        System.out.println("input idx");
         int key= input.nextInt();
        idx_key = key;
    }

}
