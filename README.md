# Student Marker Management System

## Introduction

The Student Marker Management System (SMMS) is a Java-based application designed to manage and track various performance markers for students. This console-based application demonstrates core Object-Oriented Programming (OOP) concepts such as encapsulation, inheritance, polymorphism, abstraction, the `this` pointer, and member functions.

## Features

- Manage student information and performance markers.
- Track various markers like Dojo, Professionalism, Communication Skills, Coding Skills, and Project Skills.
- Generate and display student performance reports.
- Demonstrate OOP concepts in a practical scenario.

## OOP Concepts Used

- **Encapsulation**: Private attributes and public getter/setter methods.
- **Inheritance**: Base `Marker` class with specific marker subclasses.
- **Polymorphism**: Method overriding to display marker details.
- **Abstraction**: Abstract `Marker` class with abstract methods.
- **`this` Pointer**: Used to reference the current object within a class.
- **Member Functions**: Functions that operate on the data members of a class.

## Classes

1. **Student**
   - Manages student information and associated markers.
   - Methods: `addMarker`, `getMarker`, `getAllMarkers`.

2. **Marker (Abstract Class)**
   - Base class for different performance markers.
   - Methods: `displayMarkerDetails` (abstract).

3. **DojoMarker (Subclass of Marker)**
   - Represents Dojo performance marker.

4. **ProfessionalismMarker (Subclass of Marker)**
   - Represents Professionalism performance marker.

5. **Report**
   - Generates and displays student performance reports.

6. **Main**
   - Main class to run the application and test the functionality.

## Usage

1. **Clone the Repository**

   git clone https://github.com/yourusername/student-marker-management-system.git
   cd student-marker-management-system

2. **Compile the Code**

    javac *.java

3. **Run the application**
    java Main


## License 

    This project is licensed under the MIT License. See the LICENSE file for details.

