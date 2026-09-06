# Cs240-Assignment-1-Converter-and-Pixel-System

## Description
1.hw0/1.java - ASCII to decimal converter
2.hw2.java - Number base converter
3.hw3pix.java - Reads an image and output pix RGB values
4.hw4.java - Creates an img from pix RGB values
5.hw5.java - Boundary case tests

## How to Run
Compile the Java files:
javac hw1.java
javac hw2.java
javac hw3pix.java
javac hw4.java
javac hw5.java

Run the programs:
java hw1
java hw2
java hw3pix
java hw4
java hw5

## Test Cases
### ASCII Converter
A -> 65
a -> 97
0 -> 48

### Base Converter
Enter a number: 10
Enter the base: 10
Binary: 1010
Octal: 12
Decimal: 10
Hexadecimal: A

## Boundary Tests
The project uses 8-bit values for boundary testing.
zero: 
Decimal: 00000000

Largest 8-bit unigned value: 
Decimal: 255
Binary: 11111111
Octal: 377
Hexadecimal: FF

Negative two's-complement value:
Decimal: -5
8-bit Binary: 11111011

## Image Processing
hw3pix.java reads img.png and saves the RGB pixel values to output.txt.
hw4.java reads output.txt and creates reconstructed.png.

## Sources / Collaboration
Java documentation was referenced for image processing and number conversion.
