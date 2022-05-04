import java.util.Map;

public class MyChange {

    static void m_mapChange_pts(){

        System.out.println("input vehicle passport for Change: ");
        MyScan.m_input_pts();
        System.out.println("---------------");
        for (Map.Entry<Integer, String> pair : MyMainMap.a_map_vehiclePassport.entrySet()) {
            Integer key = pair.getKey();
            String value = pair.getValue();
            if (value.contentEquals(MyMainMap.a_vehiclePassport)) {
                System.out.println("input new vehicle passport\n");
                MyScan.m_input_pts();
                MyMainMap.a_map_vehiclePassport.put(key, MyMainMap.a_vehiclePassport);
                System.out.println(MyMainMap.a_map_vehiclePassport.get(key)+
                "\t"+MyMainMap.a_map_person.get(key)+ "\t"+MyMainMap.a_map_car.get(key));
            }
        }
    }
    static void m_mapChange_person(){

        System.out.println("input a Person for Change: ");
        MyScan.m_input_person();
        System.out.println("---------------");
        for (Map.Entry<Integer, String> pair : MyMainMap.a_map_person.entrySet()) {
            Integer key = pair.getKey();
            String value = pair.getValue();
            if (value.contentEquals(MyMainMap.a_name)) {
                System.out.println("input new name\n");
                MyScan.m_input_person();
                MyMainMap.a_map_person.put(key, MyMainMap.a_name);
                System.out.println(MyMainMap.a_map_vehiclePassport.get(key)+
                        "\t"+MyMainMap.a_map_person.get(key)+ "\t"+MyMainMap.a_map_car.get(key));
            }
        }
    }
    static void m_mapChange_car(){

        System.out.println("input a car for Change: ");
        MyScan.m_input_car();
        System.out.println("---------------");
        for (Map.Entry<Integer, String> pair : MyMainMap.a_map_car.entrySet()) {
            Integer key = pair.getKey();
            String value = pair.getValue();
            if (value.contentEquals(MyMainMap.a_car)) {
                System.out.println("input new car\n");
                MyScan.m_input_car();
                MyMainMap.a_map_car.put(key, MyMainMap.a_car);
                System.out.println(MyMainMap.a_map_vehiclePassport.get(key)+
                        "\t"+MyMainMap.a_map_person.get(key)+ "\t"+MyMainMap.a_map_car.get(key));
            }
        }
    }

}
