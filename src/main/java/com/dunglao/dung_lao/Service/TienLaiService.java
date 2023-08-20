package com.dunglao.dung_lao.Service;

import com.dunglao.dung_lao.DTO.TienLaiNgay;
import com.dunglao.dung_lao.Repository.NgayBanGaoRepository;
import com.dunglao.dung_lao.util.SystemUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TienLaiService {

    @Autowired
    private NgayBanGaoRepository ngayBanGaoRepository;

    public Map<String,Double> tinhTienLaiTungTuan(String tuan) {
        List<TienLaiNgay> tienLaiNgays = ngayBanGaoRepository.tinhTienLaiTungTuan();
//        List<Integer> giaGaos = tienLaiNgays.stream().map(x->x.getSoGaoBan()).toList();
        Map<String,List<Integer>> cacTuan = SystemUtils.geData();
        Map<String,Double> result = new HashMap<>();
        String tg = null;
        if (tuan != null){
            tg = tuan;
        }
        List<String> tenTuan = SystemUtils.geTuan(tg);


        for ( String string : tenTuan){
            if (cacTuan.containsKey(string)){
                List<Integer> tenCacTuan = cacTuan.get(string);
                System.out.println(tenCacTuan);
                List<TienLaiNgay> giaGaoFilter = tienLaiNgays.stream().filter(_tenCacTuan->tenCacTuan.contains(_tenCacTuan.getNgayBan())).toList();
                List<Integer> giaGaos = giaGaoFilter.stream().map(x->x.getSoGaoBan()).toList();
                if(!giaGaoFilter.isEmpty()){
                    result.put(string,SystemUtils.tinhTienLai(giaGaos));
                }
            }
        }


//        Double tienLai = SystemUtils.tinhTienLai(giaGaos);
        // Tính tiền lãi cho từng ngày

        return result;
    }

    public List<Map<String, Object>> tinhTienLaiTungNgay() {
        List<TienLaiNgay> tienLaiNgays = ngayBanGaoRepository.tinhTienLaiTungNgay();
        List<Map<String, Object>> ngayLaiList = new ArrayList<>();

        for (TienLaiNgay tienLaiNgay : tienLaiNgays) {
            Double tienLai = SystemUtils.tinhTienLai(Collections.singletonList(tienLaiNgay.getSoGaoBan()));
            Map<String, Object> ngayLai = new HashMap<>();
            ngayLai.put("ngay", tienLaiNgay.getNgayBan());
            ngayLai.put("lai", tienLai);
            ngayLaiList.add(ngayLai);
        }

        return ngayLaiList;
    }



}

