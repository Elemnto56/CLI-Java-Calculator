#!/bin/bash

echo "Building JAR..."

# Step 1: Clean up any old temp or jar files
rm -rf build-temp Calculator.jar

# Step 2: Create temp build folder
mkdir -p build-temp

# Step 3: Compile .java files into build-temp
echo "Compiling source files..."
javac -d build-temp $(find src -name "*.java") || {
  echo "Compilation failed."
  exit 1
}

# Step 4: Extract all .jar files from lib/ into build-temp
echo "Extracting libraries from lib/..."
cd build-temp
for jar in ../lib/*.jar; do
    echo "Unpacking $jar"
    jar xf "$jar"
done
cd ..

# Step 5: Create the fat JAR
echo "Creating Calculator.jar..."
jar cfe Calculator.jar calculator.Main -C build-temp . || {
  echo "Failed to create JAR."
  exit 1
}

# Step 6: Clean up
rm -rf build-temp

echo "Build complete. Run it with:"
echo "java -jar Calculator.jar"
