# PRPBO_Inheritance
Tugas PBO - Inheritance - PILKOM A 2019

Nama :
1. Tiara Humaira - 1900676
2. Meila Pujianti - 1908682

Deskripsi Modifikasi :
1. Inheritance 
   class Item dijadikan parent dan mempunyai child class Pintu dan class NPC
   
   - class Item
     ditambahkan constructor public Item() --> agar constructor Pintu di class Pintu tidak error
     
   - class Pintu
     atribut private ArrayList<String> arrAksi = new ArrayList<>(); dan private GameInfo objGameInfo; dihapus karena sudah ada di class parent (Item)
     method public void setObjGameInfo(GameInfo objGameInfo) dihapus karena sudah ada di class parent (Item)
     method yang di Override adalah prosesAksi
     penambahan super.setNama("pintu"); di class Pintu --> untuk memanggil nama class di GameEngine
  
   - class NPC 
     atribut private ArrayList<String> arrAksi = new ArrayList<>(); dan private GameInfo objGameInfo; dihapus karena sudah ada di class parent (Item)
     method yang di Override adalah prosesAksi
     penambahan super.setNama("NPC");  di class NPC --> untuk memanggil nama class di GameEngine

2. Polymorphism
   menggunakan Polymorphism di class Ruangan agar script bisa menjadi lebih singkat dan fleksibel 
   
   - di contructor Ruangan ditambahkan arrItem.add(objPintu); dan arrItem.add(objNPC); untuk mengganti perulangan dari objekItem 
   - karena sudah memakai inheritance, percabangan diganti dengan arrItem.get(pil-1).prosesAksi(subPil); (pada line 113)
   
     
     


