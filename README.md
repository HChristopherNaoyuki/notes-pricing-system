# Notes Pricing System

This Java project demonstrates an object-oriented approach to managing and displaying notes with fixed prices. It includes an abstract `Notes` class and two subclasses, `BUPENotes` and `BUISNotes`, each with a predefined price. The system allows you to create instances of these notes and display their summary names and prices.

## Features

- **Abstract `Notes` class**: Contains fields for the summary name and price, with an abstract method `setPrice()` for defining price in subclasses.
- **`BUPENotes` subclass**: Represents notes for the Entrepreneurship course with a fixed price of R19.99.
- **`BUISNotes` subclass**: Represents notes for the Information Systems course with a fixed price of R24.99.
- **`UseNotes` class**: Demonstrates how to create and use instances of `BUPENotes` and `BUISNotes`, printing their summary names and prices.

## Project Structure

```
src/
│
├── Solution/
│   ├── Notes.java        # Abstract base class for all notes
│   ├── BUPENotes.java    # Subclass for Entrepreneurship notes
│   ├── BUISNotes.java    # Subclass for Information Systems notes
│   └── UseNotes.java     # Main class to demonstrate functionality
```

### `Notes.java`
This is the abstract base class. It contains:
- A `summaryName` field (String) for the name of the notes.
- A `price` field (double) to store the price of the notes.
- An abstract method `setPrice()` to be implemented by subclasses to set the specific price.

### `BUPENotes.java`
A subclass of `Notes` that represents notes related to the Entrepreneurship course. The price is set to R19.99.

### `BUISNotes.java`
A subclass of `Notes` that represents notes related to the Information Systems course. The price is set to R24.99.

### `UseNotes.java`
This is the main class that demonstrates how to create objects of `BUPENotes` and `BUISNotes`, and prints their details (summary name and price).

## Usage

To run the project:

1. Clone the repository:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/notes-pricing-system.git
   ```
2. Open the project in your IDE (e.g., IntelliJ, NetBeans).
3. Run the `UseNotes` class to see the output, which will print the details of `BUPENotes` and `BUISNotes` objects.

Example output:

```
BUPE Notes on Entrepreneurship costs R19.99
BUIS Notes on Information Systems costs R24.99
```
