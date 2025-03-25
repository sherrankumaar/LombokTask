# 🚗 Car Equality Check using Lombok (Vistula Task)

This project demonstrates how to use **Project Lombok** in Java to simplify model class creation and override equality logic using only selected fields — in this case, comparing only the `brand` field of a `CarWithLombok` object.

## ✅ Task Objective

- Create a `CarWithLombok` class using Lombok annotations.
- Generate all necessary methods (`getters`, `setters`, `equals`, `hashCode`, etc.) automatically.
- Customize `equals()` and `hashCode()` to consider only the `brand` field.
- Create two different objects (different `model`, `year`, etc.) but with the **same `brand`**.
- Ensure:
  - `equals()` returns `true`
  - `hashCode()` returns the same value for both

## 🔧 Technologies Used

- Java 17+
- IntelliJ IDEA
- Lombok (via `@Data`, `@AllArgsConstructor`, `@NoArgsConstructor`, `@EqualsAndHashCode`)

## 📁 Project Structure
src/ Main.java // Main class to run and compare two car objects CarWithLombok.java // Car model class using Lombok annotations

## 🧠 Lombok Annotations Used

| Annotation | Purpose |
|------------|---------|
| `@Data` | Generates getters, setters, `toString()`, `equals()`, and `hashCode()` |
| `@AllArgsConstructor` | Generates a full-args constructor |
| `@NoArgsConstructor` | Generates a no-args constructor |
| `@EqualsAndHashCode(of = "brand")` | Restricts equality and hash code generation to the `brand` field only |

## 🖥️ Output Example

✔️ `equals()` → `true`  
✔️ `hashCode()` → Same for both


