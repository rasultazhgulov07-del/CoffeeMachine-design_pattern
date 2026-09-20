# Assignment 2 — Factory Method & Abstract Factory

## Тема: Coffee Kiosk

### Part A — Factory Method
Одиночный продукт: Drink (Espresso, Latte, Cappuccino).
Creator: DrinkStation, бизнес-метод serveOrder() использует продукт
только через интерфейс Drink.

### Part B — Abstract Factory
Семья продуктов: Cup + Lid + Receipt, две согласованные семьи —
ClassicBrandFactory и EcoBrandFactory.
Точка выбора семьи: AbstractFactoryDemo.main(), строка N.

## Как запустить
javac -d out src/factorymethod/*.java && java -cp out factorymethod.FactoryMethodDemo
javac -d out src/abstractfactory/*.java && java -cp out abstractfactory.AbstractFactoryDemo

## Почему Factory Method vs Abstract Factory
(2–3 абзаца — см. блок "защита" ниже, перескажите своими словами)