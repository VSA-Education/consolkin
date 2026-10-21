package model;

import java.util.Map;

/**
 * Класс сущности варианта консоли.
 * <br>
 * Консоли могут иметь несколько вариантов комплектации в
 * зависимости от различных признаков, например, региона.
 *
 * @author Anna
 * @version 1.0
 */
public class Variety {
    /**Ссылка на основную версию консоли*/
    private Console mainConsole;
    /**Наименование версии*/
    private String name;
    //TODO: сделать отдельный класс для Map<String, CharacteristicValue<?>,
    //чтобы использовать в нескольких местах
    //методы setCharacteristic и getCharacteristic
    /**Список особых свойств, отличных от основной версии консоли*/
    private Map<
            CharacteristicTemplate,
            Map<String, CharacteristicValue>
            > characteristicList;
}
