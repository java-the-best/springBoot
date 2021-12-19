package com.example.springBoot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class Test2Impl implements Test {

  @Value("${d}")
  private String d;

  public String m() {
    return d;
  }
}
