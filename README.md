# Builder – Pizza Order Management System

## 📄 Description

This exercise focuses on the **Builder Design Pattern** to develop a modular and flexible pizza order management system. The goal is to simplify the creation of pizza objects with different combinations of size, dough type, and toppings, while demonstrating separation between the construction and representation of complex objects.

---

## 🚀 Exercise

### Exercise 1: Pizza Order Builder

Develop a pizza ordering system using the Builder Pattern in Java. The system should allow the creation of different types of pizzas with configurable size, dough, and toppings.

#### 🧩 Functionality:

* Define a `Pizza` class with the following attributes:

  * `size` (pizza size)
  * `dough` (type of dough)
  * `toppings` (list of ingredients)
* Create a `PizzaBuilder` interface with methods to:

  * Set the pizza size
  * Set the type of dough
  * Add toppings
* Implement one or more **concrete builder classes** for specific pizza types (e.g., Hawaiian, Vegetarian).
* Create a `MestrePizzer` (Pizza Master) class that receives a `PizzaBuilder` and constructs pizzas based on a defined configuration.

---

## 💻 Technologies Used

* Java
* Builder Design Pattern
* Console I/O (`Scanner`)

## 📋 Requirements

* JDK 8 or higher
* IntelliJ IDEA, Eclipse or VS Code with Java support
* Gradle (for project structure)
