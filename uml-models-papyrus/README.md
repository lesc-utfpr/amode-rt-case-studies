This directory contains UML models for the new EMF implementation of AMoDE-RT.  
They are created using the [Eclipse Papyrus](https://www.eclipse.org/papyrus/) modelling environment.

## Setup
To use these models in Papyrus, the MARTE Profile must first be installed.  
If you have not yet installed MARTE, follow these steps:
1. Open Papyrus
2. From the Menu bar select "Help" then "Install new Software"
3. In the top field labeled "Work with:" enter the following URL:
```https://download.eclipse.org/modeling/mdt/papyrus/components/marte/```
4. Select all the available components from the list and click "Next"
5. Follow the instructions to complete the installation.

## Usage
The `AMoDE-RT` Project must be present in the same Papyrus workspace in order for any AMoDE-RT models to work correctly.  
(This is because it provides the profile containing the Aspect-Orientation stereotypes and other required utilities.)
