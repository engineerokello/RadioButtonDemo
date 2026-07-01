Radio Button Demo
A lightweight desktop application built using Java Swing (GUI) for Assignment 2. The application allows users to select different pets using a grouped radio button layout, dynamically updates the displayed image, and throws a native confirmation message box using JOptionPane.

🚀 Features
Mutually Exclusive Selection: Uses ButtonGroup to ensure only one pet can be selected at a time.
Keyboard Mnemonics: Key bindings integrated (e.g., Alt + P for Pig) matching standard desktop accessibility.
Dynamic Media Loading: Uses ImageIcon to load assets relative to the runtime class path.
Pop-up Alerts: Triggers a clean dialog confirmation box upon user selection.
📸 Application Outcomes
Here is a preview of all five pet selections along with their corresponding popup message boxes:


<img width="1366" height="768" alt="Screenshot (20)" src="https://github.com/user-attachments/assets/60e54577-f582-417e-b0ac-c27e28e59891" />


Bird Selection Cat Selection Dog Selection

Rabbit Selection Pig Selection
📂 Project Structure
├── assets/
│   ├── demo-bird.png
│   ├── demo-cat.png
│   ├── demo-dog.png
│   ├── demo-rabbit.png
│   └── demo-pig.png
├── AssignmentTwo.java
├── bird.png
├── cat.png
├── dog.png
├── rabbit.png
├── pig.png
├── README.md
└── .gitignore

🛠️ How to Run Locally

    Clone this repository:
    Bash


Navigate to the project directory:
Bash

cd YOUR_REPO_NAME

Compile the Java file:
Bash

javac AssignmentTwo.java

Run the application:
Bash

java AssignmentTwo
