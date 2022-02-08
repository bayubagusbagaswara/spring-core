package com.springcore.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CyclicB {

    // inject CyclicC
    private CyclicC cyclicC;
}
