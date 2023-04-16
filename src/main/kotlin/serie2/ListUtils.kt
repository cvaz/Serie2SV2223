package serie2

fun <E> removeAfterIntersectionPoint(list1: Node<E>, list2: Node<E>, cmp: Comparator<E>) {
   TODO()
}

fun <E> xor(list1: Node<E>, list2: Node<E>, cmp: Comparator<E>): Node<E> {
  TODO()
}

class Node<E> {
    val value: E
    var previous: Node<E>
    var next: Node<E>

    constructor() {
        value = Any() as E
        previous = this
        next = this
    }

    constructor(data: E, p: Node<E>, n: Node<E>) {
        value = data
        previous = p
        next = n
    }
}





