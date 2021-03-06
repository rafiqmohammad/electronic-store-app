package com.mulesoft.estore.samsung;

import javax.jws.WebService;

@WebService(endpointInterface="com.mulesoft.estore.samsung.SamsungService", name="SamsungService")
public class SamsungServiceImpl implements SamsungService {

	@Override
	public OrderResponse purchase(OrderRequest orderRequest) {
		OrderResponse orderResponse = new OrderResponse();
		orderResponse.setId("1");
		orderResponse.setResult("ACCEPTED");
		Integer price = 2550 * orderRequest.getQuantity();
		orderResponse.setPrice(price.toString());
		return orderResponse;
	}

}
