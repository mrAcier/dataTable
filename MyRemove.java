import java.util.Iterator;
import java.util.Map;

public class MyRemove {

    //    Normally in java == return true if the memory adress is same
//    Equal return true if the value of memory adress are same
    static void m_mapRemove_pts(){
        Iterator<Map.Entry<Integer, String>> iterator2 = MyMainMap.a_map_vehiclePassport.entrySet().iterator();
        while (iterator2.hasNext()){
            Map.Entry<Integer, String> pair = iterator2.next();
            Integer key = pair.getKey();
            String value = pair.getValue();
            if (value.contentEquals(MyMainMap.a_vehiclePassport)){       // if (value == a_fio)
                MyMainMap.a_map_person.remove(key);
                //a_map_pts.remove(key);
                MyMainMap.a_map_car.remove(key);
                iterator2.remove();
            }
        }
    }
    static void m_mapRemove_person(){
        Iterator<Map.Entry<Integer, String>> iterator1 = MyMainMap.a_map_person.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry<Integer, String> pair = iterator1.next();
            Integer key = pair.getKey();
            String value = pair.getValue();
            if (value.contentEquals(MyMainMap.a_name)){       // if (value == a_fio)
                //a_map_person.remove(key);
                MyMainMap.a_map_vehiclePassport.remove(key);
                MyMainMap.a_map_car.remove(key);
                iterator1.remove();
            }
        }
    }
    static void m_mapRemove_car(){
        Iterator<Map.Entry<Integer, String>> iterator3 = MyMainMap.a_map_car.entrySet().iterator();
        while (iterator3.hasNext()){
            Map.Entry<Integer, String> pair = iterator3.next();
            Integer key = pair.getKey();
            String value = pair.getValue();
            if (value.contentEquals(MyMainMap.a_car)){       // if (value == a_fio)
                MyMainMap.a_map_person.remove(key);
                MyMainMap.a_map_vehiclePassport.remove(key);
                //a_map_car.remove(key);
                iterator3.remove();
            }
        }
    }

}
