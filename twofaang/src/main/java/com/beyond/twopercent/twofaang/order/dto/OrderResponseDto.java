package com.beyond.twopercent.twofaang.order.dto;

import com.beyond.twopercent.twofaang.order.entity.OrderState;
import com.beyond.twopercent.twofaang.order.entity.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class OrderResponseDto {

    private Long memberId; // 회원 번호

    private Long productId; // 상품 번호

    private Long deliveryId; // 배송지 번호

    private String requestMsg; // 배송 요청사항

    private LocalDateTime orderDate; // 주문일

    private int totalPayment; // 주문 총 가격

    private PaymentMethod paymentMethod; // 결제 수단

    private int gradeDiscount; // 등급 할인액

    private int couponDiscount; // 쿠폰 할인액

    private int realAmount; // 실 결제가격

    private OrderState orderState; // 주문 상태

    private int count; // 주문 수량
}
