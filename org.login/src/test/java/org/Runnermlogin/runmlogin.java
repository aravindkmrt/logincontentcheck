package org.Runnermlogin;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmrep.JVMreportGenerationlogin;
import org.testng.annotations.BeforeClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "html:\\HtmlReport",
        "junit:\\Report\\junit\\matri.xml",
        "json:C:\\Users\\Aravindthanika-54029\\eclipse-workspace\\org.login\\Report\\cucumber.json"},features ="src\\test\\resources\\folder\\Mlogin.Feature", glue="org.login",dryRun=false,tags= {"@login"})

public class runmlogin {
	@AfterClass
	public static void generateAll() {
		JVMreportGenerationlogin.Jvmreport("C:\\Users\\Aravindthanika-54029\\eclipse-workspace\\org.login\\Report\\cucumber.json");
}
}