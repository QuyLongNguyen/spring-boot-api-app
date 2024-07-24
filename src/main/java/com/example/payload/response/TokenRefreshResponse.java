package com.example.payload.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class TokenRefreshResponse {
  private final String accessToken;
  private final String refreshToken;
  private String tokenType = "Bearer";

}
