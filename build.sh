#!/bin/bash
echo "Compiling all Java files..."
javac -cp "Calculator/lib/*" -d bin $(find Calculator/src -name "*.java")
echo "Done."
