package com.example.springBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StartService {

  @Autowired
  private Test test;

//  public StartService(Test test) {
//    this.test = test;
//  }

  public void start() {
    test.m();
  }
}
