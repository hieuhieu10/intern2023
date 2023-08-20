package com.dunglao.dung_lao.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemUtils {

    public static Map<String,List<Integer>> geData(){
        Map<String,List<Integer>> stringListMap = new HashMap<>();
        stringListMap.put("tuan1", List.of(1,2,3,4,5,6,7));
        stringListMap.put("tuan2", List.of(8,9,10,11,12,13,14));
        stringListMap.put("tuan3", List.of(15,16,17,18,19,20,21));
        stringListMap.put("tuan4", List.of(22,23,24,25,26,27,28));
        return stringListMap;
    }

    public static List<String> geTuan(String tuan){
        if (tuan != null ){
            return  List.of(tuan);
        }
        return List.of("tuan1","tuan2","tuan3","tuan4");
    }

    public static Double tinhTienLai (List<Integer> list)  {
        Double giaMotBat = 0.3*2000;
        Double lai = 0D;
        for (Integer soGaoBan: list ){
            // so bat gao xau
            Integer gaoXau =  soGaoBan / 5;
            double laiMotNgay = gaoXau * giaMotBat;
            lai = lai + laiMotNgay;
        }
        return lai;
    }


}
