package lk.ijse.dto;

import lk.ijse.dto.tm.GrnTM;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class PlaceGRNdto {
    private String grnId;

    private LocalDate grnDate;

    private String supplierId;

    private String supplierName;

    private Double total;

    private  List<GrnTM> grnTmList= new ArrayList<>();



}
