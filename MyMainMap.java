import java.io.IOException;
import java.util.*;

public class MyMainMap {
static int glob_key = 0;
static String a_vehiclePassport = "";
static String a_name = "";
static String a_car = "";
static Map<Integer, String> a_map_vehiclePassport =new HashMap<>();
static Map<Integer, String> a_map_car=new HashMap<>();
static Map<Integer, String> a_map_person = new HashMap<>();



    public static void main(String[] args) {
        m_switchOfOperation();
    }

    static Set<Map.Entry<Integer, String>> m_mapAdd_pts(){
    a_map_vehiclePassport.put(glob_key, a_vehiclePassport);
    return a_map_vehiclePassport.entrySet();
}

    static Set<Map.Entry<Integer, String>> m_mapAdd_person(){
        a_map_person.put(glob_key, a_name);
        return a_map_person.entrySet();
    }

    static Set<Map.Entry<Integer, String>> m_mapAdd_car(){
        a_map_car.put(glob_key, a_car);
        return a_map_car.entrySet();
    }

        static void m_switchOfOperation(){
            a_map_car.put(1,"volvo");
            a_map_car.put(2,"mersedes");
            a_map_car.put(3,"porsche");
            a_map_car.put(4,"ford");
            a_map_car.put(5,"renault");
            a_map_car.put(8, "kia");
            a_map_vehiclePassport.put(1, "11");
            a_map_vehiclePassport.put(2, "22");
            a_map_vehiclePassport.put(3, "33");
            a_map_vehiclePassport.put(4, "44");
            a_map_vehiclePassport.put(5, "55");
            a_map_vehiclePassport.put(8, "88");
            a_map_person.put(1, "ivan");
            a_map_person.put(2, "boris");
            a_map_person.put(3, "petro");
            a_map_person.put(4, "glasha");
            a_map_person.put(5, "nefiti");
            a_map_person.put(8, "lesha");

        do {
            System.out.println(" \n" + "WORKs...");
            System.out.println("1 - Add new data");              //map.put(key,obj)
            System.out.println("2 - Remove data . . .");         //  map.remove("we are"); only by key
            System.out.println("3 - Search data . . .");         //containsValue
            System.out.println("4 - Change data . . .");
            System.out.println("9 - show all idx");
            System.out.println("exit - for close app");             //System.out.println(map.values());
            //Получить множество всех ключей 	keySet()
//            System.out.println(map.keySet());
            Scanner input = new Scanner(System.in);
            String switcher = input.next();
            switch (switcher) {
                case "1":{
                    System.out.println("Would you change an index: 1 -YES, 2-NO (just++)");
                    String check = input.next();
                    switch (check){

                        case "1":

                            int new_key=0;
                            do {
                                System.out.println("input NEW UNIQUE index");
                                try {
                                new_key = input.nextInt();
                                }
                                catch (Exception ex)
                                {
                                    System.out.println("ERROR");
                                }
                                boolean ch_key = a_map_vehiclePassport.containsKey(new_key);
                                System.out.println(ch_key);
                                if(ch_key)
                                {
                                    System.out.println("that key already exist");
                                }
                                if(!ch_key)
                                {
                                    glob_key = new_key;
                                    System.out.println(glob_key);
                                }
                            } while (glob_key!= new_key);

                            break;

                        case "2":
                            int tmp = 1;
                            do {

                            for (Map.Entry<Integer, String> pair : a_map_vehiclePassport.entrySet()) {
                                Integer key = pair.getKey();
                                if (tmp==key){
                                    tmp++;
                                }glob_key = tmp;
                            }

                        }while(glob_key<tmp);break;
                        default:
                            System.out.println("incorrect");continue;
                    }

                    MyScan.m_input_pts();
                    MyScan.m_input_person();
                    MyScan.m_input_car();
                    m_mapAdd_pts();
                    m_mapAdd_person();
                    m_mapAdd_car();
                    break;}
                case "2": {
                    System.out.println("1 - Remove data pts");          //  map.remove("we are"); only by key
                    System.out.println("2 - Remove data person");
                    System.out.println("3 - Remove data car");
                    String sw_switcher = input.next();

                    switch (sw_switcher) {
                        case "1":
                            MyScan.m_input_pts();
                            MyRemove.m_mapRemove_pts();
                            break;
                        case "2":
                            MyScan.m_input_person();
                            MyRemove.m_mapRemove_person();
                            break;
                        case "3":
                            MyScan.m_input_car();
                            MyRemove.m_mapRemove_car();
                            break;
                        default:
                            System.out.println("input correct number");
                    } break;}
                case "3":{
                    System.out.println("1 - Search data pts");          //  map.remove("we are"); only by key
                    System.out.println("2 - Search data person");
                    System.out.println("3 - Search data car");
                    String sw_switcher = input.next();

                    switch (sw_switcher) {
                        case "1":
                            MyScan.m_input_pts();
                            MySearch.m_mapSearch_pts();
                            break;
                        case "2":
                            MyScan.m_input_person();
                            MySearch.m_mapSearch_person();
                            break;
                        case "3":
                            MyScan.m_input_car();
                            MySearch.m_mapSearch_car();
                            break;
                        default:
                            System.out.println("input correct number");
                    } break;}

                case "4":{
                    System.out.println("1 - Change data pts");          //  map.remove("we are"); only by key
                    System.out.println("2 - Change data person");
                    System.out.println("3 - Change data car");
                    String sw_switcher = input.next();

                    switch (sw_switcher) {
                        case "1":
                            MyChange.m_mapChange_pts();
                            break;
                        case "2":
                            MyChange.m_mapChange_person();
                            break;
                        case "3":
                            MyChange.m_mapChange_car();
                            break;
                        default:
                            System.out.println("input correct number");
                    } break;}

                case "9":
                    System.out.println("idx"+"\t\t"+"pts"+ "\t\t\t"+ "Person\t\t\t"+ "Vehicle");
                    for (Map.Entry<Integer, String> pair : a_map_vehiclePassport.entrySet())
                    {
                        Integer key = pair.getKey();
                        String value = pair.getValue();
                        System.out.println(key + ":\t\t" + value + "\t\t\t" + a_map_person.get(key) + "\t\t\t" + a_map_car.get(key));
                    }break;
                case "exit": input.close(); System.exit(1);break;
                default:
                    System.out.println("Input correct number from list");
            }
        }while (true);
    }
}
