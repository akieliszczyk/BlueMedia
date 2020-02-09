package provider;

import model.BusinessClient;

public class DataProvider {

    public static BusinessClient getBusinessClient() {
        BusinessClient businessClient = new BusinessClient();
        businessClient.setFirstname("BlueServices");
        businessClient.setLastname("Test");
        businessClient.setEmail("bs@blueservices.pl");
        businessClient.setPhone("+48 123 123 123");
        businessClient.setSubject("Przelewy natychmiastowe");
        businessClient.setDescription("automat test Blueservices");
        return businessClient;
    }
}
