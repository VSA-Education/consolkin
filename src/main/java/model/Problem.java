package model;

import java.time.LocalDate;

/**
 * Класс сущности проблемы консоли или аксессуаров.
 * Например, {@code Перегрев консоли}.
 *
 * @author Anna
 * @version 1.0
 */
public class Problem {
    /**Идентификатор ошибки*/
    private Integer id;
    /**Наименование ошибки*/
    private String name;
    /**Дата обнаружения*/
    private LocalDate detectionDate;
    /**Статус ошибки*/
    private String status;
    /**Описание проблемы*/
    private String description;
    /**Описание решения*/
    private String solution;
}
