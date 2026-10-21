package model;

import java.net.URL;

/**
 * Класс сущности производителя. Например, указывается
 * в {@link model.Console} или {@link model.Accessory}.
 *
 * @author Anna
 * @version 1.0
 */
public class Manufacturer {
    /**Наименование производителя*/
    private String name;
    /**Страна производителя*/
    private String country;
    /**Юридический адрес главного офиса*/
    private String mainAddress;
    /**Электронная почта*/
    private String email;
    /**Официальный сайт производителя*/
    private URL officialSite;
}
