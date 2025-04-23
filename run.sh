#!/bin/bash

# Path setup
SRC_DIR="Calculator/src"
BIN_DIR="Calculator/bin"
LIB_DIR="Calculator/lib"

# Clean old .class files
echo "Cleaning rogue .class files"
find . -name "*.class" ! -path "./bin/*" -delete

# Prompt for class name
read -p "Enter the class name to run (e.g., Main): " CLASS_NAME

# Compile everything
find "$SRC_DIR" -name "*.java" | xargs javac -cp "$LIB_DIR/*" -d "$BIN_DIR"

# Run the specified class
java -cp "$BIN_DIR:$LIB_DIR/*" "calculator.${CLASS_NAME}"
