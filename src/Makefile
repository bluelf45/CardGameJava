
JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java
MAIN = Juego

CLASSES = \
        Estudio.java \
		Carta.java \
		Evento.java \
		Mano.java \
		Ramo.java \
        Mazo.java \
        tablero.java \
        Juego.java

default: classes

classes: $(CLASSES:.java=.class)

run: $(MAIN).class
	java $(MAIN)
clean:
	$(RM) *.class