package com.Educonnect_cucumber;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={
       "C:/Users/ASUS/eclipse-workspace/Educonnect/Edu.feature",
        "C:/Users/ASUS/eclipse-workspace/Educonnect/previa.feature"
    },
//glue="com.Educonnect_cucumber",
tags = "@ContactUs or @vittalmile or @Career",
plugin = {"pretty", "html:target/cucumber-reports.html"} // Optional: generate reports
)


public class RunFile {
	


}
