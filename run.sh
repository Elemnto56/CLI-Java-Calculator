#!/bin/bash

SRC_DIR="Calculator/src"
BIN_DIR="bin"
LIB_DIR="Calculator/lib/*"

echo "Which class do you want to run? (e.g., calculator.Main)"
read mainClass

echo "Compiling..."
javac -cp "$LIB_DIR" -d "$BIN_DIR" $(find "$SRC_DIR" -name "*.java")

if [ $? -eq 0 ]; then
    echo "Running $mainClass..."
    java -cp "$BIN_DIR:$LIB_DIR" "$mainClass"
else
    echo "Compilation Error"
fi
