package com.ssafy.orderme.payment.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SetDefaultCardRequest {
    private Integer paymentInfoId;
}
