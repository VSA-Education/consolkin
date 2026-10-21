package model;

import java.net.URL;
import java.time.LocalDate;
import java.util.List;

/** Класс для описания игровой консоли
 * @author Anna
 * @version 1.0
 * */
public class Console {
    /** Уникальный идентификатор */
    private Integer id;
    /**Название*/
    private String name;
    /**Дата выпуска*/
    private LocalDate realeseDate;
    /**Дата завершения выпуска*/
    private LocalDate removalDate;
    /**Дата завершения поддержки*/
    private LocalDate supportEndDate;
    /**Ссылка на официальную страницу консоли*/
    private URL officialPage;
    /**Производитель консоли*/
    private Manufacturer manufacturer;
    /**Шаблон списка характеристик*/
    private List<CharacteristicTemplate> characteristicTemplateList;
    /**Список особенностей консоли*/
    private List<Peculiarity> peculiarityList;
    /**Форм-фактор консоли*/
    private FormFactor formFactor;
    /**Список поддерживаемых аксессуаров*/
    private List<Accessory> accssoriesList;
    /**Список известных проблем консоли*/
    private List<Problem> problemList;
    /**Поколение консоли*/
    private Generation generation;
    /**Основное описание*/
    private String mainArticle;
    /**Список тегов(меток) консоли*/
    private List<Tag> tagList;
    /**Список вариантов консоли*/
    private List<Variety> varietiyList;
}
