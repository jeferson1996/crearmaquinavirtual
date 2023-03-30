package com.tiendavirtual.miscompras.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cardto {

    private int id;
    private String brand;
    private int model;
    private int category_id;

}
