
import java.util.Map;

public class MySearch {

    static void m_mapSearch_car(){
        System.out.println("cars data found: \n");
        System.out.println("pts\t"+"person");
        System.out.println("---------------");
        for (Map.Entry<Integer, String> pair : MyMainMap.a_map_car.entrySet()) {
            Integer key = pair.getKey();
            String value = pair.getValue();
            if (value.contentEquals(MyMainMap.a_car)) {
                System.out.println(MyMainMap.a_map_vehiclePassport.get(key)+"\t"+MyMainMap.a_map_person.get(key));
            }
        }
    }
    static void m_mapSearch_person(){
        System.out.println("person data found: \n");
        System.out.println("pts\t"+"car");
        System.out.println("---------------");
        for (Map.Entry<Integer, String> pair : MyMainMap.a_map_person.entrySet()) {
            Integer key = pair.getKey();
            String value = pair.getValue();
            if (value.contentEquals(MyMainMap.a_name)) {
                System.out.println(MyMainMap.a_map_vehiclePassport.get(key) + "\t"+ MyMainMap.a_map_car.get(key));
            }
        }
    }
    static void m_mapSearch_pts(){
        System.out.println("pts data found: \n"); // if (value == a_fio) vehicle passport
        System.out.println("person\t"+"car");
        System.out.println("---------------");
        for (Map.Entry<Integer, String> pair : MyMainMap.a_map_vehiclePassport.entrySet()) {
            Integer key = pair.getKey();
            String value = pair.getValue();
            if (value.contentEquals(MyMainMap.a_vehiclePassport)) {
                System.out.println(MyMainMap.a_map_person.get(key)+ "\t"+MyMainMap.a_map_car.get(key));
            }
        }
    }
}
