package com.springcore.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CyclicC {

    // inject CyclicA
    private CyclicA cyclicA;
}
