package Paginas;

public class GoogleSearchPage extends BasePage{
        private static String searchBox="//input[@type='text']";
        private static String searchButton="//body[@id='gsr']/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[@jsmodel='vWNDde']/div[@class='A8SBwf emcav']/div[@class='UUbT9']/div[@class='aajZCb']/div[@class='tfB0Bf']/center/input[1]";

    public GoogleSearchPage(){
        super(driver);
    }

    public void navigateToGoogle() {
        navigateTo("https://www.google.com");
    }

    public void enterSearchCriteria(String searchText){ sendKeysTo(searchBox,searchText); }

    public void clickOnSearchButton(){ clickElement(searchButton); }


}
