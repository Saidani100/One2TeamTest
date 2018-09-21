package com.one2team.common;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * la classe permet de générer un rapport.
 * 
 * @author Saidani
 */
public class GenerateExtentReport
{
	
	private static ExtentReports extent;
	private static ExtentTest test;
	private static ExtentHtmlReporter htmlReporter;
	private static String filePath = "./extentreport.html";
	
	/**
     * créer une instance de fichier html.
     * 
     * @return une instance d'fichier html.
     */
	public static ExtentReports GetExtent(){
		if (extent != null)
                    return extent; //avoid creating new instance of html file
                extent = new ExtentReports();		
		extent.attachReporter(getHtmlReporter());
		return extent;
	}
 
	/**
     * Créer un fichier html.
     * 
     * @return un fichier html.
     */
	private static ExtentHtmlReporter getHtmlReporter() {
	
        htmlReporter = new ExtentHtmlReporter(filePath);
		
        // make the charts visible on report open
        htmlReporter.config().setChartVisibilityOnOpen(true);
		
        htmlReporter.config().setDocumentTitle("One2Team automation report");
        htmlReporter.config().setReportName("Regression cycle");
        return htmlReporter;
	}
	
	/**
     * creer un test.
     * 
     * @return retourne l'etat du test.
     */
	public static ExtentTest createTest(String name, String description){
		test = extent.createTest(name, description);
		return test;
	}
}


