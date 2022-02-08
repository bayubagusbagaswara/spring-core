package com.springcore.client;

import lombok.Data;

/**
 * misal ini adalah class third party library
 */
@Data
public class PaymentGatewayClient {

    private String endpoint;
    private String privateKey;
    private String publicKey;
}
