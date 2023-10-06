package com.example.LaptopStore.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Builder
@Entity
@Table(name="laptops")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class laptopDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String laptopName;
    private String laptopColour;
    private String laptopCost;


}
