#!/bin/bash

# Step 2: Compile all Java files
javac --module-source-path src -d target $(find src -name "*.java")

# Step 3: Run the main class with redirected input
java --module-path target -m exercise/ifrs.edu.br.Main<input.txt
