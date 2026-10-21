package model;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * Класс шаблона характеристики.
 * Описывает тип данных характеристики для списка
 * характеристик консоли.
 * @author Anna
 * @version 1.0
 */
public class CharacteristicTemplate {
    /**Наименование типа характеристики, например
     * {@code "комплектующее"},{@code "свойство"} и т.п.*/
    private String name;
    /**Описание характеристики (пояснение)*/
    private String description;
    /**
     * Структура данных характеристик.
     * <p>
     * Карта (Map), где:
     * <ul>
     *   <li><b>Ключ (String):</b> {@code String} — уникальное наименование характеристики.</li>
     *   <li><b>Значение (Type):</b> {@code Type} — тип данных этой характеристики.</li>
     * </ul>
     */
    private Map<String, Type> structure;
    /**Группа характеристики. Например, характеристика {@code процессор}
     *  может находиться в группе {@code железо}*/
    private String group;
}
