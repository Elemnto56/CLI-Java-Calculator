#!/bin/bash
echo "Building project (no run)..."
javac -cp "Calculator/lib/*" -d bin $(find Calculator/src -name "*.java")
[ $? -eq 0 ] && echo "Build successful." || echo "Compilation failed."
