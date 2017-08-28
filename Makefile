#Makefile for compiling the java files

JCC = javac
JFLAGS = -g


all: memo.class nomemo.class

memo.class: memo.java
	$(JCC) $(JFLAGS) memo.java

nomemo.class: nomemo.java
	$(JCC) $(JFLAGS) nomemo.java

clean:
	$(RM) *.class