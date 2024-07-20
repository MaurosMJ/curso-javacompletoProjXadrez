# Chess Game Project

###### @Author: MaurosMJ
<div style="text-align:center;">
    <img src="https://imgur.com/D8t3Umu.png" alt="Chess Game Logo" width="100" height="100">
</div>

This repository contains a Java-based chess game project. It features a complete implementation of the classic chess game, including functionalities such as move validation, game state management, and an interactive user interface. The project is designed to showcase the application of Java programming concepts.

The goal of this project is to practically apply the knowledge acquired throughout the course. Although the course section covering this project included approximately 6 hours of video lessons, it took me around 10 hours to complete due to additional testing, code review, debugging, and occasionally rewatching the videos for a better understanding.

##### More Information:
**Course Link:** [Udemy Java Complete Course](https://www.udemy.com/course/java-curso-completo)  
**Section 16:** Project - Chess Game System

## Table of Contents

- [Architecture](#architecture)
- [Worknotes & Commits](#worknotes--commits)
- [Special Moves](#special-moves)
- [Credits](#credits)

## Architecture:

Examples:

### Possible Moves of a Piece:  

<div style="text-align:center;">
    <img src="https://imgur.com/Y5AdB7B.png" alt="Possible Moves of a Piece">
</div>
<div style="text-align:center;">
    <img src="https://imgur.com/zTYAQtB.png" alt="Possible Moves of a Piece">
</div>

### Castling:  

<div style="text-align:center;">
    <img src="https://imgur.com/SU0Z8tk.png" alt="Castling">
</div>

### En Passant:  

<div style="text-align:center;">
    <img src="https://imgur.com/ajR1Rgv.png" alt="En Passant">
</div>

### Promotion:
<div style="text-align:center;">
    <img src="https://imgur.com/EL8UuIi.png" alt="Promotion">
</div>

## Worknotes & Commits:

##### Worknote #1 - Initial Class Position
Commit hash: [f70b44743aa81591d9a16cf8627ddc8ac040d1fa](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/f70b44743aa81591d9a16cf8627ddc8ac040d1fa)  
Checklist:
* Class Position [public]
* OOP Topics:
  * Encapsulation
  * Constructors
  * `toString()` (Object / overriding)

##### Worknote #2 - Implementing Board and Piece
Commit hash: [5b00bb0e9d4aa82676cc80d8bec2d71c7fe1945d](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/5b00bb0e9d4aa82676cc80d8bec2d71c7fe1945d)  
Checklist:
* Classes Piece, Board [public]
* OOP Topics:
  * Associations
  * Encapsulation / Access Modifiers
* Data Structures Topics:
  * Matrix

##### Worknote #3 - Chess Layer and Board Printing
Commit hash: [5d057d827a344dc7400dfd6cfa20df13c809db63](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/5d057d827a344dc7400dfd6cfa20df13c809db63)  
Checklist:
* Classes Piece, Board [public]
* OOP Topics:
  * Associations
  * Encapsulation / Access Modifiers
* Data Structures Topics:
  * Matrix

##### Worknote #4 - Placing Pieces on the Board
Commit hash: [0d1c4a1bcaa8bda05074481e90b0d7f5efcc6cd3](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/0d1c4a1bcaa8bda05074481e90b0d7f5efcc6cd3)  
Checklist:
* Method: `Board.placePiece(piece, position)`
* Classes: Rook, King [public]
* Method: `ChessMatch.initialSetup`
* OOP Topics:
  * Inheritance
  * Overriding
  * Polymorphism (`toString()`)

##### Worknote #5 - BoardException and Defensive Programming
Commit hash: [d8a7657012d39672d32df4e34fad24d89e2abea4](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/d8a7657012d39672d32df4e34fad24d89e2abea4)  
Checklist:
* Class `BoardException` [public]
* Methods: `Board.positionExists`, `Board.thereIsAPiece`
* Implement defensive programming in Board methods
* OOP Topics:
  * Exceptions
  * Constructors (string argument for exceptions)

##### Worknote #6 - ChessException and ChessPosition
Commit hash: [6c13881057b0055ddb4a49a00d12f2c99c03db39](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/6c13881057b0055ddb4a49a00d12f2c99c03db39)  
Checklist:
* Class `ChessException` [public]
* Class `ChessPosition` [public]
* Refactor `ChessMatch.initialSetup`
* OOP Topics:
  * Exceptions
  * Encapsulation
  * Constructors (string argument for exceptions)
  * Overriding
  * Static members
  * Layers pattern

##### Worknote #7 - Minor Improvement in Board Printing
Commit hash: [7f9d1202e6ce32a1d4c7b9f6c3c53c1280b84d4f](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/7f9d1202e6ce32a1d4c7b9f6c3c53c1280b84d4f)  
Checklist:
* Terminal color settings:
  * Windows: Git Bash
  * Mac: Search for "OSX terminal color"
* Place additional pieces on the board
* Distinguish piece colors in `UI.printPiece` method

##### Worknote #8 - Moving Pieces
Commit hash: [a6d024ee0a9e8b91637362d9b909cb4e1236ea5e](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/a6d024ee0a9e8b91637362d9b909cb4e1236ea5e)  
Checklist:
* Method: `Board.removePiece`
* Method: `UI.readChessPosition`
* Methods: `ChessMatch.performChessMove`, `ChessMatch.makeMove`, `ChessMatch.validateSourcePosition`
* Basic logic in `Program.cs`
* OOP Topics:
  * Exceptions
  * Encapsulation

##### Worknote #9 - Exception Handling and Screen Clearing
Commit hash: [bde6e416f7a8fc49e544168efd848767fe99dd55](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/bde6e416f7a8fc49e544168efd848767fe99dd55)  
Checklist:
* `ChessException`
* `InputMismatchException`

##### Worknote #10 - Possible Moves of a Piece
Commit hash: [20096e534e191ed0c206a6da0e5b52b92597db37](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/20096e534e191ed0c206a6da0e5b52b92597db37)  
Checklist:
* Methods in Piece:
  * `possibleMoves` [abstract]
  * `possibleMove`
  * `isThereAnyPossibleMove`
* Basic `possibleMove` implementation for Rook and King
* Update `ChessMatch.validateSourcePosition`
* OOP Topics:
  * Abstract methods / classes
  * Exceptions

##### Worknote #11 - Implementing Rook's Possible Moves
Commit hash: [1dfccd937e7183cbdb11deef5af3225a24796cbb](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/1dfccd937e7183cbdb11deef5af3225a24796cbb)  
Checklist:
* Method `ChessPiece.isThereOpponentPiece(position)` [protected]
* Implement `Rook.possibleMoves`
* Method `ChessMatch.validateTargetPosition`
* OOP Topics:
  * Polymorphism
  * Encapsulation / Access Modifiers [protected]
  * Exceptions

##### Worknote #12 - Printing Possible Moves
Commit hash: [bd2f4447cea6e40af6739d4c35aa5cea5916d155](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/bd2f4447cea6e40af6739d4c35aa5cea5916d155)  
Checklist:
* Implement `UI.printPossibleMoves` method
* Correct implementation of `Rook.possibleMoves`

##### Worknote #13 - Implementing King and Castling
Commit hash: [9fc33ffb4fbe849fbb6daab9fd9b752da34b9c8b](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/9fc33ffb4fbe849fbb6daab9fd9b752da34b9c8b)  
Checklist:
* Class King [public]
* Methods `possibleMoves`, `canMove`, `movePiece`
* Methods `kingSideCastling`, `queenSideCastling`
* Logic for castling and king move
* OOP Topics:
  * Polymorphism
  * Encapsulation / Access Modifiers
  * Layer Pattern

##### Worknote #14 - Implementing En Passant
Commit hash: [c2e6c9894c652251f583b4e16db58749a6ed3e31](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/c2e6c9894c652251f583b4e16db58749a6ed3e31)  
Checklist:
* Implement `ChessMatch.enPassantMove`
* Update logic in `ChessMatch`
* OOP Topics:
  * Encapsulation / Access Modifiers

##### Worknote #15 - Implementing Pawn Promotion
Commit hash: [08d36d5eec1fc8657d3ac51d2b378aa9ea519d86](https://github.com/MaurosMJ/curso-javacompletoProjXadrez/commit/08d36d5eec1fc8657d3ac51d2b378aa9ea519d86)  
Checklist:
* Implement `ChessMatch.pawnPromotion`
* Methods `ChessMatch.validatePromotionPosition`
* `UI.readChessPieceType`
* OOP Topics:
  * Encapsulation / Access Modifiers
  * Inheritance

## Special Moves:

### Castling:
**Short Castling**: The king moves two squares towards the rook, and the rook moves to the square next to the king.  
**Long Castling**: The king moves two squares towards the rook, and the rook moves to the square next to the king.

### En Passant:
A special move for pawns where they capture an opponent's pawn that moved two squares forward from its initial position.

### Promotion:
When a pawn reaches the last rank, it is promoted to any other piece (usually a queen).

## Credits:
- This repository is maintained by MaurosMJ. The Projects are based on the 'Java COMPLETO Programação Orientada a Objetos + Projetos' course.
