package ru.serggh.garry_bot.service;

import org.springframework.stereotype.Service;
import ru.serggh.garry_bot.exception.ServiceException;


public interface ExchangeRatesService {

    String getUSDExchangeRate() throws ServiceException;

    String getEURExchangeRate() throws ServiceException;

    void clearUSDCache();

    void clearEURCache();

}
