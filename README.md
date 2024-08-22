# Horus-Task
Metody getColor() i getMaterial() w klasie CompositeBlockImp są odpowiedzialne za zwracanie koloru i materiału dla całej listy List<Block> przechowywanej przez CompositeBlockImp.
W konstruktorze klasy CompositeBlockImp zliczane są wszystkie kolory i materiały bloków, trafiają do map  compositeColor oraz compositeMaterial, kluczem jest kolor/materiał, a wartościami liczba bloków z danym kolorem/materiałem.
  -jeśli compositeColor/compositeMaterial posiada bloki o jednakowym kolorze/materiale, metoda zwraca nazwę tego koloru/materiału.
  -w innym wypadku metoda zwraca "mixed colors"/"mixed materials".

findBlockByColor, zanim rozpocznie szukanie elementu o kolorze podanym jako parametr metody, sprawdza przy użyciu obiektu CompositeBlockImp czy compositeBlock.getColor() jest takie samo jak color(parametr), jeśli tak to po prostu zwraca pierwszy element List<Block>, ponieważ wiemy wtedy, że każdy element ma ten sam kolor. W innym wypadku przeszukuję listę przy użyciu stream().

findBlocksByMaterial działa podobnie, sprawdza, czy compositeBlock.getMaterial() jest takie samo jak material(parametr), jeśli tak to zwraca całą listę Block, ponieważ wiemy wtedy, że cała lista składa się z bloków o tym samym materiale. W innym wypadku przeszukuję listę przy użyciu stream().

W funkcji Main() dodałem trochę kodu do sprawdzenia działania reszty klas.
