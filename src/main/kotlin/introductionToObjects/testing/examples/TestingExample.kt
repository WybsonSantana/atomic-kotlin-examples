package introductionToObjects.testing.examples

import atomictest.*

fun main() {
    val v1 = 11
    val v2 = "Ontology"

    // 'eq' means "equals":
    v1 eq 11
    v2 eq "Ontology"

    // 'neq' means "not equals":
    v1 neq 17
    v2 neq "Epistemology"

    v1 eq 17
    v2 eq "Epistemology"
}

/*
Output:
11
Ontology
11
Ontology
11
[Error]: 11 != 17
Ontology
[Error]: Ontology != Epistemology
*/