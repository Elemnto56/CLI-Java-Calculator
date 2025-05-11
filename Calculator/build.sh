#!/bin/bash

echo "=== Java Project Build Script ==="

# Variables
SRC_DIR="src"
BIN_DIR="bin"
MAIN_CLASS="calculator.Main"
JAR_NAME="Calculator.jar"
LIB_DIR="lib"
CLASS_OUTPUT="$BIN_DIR"

# Step 1: Make sure bin exists
mkdir -p "$CLASS_OUTPUT"

# Step 2: Build classpath from all .jar files in lib/
CP=$(find "$LIB_DIR" -name '*.jar' | paste -sd ':' -)
echo "Using classpath: $CP"

# Step 3: Compile all Java files
echo "Compiling Java source..."
find "$SRC_DIR" -name "*.java" > sources.txt
javac -d "$CLASS_OUTPUT" -cp "$CP" @sources.txt

if [ $? -ne 0 ]; then
    echo "Compilation failed!"
    exit 1
fi

# Step 4: Create manifest
echo "Main-Class: $MAIN_CLASS" > manifest.txt

# Step 5: Build JAR
echo "Building $JAR_NAME..."
jar cfm "$JAR_NAME" manifest.txt -C "$CLASS_OUTPUT" .

# Step 6: Clean temp files
rm manifest.txt sources.txt

echo "Done. Run using: java -cp \"$JAR_NAME:$CP\" $MAIN_CLASS"
