package com.alex.vis.client;

import com.alex.vis.model.ExchangeRates;

public interface OpenExchangeRatesClient {
    ExchangeRates getLatestRates(String appId);

    ExchangeRates getHistoricalRates(String date, String appId);

}
