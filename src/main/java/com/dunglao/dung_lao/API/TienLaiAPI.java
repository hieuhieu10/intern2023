package com.dunglao.dung_lao.API;

import com.dunglao.dung_lao.Service.TienLaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping("/api")
public class TienLaiAPI {

    @Autowired
    private TienLaiService tienLaiService;

    @GetMapping("/tienlai/tuan")
    public ResponseEntity<Map<String,Double>> tinhTienLaiTungNgay(
            @RequestParam(name = "tuan", required = false) String tuan) {
        Map<String,Double> tienLaiNgay = tienLaiService.tinhTienLaiTungTuan(tuan);
        return ResponseEntity.ok(tienLaiNgay);
    }

    @GetMapping("/tienlai/Allngay")
    public ResponseEntity<List<Map<String, Object>>> tinhTienLaiNgay() {
        List<Map<String, Object>> tienLaiNgays = tienLaiService.tinhTienLaiTungNgay();
        return ResponseEntity.ok(tienLaiNgays);
    }
}

