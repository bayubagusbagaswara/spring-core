package com.springcore.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CyclicA {

    // inject CyclicB
    private CyclicB cyclicB;
}
