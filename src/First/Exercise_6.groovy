package First

class Exercise_6 {
	static void main(def args) {
		def map=[:]
		map.put(1, "Cats")
		map.put(2, "Dogs")
		map.put(3,"Wolves")
		
		for(def values:map) {
			println values
		}
		
		def newmap=map.plus([4:"Horses", 5:"Donkeys"])
		
		println newmap
		println newmap.values().sort()
		println newmap.values().sort{it.length()}
	}
}