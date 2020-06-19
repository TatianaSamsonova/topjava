package ru.javawebinar.topjava.repository;

import ru.javawebinar.topjava.model.Meal;

import java.time.LocalDateTime;
import java.util.List;

public interface MealRepository {
    // null if updated meal doesn't belong to userId
    Meal save(Meal meal, int userId);

    // false if meal doesn't belong to userId
    boolean delete(int id, int userId);

    // null if meal doesn't belong to userId
    Meal get(int id, int userId);

    //SORTED dateTime desc
    List<Meal> getAll(int userId);

    //SORTED dateTime desc
    List<Meal> getBetweenHalfOpen(LocalDateTime startDate, LocalDateTime endDate, int userId);
}
