package Paginas;

public class GoogleSearchPage extends BasePage{
        private String searchBox="//input[@type='text']";
        private String searchButton="//div[@class='FPdoLc tfB0Bf']//center//input[@value='Buscar con Google']";

    public GoogleSearchPage(){
    super(driver);
    }

    public void navigateToGoogle(){
        navigateTo("www.google.com");
    }

    public void enterSearchCriteria(String searchText){ sendKeysTo(searchBox,searchText); }

    public void clickOnSearchButton(){ clickElement(searchButton); }


}
