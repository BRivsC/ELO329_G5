# makefile begins

# define a variable for compiler flags (JFLAGS)
JFLAGS = -g
# define a variable for the compiler (JC)  
JC = javac
# define a variable for the Java Virtual Machine (JVM)
JVM = java 
# define a variable for the filename parameter
FILE =

# Clear any default targets for building .class files from .java files
.SUFFIXES: .java .class

# Here is our target entry for creating .class files from .java files
.java.class:
	$(JC) $(JFLAGS) $*.java

# CLASSES is a macro consisting of N words (one for each java source file)
CLASSES = \
	Main.java \
	Mascota.java \
	Estado.java

# MAIN is a variable with the name of the file containing the main method
MAIN = Main 

# the default make target entry
default: classes

# This target entry replaces the suffix .java of all words in the macro CLASSES 
# with the .class suffix
classes: $(CLASSES:.java=.class)

# Target for running the program
run:
	$(JVM) $(MAIN) $(FILE)

# Target to remove all unneeded files from the directory
clean:
	$(RM) *.class
