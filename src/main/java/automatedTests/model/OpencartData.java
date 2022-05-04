package automatedTests.model;

public class OpencartData {

    private String userName;
    private String password;
    private String filterSearch;
    private String correctScenario;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFilterSearch() {
        return filterSearch;
    }

    public void setFilterSearch(String filterSearch) {
        this.filterSearch = filterSearch;
    }

    public String getCorrectScenario() {
        return correctScenario;
    }

    public void setCorrectScenario(String correctScenario) {
        this.correctScenario = correctScenario;
    }

    private String searchBox;
    private String writeNumber;
    private String incompleteTest;

    public String getSearchBox() {
        return searchBox;
    }

    public void setSearchBox(String searchBox) {
        this.searchBox = searchBox;
    }

    public String getWriteNumber() {
        return writeNumber;
    }

    public void setWriteNumber(String writeNumber) {
        this.writeNumber = writeNumber;
    }

    public String getIncompleteTest() {
        return incompleteTest;
    }

    public void setIncompleteTest(String incompleteTest) {
        this.incompleteTest = incompleteTest;
    }

    private String productName;
    private String checkFilteredProducts;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCheckFilteredProducts() {
        return checkFilteredProducts;
    }

    public void setCheckFilteredProducts(String checkFilteredProducts) {
        this.checkFilteredProducts = checkFilteredProducts;
    }
}
