package techlearning.stepDefinitions;		

//import io.cucumber.api.java.en.Given;		
//import io.cucumber.api.java.en.Then;		
//import io.cucumber.api.java.en.When;		

public class Steps {				

     
    @io.cucumber.java.en.Given("^Open the Firefox and launch the application$")				
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
        System.out.println("This Step open the Firefox and launch the application.");					
    }		

    @io.cucumber.java.en.When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
       System.out.println("This step enter the Username and Password on the login page.");					
    }		

    @io.cucumber.java.en.Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {    		
        System.out.println("This step click on the Reset button.");					
    }	
    
    
    @io.cucumber.java.en.Given("^user navigates to login page by opening Firefox$")				
    public void open2_the_Firefox_and_launch_the_application() throws Throwable							
    {		
        System.out.println("This Step open the Firefox and launch the application.");					
    }
    

}