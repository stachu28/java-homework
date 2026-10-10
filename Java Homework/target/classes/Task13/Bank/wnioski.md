* jaką strukturę danych wybrałeś na konta i dlaczego akurat tę (co odrzuciłeś i z jakiego powodu),
  * Struktura to HashMap - wybrałem bo konta są tworzone raz, przed startem symulacji, a potem tylko odczytywane, 
    więc struktura nie wymaga synchronizacji, Collections.synchronizedMap - to stara technika.
  * Odrzuciłem: ConcurrentHashMap - bo żaden wątek nie pisze do mapy po starcie; 
* jaka cecha konta wyznaczyła globalną kolejność blokowania i dlaczego akurat ona,
  * Za cechę wybrałem id konta - bo jest stałe, unikalne i znane z góry przez co każdy wątek może je porównać 
    bez synchronizacji,
* dlaczego wariant z `tryLock` nie potrzebuje tej kolejności,
  * tryLock nie potrzebuje kolejności, bo gdy drugi zamek się nie uda, zwalnia pierwszy i próbuje od nowa 
    zamiast czekać w nieskończoność jak synchronized,
* dlaczego `AtomicReference` nie wystarcza do przelewu między dwoma kontami,
  * AtomicReference nie wystarcza do przelewu, bo CAS działa tylko na jednej komórce pamięci — a przelew 
    to dwie oddzielne operacje na dwóch kontach, między którymi suma sald może się chwilowo nie zgadzać,
* co pokazał `Thread.print` przy celowo wprowadzonym zakleszczeniu,
  * Thread.print pokazał stan BLOCKED na obu wątkach i sekcję Found one Java-level deadlock z nazwami wątków 
    oraz adresami zamków, które się wzajemnie blokowały,