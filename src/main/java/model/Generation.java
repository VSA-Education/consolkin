package model;

import java.time.LocalDate;

/**
 * Класс для определения поколения консоли.
 * {@code Поколение} - период времени, в который были популярны те
 * или иные технологии.
 *
 * @author Anna
 * @version 1.0
 */
public class Generation {
    /**Название поколения*/
    private String name;
    /**Дата начала поколения*/
    private LocalDate startDate;
    /**Дата окончания поколения*/
    private LocalDate endDate;
    /**Описание поколения*/
    private String description;
}
