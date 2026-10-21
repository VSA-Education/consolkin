package model;

import java.net.URL;
import java.util.List;

/**
 * Класс аксессуаров консоли
 * @author Anna
 * @version 1.0
 */
public class Accessory {
    /**Наименование аксессуара*/
    private String name;
    /**Ссылка на официальную страницу аксессуара*/
    private URL officialPage;
    /**Тип аксессуара*/
    private AccessoryType accessoryType;
    /**Производитель аксессуара*/
    private Manufacturer manufacturer;
    /**Список поддерживаемых консолей*/
    private List<Console> supportingConsoles;
}
