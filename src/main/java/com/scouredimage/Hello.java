package com.scouredimage;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;
import java.util.Collections;

public class Hello implements RequestHandler<Map<String, Object>, ApiGatewayResponse> {
  @Override
	public ApiGatewayResponse handleRequest(Map<String, Object> input, Context context) {
    try {
      return ApiGatewayResponse.builder()
    				.setStatusCode(200)
    				.setObjectBody("Hello!")
    				.setHeaders(Collections.singletonMap("X-Powered-By", "AWS Lambda & Serverless"))
    				.build();
    } catch (Exception ex) {
      return ApiGatewayResponse.builder()
  					.setStatusCode(500)
  					.setObjectBody(ex.toString())
  					.setHeaders(Collections.singletonMap("X-Powered-By", "AWS Lambda & Serverless"))
  					.build();
    }
  }
}
