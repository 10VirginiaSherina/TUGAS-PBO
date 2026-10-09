# Inheritance and Polymorphism in Java
## 🧬 About the Project
This project demonstrates **Inheritance and Polymorphism** in Java using geometric shapes. Each class represents a different shape and calculates its area or volume.

## 📖 Concept Used
- **Inheritance**: Classes inherit attributes and methods from their parent classes using `extends`.
- **Polymorphism**: Method overriding allows each shape to implement its own version of `printInfo()`.
- **`super`**: Used to call the parent class constructor and initialize inherited attributes.

## 📁 File Overview
```bash
Bentuk.java - The superclass that stores the shape color and provides basic information methods.
BujurSangkar.java - Represents a square, inherits from Bentuk, and calculates its area.
Lingkaran.java - epresents a circle, inherits from Bentuk, and calculates its area using PHI.
Silinder.java - Represents a cylinder, inherits from Lingkaran, and calculates its volume using the circles area and the cylinders height.
BentukDemo.java - The main class that creates objects and calls printInfo() to display their information.
```

## 💻 How to Run
1. Compile
```bash
javac Bentuk.java BujurSangkar.java Lingkaran.java Silinder.java BentukDemo.java
```
2. Execute
```bash
java BentukDemo
```

## 📤 Output Example
```
Bentuk berwarna pink
Bujur Sangkar berwarna hijau, luas = 16.0
Lingkaran berwarna coklat, luas = 79.0
Silinder berwarna hitam, volume = 553.0
```
