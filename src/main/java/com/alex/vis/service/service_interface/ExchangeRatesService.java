package com.alex.vis.service.service_interface;

import java.util.List;

public interface ExchangeRatesService {
    List<String> getCharCodes();

    int getKeyForTag(String charCode);

    void refreshRates();
}
