package codility.rakuten

fun main(args: Array<String>) {
    val A = arrayOf(6, 1, 4, 6, 3, 2, 7, 4)
    println(A.size)
//    var K = 3;
//    var L = 2;
//    print(solution(A.toIntArray(), K, L));

}

fun solution(A: IntArray, K: Int, L: Int): Int {
    if (A.size < K + L) { //invalid
        return -1
    }

    if (A.size == K + L) { //only one solution
        return A.sum()
    }

    var sum = 0
    var alice = 0
    var bob = 0
    for (i in 0..A.size - K - L) {
        if (alice == 0) {
            for (k in i until i + K) {
                alice += A[k]
            }
        } else {
            alice += A[i + K - 1]
            alice -= A[i - 1]
        }
        bob = 0
        for (j in i + K..A.size - L) {
            if (bob == 0) {
                for (k in j until j + L) {
                    bob += A[k]
                }
            } else {
                bob += A[j + L - 1]
                bob -= A[j - 1]
            }
            sum = maxOf(sum, alice + bob)
        }

    }

    bob = 0
    for (i in 0..A.size - K - L) {
        if (bob == 0) {
            for (k in i until i + L) {
                bob += A[k]
            }
        } else {
            bob += A[i + L - 1]
            bob -= A[i - 1]
        }
        alice = 0
        for (j in i + L..A.size - K) {
            if (alice == 0) {
                for (k in j until j + K) {
                    alice += A[k]
                }
            } else {
                alice += A[j + K - 1]
                alice -= A[j - 1]
            }
            sum = maxOf(sum, alice + bob)
        }
    }

    return sum
}

