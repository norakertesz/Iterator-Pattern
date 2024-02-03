Iterator:
Iterator Pattern erlaubt es auf die Elemente einer Datenstruktur sequentiell zuzugreifen, ohne den Aufbau der Datenstruktur zu kennen.
In Java: Iterator Klasse muss Iterator Interface umsetzen und intern die Position verwalten:
•	hasNext()
•	next()
•	optional remove()
Iterable Interface ermöglich es jede Klasse (z.B. Collecion) in for each Schleifen zu verwenden.
•	iterator() muss einen passenden Iterator zurückliefern
