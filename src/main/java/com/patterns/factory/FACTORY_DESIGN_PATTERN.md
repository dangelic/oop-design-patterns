# Creational Design Patterns: ***FACTORY***

We have multiple CellStructor Designs which apply the design of the maze differently. 
Every CellStructor (e.g. CellStructorDesignA, CellStructorDesignB, ...) is a implementation of the same abstract class CellStructor but with a different implementation.

With the help of a **Factory** (here: CellStructorFactory), we can manipulate the object creation of a CellStructors' implementation depending on an input.
This helps us to accomplish design changes (e.g. by user input) also during runtime: If we e.g. pass "DESIGN_B" into the constructor of MazeFX, it will create the CellStructor implementation "CellStructorDesignB".
This leads to clean and reusable code, as we can now just add new a CellStructorDesignX by adding it to the Factory and call it with "DESIGN_X" if needed.