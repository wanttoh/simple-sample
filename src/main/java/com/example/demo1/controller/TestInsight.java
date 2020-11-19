package com.example.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microsoft.applicationinsights.TelemetryClient;
import com.microsoft.applicationinsights.telemetry.Duration;

@RestController
@RequestMapping("/sample")
public class TestInsight {
	
     @Autowired
     TelemetryClient telemetryClient;

     @GetMapping("/hello")
     public String hello() {

         //track a custom event  
         telemetryClient.trackEvent("Sending a custom event...hhh");

         //trace a custom trace
         telemetryClient.trackTrace("Sending a custom trace....hhh");

         //track a custom metric
         telemetryClient.trackMetric("custom metric hhh", 1.0);

         //track a custom dependency
         telemetryClient.trackDependency("SQL", "Insert", new Duration(0, 0, 1, 1, 1), true);

         return "hello";
     }
}
