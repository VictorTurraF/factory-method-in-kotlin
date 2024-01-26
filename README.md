# Factory Method Design Pattern in Kotlin

This project provides a simple example implementation of the Factory Method design pattern in Kotlin. The Factory Method pattern is a creational pattern that defines an interface for creating an object but leaves the choice of its type to the subclasses, creating the instance without specifying its exact class.

## Project Structure

The project is organized into the following packages:

- `org.example.Buttons`: Contains the common product interface `Button` and its concrete implementations (`HtmlButton` and `WindowsButton`).
- `org.example.Factory`: Contains the base creator `Dialog` and its concrete implementations (`HtmlDialog` and `WindowsDialog`).
- `refactoring_guru.factory_method.example`: Contains the `Main` class, demonstrating the use of Factory Method pattern.

## Usage

To use the Factory Method pattern in your application:

1. Create a subclass of `Dialog` (e.g., `HtmlDialog` or `WindowsDialog`).
2. Override the `createButton` method in your subclass to return the specific type of button you want to create.
3. Use the created `Dialog` subclass to render the window, which internally creates the specified button.

```kotlin
val dialog: Dialog = HtmlDialog()
dialog.renderWindow()
```