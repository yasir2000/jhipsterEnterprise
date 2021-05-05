package com.mycompany.myapp.cucumber;

import com.mycompany.myapp.JhipsterEnterpriseApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = JhipsterEnterpriseApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
