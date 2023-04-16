package serie2.mapCollections

class AEDHashMapAED<K, V> : AEDMutableMap<K, V> {

    override var size: Int=0
        private set

    override fun put(key: K, value: V): V?=TODO()
    override operator fun get(key: K): V? =TODO()
    override fun iterator(): Iterator<AEDMutableMap.MutableEntry<K, V>> {
        TODO()
    }
    override fun containsKey(k:K):Boolean=TODO()
}



