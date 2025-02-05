package com.content.evandro.course.enuns;

public enum OrderStatus {

    PENDING_PAYMENT,
    PROCESSING,
    SHIPPED,
    DELIVERY,
    CANCELED;

//    private final int code;
//
//    OrderStatus(int code){
//        this.code = code;
//    }
//    public Integer getCode(){
//        return code;
//    }
//
//    public static OrderStatus getStatusCode(int code){
//        for(OrderStatus status: OrderStatus.values()){
//            if(status.getCode() == code){
//                return status;
//            }
//        }
//        throw new IllegalArgumentException("Invalid status code: "+ code);
//    }
}
