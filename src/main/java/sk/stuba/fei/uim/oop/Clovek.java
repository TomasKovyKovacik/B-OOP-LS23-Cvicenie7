package sk.stuba.fei.uim.oop;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Clovek {
    private String meno;
    private String adresa;
    private double vyska;
    private double vaha;
    private final int vek;
    private List<Person> priatelia;
}
