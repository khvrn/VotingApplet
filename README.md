# VotingApplet
This is my final project for CS230, VotingApplet.

## Description
For this project, I had to design and implement the data structures used for a VotingApplet. The scenario was student elections, so I designed the structures for the applet using Dynamic Polymorphism.

## Class Structure

### Election Structures
* Database: Parent Class - ArrayList of Elections
* Election: extends Database - Election name, Election ID, Election Status, Election Result
* Vote: extends Election - Vote ID, Ballot ID
* Ballot: extends Election - Ballot name, Ballot ID
* Race: extends Ballot - Race ID

### User Structures
* User: Parent Class - First Name, Last Name
* Student: extends User - Student ID, Demographics
* Demographics: extends Student - Age, Sex, College, Class Standing
* Candidate: First Name, Last Name
