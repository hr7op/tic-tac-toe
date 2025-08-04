# Tic Tac Toe (Java Console Game)

A simple two-player Tic Tac Toe game for the console, written in Java. Players take turns entering their moves, and the game displays the board after each turn with colored X and O symbols.

## Features

-   Two-player mode (X and O)
-   Console-based interface
-   Colored output for better visibility
-   Input validation and error handling

## Prerequisites

-   **Java Development Kit (JDK) 8 or higher** installed on your machine
-   **Git** (optional, for cloning the repository)

## Getting Started

### 1. Clone the Repository

Open your terminal or command prompt and run:

```
git clone https://github.com/hr7op/tic-tac-toe.git
```

Or download the ZIP file and extract it.

### 2. Navigate to the Project Directory

```
cd tic-tac-toe
```

### 3. Compile the Source Files

Navigate to the `src` folder and compile all `.java` files:

```
cd src
javac *.java
```

### 4. Run the Game

After successful compilation, run the `Game` class:

```
java Game
```

### 5. Play!

-   The game will prompt each player to enter their move as two numbers: **row** and **column** (both from 1 to 3).
-   Example: To place your mark in the top-left corner, enter `1 1`.
-   The board updates after each move.
-   The game announces the winner or a draw when finished.

## Troubleshooting

-   If you see errors about missing classes, ensure all `.java` files are compiled.
-   If colors do not display correctly, try running the game in a terminal that supports ANSI escape codes.

## File Structure

```
tic-tac-toe/
├── src/
│   ├── Game.java
│   ├── User1.java
│   ├── User2.java
│   └── ClearScreen.java
└── README.md
```

## License

This project is open source and free to use.

---
